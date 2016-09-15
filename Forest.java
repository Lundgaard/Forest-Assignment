
//Anne Lundgaard
//20-09-16
public class Forest
{
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    
    //Constructor
    public Forest() {
        tree1 = new Tree(10.0);
        tree2 = new Tree(20.0);
        tree3 = new Tree(30.0);
    }
    
    //Shows the age and height of the three trees
    public void show() {
        System.out.println("Første træ:");
        tree1.show();
        System.out.println("Andet træ:");
        tree2.show();
        System.out.println("Tredje træ:");
        tree3.show();
    }
    
    //Makes the forest grow one year
    public void growOneYear() {
        tree1.growOneYear();
        tree2.growOneYear();
        tree3.growOneYear();
        System.out.println("Et år er gået i skoven");
        show();
    }
}
