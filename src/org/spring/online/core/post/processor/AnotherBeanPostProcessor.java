package org.spring.online.core.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class AnotherBeanPostProcessor implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(getOrder()+"->@-> AnotherBeanPostProcessor-> postProcessAfterInitialization-"+beanName );
	
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(getOrder()+"->@-> AnotherBeanPostProcessor-> postProcessBeforeInitialization-"+beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
