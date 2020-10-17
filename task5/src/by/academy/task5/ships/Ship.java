package by.academy.task5.ships;

public abstract class Ship implements shipInterface {
    int numOfDecks;


    @Override
    public String toString() {
        return "Ship{" +
                "numOfDecks=" + numOfDecks +
                '}';
    }

    public int getNumOfDecks() {
        return numOfDecks;
    }

    public void setNumOfDecks(int numOfDecks) {
        this.numOfDecks = numOfDecks;
    }

    public Ship(int numOfDecks) {
        if(numOfDecks >= 1 || numOfDecks <=2){
            this.numOfDecks = numOfDecks;
        }
        else {
            System.out.println("Не корректный ввод!");
        }

    }



    public void pushContainerToShip(){
        if (numOfDecks == 1){

        }
        if(numOfDecks == 2){

        }
        else {
            System.out.println("Не корректный ввод");
        }
    }


}
