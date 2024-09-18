package data_structure.tree;
import data_structure.tree.Node;

public class TreeRef {
    Node root=null;


    public TreeRef(int v){
        this.root = new Node(v);
    }


    public void addData(int v, Node ref) {
        //중복된 값은 없다는 가정.

        // 아래 식으로 코딩하니깐 null값만 복사되서 동작하지 않음,
        //Node  temp = (v>ref.getValue())? ref.rightNode : ref.leftNode;
        if (v > ref.getValue()) {
            if (ref.rightNode == null) {
                ref.rightNode = new Node(v);
                return;
            }
            else{
                addData(v,ref.rightNode);
            }
        }
        else{
            if (ref.leftNode == null) {
                ref.leftNode = new Node(v);

                return;
            }
            else{
                addData(v,ref.leftNode);
            }
        }
    }




    public void printTree(Node ref){
        // Full Binary Tree라 가정.
        System.out.println(ref.getValue());
        if(ref.leftNode==null && ref.rightNode==null) {

            return;
        }

        printTree(ref.leftNode);
        printTree(ref.rightNode);
    }
}

