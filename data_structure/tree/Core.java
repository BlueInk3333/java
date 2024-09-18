package data_structure.tree;
import data_structure.tree.TreeRef;

public class Core {
    public static void main(String[] args) {
        TreeRef tree = new TreeRef(5);
        tree.addData(7,tree.root);
        tree.addData(3,tree.root);
        tree.addData(9,tree.root);
        tree.addData(6,tree.root);
        tree.addData(4,tree.root);
        tree.addData(1,tree.root);

        tree.printTree(tree.root);
    }
}
