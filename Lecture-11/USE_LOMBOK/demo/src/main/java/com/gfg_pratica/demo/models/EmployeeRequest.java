package com.gfg_pratica.demo.models;

import lombok.Data;

@Data
public class EmployeeRequest {
    private String name;
    private int age;
    private String address;
    private long phoneNumber;
    //...


    //After use of LOMBOK don't need to use, above @Data which is coming from LOMBOK and this helps to remove this
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "EmployeeRequest{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                '}';
//    }
}
