package com.ljf.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by lujiafeng on 2018/8/17.
 */

//注：此处的属性名称image必须和
//<input id="categoryPic" accept="image/*" type="file" name="image" />
    //中的type="file"的name值保持一致
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
