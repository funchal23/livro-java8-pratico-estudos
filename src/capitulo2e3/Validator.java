package capitulo2e3;

@FunctionalInterface
public interface Validator<T> {

    boolean valid(T t);
}
