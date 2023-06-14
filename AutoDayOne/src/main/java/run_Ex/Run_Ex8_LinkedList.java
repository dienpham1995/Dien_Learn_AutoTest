package run_Ex;

import java.util.LinkedList;

public class Run_Ex8_LinkedList {
    public static void main(String[] args) {
        //khai báo 1 LinkedList
        LinkedList<String> nameList = new LinkedList<String>();
        //Thêm các phần tử vào nameList
        nameList.add("Bằng");
        nameList.add("Diện");
        nameList.add("Coca");
        nameList.add("Việt Anh");
        //LinkedList - sử dụng vòng lặp for cải tiến để hiển thị list
        System.out.println("Gia đình Coca có những ai nhỉ: ");
        for (String str : nameList) {
            System.out.println(str);
        }
    }
}
        //LinkedList - sử dụng vòng lặp for
//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.print( nameList.get(i));}
        // sử dụng Iterator - hiển thị các phần tử của list
//        Iterator<String> iterator = nameList.iterator();
//        System.out.println("Gia đình Coca có những ai nhỉ: ");
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }
        // sử dụng ListIterator - hiển thị các phần tử của list
//        ListIterator<String> iterator = nameList.listIterator();
//        System.out.println("Gia đình Coca có những ai nhỉ: ");
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }
// CÚ pháp khởi tạo list
//        List<Integer> mangDemo = new ArrayList<>();
//                mangDemo.add(4);
//                        mangDemo.add(5);
//
//                        LinkedList<Integer> mang = new LinkedList<>();
//        mang.add(3);
//        mang.add(31);
//        mang.add(43);
//        System.out.println(mang);
//        for (int i = 0; i < mang.size(); i++) {
//        System.out.println(mang.get(i));
//        }
//        }
