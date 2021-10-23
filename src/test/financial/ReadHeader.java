package test.financial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadHeader {

	static String readHeader(String path) {
		BufferedReader reader = null;
		String buffer = null;
		try {
			reader = new BufferedReader(new FileReader(path));
			buffer = reader.readLine();
		} catch (IOException ex) {
			System.out.println("Error reading header from ex " + path + " : " + ex.getMessage());
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ex1) {
					System.out.println("Exception inside finally" + ex1.getMessage());
				}
			}
		}
		System.out.println("reader " + reader);
		System.out.println("buffer " + buffer);
		return buffer;

	}

	public static void main(String[] args) {
		String result = readHeader("E:/tomcat/text.txt");
		System.out.println("result " + result);
	}

}
