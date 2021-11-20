package com.shan.project.entity;

import lombok.Data;


import java.io.Serializable;
import java.util.Date;

@Data
public class Duty implements Serializable {

    private static final long serialVersionUID = 8487927004691031275L;
    private String id;

    private String name;

    private Date createTime;
}
