package ie.gmit.sw;

import org.junit.*;

public class TestFont {

	private MyFont font;
	
	@Before
	public void setup(){ // setup the test fixture
		font = new MyFont();
	}
	
	@After
	public void tearDown() {
		font = null;
	}
	
	@Test
	public void validSetFont()throws Exception{
		font.setFont("SANS_SERIF",1, 100);
	}
	
	@Test
	public void validSetColour()throws Exception{
		font.setColour();
	}
	
	@Test
	public void validSetSize()throws Exception{
		font.setSize(1);
	}
	
}
