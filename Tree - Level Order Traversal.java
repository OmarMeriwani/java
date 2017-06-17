   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) 
   {
      //result = result + root.data + " ";
       ArrayList<Integer> a = new ArrayList<Integer>();
       a.add(root.data);
       BigList.add(a);
       LOR(root,1);
       for (int i = 0 ; i < BigList.size(); i ++)
       {
           ArrayList<Integer> smallList = BigList.get(i);
           for (int j = 0 ; j < smallList.size(); j++)
           {
               System.out.print(smallList.get(j) + " ");
           }    
       }
   }
   ArrayList<ArrayList<Integer>> BigList = new ArrayList<ArrayList<Integer>>();
   //String result = "";
   void LOR (Node root, int level)
   {
       if (BigList.size() + 1 > level)
       {    
           ArrayList<Integer> a = new ArrayList<Integer>();
           BigList.add(a);
       }
       if (root.left != null)
           BigList.get(level).add(root.left.data);
       if (root.right != null)
           BigList.get(level).add(root.right.data);
       //result = result + root.data + " ";
       if (root.left != null)
       {
           LOR(root.left, level + 1);
       }
       if (root.right != null)
       {
           LOR(root.right, level + 1);
       }    
   } 