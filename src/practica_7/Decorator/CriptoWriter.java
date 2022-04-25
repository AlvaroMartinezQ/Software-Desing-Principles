package practica_7.Decorator;

import java.io.*;

public class CriptoWriter extends BufferedWriter {

	// Constructor:
	public CriptoWriter(Writer writer) {
		super(writer);
	}
	// End Constructor.

	// Public Methods:
	public void write(char c) throws IOException {
		this.append((char) (c + 1));
	}

	@Override
	public void write(String s) throws IOException {
		for (int i = 0; i < s.length(); i++)
			this.write(s.charAt(i));
	}
	// End Public Methods.
}
