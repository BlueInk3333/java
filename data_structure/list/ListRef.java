package data_structure.list;

import data_structure.list.Node;

public class ListRef {
    Node head=null;
    Node tail=null;

    public ListRef(int val){
        head = new Node(val);
        tail =head;
    }       //첫 head와 tail은 처음 생성되는 Node를 가리킨다.


    public void addNode(int val){
        Node newNode = new Node(val);
        tail.nextNode = newNode;
        tail = newNode;
    }


    public Node getNthNode(int n, Node head){
        n-=1;
        if(n==0)
            return head;
        else
            return getNthNode(n,head.nextNode);
    }


    public void getNthNodeValue(int n, Node head){

        System.out.println(n+"번째 node의 값 : " + getNthNode(n,head).getValue());

    }


    public void deleteNthNode(int n, Node head){
        //n번째 node를 지우기 위해선 (n-1)번째 node와 (n+1)번쨰 node를 연결해야한다.
        Node prevN = getNthNode(n-1,head);
        Node laterN = getNthNode(n+1,head);

        prevN.nextNode = laterN;
    }


    public void checkList(Node head){
        if(head.nextNode==null) {
            System.out.println(head.getValue() +" ");
            return;
        }
        else{
            System.out.print(head.getValue() +" ");
            checkList(head.nextNode);
        }

    }
}
