package zoomanagementp;
import gestionzooentities.Animal;
import gestionzooentities.Zoo;

public class Zoomanagement {

        public static void main(String[] args) {
                Animal lion = new Animal();
                lion.setname();
                lion.setfamily();
                lion.setmam();
                lion.setage();

               
                Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
                Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


                Animal dog = new Animal("Canine", "Snoopy", 2, true);


                System.out.println(myZoo.addAnimal(lion));
                System.out.println(myZoo.addAnimal(dog));
                System.out.println(myZoo.addAnimal(dog));

                myZoo.addAnimal(lion);
                myZoo.displayAnimals();

                System.out.println(myZoo.searchAnimal(dog));
                Animal dog2 = new Animal("Canine", "lll", 2, true);
                System.out.println(myZoo.searchAnimal(dog));

                //   System.out.println(myZoo.removeAnimal(dog));
                myZoo.displayAnimals();


                System.out.println(myZoo);

                myZoo.addAnimal(lion);
                myZoo.addAnimal(dog);
                myZoo.addAnimal(dog2);
                myZoo.displayAnimals();
                System.out.println("a" + myZoo.removeAnimal(lion));
                myZoo.displayAnimals();
                System.out.println("a" + myZoo.removeAnimal(dog2));
                myZoo.displayAnimals();
                System.out.println("a" + myZoo.removeAnimal(dog));
                myZoo.displayAnimals();
                System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
               // System.out.println(myZoo.isZooFull());

        }

}