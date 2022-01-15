package com.wipro.Spring.SpecificCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpecificCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/com/wipro/Spring/SpecificCollection/SpCollSpring.xml");
		BeanFactory collBean = appContext;
		SpecificCollectionBean spCollBean = (SpecificCollectionBean) collBean.getBean("spCollTest") ;
		spCollBean.printData();
	}

}
