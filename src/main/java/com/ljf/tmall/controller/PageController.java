package com.ljf.tmall.controller;

import com.ljf.tmall.mapper.ProductMapper;
import com.ljf.tmall.pojo.Product;
import com.ljf.tmall.pojo.ProductExample;
import com.ljf.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/25.
 */
@Controller
@RequestMapping("")
public class PageController {

    @Autowired
    ProductService productService;
    @Autowired
    ProductMapper productMapper;

    @RequestMapping("registerPage")
    public String registerPage() {
        return "fore/register";
    }

    @RequestMapping("registerSuccessPage")
    public String registerSuccessPage() {
        return "fore/registerSuccess";
    }

    @RequestMapping("loginPage")
    public String loginPage() {
        return "fore/login";
    }

    @RequestMapping("forealipay")
    public String alipay() {
        return "fore/alipay";
    }

//    @RequestMapping("foreSetAllProductImage")
//    @ResponseBody
//    public String SetAllProductImage() {
//        ProductExample example = new ProductExample();
//        example.setOrderByClause("id desc");
//        List<Product> ps = productMapper.selectByExample(example);
//        for (Product p : ps) {
//            productService.setFirstProductImage(p);
//            System.out.println(p.getFirstProductImage());
//            productService.update(p);
//        }
//        return "SetAllProductImage OK!";
//    }
//
//    @RequestMapping("foreimage")
//    @ResponseBody
//    public String image() {
//        ProductExample example = new ProductExample();
//        example.setOrderByClause("id desc");
//        List<Product> ps = productMapper.selectByExample(example);
//        for (Product p : ps) {
//            //productService.setFirstProductImage(p);
//            //productService.update(p);
//            System.out.println(p.getFirstProductImage());
//        }
//        return "sucess";
//    }

}
