package com.manuelrodriguezs;

import lombok.extern.slf4j.Slf4j;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
@Slf4j
public class SimpleScheduler {

    @Schedule(hour = "*", minute = "*", second = "*/2", info = "Every 2 seconds timer")
    public void scheduledTAsk() {
        log.info("Hello scheduled world!");
    }
}
