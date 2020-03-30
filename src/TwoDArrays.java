public class TwoDArrays {
    public static int maxValue(int[][] arr){
        int maxnum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for (int x=0; x<arr[0].length; x++){
                if(maxnum<arr[i][x])
                    maxnum= arr[i][x];
            }
        }
        return maxnum;
    }
    public static int sumAll(int[][] arr){
        int total= 0;
        for (int i= 0; i<arr.length; i++){
            for (int x=0; x<arr[0].length; i++){
                total+= arr[i][x];
            }
        }
        return total;
    }
    public static boolean isSquare(int[][] arr){
        if(arr.length==arr[0].length)
            return true;
        else
            return false;
    }
}
