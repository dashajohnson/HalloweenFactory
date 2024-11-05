public class HalloweenFactory {
    int year;
    int temperature;

    public static void main(String[] args) {
        HalloweenFactory myHalloween;
        myHalloween = new HalloweenFactory();
        myHalloween.year = 2024;
        myHalloween.temperature = 20;

        System.out.println("In "+ myHalloween.year +", I went out for trick or treating on Halloween and it was "+myHalloween.temperature + " degrees celsius.");
    }

    public HalloweenFactory(){
        PieceofCandy PieceofCandy1;
        PieceofCandy1 = new PieceofCandy(false, "tootsie roll", 50);
        PieceofCandy1.printinfo();

        PieceofCandy PieceofCandy2;
        PieceofCandy2 = new PieceofCandy(true,"patch kid",60);
        PieceofCandy2.printinfo();

        Student Student1;
        Student1 = new Student("Dasha","cat",25);
        Student1.printinfo();

        Student Student2;
        Student2 = new Student ("Indra","astronaut", 47);
        Student2.printinfo();
    }

}
