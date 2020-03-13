package com.buyibo.service.impl;

import com.buyibo.model.SortImage;
import com.buyibo.mapper.SortImageMapper;
import com.buyibo.service.SortImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片_类别关系表(SortImage)表服务实现类
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
@Service("sortImageService")
public class SortImageServiceImpl implements SortImageService {
    @Resource
    private SortImageMapper sortImageMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SortImage queryById(Long id) {
        return this.sortImageMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SortImage> queryAllByLimit(int offset, int limit) {
        return this.sortImageMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sortImage 实例对象
     * @return 实例对象
     */
    @Override
    public SortImage insert(SortImage sortImage) {
        this.sortImageMapper.insert(sortImage);
        return sortImage;
    }

    /**
     * 修改数据
     *
     * @param sortImage 实例对象
     * @return 实例对象
     */
    @Override
    public SortImage update(SortImage sortImage) {
        this.sortImageMapper.update(sortImage);
        return this.queryById(sortImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sortImageMapper.deleteById(id) > 0;
    }
}