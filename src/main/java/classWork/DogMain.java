package classWork;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DogMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Dog.xml");
		Dog bulldog = (Dog) context.getBean("dog");
		System.out.println(bulldog);
	}
	}
