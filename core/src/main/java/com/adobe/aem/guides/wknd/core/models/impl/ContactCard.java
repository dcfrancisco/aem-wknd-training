package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.Contact;
import com.adobe.cq.export.json.ComponentExporter;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.api.resource.Resource;
import java.util.List;

@Model(adaptables = Resource.class, 
       adapters = { ContactCard.class, ComponentExporter.class },
       resourceType = "wknd/components/contactCard",
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactCard implements ComponentExporter {

    @ChildResource(name = "contacts")
    private List<Contact> contacts;

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String getExportedType() {
        return "wknd/components/contactCard";
    }
}
