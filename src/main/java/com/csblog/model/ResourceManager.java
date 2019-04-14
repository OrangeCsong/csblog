package com.csblog.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
@Data
public class ResourceManager implements Serializable{
   
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String title;

    private String content;

    private String link;

    private String password;
    
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date addtime;

    private Integer status;

}