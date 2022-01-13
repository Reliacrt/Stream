package xyz.relia.stream.util;

public class Id {

    private static int maxId;

    public Id() {
        maxId = 0;
    }

    public synchronized int nextId() {
        return maxId++;
    }
}
