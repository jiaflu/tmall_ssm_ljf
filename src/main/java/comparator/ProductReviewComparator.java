package comparator;

import com.ljf.tmall.pojo.Product;

import java.util.Comparator;

/**
 * Created by lujiafeng on 2018/8/31.
 */

//人气比较器，把评价数量多的放前面
public class ProductReviewComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount() - p1.getReviewCount();
    }
}
