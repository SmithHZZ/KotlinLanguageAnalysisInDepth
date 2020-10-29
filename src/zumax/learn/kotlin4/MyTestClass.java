package zumax.learn.kotlin4;

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/22
 * Desc:
 **/
public class MyTestClass {

    public static void main(String[] args) {
        Object[] objects = new String[2];

        objects[0] = "hello";

        objects[1] = "world";

        //不安全的，欠妥的
        objects[0] = 1;

    }

    public void sayHi()
    {
        System.out.println("Hi!!!");
    }

    public void myArrayMethod(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    //可变参数
    public void myVariableParams(String ...args)
    {
        for (String s : args) {
            System.out.println(s);
        }
    }

}
