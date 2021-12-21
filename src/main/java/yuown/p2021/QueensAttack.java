package yuown.p2021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.core.io.ClassPathResource;

public class QueensAttack {

	public static void main(String[] args) throws IOException {
		// List<List<Integer>> obstacles = new ArrayList<>();
		// // System.out.println(queensAttack(8, 0, 4, 5, obstacles));
		// obstacles.add(new ArrayList<Integer>() {
		// {
		// add(5);
		// add(5);
		// }
		// });
		// obstacles.add(new ArrayList<Integer>() {
		// {
		// add(4);
		// add(2);
		// }
		// });
		// obstacles.add(new ArrayList<Integer>() {
		// {
		// add(2);
		// add(3);
		// }
		// });

		File file = new ClassPathResource("queens-attack-input13.txt").getFile();
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int r_q = Integer.parseInt(secondMultipleInput[0]);

		int c_q = Integer.parseInt(secondMultipleInput[1]);

		List<List<Integer>> obstacles = new ArrayList<>();

		IntStream.range(0, k).forEach(i -> {
			try {
				obstacles.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = queensAttack(n, k, r_q, c_q, obstacles);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();

		System.out.println(result);
	}

	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
		// Write your code here
		Map<Integer, List<Integer>> obs = new HashMap<>();
		for (int i = 0; i < obstacles.size(); i++) {
			if (!obs.containsKey(obstacles.get(i).get(0))) {
				obs.put(obstacles.get(i).get(0), new ArrayList<>());
			}
			obs.get(obstacles.get(i).get(0)).add(obstacles.get(i).get(1));
		}
		int count = 0;
		for (int r = r_q + 1; r <= n; r++) {
			if (obstacle(r, c_q, obs)) {
				break;
			}
			count++;
		}
		for (int r = r_q - 1; r >= 1; r--) {
			if (obstacle(r, c_q, obs)) {
				break;
			}
			count++;
		}
		for (int c = c_q + 1; c <= n; c++) {
			if (obstacle(r_q, c, obs)) {
				break;
			}
			count++;
		}
		for (int c = c_q - 1; c >= 1; c--) {
			if (obstacle(r_q, c, obs)) {
				break;
			}
			count++;
		}
		for (int r = r_q - 1, c = c_q + 1; r >= 1 && c <= n; r--, c++) {
			if (obstacle(r, c, obs)) {
				break;
			}
			count++;
		}
		for (int r = r_q + 1, c = c_q + 1; r <= n && c <= n; r++, c++) {
			if (obstacle(r, c, obs)) {
				break;
			}
			count++;
		}
		for (int r = r_q - 1, c = c_q - 1; r >= 1 && c >= 1; r--, c--) {
			if (obstacle(r, c, obs)) {
				break;
			}
			count++;
		}
		for (int r = r_q + 1, c = c_q - 1; r <= n && c >= 1; r++, c--) {
			if (obstacle(r, c, obs)) {
				break;
			}
			count++;
		}
		return count;
	}

	private static boolean obstacle(int r, int c, List<List<Integer>> obstacles) {
		for (int i = 0; i < obstacles.size(); i++) {
			if (obstacles.get(i).get(0) == r && obstacles.get(i).get(1) == c) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean obstacle(int r, int c, Map<Integer, List<Integer>> obs) {
		return obs.containsKey(r) && obs.get(r).contains(c);
	}
}
