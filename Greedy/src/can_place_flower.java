/* You have a long flowerbed in which some of the plots are planted,
and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's,
where 0 means empty and 1 means not empty, and an integer n,
return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

*/

public class can_place_flower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if(next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count>=n;
    }

    public static void main(String[] args) {
//        Output: true
        int [] test1 = new int[] {1,0,0,0,1};
        int n1 = 1;
        int [] test2 = new int[] {0,0,0,0,1};
        int n2 = 2;

        System.out.println(canPlaceFlowers(test1,n1));
        System.out.println(canPlaceFlowers(test2,n2));
    }
}
