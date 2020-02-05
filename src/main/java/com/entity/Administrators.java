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
public class Administrators extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("Account")
    private String Account;

    @TableField("PassWord")
    private String PassWord;



}
