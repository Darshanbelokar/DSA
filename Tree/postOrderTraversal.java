import java.util.ArrayList;
import java.util.List;

public class postOrderTraversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);

    root.Left = new TreeNode(2);
    root.Right = new TreeNode(3);

    root.Left.Left = new TreeNode(4);
    root.Left.Right = new TreeNode(5);

    root.Right.Left = new TreeNode(6);
    root.Right.Right = new TreeNode(7);

    List<Integer> ans = postOrderTraversal(root);
    System.out.println(ans);
  }

  public static List<Integer> postOrderTraversal(TreeNode root){
    List<Integer> ans = new ArrayList<>();

    postOrder(root,ans);

    return ans;
  }

  public static void postOrder(TreeNode root, List<Integer> ans) {
    if(root == null) return ;
    
    postOrder(root.Left, ans);
    postOrder(root.Right, ans);

    ans.add(root.val);
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