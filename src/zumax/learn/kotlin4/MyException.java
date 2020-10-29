package zumax.learn.kotlin4;

import java.io.IOException;

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 **/
public class MyException {

    public void myMethod() throws IOException {
        throw new IOException("IO异常");
    }
}
