/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normal.sort;

/**
 *
 * @author ITCLANBD
 */
public class RECURSIVE_SORT {

    public static void main(String[] args) {
        int[] a1 = {9, 1, 3, 11, 5, 6, 16, 8};
        System.out.println("Sort an array. (Hint, you may use another function that finds the minimum.) (or try recursive bubble sort)");
        int[] mn = sortarray(a1, 0, 8);
        for (int c = 0; c < mn.length; c++) {
            System.out.print(mn[c] + ", ");
        }
    }

    public static int[] sortarray(int[] a, int p, int q) {
        if (p >= q) {
            return a;
        } else {
            int temp = a[p];
            int x = p - 1;
            while (x >= 0 && temp < a[x]) {
                a[x + 1] = a[x];
                x--;
            }
            a[x + 1] = temp;
            return sortarray(a, p + 1, q);
        }
    }
}
