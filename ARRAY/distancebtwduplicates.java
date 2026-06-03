public class distancebtwduplicates {
      public static int max(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static int distanceBetweenDuplicates(int[] arr){
        int n = arr.length;
        int dist = 0; // taking initial distance = 0

        for(int start = 0; start < n; start ++){ // moving start
            for(int end = start; end < n; end++){ // moving end 
                if(arr[start] == arr[end]){
                    dist = max(dist, end-start); 
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 5, 2, 3}; 
        System.out.println("Distance between Duplicates = " + distanceBetweenDuplicates(arr)); 
    }

}

