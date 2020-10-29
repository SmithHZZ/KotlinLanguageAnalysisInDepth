package zumax.learn.kotlin5;

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 **/
public class HelloPart02 {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        //kt中包级的方法和属性，变成Java中文件名+kt类的静态成员和方法

        Part02Kt.setStr("hello");

        System.out.println(Part02Kt.getStr());

        //静态final的方法
        Part02Kt.test();

        //没有构造器
        //我们没法用new关键字创建kt自动生成的已kt结尾的类的实例
        //Part02Kt part02Kt = new Part02Kt();




    }
}
