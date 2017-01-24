package org.spring.online.core.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.spring.online.core.domain.Event;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringEventManager {
	
	public static void main(String args[]){
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			
			Event event = (Event)context.getBean("event");
			System.out.println(event.getId()+":"+event.getTitle());
			
			DataSource ds = (DataSource)context.getBean("dataSource");
			
			JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
			
			String sql = "select * from EVENTS order by EVENT_ID desc limit 10";
			
			List<Event> events = new ArrayList<>();
			
			List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
			
			for(Map row:rows){
				//Event e = (Event)context.getBean("event"); // works with scope="prototype"
				Event e = new Event();
				e.setId((Long)row.get("event_id"));
				e.setTitle((String)row.get("title"));
				e.setDate((Date)row.get("event_date"));
				events.add(e);
			}
			
			for(Event e:events)
				System.out.println(e.getId()+","+e.getDate()+","+e.getTitle());
			
			//Default Mapping			
			/*List<Event> eventsd = jdbcTemplate.query(sql,new BeanPropertyRowMapper(Event.class));
			for(Event e:eventsd)
				System.out.println(e.getEvent_id()+","+e.getDate()+","+e.getTitle());*/
			
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
