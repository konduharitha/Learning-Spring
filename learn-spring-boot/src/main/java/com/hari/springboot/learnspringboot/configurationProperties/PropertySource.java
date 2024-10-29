package com.hari.springboot.learnspringboot.configurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySource {

    @Autowired
    private Environment environment;

    public String getDef() {
        return def;
    }

    @Value("Default name")
    private String def;

  //  @Value("${mail.host}")
    private String host;

  //  @Value("${mail.gmail}")
    private String gmail;

   // @Value("${mail.password}")
    private String password;

  //  @Value("${springapp.name}")
    private String appName;

  //  @Value("${springapp.description}")
    private String appDescription;

    @Value("${java.Home}")
    private String javaHome;

    @Value("${HOME}")
    private String home;

    public String getHost() {
        return environment.getProperty("mail.host");
    }

    public String getGmail() {
        return environment.getProperty("mail.gmail");
    }

    public String getPassword() {
        return environment.getProperty("mail.password");
    }

    public String getName() {
        return environment.getProperty("springapp.name");
    }

    public String getDescription() {
        return environment.getProperty("springapp.description");
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getHome() {
        return home;
    }
}
