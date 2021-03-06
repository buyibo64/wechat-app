package com.buyibo.mapper;

import com.buyibo.model.SortImage;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 图片_类别关系表(SortImage)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
public interface SortImageMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SortImage queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SortImage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sortImage 实例对象
     * @return 对象列表
     */
    List<SortImage> queryAll(SortImage sortImage);

    /**
     * 新增数据
     *
     * @param sortImage 实例对象
     * @return 影响行数
     */
    int insert(SortImage sortImage);

    /**
     * 修改数据
     *
     * @param sortImage 实例对象
     * @return 影响行数
     */
    int update(SortImage sortImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}