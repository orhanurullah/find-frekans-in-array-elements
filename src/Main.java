import java.util.Arrays;

public class Main {

    public static int frekans(int[] data, int a){
        int count = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i] == a){
                count++;
            }
        }
        return count;
    }

    public static void findFrekans(int[] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            boolean state = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                   state = false;
                }
            }
            if(state){
                System.out.println(arr[i] + " sayısı " + frekans(arr, arr[i]) + " kere tekrar edildi");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 10 ,20, 20, 20, 14, 12, 20, 20, 10, 12, 15};
        findFrekans(arr);
    }
}
