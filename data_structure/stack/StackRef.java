package data_structure.stack;


interface StackInterface{
    //stack은 선입선출 자료구조. 즉, 데이터를 입력하는 메소드 하나, 데이터를 후순위로 출력하는 메소드 하나.
    public void dataPush(int d);
    public int dataPop()throws Exception;
}



public class StackRef implements StackInterface{
    Node head = null;//stack 자료형은 입구가 하나만 사용하기에 ref node가 1개만 있으면 됨.

    @Override
    public void dataPush(int d){
        Node newNode = new Node(d);

        newNode.nextNode=this.head;
        this.head=newNode;

    }
    public int dataPop() throws Exception{

        int temp = this.head.getValue();

        this.head = this.head.nextNode;

        return temp;
    }

}
