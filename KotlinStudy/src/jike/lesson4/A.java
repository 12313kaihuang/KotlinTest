package jike.lesson4;

/**
 * @author Hy
 * created on 2020/05/13 21:21
 **/
public class A implements AInterface{

    public static A a = new A();

    public static String format(String string) {
        return string.isEmpty() ? null : string;
    }

    @Override
    public void printNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void printNumber(Integer num) {
        System.out.println("Integer");
    }
}
