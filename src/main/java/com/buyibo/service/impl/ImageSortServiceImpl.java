package com.buyibo.service.impl;

import com.buyibo.model.ImageSort;
import com.buyibo.mapper.ImageSortMapper;
import com.buyibo.service.ImageSortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片类别表(ImageSort)表服务实现类
 *
 * @author makejava
 * @since 2020-03-12 14:40:36
 */
@Service("imageSortService")
public class ImageSortServiceImpl implements ImageSortService {
    @Resource
    private ImageSortMapper imageSortMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param sortId 主键
     * @return 实例对象
     */
    @Override
    public ImageSort queryById(Long sortId) {
        return this.imageSortMapper.queryById(sortId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ImageSort> queryAllByLimit(int offset, int limit) {
        return this.imageSortMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param imageSort 实例对象
     * @return 实例对象
     */
    @Override
    public ImageSort insert(ImageSort imageSort) {
        this.imageSortMapper.insert(imageSort);
        return imageSort;
    }

    /**
     * 修改数据
     *
     * @param imageSort 实例对象
     * @return 实例对象
     */
    @Override
    public ImageSort update(ImageSort imageSort) {
        this.imageSortMapper.update(imageSort);
        return this.queryById(imageSort.getSortId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sortId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long sortId) {
        return this.imageSortMapper.deleteById(sortId) > 0;
    }
}