package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.Factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int choice;
			System.out.println();
			System.out.println("1.circle");
			System.out.println("2.triangle");
			System.out.println("3.square");
			System.out.println("enter choice");
			choice=scanner.nextInt();
			
			Shapes shapes=ShapesFactory.getshape(choice);
			if(shapes!=null)
				shapes.draw();
			
			else 
				System.out.println("invalid shape choice");
			
			
	}
}
