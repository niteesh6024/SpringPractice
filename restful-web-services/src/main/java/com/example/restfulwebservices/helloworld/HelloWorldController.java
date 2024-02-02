package com.example.restfulwebservices.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    @GetMapping ( path = "/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }



    @GetMapping ( value = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean( "Hello World!");
    }

    @GetMapping ( value = "/hello-world/ff/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean( "Hello World! "+name);
    }
    @GetMapping ( path = "/hello-world-i18n")
    public String helloWorldi18n(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default Message",locale);
//        return "Hello World! v2";
    }

}
