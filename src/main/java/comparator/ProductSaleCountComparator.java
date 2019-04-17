package comparator;

import com.ljf.tmall.pojo.Product;

import java.util.Comparator;

/**
 * Created by lujiafeng on 2018/8/31.
 */

//销量比价器 把 销量高的放在前面
public class ProductSaleCountComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount()-p1.getSaleCount();
    }

}