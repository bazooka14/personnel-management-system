package repository;

public interface Repository<T> {
    int getSize();

    void add(T item);

    void add(T[] items);

    T findById(int id);
}
