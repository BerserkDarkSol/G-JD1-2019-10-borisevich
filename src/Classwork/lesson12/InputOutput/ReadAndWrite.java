package classwork.lesson12.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {

		try (FileInputStream in = new FileInputStream("input.txt");
				FileOutputStream out = new FileOutputStream("outut.txt")) {

			int c = in.read();
			while (c != -1) {
				out.write(c);

			}
		}

	}

}