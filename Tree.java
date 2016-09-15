
//Anne Lundgaard
//20-09-16
public class Tree
{
    private int age;
    private double height;
    private double growthPct;
    private boolean alive;
    
    //Constructor
    public Tree(double growthPct) {
        age = 1;
        height = 0.25;
        alive = true;
        this.growthPct = growthPct;
    }
    
    //Makes the tree one year older
    public void growOneYear() {
        age = age + 1;
        if(height < 20) {
            height = height * (1 + growthPct/100);
        }
        if(age >= 120) {
            alive = false;
        }
    }
    
    //Shows the age and height of the tree
    public void show() {
        System.out.println("alder = " + age);
        System.out.println("højde = " + height);
        if(alive == true) {
            System.out.println("Træet lever");
        } else {
            System.out.println("Træet er dødt");
        }
        System.out.println();
    }
    
    //Returns the height of the tree
    //Used in the GA.3 (v) averageHeight
    public double getHeight() {
        return height;
    }
}
