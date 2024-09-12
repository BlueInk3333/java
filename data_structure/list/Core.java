package data_structure.list;


public class Core {

    public static void main(String[] args) {
        ListRef list = new ListRef(2);

        list.addNode(4);
        list.addNode(6);

        list.checkList(list.head);

        list.getNthNodeValue(2,list.head);

        // 여기서 알 수 있는 중요한 점은 인스턴스화는 메소드에서 정의하더라도
        // 같은 class안에서 계속 유지되는 것을 알 수 있다.

        list.deleteNthNode(2,list.head);
        list.checkList(list.head);

        list.getNthNodeValue(2,list.head);

    }
}
