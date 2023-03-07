package com.ashokit.datacollection.service.impl;

import com.ashokit.datacollection.bean.Application;
import com.ashokit.datacollection.client.ApplicationClient;
import com.ashokit.datacollection.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {
    final ApplicationClient client;

    @Override
    public boolean isApplicationValid(Long appId) {
        Application application = client.getApplication(appId).getBody();

        return application != null;
    }
}
