package com.Uday.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.Date;
@EnableScheduling
@Configuration
public class SpringBatchSceduledJob {
	
		//by default thread-pool size is 1 i.e only 1 scheduler will run with 1 thread
		// we can change this in properties file
	
	
	    //runs after every one minute
	    @Scheduled(cron="0 0/1 * 1/1 * ?")
	    public void runScheduledJob() {
	    	System.out.println("scheduled job");
	    }
	    
	    
	  //runs after every 2 seconds
	    @Scheduled(fixedRate =2000L)
	    public void runScheduledJobFor2sec() {
	    	System.out.println("scheduled job"+new Date());
	    }
	    
	  //runs after every 2 seconds of method Exceution complete
	    @Scheduled(fixedDelay =2000L)
	    public void runMethodAfterandWait2Seconds() throws InterruptedException {
	    	Thread.sleep(1000);
	    	System.out.println("scheduled job"+new Date());
	    }
	    
	  //runs after every 2 seconds of method Exceution complete
	    //P-denotes period, T-denotes time, S-denotes Second
	    @Scheduled(fixedDelayString = "PT2S",initialDelay = 2000L)
	    public void runMethodForFixedDelayString() throws InterruptedException {
	    	Thread.sleep(1000);
	    	System.out.println("scheduled job"+new Date());
	    }  

}
