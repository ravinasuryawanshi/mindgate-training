package com.mindgate.Factory;

import com.mindgate.pojo.Circle;
import com.mindgate.pojo.Shapes;
import com.mindgate.pojo.Square;
import com.mindgate.pojo.Triangle;

public class ShapesFactory {
	Shapes shapes;
	public static Shapes getshape(int choice) {
		Shapes shapes=null;
		switch(choice)
		{
		case 1: 
			shapes=new Circle();
			break;
		case 2:
			shapes=new 	Triangle();
			break;
		case 3: 
			shapes=new Square();
				break;
//		default:
//			shapes=new Shapes();
//					break;
		}
		return shapes;
	}
}
