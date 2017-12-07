package yuown.rabbitmq;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	private final ConfigurableApplicationContext context;
	private final RabbitTemplate rabbitTemplate;
	private final Receiver receiver;

	Runner(ConfigurableApplicationContext context, RabbitTemplate rabbitTemplate, Receiver receiver) {
		this.context = context;
		this.rabbitTemplate = rabbitTemplate;
		this.receiver = receiver;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending Message...");
		rabbitTemplate.convertAndSend(RabbitMqApp.queueName, "Hello from k3n!");
		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		context.close();

	}

}
