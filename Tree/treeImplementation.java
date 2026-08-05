public class treeImplementation {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.Left = new TreeNode(2);
    root.Right = new TreeNode(3);

    root.Left.Left = new TreeNode(4);
    root.Left.Right = new TreeNode(5);

    print(root);

  }

  public static void print(TreeNode root){
    if(root == null) return ;

    System.out.println(root.val + " ");
    print(root.Left);
    print(root.Right);
  }
}

class TreeNode{
  int val;
  TreeNode Left;
  TreeNode Right;

  TreeNode(int val){
    this.val = val;
  }
}


