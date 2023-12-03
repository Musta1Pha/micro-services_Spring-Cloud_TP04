package com.example.billingservice;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "token")
// on aura plus besoin de l'annotation value piur injecter les propriétés , par definition il va aller vers les sources de configuration et
// cherche les propriétés qui commencent par token
public class MyConsulConfig {
    private long accessTokenTimeout;
    private long refreshTokenTimeout;
}
