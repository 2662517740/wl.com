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
public class Address extends BaseEntity {

    private static final long serialVersionUID = 1L;


    @TableField("Name")
    private String Name;

    @TableField("Phone")
    private Integer Phone;

    @TableField("Address")
    private String Address;

    @TableField("Ascription")
    private String Ascription;

    @TableField("isDefault")
    private Boolean isDefault;


}
