public boolean haspathsum(Tree node, int sum)
    {
       if(node==null)
           return false;
       if(node.leftchild==null && node.rightchild==null)  // We have reached the leaf node
           return (sum==node.val);                      
       return haspathsum(node.leftchild, sum-node.val) || 
              haspathsum(node.rightchild, sum-node.val); // we make the recursive call with leftchild and rightchild                                                                  and the subtract the node's value from the sum
    }
