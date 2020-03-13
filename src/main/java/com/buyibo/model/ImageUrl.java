package com.buyibo.model;

import java.io.Serializable;

/**
 * 图片路径表(ImageUrl)实体类
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
public class ImageUrl implements Serializable {
    private static final long serialVersionUID = -11577194641554714L;
    /**
    * 主键ID
    */
    private Long urlId;
    /**
    * 图片路径
    */
    private String url;
    /**
    * 图片描述信息
    */
    private String imageDetail;


    public Long getUrlId() {
        return urlId;
    }

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageDetail() {
        return imageDetail;
    }

    public void setImageDetail(String imageDetail) {
        this.imageDetail = imageDetail;
    }

}