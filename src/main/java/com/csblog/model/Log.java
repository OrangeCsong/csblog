package com.csblog.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
@Data
public class Log implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String userType;
    
    private String ip;

    private String description;

    private String param;
    
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date addtime;


}