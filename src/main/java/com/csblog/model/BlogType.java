package com.csblog.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class BlogType implements Serializable{
    
	private static final long serialVersionUID = 1L;

    private Integer id;

    /** 类别名称 */
    private String typename;

    /** 该类别下的数量 */
    private Integer num;
    
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date addTime;
    

	public BlogType(Integer id, String typename, Integer num, Date addTime
			) {
		super();
		this.id = id;
		this.typename = typename;
		this.num = num;
		this.addTime = addTime;
		
	}


	public BlogType() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "BlogType [id=" + id + ", typename=" + typename + ", num=" + num
				+ ", addTime=" + addTime + "]";
	}

	
    
    
}