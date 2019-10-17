package com.demo.designpatterns.prototype;

/** 使用自身实现的克隆接口来复制 自己！避免 浅 拷贝
 *
 */
public class Student implements Cloneable {

    private String name; // 学生姓名
    private Teacher teacher; // 定义老师类

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    // 重写克隆方法
    public Student clone() {

        Student student = null;
        try {
            student = (Student) super.clone();

            Teacher teacher = this.teacher.clone();// 克隆 teacher 对象
            student.setTeacher(teacher);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

}
