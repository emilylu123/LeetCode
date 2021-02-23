/* 455. Assign Cookies
* Assume you are an awesome parent and want to give your children some cookies.
* But, you should give each child at most one cookie.
* Each child i has a greed factor g[i],
* which is the minimum size of a cookie that the child will be content with;
* and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i,
* and the child i will be content.
* Your goal is to maximize the number of your content children and output the maximum number.
* Input: g = [1,2,3], s = [1,1]
* Output: 1
* */

import java.util.Arrays;

public class assign_cookies {
    public static int findContentChildren(int[] children, int[] cookies) {
        if (cookies.length==0 || children.length==0) return 0;
        Arrays.sort(children);
        Arrays.sort(cookies);

        int i = 0; int count = 0;
        do {
            if (cookies[i]>=children[count] ){
                ++count;
            }
            ++i;
        } while (i<cookies.length && count<children.length);
        return count;
    }

    public static void main(String[] args) {
        // result -> 1
        // int [] children = new int []{1,2,3};
        // int [] cookies = new int [] {1,1};
        // result -> 2
        int [] children = new int []{1,2};
        int [] cookies = new int [] {1,2,3};

        System.out.println(findContentChildren(children, cookies));
    }
}


