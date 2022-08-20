package com.example.smtpconnect;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerTest {


    //@Scheduled(cron = "*/2 * * * * *")
    public void testScheduler(){
        System.out.println("Now working");
    }

    //@Scheduled(cron = "*/2 * * * * *")
    public void testScheduler2(){
        System.out.println("Now working on second scheduler");
    }
}
