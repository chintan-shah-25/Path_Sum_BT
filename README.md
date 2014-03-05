Path_Sum_BT
===========

check whether given number is the sum from root to any leaf in binary tree
consider the following binary tree
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

so the method bool isPathSum(root,sum) should return true only if the sum is either 49,51 or 127.
