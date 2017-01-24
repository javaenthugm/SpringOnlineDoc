package org.spring.online.core.test.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Point  {
	
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void initMethod(){
		System.out.println("initializing the point bean("+getX()+","+getY()+")");		
	}
	
	public void destroyMethod(){
		System.out.println("destroying the point bean("+getX()+","+getY()+")");
	}
	
	public void inti(){
		System.out.println("default - initializing the point bean("+getX()+","+getY()+")");		
	}
	
	public void dispose(){
		System.out.println("default - destroying the point bean("+getX()+","+getY()+")");
	}
	
	@PostConstruct
	public void testInit(){
		System.out.println("#1 Using Init Annotation");
	}
	
	
	@PreDestroy
	public void testDestroy(){
		System.out.println("#1 Using Destroy Annotation");
	}
	
	
	
}
