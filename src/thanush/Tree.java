package thanush;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

public class Tree {
    private static void preorder(Node root) {
        if(root ==null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }
    private static void postorder(Node root) {
        if(root ==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);

    }
    private static void inorder(Node root) {
        if(root ==null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    static int maxHeight(Node root){
        if(root==null)
            return 0;
        return Integer.max(maxHeight(root.left),maxHeight(root.right))+1;
    }
    static void printkdist(Node root, int k){
        if(root==null)
            return;
        else if(k==0)
            System.out.println(root.data);

        printkdist(root.left,k-1);
        printkdist(root.right,k-1);
    }
    static void levelorder(Node root){
        if(root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node ans=q.poll();
            System.out.print(ans.data+" ");

            if(ans.left!=null)
                q.add(ans.left);
            if(ans.right!=null)
                q.add(ans.right);
        }
    }
    private static int tsize(Node root) {
        if(root==null)
            return 0;
        return 1+tsize(root.left)+tsize(root.right);
    }
    private static int maxele(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxele(root.left),maxele(root.right)));
    }



    static void swap1(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    static void insertion_sort(int a[]) {
        int len=a.length;
        for(int i=1;i<len;i++) {
            for(int j=i;j>0;j--) {
                if(a[j]<a[j-1]) {
                    swap1(a, j, j-1);
                }
                else
                    break;
            }
        }
    }

    public static void main(String[] args) {

//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        System.out.println(maxele(root))

//        int []a={4,2,6,5,1,3};
//        insertion_sort(a);
//        System.out.println(Arrays.toString(a));

    }



}