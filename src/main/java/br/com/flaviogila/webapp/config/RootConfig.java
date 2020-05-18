package br.com.flaviogila.webapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.flaviogila.webapp")
@EnableWebMvc
public class RootConfig {

}