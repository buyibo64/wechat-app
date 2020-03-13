package com.buyibo.mapper;

import com.buyibo.model.ImageSort;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 图片类别表(ImageSort)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-12 14:40:41
 */
public interface ImageSortMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param sortId 主键
     * @return 实例对象
     */
    ImageSort queryById(Long sortId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ImageSort> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param imageSort 实例对象
     * @return 对象列表
     */
    List<ImageSort> queryAll(ImageSort imageSort);

    /**
     * 新增数据
     *
     * @param imageSort 实例对象
     * @return 影响行数
     */
    int insert(ImageSort imageSort);

    /**
     * 修改数据
     *
     * @param imageSort 实例对象
     * @return 影响行数
     */
    int update(ImageSort imageSort);

    /**
     * 通过主键删除数据
     *
     * @param sortId 主键
     * @return 影响行数
     */
    int deleteById(Long sortId);

}