package com.springmvc2;

import org.hibernate.validator.constraints.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

public class UserPo {
    @NotBlank(message = "{user.name.not_blank}",groups = {LoginValid.class})
    @Length(min = 6,max = 30,message = "{user.name.length}",groups = {LoginValid.class})
    private String name;
    @NotNull(message = "age不能为null",groups = {RegValid.class})
    @Min(value = 18,message = "age不能小于18",groups = {RegValid.class})
    @Max(value = 60,message = "age不能大于60",groups = {RegValid.class})
    @Range(min = 18,max = 60,message = "age必须在18~60之间",groups = {RegValid.class})
    private Integer age;
    @NotNull(message = "sex不能为null",groups = {LoginValid.class,RegValid.class})
    @AssertTrue(message = "sex必须为true",groups = {LoginValid.class,RegValid.class})
    private Boolean sex;
    @Size(min = 10,max = 100,message = "addr长度必须在10~100之间")
    private String addr;
    @NotEmpty(message = "likes不能为空")
    private List<String> likes;
    @Email(message = "email格式不正确")
    private String email;
    @URL(message = "url不是合法的url路径")
    private String myUrl;

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

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMyUrl() {
        return myUrl;
    }

    public void setMyUrl(String myUrl) {
        this.myUrl = myUrl;
    }


}
