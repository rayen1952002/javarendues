package gestionzooentities;
import java.util.*;
public class Animal {
    Scanner scan = new Scanner(System.in); 
    private String family, name;
    private int age;
    private boolean isMammal;

    public String getfamily()
    {
        return (this.family);
    }
    public String getname()
    {
        return (this.name);
    }
    public int getage()
    {
        return (this.age);
    }
    public boolean issMammal()
    {
        return (this.isMammal);
    }
    public void setname()
    {
        System.out.println("donner un nom ");
        this.name = scan.nextLine();
    }
    public void setage(){
        int age1 = -1;
        while (age1<0)
        {
            System.out.println("give a proper age  ");
            age1 = scan.nextInt();
        }
        this.age=age1;
    }
    public void setfamily()
    {
            this.family = scan.nextLine();

    } 
    public void setmam()
    {
        String answer;
        System.out.println("is he mammal? ");
        answer = scan.nextLine();
        if (answer == "yes")
        
            this.isMammal = true;
        if (answer == "no")
        
            this.isMammal = false;
    
    }



    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}