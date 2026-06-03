public class distbtwpositive {
    public static int distanceBetween(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
               
        while (start < n && (arr[start] <= 0 || arr[start] % 2 != 0)) { 
            start++;    
        }
        while (end >= 0 && (arr[end] <= 0 || arr[end] % 2 != 0)) { 
            end--;       
        }
        if (start < end) {  
            return end - start; 
        }

        return -1; 
    } 
     public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 5, 6}; 
        System.out.println("Distance between 2 positive elements = " + distanceBetween(arr)); 
    }
}

