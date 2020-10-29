package learn.java;

public class Main implements ITest {
    public static void main(String[] args) {
        Main main = new Main();
        main.Test01();
        main.Test02();
    }

    @Override
    public void Test01() {
        Test02();
    }
}

interface ITest {
    public void Test01();

    public default void Test02() {
        System.out.println("Hello");
    }
}
