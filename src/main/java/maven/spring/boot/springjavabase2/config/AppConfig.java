package maven.spring.boot.springjavabase2.config;

import maven.spring.boot.springjavabase2.service.Operation;
import maven.spring.boot.springjavabase2.service.Processor;
import maven.spring.boot.springjavabase2.service.processors.registry.ProcessorRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
@Configuration
public class AppConfig {


@Bean
    public ProcessorRegistry processorRegistry(Processor sumProcessor, Processor subtractProcessor) {


        return new ProcessorRegistry(Map.of(

                Operation.PLUS,sumProcessor, Operation.MINUS, subtractProcessor

        ));


    }

}
