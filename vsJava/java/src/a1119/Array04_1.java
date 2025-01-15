package a1119;

public class Array04_1 {
    public static void main(String[] args) {
        int[] arr = {4,1,8,-3,6};

        int max = arr[0];
        int min = arr[0];

        // 방법1
        for (int number : arr) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        // 방법2
        // for (int i : arr) {
        //     if(max < i) max = i;
        //     if(min > i) min = i;
        // }

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
    }
}
