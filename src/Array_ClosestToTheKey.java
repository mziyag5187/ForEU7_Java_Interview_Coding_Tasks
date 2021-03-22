public class Array_ClosestToTheKey {

    /*
    Given sorted array, print the number that’s closest to the key
        Ex:
            Input: (1,3,5,9,11), 6
            Output: 5

            Input: (1,3,5,9,11), 10
            Output: 9 , 11

     */

    public void printTheClosestElement(int[] array, int key) {
        int nearestSmaller = 0;
        int nearestLarger = 0;

        for (int each : array) {
            if (each <= key) {
                nearestSmaller = each;
            }
            if (each > key) {
                nearestLarger = each;
            }
        }

        int differenceWithSmaller = key - nearestSmaller;
        int differenceWithLarger = nearestLarger - key;

        if (differenceWithSmaller > differenceWithLarger) {
            System.out.println(nearestLarger);
        } else if (differenceWithLarger > differenceWithSmaller) {
            System.out.println(nearestSmaller);
        } else {
            System.out.println(nearestLarger);
            System.out.println(nearestSmaller);
        }

    }


}
