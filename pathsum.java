public boolean haspathsum(Tree node, int sum)
    {
       if(node==null)                                     // end of tree
           return false;
       if(node.leftchild==null && node.rightchild==null)  // We have reached the leaf node
           return (sum==node.val);                      
       return haspathsum(node.leftchild, sum-node.val) || 
              haspathsum(node.rightchild, sum-node.val); // we make the recursive call with leftchild and rightchild                                                                and the subtract the node's value from the sum
    }
    
    
 /*   consider the following binary tree
                                            20
                                           /   \
                                         12     41
                                        /  \      \
                                       7    19     50
                                      /            /
                                    10            16
                                    
There are 3 leaf nodes in the above tree
The sum from root to first leaf is (20+12+7+10) is 49
The sum from root to second leaf is (20+12+19) is 51
The sum from root to third leaf is (20+41+50+16) is 127 

Lets say the method call is (root, 49)
since root is neither null nor a leaf node, line 7 will be executed.
haspathsum(node.leftchild i.e 12, 29(49-20)), again line 7 will be called
haspathsum(node 7, 17),again line 7
haspathsum(node 10, 10), now second if is true since 10 is a leaf node and sum==node.val and hence true will be returned

*/
