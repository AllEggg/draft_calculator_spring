package maven.spring.boot.springjavabase2.service;

public interface Processor {

    Operation getOperation();

    int process(int a, int b);

}
