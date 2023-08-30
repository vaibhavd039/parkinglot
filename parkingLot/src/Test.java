import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    class MyComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return -1;
            } else if (o1.equals(o2)) {
                return 0;
            } else return 1;
        }
    }

    public static void main(String[] args) {

        int[] data = {10, 9, 8, 7, 50, 6, 1, 2, 3, 4, 50};


        Map<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            mymap.putIfAbsent(data[i], 0);
            int frequncy = (Integer) mymap.get(data[i]);
            mymap.put(data[i], ++frequncy);
        }

        List<Integer> duplicate =
                mymap.entrySet().stream().filter(element -> element.getValue() > 1).map(element -> element.getKey()).collect(Collectors.toList());
        duplicate.forEach(element -> System.out.println(element));
//
//        //
//        // output : 6,7,8,9,10,5,4,3,2,1;
//
//        int[] temp1 = new int[data.length / 2];
//        int n = data.length;
//        Arrays.sort(data, 0, n / 2);
//        Arrays.sort(data, n / 2, n, new MyComparator());
//        for (int i = data.length / 2; i < data.length; ++) {
//            temp1[i - (data.length / 2)] = data[i];
//        }
//        for (int i = 0; i < temp1.length; i++) {
//            data[i] = temp1[i];
//        }
    }
}
