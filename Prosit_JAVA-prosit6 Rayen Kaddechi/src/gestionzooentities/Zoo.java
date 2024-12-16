

import java.util.Scanner;

public class Zoo {

     Scanner scan = new Scanner(System.in); 
    static final int NUMBER_OF_CAGES = 25;
    public Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    
    public String getnamez()
    {

        return (this.name);
    }
    public int getnbran()
    {
        return (this.nbrAnimals);
    }

    public void setnamez()
    {   String nametest="";
        while(nametest.isEmpty())
        { 
        System.out.println("give a name to the zoo ");
        nametest = scan.nextLine();
        }
        this.name=nametest;
    }
    
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    
    public void addAnimal(Animal animal) {

        if ((searchAnimal(animal) == -1))
        {
        animals[nbrAnimals] = animal;
        nbrAnimals++;}
    }

   public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        this.nbrAnimals--;
        animals[nbrAnimals] = null;
        return true;
    }

   public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getname() == animals[i].getname())
                return i;
        }
        return index;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}