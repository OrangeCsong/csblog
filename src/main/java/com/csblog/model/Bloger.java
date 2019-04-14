package com.csblog.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class Bloger implements Serializable {

  private static final long serialVersionUID = 1L;

  /** */
  private Integer id;

  /** 用户名 */
  private String username;

  /** 密码 */
  private String password;

  /** 博主邮箱 */
  private String email;

}
