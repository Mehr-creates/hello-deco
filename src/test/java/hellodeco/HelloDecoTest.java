package hellodeco;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloDecoTest {

	@Test
	public void mainTest() {
		// Suppress the output
		System.setOut(new PrintStream(new ByteArrayOutputStream()));
		// Test the main function
		HelloDeco.main(new String[0]);
	}
	
}
