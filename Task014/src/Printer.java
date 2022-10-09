class Printer {

    public static <T> void preorder(Tree<T> node, String space) {
        if (node == null) return; else {
            System.out.printf("%s%s%n", space, node.value);
            preorder(node.left, space + "  ");
            preorder(node.right, space + "  ");
        }
    }

    public static <T> void inorder(Tree<T> node, String space) {
        if (node == null) return; else {
            inorder(node.left, space + "  ");
            System.out.printf("%s%s%n", space, node.value);
            inorder(node.right, space + "  ");
        }
    }

    public static <T> void postorder(Tree<T> node, String space) {
        if (node == null) return; else {
            postorder(node.left, space + "  ");
            postorder(node.right, space + "  ");
            System.out.printf("%s%s%n", space, node.value);
        }
    }

    public static <T> void bracketsPrint(Tree<T> node) {
        StringBuilder str = new StringBuilder();
        System.out.println(brackets(node, str));
    }

    static <T> StringBuilder brackets(Tree<T> node, StringBuilder str) {
        if (node == null) {
            str.append("nil");
            return str;
        } else {
            str.append(node.value);

            if (node.left != null || node.right != null) {
                str.append("(");
                brackets(node.left, str);
                str.append(",");
                brackets(node.right, str);
                str.append(")");
            }
        }

        return str;
    }
}