package com.web.entity;

import com.web.entity.BaseEntity;
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
public class Supplement extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("WaybillNo")
    private String WaybillNo;

    @TableField("Reason")
    private String Reason;



}
