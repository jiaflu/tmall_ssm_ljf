package com.ljf.tmall.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lujiafeng on 2018/8/19.
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        String today = "2018-8-19";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date now = simpleDateFormat.parse(today);
        Date d = new Date();
        if (d.getTime() > now.getTime() + 1000*60*60*24) {
            System.err.println("--------未成功运行--------");
            System.err.println("本程序具有破坏作用，应该只运行一次，如果必须再运行，需要修改today变量为今天，如：" + simpleDateFormat.format(new Date()));
            return;
        }

        //以下代码类似
        System.out.println("start");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //InputStream is = Generator.class.getClassLoader().getResource("src/resources/generatorConfig.xml").openStream();
        File configFile = new File("src/main/resources/generatorConfig.xml");
        System.out.println(configFile);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        //is.close();
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("生成代码成功，只能执行一次，以后执行会覆盖掉mapper、pojo、xml等文件上做的修改");
    }
}
