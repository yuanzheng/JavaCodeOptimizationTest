package com.demo.designpatterns.prototype;

public class Teacher implements Cloneable {

    private String name;  // 老师姓名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    // 重写克隆方法，堆老师类进行克隆
    public Teacher clone() {
        Teacher teacher= null;
        try {
            teacher= (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return teacher;
    }


}
