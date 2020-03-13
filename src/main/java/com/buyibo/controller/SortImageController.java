package com.buyibo.controller;

import com.buyibo.model.SortImage;
import com.buyibo.service.SortImageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 图片_类别关系表(SortImage)表控制层
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
@RestController
@RequestMapping("sortImage")
public class SortImageController {
    /**
     * 服务对象
     */
    @Resource
    private SortImageService sortImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SortImage selectOne(Long id) {
        return this.sortImageService.queryById(id);
    }

}