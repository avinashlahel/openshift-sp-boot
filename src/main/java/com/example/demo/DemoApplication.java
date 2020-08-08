package com.example.demo;

import com.example.demo.play.Environments;
import com.example.demo.play.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	@Component
	class Runner implements CommandLineRunner {
		private MyBean bean;
		private Environments env;

		@Autowired
		public Runner(MyBean bean, Environments env) {
			this.bean = bean;
			this.env = env;
		}

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Authority: "+ env.getSecurity().getAuthority());
		}
	}


}
