package ie.gmit.sw;

import java.awt.geom.*;
import java.util.*;

public class MyRectangle {
	
	private Set<Rectangle2D> rectList;
	
	public MyRectangle()
	{
		// hashset with stored rectangles
		rectList = new HashSet<Rectangle2D>();
	}
	public void add (Rectangle2D rect)
	{
		rectList.add(rect);
	}
	public void remove(Rectangle2D rect)
	{
		rectList.remove(rect);
	}
	public boolean isOverLap(Rectangle2D rect)
	{
		boolean overlap = false;
		
		for(Rectangle2D myRect : rectList)
		{
			overlap = (myRect.intersects(rect));
			
			if(overlap)
			{
				break;
			}
		}
		return overlap; 
	}
}


