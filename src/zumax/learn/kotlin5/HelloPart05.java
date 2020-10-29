package zumax.learn.kotlin5;

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 **/
public class HelloPart05 {

    public static void main(String[] args) {
        Person person = new Person();

        person.age = 10;

        person.setName("Hello");

        System.out.println(person.getName());

        //对其中伴生对象的访问
        Person.Companion.sayHi();

        System.out.println(Person.Companion.getHello());

        //在伴生对象中 被@JvmField修饰的属性，使用类名直接访问

        //伴生对象的类型是类中的匿名类，
        //Companion 静态公开对象
        System.out.println(Person.world);


        //伴生对象中的方法 加了@JvmStatic 的注解 的方法
        //既会在伴生对象中存在，也会在类中存在
        //静态方法
        Person.Companion.sayHi2();

        Person.sayHi2();
    }

}
