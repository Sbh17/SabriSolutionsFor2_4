
public class Exercise4 {
    //-כתבו מתודה המקבלת מערך של מספרים שלמים, ומחזירה true אם הוא "מערך מלא" ו-false אחרת.
    public static int[] arraySorting(int [] arr){
        int temp;
        for (int i=0; i<arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
   public static boolean isFullArray(int [] arr){
        boolean flag = true;
       int []sortedArray = arraySorting(arr);
        for (int i = 0; i < sortedArray.length-1; ++i)
            if (sortedArray[i + 1] != (sortedArray[i] + 1)) {
                flag = false;
                break;
            }
        return flag;
   }
   // כתבו מתודה המקבלת מערך של מספרים שלמים ובודקת האם הוא "מערך מלא",
    // כאשר ידוע שערכי המערך ממוינים בסדר יורד וכל ערך מופיע פעם אחת בדיוק

    // בהנחה שהמערך בסדר יורד
    public static boolean isFullArray2(int [] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length-1; ++i){
            if (arr[i + 1] != (arr[i] - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        System.out.println(isFullArray(new int[]{15,18,17,16,14,19}));
        System.out.println(isFullArray(new int[]{5,18,17,16,14,19}));
        System.out.println(isFullArray2(new int[]{17,16,15,14,13,12,11,10}));
        System.out.println(isFullArray2(new int[]{17,12,15,13,13,12,11,10}));
    }
}
