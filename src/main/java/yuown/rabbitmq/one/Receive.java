package yuown.rabbitmq.one;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Receive {

	final static String queueName = "k3n-queue";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory f = new ConnectionFactory();
		f.setHost("localhost");
		Connection con = f.newConnection();
		Channel cnl = con.createChannel();

		cnl.queueDeclare(queueName, false, false, false, null);

		DefaultConsumer defcons = new DefaultConsumer(cnl) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope,
					BasicProperties properties, byte[] body) throws IOException {
				super.handleDelivery(consumerTag, envelope, properties, body);
				String message = new String(body);
				System.out.println(" [x] Received '" + message + "'");
			}
		};

		cnl.basicConsume(queueName, defcons);

		cnl.close();
		con.close();
	}
}
