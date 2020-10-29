package zumax.learn.kotlin5;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 **/
public class HelloPart06 {

    public static void main(String[] args) {
        List<String> strings = Part06Kt.myFilter(new ArrayList<>());

        List<Integer> integers = Part06Kt.myFilter2(new ArrayList());

        strings.forEach(System.out::println);

        integers.forEach( integer -> {
            System.out.println(integer);
        });

    }
}
