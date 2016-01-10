package ie.gmit.sw;

import java.awt.*;
import java.util.Random;

public class MyFont {
	
	private Font font;
	private Color colourFont;
	private int sizeFont;
	
	public Font getFont() 
	{
		return font;
	}
	
	public void setFont(String name, int style, int size)throws Exception
	{
		font = new Font(name, style, size);
	}
	
	public void setFont()throws Exception 
	{
		setFont(chooseFont(), Font.BOLD, getSize());		
	}
	
	public void setColour()
	{
		colourFont = getRandomColour();
	}
	
	public Color getColour()
	{
		return colourFont;
	}
	
	public void setSize(int freq)
	{
		if(freq <= 1)
		{
			freq = 50;
		}
		if(freq <= 2)
		{
			freq = 100;
		}
		if(freq <= 3)
		{
			freq = 150;
		}
		if(freq <= 4)
		{
			freq = 200;
		}
		sizeFont = (int)(freq);
		
	}
	
	public int getSize()
	{
		return sizeFont;
	}

	private String chooseFont()
	{
		Random r = new Random();
		
		
		switch(r.nextInt(3))
		{
		case 0:
			return Font.MONOSPACED;
			
		case 1:
			return Font.SANS_SERIF;
			
		case 2:
			return Font.SERIF;
			
		default:
			return Font.DIALOG_INPUT;
		}		
		
	}
	
	private Color getRandomColour()
	{	
		// get a random colour
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		colourFont = new Color(red, green, blue);

		return colourFont;	
	}	
	
}
