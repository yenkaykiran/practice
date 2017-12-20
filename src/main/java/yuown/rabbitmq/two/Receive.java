package yuown.rabbitmq.two;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Receive {

	private static final String queueName = "k3n-queue";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory f = new ConnectionFactory();
		Connection con = f.newConnection();
		final Channel cnl = con.createChannel();

		cnl.queueDeclare(queueName, false, false, false, null);

		DefaultConsumer defcons = new DefaultConsumer(cnl) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope,
					BasicProperties properties, byte[] body) throws IOException {
				super.handleDelivery(consumerTag, envelope, properties, body);
				String m = new String(body);
				System.out.println(" [x] Received '" + m + "'");

				try {
					work(m);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					cnl.basicAck(envelope.getDeliveryTag(), false);
					System.out.println(" [x] Done");
				}
			}

			private void work(String m) throws InterruptedException {
				for (char c : m.toCharArray()) {
					if (c == '.') {
						Thread.sleep(1000);
					}
				}
			}
		};

		cnl.basicConsume(queueName, false, defcons);
	}
}
