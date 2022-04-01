package maven.spring.boot.springjavabase2.service.processors;

import maven.spring.boot.springjavabase2.service.Operation;
import maven.spring.boot.springjavabase2.service.Processor;
import org.springframework.stereotype.Component;

@Component
public class SubtractProcessor implements Processor {
    @Override
    public Operation getOperation() {
        return Operation.MINUS;
    }

    @Override
    public int process(int a, int b) {
        return a - b;
    }
}
