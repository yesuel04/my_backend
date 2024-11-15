package a1115;

public class Array2 {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // int[] scores = {90,80,70,85,95};

        int[] arr = new int[5];

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;

        int n = arr.length;
        System.out.println(n);
        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]); 
        }
        System.out.println();
    }
}
