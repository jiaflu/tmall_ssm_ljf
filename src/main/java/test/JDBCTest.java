package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {




    public static void main(String[] args) {
        //@Autowired
        JdbcTemplate jdbcTemplate = null;


        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(ctx);
        //jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

        //System.out.println(jdbcTemplate);

    }
}
