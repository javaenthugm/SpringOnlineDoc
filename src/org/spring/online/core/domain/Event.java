package org.spring.online.core.domain;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("prototype")
@Repository
public class Event{
	
	private Long id;
	private String title;
	private Date date;
	
	//private Long event_id;
	
	
	
	public Event(){
		
	}
	
	

	/*public Long getEvent_id() {
		return event_id;
	}



	public void setEvent_id(Long event_id) {
		this.event_id = event_id;
	}*/



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	

}
