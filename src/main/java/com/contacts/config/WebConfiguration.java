package com.contacts.config;

import java.io.File;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer cesc) {
        File root = new File("src/main/webapp/");
        if (root.exists() && root.isDirectory()) {
            cesc.setDocumentRoot(root);
        }
    }
}
