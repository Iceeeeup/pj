import java.util.ArrayList;

public class hi {
    public static void main(String[] args){
        residence home = new residence();
        residence hotel = new residence();
        residence resort = new residence();

        home.door = 1;
        home.window = 4;
        home.color = "pink";
        home.ST = 1;
        
        hotel.door = 2;
        hotel.window = 50;
        hotel.color = "white";
        hotel.ST = 2;

        resort.door = 20;
        resort.window = 40;
        resort.color = "gray";
        resort.ST = 2;


        home.ShowStatus();
        hotel.ShowStatus();
        resort.ShowStatus();

        home.Book("full");
        hotel.Book("full");
        resort.Book("booking");

        // System.out.println("door of a home : " + home.door);
        // System.out.println("window of a home : " + home.window);
        // System.out.println("color of a home : " + home.color);
        
        // System.out.println("door of a hotel : " + hotel.door);
        // System.out.println("window of a hotel : " + hotel.window);
        // System.out.println("color of a hotel : " + hotel.color);

        // System.out.println("door of a resort : " + resort.door);
        // System.out.println("window of a resort : " + resort.window);
        // System.out.println("color of a restort : " + resort.color);

    }
}
class residence{
    public int door;
    public int window;
    public String color;
    public int ST=0;

    public void ShowStatus(){
      System.out.println("ststus " + this.ST);
     
    }
    public int Book(String availability){
        if( availability.equals("booking") ){
           System.out.println("booking"); 
           return 1;
        }else{
            System.out.println("full");
            return 0;
        }
        
        
    }
    public int Sale(String sell){
        if(sell == "sold" ){
           System.out.println("sold");
           return 0;
        }else{
            System.out.println("unoccupied");
            return 1;
        }
       
    }
    public boolean Viwe(){
        System.out.println("");
        return true;
    }
     
    // public Void PrintDetails(){
    //     // ststem.out.println("Number of door are :"+ this.door);
    //     // ststem.out.println("Number of window are :"+ this.window);
    //     // ststem.out.println("Number of color are :"+ this.color);

    //     // door.PrintDetails();
    //     // window.PrintDetails();
    //     // color.PrintDetails();
    // }

}
// class array {
//     ArrayList<residence> residencelList = new Arr
// }