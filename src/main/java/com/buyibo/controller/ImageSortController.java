package com.buyibo.controller;

import com.buyibo.model.ImageSort;
import com.buyibo.service.ImageSortService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 图片类别表(ImageSort)表控制层
 *
 * @author makejava
 * @since 2020-03-12 14:40:38
 */
@RestController
@RequestMapping("imageSort")
public class ImageSortController {
    /**
     * 服务对象
     */
    @Resource
    private ImageSortService imageSortService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ImageSort selectOne(Long id) {
        return this.imageSortService.queryById(id);
    }

}