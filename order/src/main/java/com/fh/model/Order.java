package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

@TableName(value = "t_order")
public class Order {

    @TableId(value = "id",type = IdType.AUTO)
  private Integer id;//	int(19)	主键订单号
  private Integer productId;//	int(19)	商品ID
  private Integer count;//	int	购买的数量
  private BigDecimal subTotal;//	decimal	小计金额
  private Integer isDel;//	Int	是否删除

    @TableField(exist = false)
    private String typeName;
    @TableField(exist = false)
    private BigDecimal typePrice;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public BigDecimal getTypePrice() {
        return typePrice;
    }

    public void setTypePrice(BigDecimal typePrice) {
        this.typePrice = typePrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
