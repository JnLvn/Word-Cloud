package ie.gmit.sw;

import org.junit.*;

public class TestFileParser {

	private FileParser fp;
	
	@Before
	public void setup() throws Exception{ // setup the test fixture
		fp = new FileParser("new.txt");
	}
	
	@After
	public void tearDown() {
		fp = null;
	}
	
	@Test
	public void validParse()throws Exception{
		fp.parse("new.txt");
	}
	
}
