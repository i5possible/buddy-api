package com.lianghong.aws.demo.scheduler;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.service.ApplicationService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lianghong
 * @date 2019/12/25
 */


@Component
@Slf4j
public class Jobs {

    private ApplicationService applicationService;

    public Jobs(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Scheduled(fixedDelay = 100000000L)
    public void job() {
        log.info("Scheduler job is running");
        List<Application> allApplication = applicationService.getAllApplication();
        log.info("applicationSize: {}, applications: {}", allApplication.size(), allApplication);
    }
}
