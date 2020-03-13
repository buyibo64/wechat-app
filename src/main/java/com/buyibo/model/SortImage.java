package com.buyibo.model;

import java.io.Serializable;

/**
 * 图片_类别关系表(SortImage)实体类
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
public class SortImage implements Serializable {
    private static final long serialVersionUID = -24005225433870973L;
    /**
    * 主键ID自增
    */
    private Long id;
    /**
    * 类别Id
    */
    private Long sortId;
    /**
    * 图片id
    */
    private Long imageId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

}