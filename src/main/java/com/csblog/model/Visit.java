package com.csblog.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
@Data
public class Visit implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
    
    private String ip;
    
    private String userAgent;
    
    private String city;
    
    private String url;
    
    private String browserType;//浏览器类型  
    
    
    private String platformType;//平台类型  
    
    
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date time;

    public Visit(){}  
    
    public Visit(String browserType, String platformType){  
        this.browserType = browserType;  
        this.platformType = platformType;  
    } 
}