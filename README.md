This project is about implementing data structures in JAVA.

1. List

     HEAD--- Node --- Node  --- Node ---TAIL

   function 1. Add Node
   function 2. Delete Node
   function 3. Check Nth node
   function 4. Get all node

   What I learned while working on,
   ==> Objects Scope :
        Even if the object is defined within the method, it is not erased until the class is finished.


2. Stack

     HEAD--- Node --- Node  --- Node

   function 1.  Data Push
   function 2.  Data Pop

   What I learned while working on,
   ==>  


3. Tree
             Root ---    Node
                  Node          Node
             Node     Node  Node     Node

   function 1.  addData
   function 2.  searchData
   function 3.  printTree

   What I learned While working on,
   ==> 재귀함수를 사용할 떄, 반환값으로 Boolean형을 사용하는 것은 적합하지 않다.
        특정 조건이 맞아 맨 마지막에 호출된 함수가 true를 반환했더라도,
        그 함수가 종료되면서 false값을 반환 할 수 밖에 없기에, (true는 특정조건에 부합해야만 발생.)
          false
             false
                  true



   얕은 복사 경우에 주의!
   주소값을 복사하는 것이지, 같은 메모리를 동일하게 가리킨다고 생각하지 말자.
   아래와 같이 참조 변수가 null값을 가진 경우 오류가 발생할 수 있다.
   Node a = null;
   Node b = a;
   a = new Node();

   이때, a != b이다.
   당연한 결과이지만, 쉽게 헷갈린다.

   얕은 복사라고 생각 할 수 있는데, (실질적인 값이 복사 된 것이 아닌, 같은 메모리를 가리키게 하여 서로 종속적인 관계)
   참조 변수 같은 경우는 얕은 복사가 없는 것 같다.

   Node a = new Node(1);
   Node b =a;
   a = new Node(2);
   // 만약 얕은 복사라면, a.getter() == b.getter()이여야 하는데,
   // 서로 다른 값을 반환 하기에 참조 변수는 주소값을 할당하여 종속적이지 않다고 생각된다.
   







        
