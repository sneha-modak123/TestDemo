import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class DemoTest {
	
	@Test
	public void test_is_traingle_1() {
		
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_traingle_2() {
		
		assertTrue(Demo.isTriangle(5, 12, 14));
	}
	
	@Test
	public void test_is_traingle_3() {
		
		assertTrue(Demo.isTriangle(14, 12, 5));
	}
	
	@Test
	public void test_is_Not_traingle_4() {
		
		assertFalse(Demo.isTriangle(-5, 12, 13));
	}
	
	@Test
	public void test_is_Not_traingle_5() {
		
		assertFalse(Demo.isTriangle(1, 12, 5));
	}
	@Test
	public void test_is_traingle_6() {
		
		assertFalse(Demo.isTriangle(0, 12, 5));
	}
	/*@Test
	public void test_main_program()
	{
	ByteArrayInputStream in= new ByteArrayInputStream("5\n12\n13".getBytes());
	System.setIn(in);
	
	ByteArrayOutputStream out= new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String consoleOutput= "Enter side 1: \n";
	consoleOutput+= "Enter side 2: \n";
	consoleOutput+= "Enter side 3: \n";
   
	consoleOutput+= "This is a traingle";
	
	assertEquals(consoleOutput, out.toString());
	}*/
	}


