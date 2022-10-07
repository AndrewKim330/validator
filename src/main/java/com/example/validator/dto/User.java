package com.example.validator.dto;

import com.example.validator.annotation.YearMonth;

import javax.validation.constraints.*;

public class User {
    private String name;
    @Max(value=90)
    private int age;
    @Email
    private String email;
    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "형식이 맞지 않습니다. 01X-XXX(X)-XXXX")
    private String phoneNum;

//    @Size(min=6, max=6)
    @YearMonth
    private String reqYearMonth;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getReqYearMonth() {
        return reqYearMonth;
    }

    public void setReqYearMonth(String reqYearMonth) {
        this.reqYearMonth = reqYearMonth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", reqYearMonth='" + reqYearMonth + '\'' +
                '}';
    }
}
