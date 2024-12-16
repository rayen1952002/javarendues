

public class Zoo 
{
   Animal[] Animals = new Animal[] ;
   const int nbrcgs =5; 


   public  boolean add_animal(Animal a1)
   {
    boolean confirm  = false;
    

    int i ;

    if (Animals.length<nbrcgs)
    {
        Animals[Animals.length+1] = a1; 
    }




    for(i = 0; i<Animals.length();i++ )
    {
        
        if (Animal.name.equals(Animals[i].name))
        {
            confirm = true;
            break;
        }
        
    }  

    return confirm;

   }
} 