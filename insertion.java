package sorting;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]= temp;
            j--;
          }
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
