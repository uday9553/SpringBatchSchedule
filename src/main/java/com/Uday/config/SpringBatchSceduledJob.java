package com.Uday.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SpringBatchSceduledJob {
	

	    //runs after every one minute
	    @Scheduled(cron="0 0/1 * 1/1 * ?")
	    public void runScheduledJob() {
	    	System.out.println("scheduled job");
	    }
	    
	    

}
