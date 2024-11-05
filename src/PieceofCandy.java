public class PieceofCandy {

    boolean isSour;
    String type;
    int calories;

    public PieceofCandy(boolean paramIsSour, String paramType, int paramCalories){

        isSour = paramIsSour;
        type = paramType;
        calories = paramCalories;
    }
    public void printinfo(){
        if (isSour == true){
            System.out.println("One of my halloween candies was a sour " + type + " candy that had "+ calories + " calories in it.");
        }
        if (isSour == false) {
            System.out.println("One of my halloween candies was a sweet " + type + " candy that had "+ calories + " calories.");
        }
    }

}
