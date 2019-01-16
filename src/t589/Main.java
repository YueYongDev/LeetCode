package t589;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    List<Integer> res=new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root==null) return res;
        res.add(root.val);
        for (Node child:root.children){
            preorder(child);
        }
        return res;
    }
}
