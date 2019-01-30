package com.changhong.community.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextInfo implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {

    private int serverPort;

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent embeddedServletContainerInitializedEvent) {
        this.serverPort = embeddedServletContainerInitializedEvent.getEmbeddedServletContainer().getPort();
    }

    public int getPort() {
        return this.serverPort;
    }
}
