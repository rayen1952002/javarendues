public class Penguin extends Aquatic  {
    float swdepth;

    float getswdepth()
    {
        System.out.println("this is his speed ");
        return this.swdepth;
    }
    void setswdepth()
    {
        System.out.println("give him a set speed ");
        this.swdepth=scan.nextFloat();
    }
    
    public Penguin()
    {

    }
    public Penguin(float swdepth1)
    {
        this.swdepth = swdepth1;
    }
    @Override
    public void swim()
    {
        
        System.out.println("this "+ this.getClass().getCanonicalName() +"is swimming ");
    }
    @Override
    public String toString() {
        
        return "Penguin"+"{"
        +"swdepth"+swdepth+'\''
        ;
    }
}
