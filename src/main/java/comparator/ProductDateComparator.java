package comparator;

import com.ljf.tmall.pojo.Product;

import java.util.Comparator;

/**
 * Created by lujiafeng on 2018/8/31.
 */

//新品比较器 把 创建日期晚的放在前面
public class ProductDateComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getCreateDate().compareTo(p1.getCreateDate());
    }
}
