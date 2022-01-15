package com.wipro.Spring.ListSetMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListSetMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/com/wipro/Spring/ListSetMap/CoffeeShopSpring.xml");
		BeanFactory beanFactory = appContext;
		TestListSetBean testListSetBean = (TestListSetBean) beanFactory.getBean("ListSetMap");
		testListSetBean.printData();
	}

}
