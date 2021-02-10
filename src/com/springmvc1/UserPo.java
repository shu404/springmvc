package com.springmvc1;

public class UserPo {
    private String name;
    private Integer age;
    private Boolean sex;
    private String addr;

    public UserPo() {
    }

    public UserPo(String name, Integer age, Boolean sex, String addr) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "UserPo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", addr='" + addr + '\'' +
                '}';
    }
}
