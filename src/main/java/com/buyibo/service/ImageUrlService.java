package com.buyibo.service;

import com.buyibo.model.ImageUrl;
import java.util.List;

/**
 * 图片路径表(ImageUrl)表服务接口
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
public interface ImageUrlService {

    /**
     * 通过ID查询单条数据
     *
     * @param urlId 主键
     * @return 实例对象
     */
    ImageUrl queryById(Long urlId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ImageUrl> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param imageUrl 实例对象
     * @return 实例对象
     */
    ImageUrl insert(ImageUrl imageUrl);

    /**
     * 修改数据
     *
     * @param imageUrl 实例对象
     * @return 实例对象
     */
    ImageUrl update(ImageUrl imageUrl);

    /**
     * 通过主键删除数据
     *
     * @param urlId 主键
     * @return 是否成功
     */
    boolean deleteById(Long urlId);

}