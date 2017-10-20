class TreeNode
{
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode()
    {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public TreeNode getRight()
    {
        return this.right;
    }

    public TreeNode setRight(TreeNode t)
    {
        this.right = t;
    }

    public TreeNode getLeft()
    {
        return this.left;
    }

    public TreeNode setLeft(TreeNode t)
    {
        this.left = t;
    }
}


class Trees
{
    public static void main(String [] args)
    {
        //Find a way to send one number at a time into a Tree
        //and then MAYBE print it
    }

    public static void insert(int x, TreeNode root)
    {
        // Create a node with a given value. then add that node to its
        // appropriate position in the Tree
        TreeNode curr, trail, n;
        curr = trail = n = null;
        
        n = new TreeNode();
        n.setData(x);
        n.setLeft(null);
        n.setRight(null);

        if(root == null)
            root = n;
        else
        {
            curr = root;

            while(curr != null)
            {
                trail = curr;

                if(curr.getData() == x)
                {
                    System.out.println("We don't want duplicate values")
                    return;
                }

                else if(curr.getData() > x)
                    curr = curr.getLeft();
                else
                    curr = curr.getRight();

            }
            if(trail.getData() > x)
                trail.setLeft(n);
            else
                trail.setRight(n);
        }

    }
}
