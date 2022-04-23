package com.udemy.tasks;

import com.udemy.service.UserService;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.micronaut.SchedulerLock;

@Singleton
@Slf4j
public class AnalyticsTask {

    private final UserService userService;

    public AnalyticsTask(UserService userService) {
        this.userService = userService;
    }

    @Scheduled(cron = "*/5 * * * * *")
    @SchedulerLock(name = "analyticsTask", lockAtLeastFor = "4s")
    void execute() {
        long userCount = userService.getUserCount();
        log.info("User count is: {}", userCount);
        // Sending email to admin
    }

}
