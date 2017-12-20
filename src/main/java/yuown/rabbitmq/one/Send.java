package yuown.rabbitmq.one;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	final static String queueName = "k3n-queue";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory f = new ConnectionFactory();
		f.setHost("localhost");
		Connection con = f.newConnection();
		Channel cnl = con.createChannel();

		cnl.queueDeclare(queueName, false, false, false, null);

		String message = "Hello k3n!";
		cnl.basicPublish("", queueName, null, message.getBytes());

		System.out.println(" [x] Sent '" + message + "'");

		cnl.close();
		con.close();
	}

}
