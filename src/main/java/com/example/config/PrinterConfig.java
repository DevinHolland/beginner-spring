package com.example.config;

import com.example.printer.HelloWorldPrinter;
import com.example.printer.StringPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public StringPrinter stringPrinter() {
        return new HelloWorldPrinter();
    }
}
