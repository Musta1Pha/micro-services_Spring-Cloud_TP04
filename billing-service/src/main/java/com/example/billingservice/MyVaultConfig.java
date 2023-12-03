package com.example.billingservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "user")
// on aura plus besoin de l'annotation value piur injecter les propriétés , par definition il va aller vers les sources de configuration et
// cherche les propriétés qui commencent par token
public class MyVaultConfig {
    private String username;
    private String password;
    private String otp;
}
