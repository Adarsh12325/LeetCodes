class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<>(), paths);
        return paths;
    }

    public void findPaths(TreeNode root, int sum, List<Integer> current, List<List<Integer>> paths) {
        if (root == null) return;

        current.add(root.val);

        if (root.val == sum && root.left == null && root.right == null) {
            paths.add(new ArrayList<>(current));
        } else {
            findPaths(root.left, sum - root.val, current, paths);
            findPaths(root.right, sum - root.val, current, paths);
        }

        current.remove(current.size() - 1);
    }
}
