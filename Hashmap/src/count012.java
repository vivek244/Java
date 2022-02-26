import java.util.HashMap;
import java.util.Scanner;

public class count012 {

    // private static void printBoundaryLeft(BinaryTreeNode<Integer> root) {
    //     if (root != null) {
    //         if (root.left != null) {
    //             System.out.print(root.data + " ");
    //             printBoundaryLeft(root.left);
    //         } else if (root.right != null) {
    //             System.out.print(root.data + " ");
    //             printBoundaryLeft(root.right);
    //         }
    //     }
    // }

    // private static void printBoundaryRight(BinaryTreeNode<Integer> root) {
    //     if (root != null) {
    //         if (root.right != null) {
    //             printBoundaryRight(root.right);
    //             System.out.print(root.data + " ");
    //         } else if (root.left != null) {
    //             printBoundaryRight(root.left);
    //             System.out.print(root.data + " ");
    //         }
    //     }
    // }

    // private static void printLeaves(BinaryTreeNode<Integer> root) {
    //     if (root != null) {
    //         printLeaves(root.left);
    //         if (root.left == null && root.right == null)
    //             System.out.print(root.data + " ");
    //         printLeaves(root.right);
    //     }
    // }

    // private static void printBoundary(BinaryTreeNode<Integer> root) {
    //     if (root != null) {
    //         System.out.print(root.data + " ");
    //         printBoundaryLeft(root.left);
    //         printLeaves(root.left);
    //         printLeaves(root.right);
    //         printBoundaryRight(root.right);
    //     }
    // }

    // public static void solve(BinaryTreeNode<Integer> root) {
    //     printBoundary(root);
    //     System.out.println();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int k = sc.nextInt();
        // System.out.println(solve(arr));
        sc.close();
    }

}
