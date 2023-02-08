package ru.gil.ripper.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gil.ripper.component.Quoter;
import ru.gil.ripper.component.TerminatorQuoter;
import ru.gil.ripper.service.InjectRandomIntAnnotationPostProcessor;
import ru.gil.ripper.service.ProfilingHandlerBeanPostProcessor;

@Configuration
public class MyConfig {

    @Bean
    public Quoter terminatorQuoter() {
        return new TerminatorQuoter();
    }

    @Bean
    public InjectRandomIntAnnotationPostProcessor injectRandomIntAnnotationPostProcessor() {
        return new InjectRandomIntAnnotationPostProcessor();
    }

    @Bean
    public ProfilingHandlerBeanPostProcessor profilingHandlerBeanPostProcessor() throws Exception {
        return new ProfilingHandlerBeanPostProcessor();
    }
}
