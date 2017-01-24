package org.spring.online.core.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(getOrder()+"->@->DisplayNameBeanPostProcessor->postProcessAfterInitialization-"+beanName );
	
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(getOrder()+"->@->DisplayNameBeanPostProcessor->postProcessBeforeInitialization-"+beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
