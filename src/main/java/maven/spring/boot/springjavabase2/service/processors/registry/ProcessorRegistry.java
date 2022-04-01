package maven.spring.boot.springjavabase2.service.processors.registry;

import maven.spring.boot.springjavabase2.service.Operation;
import maven.spring.boot.springjavabase2.service.Processor;

import java.util.Map;

public class ProcessorRegistry {

    private final Map<Operation, Processor> registery;


    public ProcessorRegistry(Map<Operation, Processor> registery) {
        this.registery = registery;
    }

    public Processor findByType(Operation operation) {
        if (!registery.containsKey(operation)) {
            throw new RuntimeException("Unnown oper");
        }

        return registery.get(operation);
    }

}
