import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TextAOPMain {
public static void main(String[] args) {
	ApplicationContext beanFactory=new ClassPathXmlApplicationContext("new.xml");
	
	ApplicationService annoservice=(ApplicationService)beanFactory.getBean(ApplicationService.class);
	
	System.out.println(annoservice);
	annoservice.processApplication();
	annoservice.processApplicationWithAudit();
	
}
}
