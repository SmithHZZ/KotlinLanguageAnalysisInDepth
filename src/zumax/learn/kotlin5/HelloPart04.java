package zumax.learn.kotlin5;

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 **/
public class HelloPart04 {


    public static void main(String[] args) {
        HelloWorld.setMyStr("hello");
        HelloWorld.setMyStr1("world");
        System.out.println(HelloWorld.getMyStr());
        System.out.println(HelloWorld.getMyStr1());

        HelloWorld.myPrint();
        HelloWorld.myPrint1();
    }
}
