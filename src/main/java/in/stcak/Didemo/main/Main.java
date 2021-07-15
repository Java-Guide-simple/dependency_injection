package in.stcak.Didemo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.stcak.Didemo.model.Student;

public class Main {

	public static void main(String[] args) {
		
	Resource r=	new ClassPathResource("appConfig.xml");
	BeanFactory bf = new XmlBeanFactory(r);
	
	Student stu1 = bf.getBean("stu1",Student.class);
	System.out.println(stu1);
	
	Student stu2 = bf.getBean("stu2", Student.class);
	System.out.println(stu2);
	}

}
