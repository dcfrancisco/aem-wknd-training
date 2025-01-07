package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CountdownModel {

    private static final Logger LOG = LoggerFactory.getLogger(CountdownModel.class);

    private Date endDate;

    @ValueMapValue
    private String formattedEndDate;

    @PostConstruct
    protected void init() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        endDate = new Date();
        formattedEndDate = sdf.format(endDate);
        LOG.info("Formatted End Date: {}", formattedEndDate);

    }

    public String getFormattedEndDate() {
        return formattedEndDate;
    }
}