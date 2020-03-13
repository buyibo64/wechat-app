package com.buyibo.model;

import java.io.Serializable;

/**
 * 图片类别表(ImageSort)实体类
 *
 * @author makejava
 * @since 2020-03-12 14:40:41
 */
public class ImageSort implements Serializable {
    private static final long serialVersionUID = 120956101437770240L;
    /**
    * 主键ID
    */
    private Long sortId;
    /**
    * 类别名称
    */
    private String sortName;
    /**
    * 户型
    */
    private String sortHousetype;
    /**
    * 房屋面积
    */
    private Integer sortArea;
    /**
    * 备用字段
    */
    private String backup;


    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortHousetype() {
        return sortHousetype;
    }

    public void setSortHousetype(String sortHousetype) {
        this.sortHousetype = sortHousetype;
    }

    public Integer getSortArea() {
        return sortArea;
    }

    public void setSortArea(Integer sortArea) {
        this.sortArea = sortArea;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

}