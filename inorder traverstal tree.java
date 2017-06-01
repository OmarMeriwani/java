
void inOrder(Node root) {
inorder(root);
}
void inorder(Node r)
{
    if (r == null )
    {
        return;
    }
    else
    {
        if (r.left != null)
        {
            inorder(r.left);
        }
        System.out.print(r.data + " ");
        if (r.right != null)
        {
            inorder(r.right);
        }
    }
}