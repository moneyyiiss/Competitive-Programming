package August._22_Aug_2022.Implementation_of_tree;

import java.util.ArrayList;

public class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}