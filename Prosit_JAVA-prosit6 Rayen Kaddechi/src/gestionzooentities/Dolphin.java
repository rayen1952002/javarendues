
public class Dolphin extends Aquatic {
    float swspeed;

    float getswspeed()
    {
        System.out.println("this is his speed ");
        return this.swspeed;
    }
    void setswpeed()
    {
        System.out.println("give him a set speed ");
        this.swspeed=scan.nextFloat();
    }
    public Dolphin(){

    }
    public Dolphin (float swspeed1 )
    {
       
        this.swspeed = swspeed1;

    }
    
}