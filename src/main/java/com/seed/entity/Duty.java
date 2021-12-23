package com.seed.entity;

import java.io.Serializable;
import java.util.Date;


public class Duty implements Serializable {

    private static final long serialVersionUID = 8487927004691031275L;
    private String id;

    private String name;

    private Date createTime;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getCreateTime(){
        return this.createTime;
    }

    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }


}
