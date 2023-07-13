import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class revArray{
    public static int[] verify(int A[])
    {
        Scanner	sc = new Scanner(System.in);
        int size = A.length;
        int B = sc.nextInt();
        int C = sc.nextInt();
        while(B<C) {
            int temp = A[B];
            A[B]=A[C];
            A[C]=temp;
            B++;C--;
        }
        return A;
    }
}
public class revrseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        revArray Array = new revArray();
        int pair[]=revArray.verify(arr);
        for(int i=0;i<pair.length;i++) {
            System.out.print(pair[i]);
        }
    }
}