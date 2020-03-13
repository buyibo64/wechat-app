package com.buyibo.controller;

import com.buyibo.model.ImageUrl;
import com.buyibo.service.ImageUrlService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 图片路径表(ImageUrl)表控制层
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
@RestController
@RequestMapping("imageUrl")
public class ImageUrlController {
    /**
     * 服务对象
     */
    @Resource
    private ImageUrlService imageUrlService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ImageUrl selectOne(Long id) {
        return this.imageUrlService.queryById(id);
    }

}