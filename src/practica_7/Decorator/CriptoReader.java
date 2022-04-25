package practica_7.Decorator;

import java.io.*;

public class CriptoReader extends BufferedReader {
	// Constructor:
	public CriptoReader(Reader reader) {
		super(reader);
	}
	// End Constructor.

	// Public Method:
	@Override
	public int read() throws IOException {
		return super.read() - 1;
	}
	// End Public Method.
}
