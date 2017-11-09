package yuown.java;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/Users/k3n/Development/git-projs/practice/.classpath"));
				TestAutoCloseable a = new TestAutoCloseable();) {
			System.out.println(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestAutoCloseable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
	}
}