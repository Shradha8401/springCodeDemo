package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carMain {
	public static void main(String[] args) {
//		Car cc = new Car();
//		cc.setBrand("bmw");
//		cc.setColor("red");
//		cc.setPrice(1000);
//
//		System.out.println(cc.getBrand());
//		System.out.println(cc.getColor());
//		System.out.println(cc.getPrice());
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Car.xml");
		Car audi = (Car) context.getBean("car");
		System.out.println(audi);
	}
}
