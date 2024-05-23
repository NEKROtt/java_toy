package java_toy_1;

import java.util.LinkedList;

public interface FileWorkerInterface {
    <E> void save(E e);
    LinkedList load();
}