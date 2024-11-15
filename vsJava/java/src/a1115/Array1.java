package a1115;

public class Array1 {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // int[] scores = {90,80,70,85,95};

        int arr[];
        arr = new int[5];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        int n = arr.length;
        System.out.println(n);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
