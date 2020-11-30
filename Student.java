package system;

public class Student {
    private String sno;
    private String name;
    private int age;
    private String classes;

    public Student() {
    }

    public Student(String sno, String name, int age, String classes) {
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getclass() {
        return classes;
    }

    public void setclass(String classes) {
        this.classes = classes;
    }

    public String getMessage() {
        return "学号：" + sno + " 姓名：" + name + " 年龄：" + age + " 班别：" + classes;
    }
}
