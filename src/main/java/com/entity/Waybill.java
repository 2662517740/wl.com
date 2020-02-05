package com.entity;

import java.math.BigDecimal;
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
public class Waybill extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("WaybillNo")
    private String WaybillNo;

    @TableField("SenderName")
    private String SenderName;

    @TableField("SenderPhone")
    private Integer SenderPhone;

    @TableField("SenderAddress")
    private String SenderAddress;

    @TableField("RecipientName")
    private String RecipientName;

    @TableField("RecipientPhone")
    private Integer RecipientPhone;

    @TableField("RecipientAddress")
    private String RecipientAddress;

    @TableField("Weight")
    private BigDecimal Weight;

    @TableField("Remarks")
    private String Remarks;

    @TableField("State")
    private String State;

    @TableField("Time")
    private LocalDateTime Time;

    @TableField("isChange")
    private Boolean isChange;

    @TableField("isSupplement")
    private Boolean isSupplement;

    @TableField("isReturn")
    private Boolean isReturn;


}
