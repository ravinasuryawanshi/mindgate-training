package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Repeat;
    
import com.mindgate.pojo.Product;
                                                                                                                                                                                                                                                                                                                                  
public class ProductMain {
	public static void main(String[] args) {
		System.out.println("main start");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Application context is created");

		Product product = applicationContext.getBean("product", Product.class);
		System.out.println("product object created");
		System.out.println(product);
		System.out.println(product.hashCode());
		System.out.println("_".repeat(50));

		Product product2 = applicationContext.getBean("product", Product.class);
		System.out.println("product object created");
		System.out.println(product2);
		System.out.println(product2.hashCode());
		System.out.println("main end");

	}
}
