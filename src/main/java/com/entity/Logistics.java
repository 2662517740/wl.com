package com.entity;

import com.entity.BaseEntity;

import java.time.LocalDateTime;
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
public class Logistics extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("WaybillNo")
    private String WaybillNo;

    @TableField("State")
    private String State;

    @TableField("Time")
    private LocalDateTime Time;

    @TableField("Details")
    private String Details;


}
