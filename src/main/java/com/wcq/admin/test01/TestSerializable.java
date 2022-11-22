package com.wcq.admin.test01;

import com.wcq.admin.bean.User;
import lombok.Data;

import java.io.*;

public class TestSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Chrildren chrildren = new Chrildren();
        chrildren.setUser(new User("zhangsan", "123"));
        //序列化将对象写入文件
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream("e:/source.txt"));//用缓冲流进行包装提高效率
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(chrildren);
        oos.close();
        bos.close();

        //将文件中的对象读出来
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:/source.txt"));
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object ob = null;

        try {
            while (true) {
                ob = ois.readObject();
                if (ob instanceof Chrildren) {
                    ob = (Chrildren) ob;
                    System.out.println(ob);
                }
            }
        } catch (EOFException e) {
            System.out.println("读取完毕");
        }

    }
}

@Data
class Chrildren implements Serializable {
    private static final long serialVersionUID = 1L;//默认生成的版本号，没有该版本号在修改代码后再执行读取操作会抛出异常
    private User user;
    private String name;
}