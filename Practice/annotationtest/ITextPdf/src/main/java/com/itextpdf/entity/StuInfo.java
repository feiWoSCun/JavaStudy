package com.itextpdf.entity;

import com.itextpdf.annotation.ColumnName;

public class StuInfo {
    @ColumnName(value = "学生姓名")
    private String stuName;
    @ColumnName(value = "学生成绩")
    private String stuCore;
    @ColumnName(value = "年龄")
    private String stuAge;
    @ColumnName(value = "学生年级")
    private String stuGrade;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuCore() {
        return stuCore;
    }

    public void setStuCore(String stuCore) {
        this.stuCore = stuCore;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    @Override
    public String toString() {
        return
                stuName + "," +
                        stuCore + "," +
                        stuAge+","+
                        stuGrade + ","
                ;
    }
}
