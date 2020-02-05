package com.entity;

import com.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-01-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("UserName")
    private String UserName;

    @TableField("PassWord")
    private String PassWord;

    @TableField("Email")
    private String Email;

    @TableField("Phone")
    private String Phone;


}
