public class Nodes{

    // Define instance variables
    int value;
    Nodes link_node;

    // Class Constructor
    Nodes(){
        System.out.println("Node created");
    }

    // Set link node method
    public void set_link_node(Nodes other_node){
        link_node = other_node;
    }

    // Get link node method
    public Nodes get_link_node(){
        return link_node;
    }

    // Set value method
    public void set_value(int new_value){
        value = new_value;
    }

    // Get value method
    public int get_value(){
        return value;
    }

    // Main
    public static void main(String[] args){
        Nodes myNode = new Nodes();
        Nodes myLinkNode = new Nodes();
        System.out.println(myNode.link_node);
        System.out.println(myNode.value);
        myNode.set_value(3);
        myNode.set_link_node(myLinkNode);
        System.out.println(myNode.link_node);
        System.out.println(myNode.value);

    }
}