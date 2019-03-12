package iodecoratorpattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Reader {
	public static void main(String[] args) throws IOException {
		int c;
		String path = "src/iodecoratorpattern/text.txt";
		try (FileInputStream fin = new FileInputStream(path);
				InputStream in = new LowerCaseInputStream(new BufferedInputStream(fin))) {
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		}
	}
}
