package yuown.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) throws Exception {
		File f = new File(".classpath");
//		BufferedReader br = new BufferedReader(new FileReader(f));
//		String s = "";
//		while (null != (s = br.readLine())) {
//			System.out.println(s);
//		}
//		br.close();
		Scanner sc = new Scanner(new FileReader(f));
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}