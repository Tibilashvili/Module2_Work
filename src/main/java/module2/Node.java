package module2;

public class Node implements Comparable <Node>  {
    private char symbol;
    private int weight;
    Node leftNode;
    Node rightNode;

    public Node(char symbol, int weight, Node leftNode, Node rightNode) {
        this.symbol = symbol;
        this.weight = weight;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getWeight() {
        return weight;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (symbol != node.symbol) return false;
        if (weight != node.weight) return false;
        if (leftNode != null ? !leftNode.equals(node.leftNode) : node.leftNode != null) return false;
        return rightNode != null ? rightNode.equals(node.rightNode) : node.rightNode == null;
    }

    @Override
    public int hashCode() {
        int result = (int) symbol;
        result = 31 * result + weight;
        result = 31 * result + (leftNode != null ? leftNode.hashCode() : 0);
        result = 31 * result + (rightNode != null ? rightNode.hashCode() : 0);
        return result;
    }

    public int compareTo(Node o) {
        return this.weight - o.weight;
    }

}
