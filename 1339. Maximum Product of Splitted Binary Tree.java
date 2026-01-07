class Solution {
  static long wholeTreeSum;
  static long answer;
  static final int MOD = 1_000_000_007;

  public int maxProduct(TreeNode root) {
    answer = 0;
    wholeTreeSum = calculateSum(root);
    findMax(root);
    return (int) (answer % MOD);
  }

  private long calculateSum(TreeNode node) {
    if (node == null) return 0;
    return node.val + calculateSum(node.left) + calculateSum(node.right);
  }

  private long findMax(TreeNode node) {
    if (node == null) return 0;

    long leftPart = findMax(node.left);
    long rightPart = findMax(node.right);

    long currentSum = node.val + leftPart + rightPart;
    answer = Math.max(answer, currentSum * (wholeTreeSum - currentSum));

    return currentSum;
  }
}
