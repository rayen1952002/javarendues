@SuppressWarnings("rawtypes")
public  class Terrestrial extends  Animal implements Omnivore
{
    int nbrlegs;

    @Override
    public void eatPlantAndMeet(Object food) {
    
        
    }
    @Override
    public void eatMeat(Object meat) {
        System.out.println("this animal eats meat ");
        
    }
    @Override
    public void eatPlant(Object plant) {
        System.out.println("this haycha eats  plants ");
        
    }
   
    
    public void setNbrlegs(int nbrlegs) {
        this.nbrlegs = nbrlegs;
    }
    public int getNbrlegs() {
        return nbrlegs;
    }
    public Terrestrial( int nbrlegs1 )
    {
        this.nbrlegs = nbrlegs1;


    }
    public Terrestrial(){

    }
   
}

