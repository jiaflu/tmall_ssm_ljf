package test;

import java.util.*;
import test.Person;
/**
 * Created by lujiafeng on 2018/9/2.
 */
public class Test {
    public static void main(String[] args){
        //取数据
        List<Person> personList1 = generatePersonList();
        List<Person> personList2 = generatePersonList();
        //排序一: 正常
        Collections.sort(personList1);
        print("Collections.sort(list)",personList1);
        //排序二：发现正常了
        PersonComparator pc = new PersonComparator();
        //PersonComparator2 pc2 = new PersonComparator2();
        Collections.sort(personList2,pc.thenComparing(pc));
        print("thenComparing",personList2);
        /*
        //排序三：正常
        SortedSet<Person> ts = new TreeSet<>(personList);
        print("TreeSet",ts);
        //排序四：发现某个Person实例被吃掉了,因为TreeSet认为CompareTo为0，则两个Person实例相同
        SortedSet<Person> ts2 = new TreeSet<>(new PersonComparator());
        ts2.addAll(personList);
        print("TreeSet(Comparator)",ts2);
        */
    }

    //生成待排序数组
    private static List<Person> generatePersonList() {
        List<Person> retList = new ArrayList<>(16);
        retList.addAll(
                Arrays.asList(
                        new Person[]{
                                new Person("erMaZi", 19, "good"),
                                new Person("wangWu", 18, "middle"),
                                new Person("liSi", 17, "bad"),
                                new Person("wangWu", 16, "middla"),
                        }
                )
        );
        return retList;
    }
    public static void print(String message,List<Person> personList){
        System.out.println(message+":");
        for(Person p:personList){
            System.out.println(p);
        }
        System.out.println();
    }
}
