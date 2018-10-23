package com.yb.easypoi.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * @author yangbiao
 * @Description:学生实体类
 * @date 2018/10/23
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -3944779670897279495L;

    /**
     * 入学编号
     */
    @Excel(name = "入学编号",orderNum = "1")
    private String id;

    /**
     * 姓名
     */
    @Excel(name = "姓名",orderNum = "2")
    private String name;

    /**
     * 年龄
     */
    @Excel(name = "入学编号",orderNum = "1")
    private Integer age;

    /**
     * 班级
     */
    @Excel(name = "入学编号",orderNum = "1")
    private String className;

    /**
     * 入学时间
     */
    @Excel(name = "入学时间",orderNum = "1")
    private LocalDate joinTime;

    public Student() {
        //构造时初始化id和入学时间
        this.id = UUID.randomUUID().toString().replaceAll("-:", "");
        this.joinTime = LocalDate.now();
    }

    public Student(String name, Integer age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
        //构造时初始化id和入学时间
        this.id = UUID.randomUUID().toString().replaceAll("-:", "");
        this.joinTime = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDate getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(LocalDate joinTime) {
        this.joinTime = joinTime;
    }
}
