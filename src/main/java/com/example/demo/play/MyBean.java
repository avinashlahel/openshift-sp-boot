package com.example.demo.play;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBean  {

    @Value("${name}")
    private List<String> name;

    public List<String> getName() {
        return name;
    }

    public MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        System.out.println(debug);
    }
}
