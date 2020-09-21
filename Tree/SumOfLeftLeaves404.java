public class SumOfLeftLeaves404 {
    class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                sum+=root.left.val;
            }else{
                sumOfLeftLeaves(root.left);
            }
        }
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
