package hackerrank.ray.com;

import java.util.*;
import java.io.*;

class Node{

    Node left,right;
    int data;

    Node(int data){
        this.data=data;
        left = null;
        right = null;
    }
}

class BinarySearchTreesDay22 {

    public static int getHeight(Node root){
        if(root == null) {
            return -1;
        }

        int left = 1 + getHeight(root.left);
        int right = 1 + getHeight(root.right);

        return Math.max(left, right);
    }

    public static Node insert(Node root,int data){

        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    /**
     * Sample Input
     * 7
     * 3
     * 5
     * 2
     * 1
     * 4
     * 6
     * 7
     * Output
     * 3
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}