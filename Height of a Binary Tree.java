import java.util.*;
import java.io.*;
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    static int height(Node root) 
    {
       return( Measure(root, 0));
    }
   static int Measure(Node root, int depth)
   {
        int max = depth;
        if (root == null)
        {
            //System.out.println("Null root");
            return max;             
        }
        else
        {
            if (IsEnd(root) == false)
            {
                max = max + 1;
                //System.out.println("Node ("+ root.data +"), max is: "+ max );
                int left = 0;
                int right = 0;
                if (root.left != null)
                     left = Measure(root.left, max);
                if (root.right != null)
                     right = Measure(root.right, max);

                if (left >= right)
                {
                    //System.out.println("Left of ("+ root.data +") is larger: " + left + " than right: " + right);
                    max =  left;
                }
                else
                {
                    //System.out.println("Right of ("+ root.data +") is larger: " + right + " than left: " + left);
                    max =  right;
                }  
            }
        }
        return max;    
   }
    static boolean IsEnd(Node r)
    {
        if (r.left == null && r.right == null)
            return true;
        else
            return false;
    }
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}