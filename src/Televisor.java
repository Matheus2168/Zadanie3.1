public class Televisor {

    boolean working = false;



    void turnOn(){
        working = true;
    }

    void turnOff(){
        working = false;
    }

    void showStatus(){

        if (working == true)
            System.out.println("Ten telewizor jest wlaczony");

        else
            System.out.println("Ten telewizor jest wylaczony");
    }



}
