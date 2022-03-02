//Time complexity: O(N)
//Space complexoty: O(N)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        
        Queue<TreeNode> curr = new LinkedList<TreeNode>();
        curr.add(root);
        int level = 0;
        
        while(!curr.isEmpty()){
            int level_size = curr.size();
            result.add(new ArrayList<Integer>());
            
            for(int i=0; i<level_size; i++){
                TreeNode node = curr.remove();
                
                result.get(level).add(node.val);
                
                if(node.left!=null)
                    curr.add(node.left);
                if(node.right!=null)
                    curr.add(node.right);
            }
            level++;
        }
        return result;
        
        
    }
}
