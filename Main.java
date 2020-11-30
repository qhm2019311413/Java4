package system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileUtils fu = new FileUtils();
        PoetryUtils pu = new PoetryUtils();

        String sno = "";
        String name = "";
        int age = 0;
        String classes = "";

        boolean validate = false;
        while (!validate) {
            try {
                System.out.println("请输入学生学号：");
                sno = input.nextLine();
                System.out.println("请输入学生姓名：");
                name = input.nextLine();
                System.out.println("请输入学生年龄：");
                String ages = input.nextLine();
                age = Integer.parseInt(ages);
                System.out.println("请输入学生班别：");
                classes = input.nextLine();
                validate = true;
            } catch (Exception e) {
                System.out.println("输入信息有误，请重新输入！");
                input = new Scanner(System.in);
            }
        }

        Student student = new Student(sno,name,age,classes);
        if (fu.saveStuMsg(student))
            System.out.println("存储学生信息成功！");

        String poetry = pu.processPoetry(fu.readB());
        if (fu.saveStrMsg(poetry))
            System.out.println("存储古诗信息成功！");
    }
}
