package sorting;

import java.util.Scanner;

public class recursive_bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble_sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void bubble_sort(int[] arr,int n){
        if(n==1) return;
        boolean didswap=false;
        for(int i=0;i<=n-2;i++){
          if(arr[i]>arr[i+1]){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            didswap=true;
          }
        }
        if(!didswap) return;
        bubble_sort(arr,n-1);
    }
    
}
