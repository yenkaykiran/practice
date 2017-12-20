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
		String body = generate(args);
		cnl.basicPublish("", queueName, null, body.getBytes());
		
		System.out.println(" [x] Sent '" + body + "'");

		cnl.close();
		con.close();
	}

	private static String generate(String[] args) {
		if (args.length < 1) {
			return "Hello k3n........";
		}
		return joinStrings(args, " ");
	}

	private static String joinStrings(String[] args, String string) {
		StringBuilder sb = new StringBuilder(args[0]);
		for (int i = 1; i < args.length; i++) {
			sb.append(string).append(args[i]);
		}
		return sb.toString();
	}
}
