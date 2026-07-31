package sorting;
import java.util.Scanner;

public class bubble{
    public static void main(String[] args){
        int count =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean didsort=false;
            for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
              didsort=true;
              }
            }
            if(didsort==false)
                break;
            System.out.println(count);
            count++;         
        }
        sc.close();
    }
    
}
