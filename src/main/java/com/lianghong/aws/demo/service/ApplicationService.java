package com.lianghong.aws.demo.service;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.repository.ApplicationRepository;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.lianghong.aws.demo.repository.mapper.ApplicationEntityMapper.MAPPER;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplication() {
        return applicationRepository.scanApplicationEntities().stream().map(MAPPER::mapToDomain).collect(Collectors.toList());
    }

    public Application get(String applicationId) {
        return MAPPER.mapToDomain(applicationRepository.getApplicationAbstractById(applicationId));
    }

    public List<Application> getAll(String applicationId) {
        return applicationRepository.getApplicationEntities(applicationId).stream().map(MAPPER::mapToDomain).collect(Collectors.toList());
    }

}
