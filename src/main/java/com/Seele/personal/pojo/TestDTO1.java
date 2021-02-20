package com.Seele.personal.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@TableName(value = "bd_dict")
@Getter
@Setter
@ToString
public class TestDTO1 {
    private static final long serialVersionUID = 1L;

    /**ID*/
    @TableId(value = "dict_id", type = IdType.ID_WORKER)
    private Long dictId;

    /**编码*/
    @TableField("code")
    private String code;

    /**名称*/
    @TableField("name")
    private String name;

    /**描述*/
    @TableField("description")
    private String description;

    /**创建ID*/
    @TableField("created_by")
    private Long createdBy;

    /**创建人*/
    @TableField("created_name")
    private String createdName;

    /**创建时间*/
    @TableField("creation_date")
    private java.util.Date creationDate;

    /**更新ID*/
    @TableField("last_updated_by")
    private Long lastUpdatedBy;

    /**更新人*/
    @TableField("last_updated_name")
    private String lastUpdatedName;

    /**更新时间*/
    @TableField("last_update_date")
    private java.util.Date lastUpdateDate;

    /**扩展字段*/
    @TableField("attribute1")
    private String attribute1;

    /**扩展字段*/
    @TableField("attribute2")
    private String attribute2;

    /**扩展字段*/
    @TableField("attribute3")
    private String attribute3;

    /**扩展字段*/
    @TableField("attribute4")
    private String attribute4;

    /**扩展字段*/
    @TableField("attribute5")
    private String attribute5;


}
