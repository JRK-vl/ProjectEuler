public class Task_2 {
    public static void main (String []args){
        int[] arr = {1,2,0};
        int sum = 0;

        do {
            arr[2] = arr[0]+arr[1];
            arr[0] = arr[1];
            arr[1] = arr[2];
            if (arr[2]%2 == 0){
                sum += arr[2];
            }
        }while (arr[2] <= 4000000);

        System.out.println(sum);
    }
}
