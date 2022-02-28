
// import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class count012 {

    static int solve(int a[]) {

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        int previousIndex = 0, currentIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (hmap.containsKey(a[i])) {
                currentIndex = i;
                previousIndex = hmap.get(a[i]);
                minDistance = Math.min((currentIndex - previousIndex), minDistance);
            }
            hmap.put(a[i], i);
        }
        return minDistance;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // int freq = map.get(arr[i]);
        // map.put(arr[i], i - freq);
        // int ele = map.get(arr[i]);
        // list.add(ele);
        // } else {
        // map.put(arr[i], i);
        // }
        // }

        // Collections.sort(list);

        // int ans = list.get(0);
        // return ans;
    }

    // private static void printBoundaryLeft(BinaryTreeNode<Integer> root) {
    // if (root != null) {
    // if (root.left != null) {
    // System.out.print(root.data + " ");
    // printBoundaryLeft(root.left);
    // } else if (root.right != null) {
    // System.out.print(root.data + " ");
    // printBoundaryLeft(root.right);
    // }
    // }
    // }

    // private static void printBoundaryRight(BinaryTreeNode<Integer> root) {
    // if (root != null) {
    // if (root.right != null) {
    // printBoundaryRight(root.right);
    // System.out.print(root.data + " ");
    // } else if (root.left != null) {
    // printBoundaryRight(root.left);
    // System.out.print(root.data + " ");
    // }
    // }
    // }

    // private static void printLeaves(BinaryTreeNode<Integer> root) {
    // if (root != null) {
    // printLeaves(root.left);
    // if (root.left == null && root.right == null)
    // System.out.print(root.data + " ");
    // printLeaves(root.right);
    // }
    // }

    // private static void printBoundary(BinaryTreeNode<Integer> root) {
    // if (root != null) {
    // System.out.print(root.data + " ");
    // printBoundaryLeft(root.left);
    // printLeaves(root.left);
    // printLeaves(root.right);
    // printBoundaryRight(root.right);
    // }
    // }

    // public static void solve(BinaryTreeNode<Integer> root) {
    // printBoundary(root);
    // System.out.println();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int k = sc.nextInt();
        System.out.println(solve(arr));
        sc.close();
    }

}
