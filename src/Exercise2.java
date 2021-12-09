
public class Exercise2 {
    /*---------------------------------------/
    function check if sum of digits is equal
    /--to other return true else return false
    ---------------------------------------- */
   public static boolean isBrothers(int firstNum , int secondNum){
       int sum1 = 0 , sum2 = 0 ;
       if(firstNum <0 ){
           firstNum *=(-1);
           if (secondNum < 0){
               secondNum *= (-1);
           }
           while (firstNum>0 || secondNum >0){
               sum1 = sum1 + (firstNum % 10);
               firstNum = firstNum / 10;
               sum2 = sum2 + (secondNum % 10);
               secondNum = secondNum / 10;
           }
       } else if (firstNum > 0){
           if (secondNum<0){
               secondNum *= (-1);
           }
           while (firstNum>0 || secondNum >0){
               sum1 = sum1 + (firstNum % 10);
               firstNum = firstNum / 10;
               sum2 = sum2 + (secondNum % 10);
               secondNum = secondNum / 10;
           }
       }
       else {
           while (firstNum>0 || secondNum >0){
               sum1 += firstNum % 10;
               firstNum /= 10;
               sum2 = sum2 + (secondNum % 10);
               secondNum = secondNum / 10;
           }
       }
       return (sum1 == sum2);
   }
   public static int countingBrothers(int [] arr , int number){
       int cnt =0 ;
       for (int i = arr.length-1; i >= 0; i--){
           if (isBrothers(arr[i],number)){
               ++ cnt;
           }
       }
       return cnt;
   }
   public static int maximumCounterOfBrother(int [] arr1 ,int[]arr2 ){
       int location = 0;
       int maxCounted = 0;
       for (int i = 0; i <= arr1.length-1; ++i) {
               if (maxCounted < countingBrothers(arr2, arr1[i])) {
                   maxCounted = countingBrothers(arr2, arr1[i]);
                   location = i;
           }
       }
       System.out.println("the counter equals to : "+ maxCounted);
       return location;
   }

    public static void main(String[] args) {
        System.out.println(isBrothers(20,-2));
        // System.out.println(isBrothers(-20,2));
         int [] arr ={28,19,29,88,78,112,25};
         int [] arr2 = {52,70,7,700,-700,67};
         System.out.println(maximumCounterOfBrother(arr,arr2));
    }
}
