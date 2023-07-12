package com.polarbookshop.orderservice.order.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "polar")
public record ClientProperties(
        URI catalogServiceUri
) {
}
