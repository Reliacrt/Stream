package xyz.relia.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

public class MainTest {

    @Test
    public void testFunc() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(9);
        var m = list.stream().collect(Collectors.toMap(v -> v * 2, v -> v));
        System.out.println(m);
        m = list.stream().collect(Collectors.toMap(v -> v * 2, Function.identity()));
        System.out.println(m);

        System.out.println(Byte.parseByte("123"));
    }
}
