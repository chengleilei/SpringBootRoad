package com.example.sbtMybatisP.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class T_user {
    @TableId(value="id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public String getScore() {
        return score;
    }

    public Integer getAge() {
        return age;
    }

    private String score;
    private Integer age;
}
