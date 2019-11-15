package classwork.lesson12.InputOutput;

import java.io.File;

public class Test5 {

	public static void main(String[] args) {

		showSamples(new File("C:\\Windows\\winhlp.exe"));
		System.out.println("___________________");
		showSamples(new File("C:\\Windows"));
	}

	protected static void showSamples(final File f) {

		System.out.println("File name: " + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute path: " + f.getAbsolutePath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("Exist: " + f.exists());
		if (f.exists()) {
			System.out.println("Is writable: " + f.canWrite());
			System.out.println("Is readable: " + f.canRead());
			System.out.println("Is a directory: " + f.isDirectory());
			System.out.println("File size in bytes: " + f.length());
		}
	}

}
