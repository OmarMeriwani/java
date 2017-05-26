
static String a = "";
void postOrder(Node root) 
{
    printAll(root);
    System.out.print(a);
}
void printAll(Node root)
{
    if (root.left == null && root.right == null)
    {
        a += root.data + " ";
    }
    else
    {
        if (root.left != null)
        {
            printAll(root.left);
        }
        if (root.right != null)
        {
            printAll(root.right);
        }
        a += root.data + " ";
    }
}
