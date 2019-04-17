package test;

import java.util.Comparator;

/**
 * Created by lujiafeng on 2018/9/2.
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        //使用到了Person类中的compareTo方法进行比较
        //若Person没实现Comparable接口，也可以自行比较
        int ret = p1.getName().compareTo(p2.getName());
        if(ret == 0){
            return p1.getAge().compareTo(p2.getAge());
        }
        return ret;
    }
}