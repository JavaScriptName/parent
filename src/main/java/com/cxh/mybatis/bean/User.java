package com.cxh.mybatis.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * User
 *
 * @author cxh
 * @version v1.0
 * @since 2019/6/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User  implements Serializable {

    /**
     * 主键ID
     */
    @TableId(value = "",type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;


    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;


    /**
     * 创建时间
     * @DateTimeFormat(pattern = "yyyy-MM-dd")
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date carateDate;

}
