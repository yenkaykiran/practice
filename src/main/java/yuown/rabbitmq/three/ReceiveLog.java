package yuown.rabbitmq.three;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class ReceiveLog {

	private static final String exchangeName = "logs";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory f = new ConnectionFactory();
		f.setHost("localhost");
		Connection c = f.newConnection();
		Channel cnl = c.createChannel();

		String queueName = cnl.queueDeclare().getQueue();

		cnl.exchangeDeclare(exchangeName, BuiltinExchangeType.FANOUT);
		cnl.queueBind(queueName, exchangeName, "");
		DefaultConsumer defcons = new DefaultConsumer(cnl) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope,
					BasicProperties properties, byte[] body) throws IOException {
				super.handleDelivery(consumerTag, envelope, properties, body);
				String message = new String(body, "UTF-8");
				System.out.println(" [x] Received '" + message + "'");
			}
		};

		cnl.basicConsume(queueName, true, defcons);
	}
}