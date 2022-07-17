package com.oxigen.hardware.penstore;

public class User {
    String imgPath;
    String user_key;
    String username;
    String email;
    String fullName;
    String address;
    String phoneNum;
    String security_key;

    public User(String imgPath,
                String user_key,
                String username,
                String email,
                String fullName,
                String address,
                String phoneNum,
                String security_key){
        this.imgPath = imgPath;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.security_key = security_key;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getUser_key() {
        return user_key;
    }

    public void setUser_key(String user_key) {
        this.user_key = user_key;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSecurity_key() {
        return security_key;
    }

    public void setSecurity_key(String security_key) {
        this.security_key = security_key;
    }

}
