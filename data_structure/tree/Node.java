package data_structure.tree;

public class Node {
    //tree 구조에선 좌,우 노드의 주소값을 저장하는 두 개의 reference가 필요
    private int value=0;

    Node leftNode = null;
    Node rightNode = null;

    public Node(int n){
        this.value =n;
    }

    public int getValue() {
        return this.value;
    }
}
