

@SuppressWarnings("rawtypes")
public class Aquatic extends Animal implements Carnivore{
    String habitat;
    String type;
    @Override
    public void eatMeat(Object  Food)  {
        
        
    }




    
public String getHabitat() {
    return habitat;
}

public String getType() {
    return type;
}
public void setHabitat(String habitat) {
    this.habitat = habitat;
}
public void setType(String type) {
    this.type = type;
}
public Aquatic(){

}
public Aquatic(String habitat1,String type1) 
{
    this.habitat = habitat1;
    this.type = type1;


}
public void swim()
    {
        System.out.println("this animal is swimming ");
    }
}