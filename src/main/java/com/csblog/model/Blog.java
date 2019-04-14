package com.csblog.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@ToString
public class Blog implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** 自增 */
    private Integer id;

    /** 博客标题 */
    private String title;

    /** 博客简介/摘要 */
    private String introduction;

    /**  */
    private String keyword;

    /** 封面缩略图等 */
    private String images;

    /** 点击量 */
    private Integer clicknum;

    /** 评论量 */
    private Integer commentnum;

    /** 点赞量 */
    private Integer agreenum;

    /** 1置顶，0普通 */
    private Integer istop;

    /** 博主推荐,1为推荐，0为普通 */
    private Integer isrecommend;

    /**  */
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updatetime;

    /**  */
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date addtime;

    /** -1为草稿，1为正文 ，2为回收站*/
    private Integer status;

    /** 类别 */
   
    private com.csblog.model.BlogType type;

    /** 博客内容 */
    private String content;

	public Blog(Integer id, String title, String introduction, String keyword,
			String images, Integer clicknum, Integer commentnum,
			Integer agreenum, Integer istop, Integer isrecommend,
			Date updatetime, Date addtime, Integer status, com.csblog.model.BlogType type,
			String content) {
		super();
		this.id = id;
		this.title = title;
		this.introduction = introduction;
		this.keyword = keyword;
		this.images = images;
		this.clicknum = clicknum;
		this.commentnum = commentnum;
		this.agreenum = agreenum;
		this.istop = istop;
		this.isrecommend = isrecommend;
		this.updatetime = updatetime;
		this.addtime = addtime;
		this.status = status;
		this.type = type;
		this.content = content;
	}

	public Blog() {
		// TODO Auto-generated constructor stub
	}

}