package com.demo.designpatterns.prototype;

public class TestMain {

    public static void main(String args[]) {
        Teacher teacher = new Teacher (); // 定义老师 1
        teacher.setName(" 刘老师 ");
        Student stu1 = new Student();  // 定义学生 1
        stu1.setName("test1");
        stu1.setTeacher(teacher);

        Student stu2 = stu1.clone(); // 定义学生 2

        stu2.setName("test2");
        stu2.getTeacher().setName(" 王老师 ");// 修改老师
        System.out.println(" 学生 " + stu1.getName() + " 的老师是:" + stu1.getTeacher().getName());
        System.out.println(" 学生 " + stu2.getName() + " 的老师是:" + stu2.getTeacher().getName());
    }
}
