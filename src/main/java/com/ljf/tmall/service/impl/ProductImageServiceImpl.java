package com.ljf.tmall.service.impl;

import com.ljf.tmall.mapper.ProductImageMapper;
import com.ljf.tmall.pojo.Product;
import com.ljf.tmall.pojo.ProductImage;
import com.ljf.tmall.pojo.ProductImageExample;
import com.ljf.tmall.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/21.
 */
@Service
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    ProductImageMapper productImageMapper;

    @Override
    public void add(ProductImage pi) {
        productImageMapper.insert(pi);
    }

    @Override
    public void delete(int id) {
        productImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ProductImage pi) {
        productImageMapper.updateByPrimaryKeySelective(pi);
    }

    @Override
    public ProductImage get(int id) {
        return productImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int pid, String type) {
        ProductImageExample example = new ProductImageExample();
        ProductImageExample.Criteria criteria = example.createCriteria();
        criteria.andPidEqualTo(pid)
                .andTypeEqualTo(type);
        example.setOrderByClause("id desc");

        List<ProductImage> result = productImageMapper.selectByExample(example);

        return result;
    }
}
