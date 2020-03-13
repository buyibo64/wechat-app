package com.buyibo.service;

import com.buyibo.model.ImageSort;
import java.util.List;

/**
 * 图片类别表(ImageSort)表服务接口
 *
 * @author makejava
 * @since 2020-03-12 14:40:34
 */
public interface ImageSortService {

    /**
     * 通过ID查询单条数据
     *
     * @param sortId 主键
     * @return 实例对象
     */
    ImageSort queryById(Long sortId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ImageSort> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param imageSort 实例对象
     * @return 实例对象
     */
    ImageSort insert(ImageSort imageSort);

    /**
     * 修改数据
     *
     * @param imageSort 实例对象
     * @return 实例对象
     */
    ImageSort update(ImageSort imageSort);

    /**
     * 通过主键删除数据
     *
     * @param sortId 主键
     * @return 是否成功
     */
    boolean deleteById(Long sortId);

}