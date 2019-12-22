package com.scheduler.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

	@Scheduled(cron = "${cronJob}")
	public void scheduledJob() {
		//Any logic here
		System.out.println("Time :: "+new Date());
		
	}
	
}
