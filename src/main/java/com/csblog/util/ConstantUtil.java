package com.csblog.util;

import java.io.File;

public class ConstantUtil {

    /**
     * 文章字数限制
     */
    public static final int Max_Blog_Size = 34;
    /**
     * 图片服务器路径[上传]
     */
    public static final String UPLOAD_SERVER_PATH = File.separator + "usr" + File.separator + "local" +
            File.separator + "softhome" + File.separator + "nginx-1.8.0" + File.separator + "resource" + File.separator+"csblog"+File.separator;

    /**
     * 访问图片路径
     */
    public static final String READ_IMAGE_PATH = "http://47.106.148.234:89/csblog/";

    /**
     * 博客文章中引入的图片
     */
    public static final  String ARTICLE_IMAGE_PATH = File.separator + "usr" + File.separator + "local" +
            File.separator + "softhome" + File.separator + "nginx-1.8.0" + File.separator + "resource" + File.separator + "blogarticle" + File.separator;
    /**
     * 访问图片路径
     */
    public static final String READ_ARTICLE_PATH = "http://47.106.148.234:89/blogarticle/";


    public static final String USERTYPE_ADMIN="管理员";
	
	public static final String USERTYPE_USER="普通用户";
	
	public static final String BLOG_ADD="新增博客";
	
	public static final String BLOG_DELETE="删除博客";
	
	public static final String BLOG_UPDATE="更新博客";
	
	public static final String BLOG_SELECT="查看博客";
	
	public static final String BLOG_FINDKEY="关键字查询博客";
	
	public static final String BLOGTYPE_ADD="新增博客类别";
	
	public static final String BLOGTYPE_UPDATE="修改博客类别";
	
	public static final String BLOGTYPE_DELETE="删除博客类别";
	
	public static final String RESOURCE_ADD="新增资源";
	
	public static final String RESOURCE_UPDATE="更新资源";
	
	public static final String RESOURCE_DELETE="删除资源";
	
	public static final String RESOURCE_FINDKEY="关键字查询资源";
	
	public static final String BACKIP_DELETE="删除黑名单";
	
	public static final String BACKIP_ADD="新增黑名单";
	
	public static final String UPLOAD_IMAGES="上传了图片";
	
	public static final String DELETE_IMAGES="删除了图片";
	
	public static final String LOGIN_IN="登录了系统";
	
	public static final String LOGIN_OUT="退出了系统";
	
	public static final String LINKS_ADD="新增友链";
	
	public static final String LINKS_UPDATE="更新友链";
	
	public static final String LINKS_DELETE="删除友链";
}
