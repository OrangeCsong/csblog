package com.csblog.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Links implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String link;
    
    private String name;

    private Integer clicknum;
    
    private Integer sort;
    
    private Integer status;
    
    private Integer isapply;
    
    private Date addtime;
    
}