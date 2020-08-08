package com.example.demo.play;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.ArrayList;
import java.util.List;

@ConstructorBinding
@ConfigurationProperties(prefix="environment")
public class Environments {
    private List<String> servers = new ArrayList<String>();
    private final Security security;

    public Environments(List<String> servers, @DefaultValue Security security) {
        this.servers = servers;
        this.security = security;
    }

    public List<String> getServers() {
        return this.servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    public Security getSecurity() {
        return security;
    }

    public static class Security {
        private String authority;

        public Security(@DefaultValue("USER") String authority) {
            this.authority = authority;
        }

        public String getAuthority() {
            return authority;
        }

        public void setAuthority(String authority) {
            this.authority = authority;
        }
    }

}
