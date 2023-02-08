package ru.gil.ripper.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import ru.gil.ripper.annotation.InjectRandomInt;
import ru.gil.ripper.annotation.Profiling;

@Profiling
public class TerminatorQuoter implements Quoter{

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    @Value("I `ll be back")
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
