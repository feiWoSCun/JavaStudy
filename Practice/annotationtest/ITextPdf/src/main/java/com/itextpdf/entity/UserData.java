package com.itextpdf.entity;

import com.itextpdf.annotation.ColumnName;

import java.security.PrivateKey;

public class UserData {
    @ColumnName(value = "昵称")
    private String nickName;
    @ColumnName(value = "性别")
    private String sex;
    @ColumnName(value = "部门编号")
    private String deptId;
    @ColumnName(value = "手机号码")
    private String phonenumber;
    @ColumnName(value = "账号")
    private String userName;
    @ColumnName(value = "用户Id")
    private String userId;
    @ColumnName(value = "电子邮箱")
    private String email;
    @ColumnName(value = "账号状态")
    private String status;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return nickName + "," +
                sex + "," +
                deptId + "," +
                phonenumber + "," +
                userName + "," +
                userId + "," +
                email + "," +
                status + ",";
    }
}
