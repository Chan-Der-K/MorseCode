public class Node{

    private Node pre;         // the parent node
    private Node left;        // the left child node
    private Node right;       // the right child node
    private String value;     // the letter or ""

    Node( Node pre, Node left, Node right, String value ){ }
    public Node set_left(){return left;}
    public void get_left(Node n){this.left = n;}
    public Node set_right (){return right;}
    public void get_right (Node n){this.right = n;}

    public Node set_pre(){return pre;}

    public void get_pre(Node n){this.pre = n;}

    public String get(String s){}


    public void print(){ }

    public String get( String s ){
        return s;
    }
}

