package com.wipro.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class TeaVarietiesApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//TajMahal taj = new TajMahal();
		
		//Deprecated way of intialising
		//DefaultListableBeanFactory teasFactory = new DefaultListableBeanFactory();
		//TajMahal tajMahal = (TajMahal) teasFactory.getBean("TajMahal");
		//tajMahal.teaColor();
		
//		Resource r = new ClassPathResource("TeaVarieties.xml");
//		BeanFactory factoryy = new XmlBeanFactory(r);
//		TeaFlavourCompany myBean=(TeaFlavourCompany)
//	    		factoryy.getBean("teaFlav");
//		TeaFlavourCompany myBean2=(TeaFlavourCompany)
//	    		factoryy.getBean("teaFlav");
//		System.out.println(myBean==myBean2);
//	    myBean.matchFlavourCompany();
		
//     XMLBeanFactory is deprecated in favour to the latest way doing it as follows:
		//BeanDefinitionRegistry-Only interface in Spring bean factory packages that encapsulates registration of bean definitions
     //DefaultListableBeanFactory-Typical usage is registering all bean definitions first (possibly read from a bean definition file), 
		//before accessing beans. Bean definition lookup is 
		//therefore an inexpensive operation in a local bean definition table, operating on pre-built bean definition metadata objects.
//		BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//		reader.loadBeanDefinitions(new ClassPathResource("/com/wipro/Spring/TeaVarieties.xml"));
		
	    
		ApplicationContext appcontext=new ClassPathXmlApplicationContext
				("/com/wipro/Spring/TeaVarieties.xml");
	    BeanFactory factory=appcontext;
	    TeaFlavourCompany myBean=(TeaFlavourCompany)
	    		factory.getBean("teaFlav");
	    //String flavour = myBean.getFlavour();
	    myBean.printData();
	    TeaFlavourCompany myBean2=(TeaFlavourCompany)
	    		factory.getBean("teaFlav");
	System.out.println(myBean==myBean2);
//	    myBean.matchFlavourCompany();

		
//		ApplicationContext context= new ClassPathXmlApplicationContext
//				("TeaVarieties2.xml");
//		TajMahal myBean= (TajMahal) 
//        		context.getBean("TajMahal");
//        myBean.teaColor();
//    

	}}

///////////////////}
