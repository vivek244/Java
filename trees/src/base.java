
//import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;

// import java.util.Queue;
public class base {

    static class node {
        int data;
        node left;
        node right;

        node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static void printSpecificPattern(node root) {

        if (root == null)
            return;
        int count = 1;
        Queue<node> que = new LinkedList<>();
        que.add(root);
        String str = "";
        while (!que.isEmpty()) {
            int j = que.size();
            int i = 0;
            int[] arr = new int[j];
            while (j != 0) {
                node x = que.remove();
                arr[i] = x.data;
                i++;
                if (x.left != null) {
                    que.add(x.left);
                }
                if (x.right != null) {
                    que.add(x.right);
                }
                j--;
            }
            count++;

            for (int x = 0; x < count; i++) {
                str = str + arr[x] + " ";
                str = str + arr[arr.length - 1 - x] + " ";
            }
        }

        System.out.println(str);

    }

    // static node getr(node left, node curr) {
    // while (left.right != null && left.right != curr) {
    // left = left.right;
    // }
    // return left;
    // }

    // static node getl(node left, node curr) {
    // while (left.left != null && left.left != curr) {
    // left = left.left;
    // }
    // return left;
    // }

    // static ArrayList<Integer> in(node root) {
    // ArrayList<Integer> res = new ArrayList<>();
    // node curr = root;
    // while (curr != null) {
    // node lefts = curr.left;
    // if (lefts == null) {
    // res.add(curr.data);
    // curr = curr.right;
    // } else {
    // node r = getr(lefts, curr);
    // if (r.right == null) {
    // r.right = curr;
    // curr = curr.left;
    // } else {
    // r.right = null;
    // res.add(curr.data);
    // curr = curr.right;
    // }
    // }
    // }

    // return res;
    // }

    // static ArrayList<Integer> pre(node root) {
    // ArrayList<Integer> res = new ArrayList<>();
    // node curr = root;
    // while (curr != null) {
    // node l = curr.left;
    // if (l == null) {
    // res.add(curr.data);
    // curr = curr.right;
    // } else {
    // node r = getr(l, curr);
    // if (r.right == null) {
    // res.add(curr.data);
    // r.right = curr;
    // curr = curr.left;
    // } else {
    // r.right = null;
    // curr = curr.right;
    // }
    // }
    // }

    // return res;
    // }

    // static ArrayList<Integer> post(node root) {
    // ArrayList<Integer> res = new ArrayList<>();
    // node curr = root;
    // while (curr != null) {
    // node r = curr.right;
    // if (r == null) {
    // res.add(curr.data);
    // curr = curr.left;
    // } else {
    // node l = getl(r, curr);
    // if (l.left == null) {

    // l.left = curr;
    // curr = curr.right;
    // } else {
    // res.add(curr.data);
    // l.left = null;
    // curr = curr.left;
    // }
    // }
    // }
    // return res;
    // }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        // ArrayList<Integer> list = in(root);
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " -> ");
        // }
        // System.out.println();
        // ArrayList<Integer> lis = pre(root);
        // for (int i = 0; i < lis.size(); i++) {
        // System.out.print(lis.get(i) + " -> ");
        // }
        System.out.println();
        printSpecificPattern(root);
        // ArrayList<Integer> li = post(root);
        // for (int i = 0; i < li.size(); i++) {
        // System.out.print(li.get(i) + " -> ");
        // }
        // print(root);
    }

}
