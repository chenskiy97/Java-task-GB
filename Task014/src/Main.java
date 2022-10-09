public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>(1);
        tree.left = new Tree<>(2);
        tree.right = new Tree<>(3);
        tree.left.left = new Tree<>(4);
        tree.left.right = new Tree<>(5);
        tree.right.left = new Tree<>(6);
        tree.right.right = new Tree<>(7);

        System.out.println();
        Printer.preorder(tree, "");
        System.out.println("\n--------------------------\n");
        Printer.inorder(tree, "");
        System.out.println("\n--------------------------\n");
        Printer.postorder(tree, "");
        System.out.println();
        Printer.bracketsPrint(tree);
    }

}
