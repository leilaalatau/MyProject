package Lesson4;

public class TriangleClass {
    public int someMethod(int a, int b, int c) throws MyException {
        if(a<0 || b<0) throw new MyException("Текст моей ошибки");
        int result = (a+b+c)/2;
        return result;
    }
}
