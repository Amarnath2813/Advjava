package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("injection.xml");
	Soldier gunfire=(Soldier)context.getBean("gunfire");
	gunfire.perform();
}
}
