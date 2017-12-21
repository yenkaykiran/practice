package yuown.rabbitmq.three;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class EmitLog {

	private static final String exchangeName = "logs";

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory f = new ConnectionFactory();
		f.setHost("localhost");
		Connection con = f.newConnection();
		Channel cnl = con.createChannel();

		cnl.exchangeDeclare(exchangeName, BuiltinExchangeType.FANOUT);
		for (int i = 1; i <= 30; i++) {
			String body = prepare("Hello " + i, i);
			cnl.basicPublish(exchangeName, "", null, body.getBytes());

			System.out.println(" [x] Sent '" + body + "'");
		}

		cnl.close();
		con.close();
	}

	private static String prepare(String args, int j) {
		StringBuilder sb = new StringBuilder(args);
		// for (int i = 1; i <= j * 2; i++) {
		// sb.append(".");
		// }
		return sb.toString();
	}
}