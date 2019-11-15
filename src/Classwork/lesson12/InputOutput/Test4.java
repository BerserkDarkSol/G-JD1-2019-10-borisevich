package classwork.lesson12.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {

		try (FileInputStream in = new FileInputStream("input.txt");
				FileOutputStream out = new FileOutputStream("outut.txt")) {

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);

			}
		}

	}

}