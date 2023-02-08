package ru.gil.ripper;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gil.ripper.component.Quoter;
import ru.gil.ripper.configuration.MyConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Quoter quoter = context.getBean("terminatorQuoter", Quoter.class);
            quoter.sayQuote();
    }
}
