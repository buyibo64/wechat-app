package com.buyibo.service;

import com.buyibo.model.SortImage;
import java.util.List;

/**
 * 图片_类别关系表(SortImage)表服务接口
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
public interface SortImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SortImage queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SortImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sortImage 实例对象
     * @return 实例对象
     */
    SortImage insert(SortImage sortImage);

    /**
     * 修改数据
     *
     * @param sortImage 实例对象
     * @return 实例对象
     */
    SortImage update(SortImage sortImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}