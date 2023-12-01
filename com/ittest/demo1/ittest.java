package com.ittest.demo1;

public class ittest {
    public static void main(String[] args) {
        System.out.println("ITTEST");
    }
}
//写一个漂亮的程序，要求：web登陆页面
class LoginPage {
    public static void main(String[] args) {
        System.out.println("欢迎来到ITTEST");
        System.out.println("请输入用户名：");
        String username = scan.nextLine();
        System.out.println("请输入密码：");
        String password = scan.nextLine();
        if (username.equals("ittest") && password.equals("123456")) {
            System.out.println("登录成功");
        }
    }
}

//检查cpu/内存/硬盘使用率
class CheckResource {
    public static void main(String[] args) {
        System.out.println("检查资源");
        System.out.println("CPU使用率：");
        double cpu = 0.5;
        System.out.println("内存使用率：");
        double memory = 0.5;
        System.out.println("硬盘使用率：");
        double disk = 0.5;
        if ()
    }
}

//写一组1-100循环奇数
class OddNumber {
    public static void main(String[] args) {
        System.out.println("奇数");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
class EvenNumber {
    public static void main(String[] args) {
        System.out.println("偶数");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
