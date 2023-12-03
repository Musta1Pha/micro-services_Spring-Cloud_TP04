package com.example.billingservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RefreshScope // Vault utilise un système de versionning
@AllArgsConstructor
public class ConsulConfigRestController {
    private MyConsulConfig myConsulConfig;
    private MyVaultConfig myVaultConfig;
    /*@Value("${token.accessTokenTimeout}")
    private long accessTokenTimeout;
    @Value("${token.refreshTokenTimeout}")
    private long refreshTokenTimeout;
*/
    @GetMapping("/myConfig")
    public Map<String, Object> myConfig(){
        return Map.of("consulConfig",myConsulConfig,"vaultConfig",myVaultConfig);
    }

}
