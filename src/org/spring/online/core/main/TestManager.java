package org.spring.online.core.main;

import org.spring.online.core.test.domain.Point;
import org.spring.online.core.test.domain.Triangle;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestManager {

	public static void main(String args[]){
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/*XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocations(new String[]{"spring.xml"});
		context.refresh();
		context.start();*/
		
		Point p = (Point)context.getBean("pointC");
		System.out.println("@@->"+p.getX()+","+p.getY());
		p.setX(3);
		System.out.println("@@->"+p.getX()+","+p.getY());
		Triangle t = (Triangle)context.getBean("triangle");
		t.draw();
		
		context.registerShutdownHook();
		
		System.out.println("---------------------");
		
		/*ComplexObject cObj =(ComplexObject)context.getBean("complexObj");
		
		Set<Object> it = cObj.getAdminEmails().keySet();
		
		for(Object o:it){
			System.out.println(o+"\t:"+cObj.getAdminEmails().getProperty((String) o));
		}
		
		System.out.println("---------------------");
		ChildComplexObject childCObj = (ChildComplexObject)context.getBean("childComplexObj");
		
		Set<Object> cs = childCObj.getAdminEmails().keySet();
		
		for(Object o:cs){
			System.out.println(o+"\t:"+childCObj.getAdminEmails().getProperty((String) o));
		}*/
		
		
	}
	
	
	
}
