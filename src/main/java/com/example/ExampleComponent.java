package com.example;

import com.example.printer.StringPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleComponent {
    @Autowired
    public ExampleComponent(StringPrinter stringPrinter) {
        stringPrinter.print();
    }
}
