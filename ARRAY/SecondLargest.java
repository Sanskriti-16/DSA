public class SecondLargest {
    public static int SecondLargest(int[] arr){
        
       
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
       
        int count = 0;
        for(int i : arr){
            if(i == max){
                count ++;
            }
        }
        
        if(count == arr.length){
            return -1;
            
        }
         
        
        int sec_max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > sec_max && i < max){
                sec_max = i;
            }
        }
        return sec_max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 35, 5, 4};
        System.out.println(SecondLargest(arr));
    }
}

