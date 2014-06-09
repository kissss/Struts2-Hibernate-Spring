package hibernate.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1
{

	@Test
	public void testSpringHibernate()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]
		{ "classpath:spring.xml", "classpath:spring-hibernate.xml" });
		SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}

}
