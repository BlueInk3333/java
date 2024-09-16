package data_structure.stack;

public class Core {

    public static void main(String[] args) {
        StackRef ref = new StackRef();

        ref.dataPush(11);
        ref.dataPush(22);
        ref.dataPush(33);

        try {
            System.out.println(ref.dataPop());
            System.out.println(ref.dataPop());
            System.out.println(ref.dataPop());
            System.out.println(ref.dataPop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
