package maven.spring.boot.springjavabase2.service;

import maven.spring.boot.springjavabase2.service.processors.registry.ProcessorRegistry;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    private final ProcessorRegistry registery;

    public Calculator(ProcessorRegistry registery) {
        this.registery = registery;
    }
    @Calculable
    public int calculate(int a, int b, Operation operation) {
        return registery.findByType(operation).process(a, b);

    }

}
