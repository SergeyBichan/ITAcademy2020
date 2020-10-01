package Animal;

import javafx.scene.AmbientLight;

public class Main {
    public static void main(String[] args) {
        Animal animal2 = getAnimal("d");
       Animal animal = new Cat();
       Animal animal1 = new Dog();
       animal1.getVoice();

    }
    private static Animal getAnimal(String animal){
        if ("c".equals(animal)){
            return new Cat();
        }
        if ("d".equals(animal)){
            return new Dog();
        }
        throw new IllegalArgumentException("нет такого живтоного");
//        if (animal.equals("d")){           //ТАК НЕ ПИСАТЬ! animal ожет быть null
//
//        }
    }
}
