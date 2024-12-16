@SuppressWarnings("rawtypes")
public interface Omnivore<T> extends Herbivore , Carnivore{
    void eatPlantAndMeet(T food);
    
}
