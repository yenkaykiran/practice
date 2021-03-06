package yuown.rabbitmq.two;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	private static final String queueName = "k3n-queue";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory fct = new ConnectionFactory();
		fct.setHost("localhost");
		Connection con = fct.newConnection();
		Channel cnl = con.createChannel();

		cnl.queueDeclare(queueName, false, false, false, null);
		cnl.basicQos(1);
		for (int i = 1; i <= 3000; i++) {
			String body = prepare("Hello " + i, i);
			cnl.basicPublish("", queueName, null, body.getBytes());

			System.out.println(" [x] Sent '" + body + "'");
		}

		cnl.close();
		con.close();
	}

	private static String prepare(String args, int j) {
		StringBuilder sb = new StringBuilder(args);
//		for (int i = 1; i <= j * 2; i++) {
//			sb.append(".");
//		}
		return sb.toString();
	}
}
