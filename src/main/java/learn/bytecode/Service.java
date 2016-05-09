package learn.bytecode;

public interface Service {

    default String name() {
        return "OK";
    }

}
