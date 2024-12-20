package com.wknd.aem.custom;

import org.osgi.service.component.annotations.Component;

@Component(service = SampleService.class)
public class SampleService {
    public String getMessage() {
        return "Hello from SampleService!";
    }
}