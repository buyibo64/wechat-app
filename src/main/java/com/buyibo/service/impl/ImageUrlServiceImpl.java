package com.buyibo.service.impl;

import com.buyibo.model.ImageUrl;
import com.buyibo.mapper.ImageUrlMapper;
import com.buyibo.service.ImageUrlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片路径表(ImageUrl)表服务实现类
 *
 * @author makejava
 * @since 2020-03-12 14:40:43
 */
@Service("imageUrlService")
public class ImageUrlServiceImpl implements ImageUrlService {
    @Resource
    private ImageUrlMapper imageUrlMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param urlId 主键
     * @return 实例对象
     */
    @Override
    public ImageUrl queryById(Long urlId) {
        return this.imageUrlMapper.queryById(urlId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ImageUrl> queryAllByLimit(int offset, int limit) {
        return this.imageUrlMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param imageUrl 实例对象
     * @return 实例对象
     */
    @Override
    public ImageUrl insert(ImageUrl imageUrl) {
        this.imageUrlMapper.insert(imageUrl);
        return imageUrl;
    }

    /**
     * 修改数据
     *
     * @param imageUrl 实例对象
     * @return 实例对象
     */
    @Override
    public ImageUrl update(ImageUrl imageUrl) {
        this.imageUrlMapper.update(imageUrl);
        return this.queryById(imageUrl.getUrlId());
    }

    /**
     * 通过主键删除数据
     *
     * @param urlId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long urlId) {
        return this.imageUrlMapper.deleteById(urlId) > 0;
    }
}