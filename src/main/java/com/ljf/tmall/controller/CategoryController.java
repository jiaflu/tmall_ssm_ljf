package com.ljf.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljf.tmall.pojo.Category;
import com.ljf.tmall.service.CategoryService;
import com.ljf.tmall.util.ImageUtil;
import com.ljf.tmall.util.Page;
import com.ljf.tmall.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by lujiafeng on 2018/8/15.
 */

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("admin_category_list")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<Category> cs = categoryService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
        page.setTotal(total);
        model.addAttribute("cs", cs);
        model.addAttribute("page", page);
        //服务器跳转到"admin/listCategory"视图
        //“admin/listCategory” 会根据后续的springMVC.xml 配置文件，跳转到 WEB-INF/jsp/admin/listCategory.jsp 文件
        return "admin/listCategory";
    }

//    @RequestMapping("admin_category_list")
//    public ModelAndView list() {
//         //创建一个模型视图对象
//        ModelAndView mav = new ModelAndView();
//        List<Category> cs = categoryService.list();
//        mav.addObject("cs", cs);
//        mav.setViewName("admin/listCategory");
//        return mav;
//    }

//    @RequestMapping("admin_category_add")
//    public String add(Category c, HttpSession session, UploadedImageFile uploadedImageFile) throws IOException {
//        categoryService.add(c);
//        //session.getServletContext()拿到的是运行时环境，IDEA部署的位置在/target/tmall_ssm_ljf目录下
//        File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
//        //图片保存成文件的时候，使用的文件名是对应数据库数据的id字段的值
//        File file = new File(imageFolder, c.getId() + ".jpg");
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();
//        }
//        uploadedImageFile.getImage().transferTo(file);
//        BufferedImage img = ImageUtil.change2jpg(file);
//        ImageIO.write(img, ".jpg", file);
//
//        return "redirect:/admin_category_list";
//    }

    //图片上传功能可参考此处
    @RequestMapping("admin_category_add")
    public String add(Category c, HttpSession session, MultipartFile image) throws IOException {
        categoryService.add(c);
        //session.getServletContext()拿到的是运行时环境，IDEA部署的位置在/target/tmall_ssm_ljf目录下
        File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
        //图片保存成文件的时候，使用的文件名是对应数据库数据的id字段的值
        File file = new File(imageFolder, c.getId() + ".jpg");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        image.transferTo(file);
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, ".jpg", file);

        return "redirect:/admin_category_list";
    }


    @RequestMapping("admin_category_delete")
    public String delete(int id, HttpSession session) throws IOException {
        categoryService.delete(id);
        // 删除图片
        File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
        File file = new File(imageFolder, id + ".jpg");
        file.delete();

        return "redirect:/admin_category_list";
    }

    @RequestMapping("admin_category_edit")
    public String edit(int id, Model model) throws IOException {
        Category c = categoryService.get(id);
        model.addAttribute("c", c);
        return "admin/editCategory";
    }

    @RequestMapping("admin_category_update")
    public String update(Category c, HttpSession session, UploadedImageFile uploadedImageFile) throws IOException {
        categoryService.update(c);
        MultipartFile image = uploadedImageFile.getImage();
        //判断是否有图片上传
        if(image!=null && !image.isEmpty()) {
            File imageFolder = new File(session.getServletContext().getRealPath("/img/category"));
            File file = new File(imageFolder, c.getId() + ".jpg");
            image.transferTo(file);
            BufferedImage img = ImageUtil.change2jpg(file);
            ImageIO.write(img, "jpg", file);
        }
        return "redirect:/admin_category_list";
    }
}
