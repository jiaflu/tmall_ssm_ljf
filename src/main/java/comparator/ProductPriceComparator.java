package comparator;

import com.ljf.tmall.pojo.Product;

import java.util.Comparator;

/**
 * Created by lujiafeng on 2018/8/31.
 */

//价格比较器， 把价格低的放在前面
public class ProductPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getPromotePrice()-p2.getPromotePrice());
    }

}