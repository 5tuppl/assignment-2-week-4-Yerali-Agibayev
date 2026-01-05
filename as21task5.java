class Solution 
{
    public static void main(String[] args)
    {
       int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
       printArray(array);
       reverseArray(array);
       printArray(array);
    }

    public static void reverseArray(int[] array) {
        int l = 0;
        int r = array.length - 1; // last element of array
        while (l < r) {  // 2 pointers algorithm
            int c = array[l]; // промежуточное значение
            array[l] = array[r];
            array[r] = c;
            l++;
            r--;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
