package t590;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    List<Integer> res=new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root==null) return res;
        scanPre(root);
        res.add(root.val);
        return res;
    }

    public void scanPre(Node node){
        if(node.children.size()==0){return;}
        if(node.children.size()>0){
            for(Node n:node.children){
                scanPre(n);
                res.add(n.val);
            }
        }
    }
}
