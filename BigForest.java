
//Anne Lundgaard
//20-09-16
import java.util.ArrayList;
public class BigForest
{
    private ArrayList<Tree> trees;
    int forestAge = 0;
    
    //Constructor 
    public BigForest() {
        trees = new ArrayList<Tree>();
    }
    
    //Shows the size of the forest
    public void show() {
        int treeNumber = 1;
        
        for(Tree tree : trees) {
            System.out.println(treeNumber + ". træ:");
            tree.show();
            treeNumber += 1;
        }
    }
    
    //Makes the forest grow one year
    public void growOneYear() {
        forestAge += 1;
        System.out.println("Skoven er " + forestAge + " år gammel");
        for(Tree tree : trees) {
            tree.growOneYear();
        }
    }
    
    //Manualy adds one tree to the forest
    public void addTree(Tree t) {
        trees.add(t);
    }
    
    //Makes the forest grow n years
    //Adds one tree per year
    public void growManyYears(int n) {
        forestAge += n;
        System.out.println("Skoven er nu " + forestAge + " år gammel\n");
        for (int x = 0 ; x < n ; x++) {
            growOneYear();
            addTree(new Tree(10.0));
        }
    }
    
    //Shows the age of the forest
    public void age() {
        System.out.println("Skoven er nu " + forestAge + " år gammel\n");
    }
    
    //Shows the average height of the trees in the forest
    public double averageHeight() {
        double avg = 0;
        for (Tree tree : trees) {
            avg += tree.getHeight();
        }
        return avg /= trees.size();
    }
}
