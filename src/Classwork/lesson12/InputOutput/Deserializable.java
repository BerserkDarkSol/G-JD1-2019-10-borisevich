package classwork.lesson12.inputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Deserializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);

		int i = ois.readInt();
		String today = (String) ois.readObject();
		Date date = (Date) ois.readObject();
		ois.close();
	}

}