package Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dz4Test {
    @Test
    void test() throws MyException {
        final TriangleClass triangleClass = new TriangleClass();
        Assertions.assertEquals(30,triangleClass.someMethod(10,20,10));
        Assertions.assertThrows(MyException.class,()-> triangleClass.someMethod(-10,20,10));
    }

}
