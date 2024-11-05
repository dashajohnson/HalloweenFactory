public class HalloweenFactory {
    public int year = 2024;
    public int temperature = 20;

    public static void main(String[] args) {
    HalloweenFactory myHalloween;
    myHalloween = new HalloweenFactory();
    }

    public HalloweenFactory(){
        System.out.println("In "+ year +", I went out for trick or treating on Halloween and it was "+ temperature + " degrees celsius.");
        PieceofCandy PieceofCandy1;
        PieceofCandy1 = new PieceofCandy(false, "tootsie roll", 50);
        PieceofCandy1.printinfo();

        PieceofCandy PieceofCandy2;
        PieceofCandy2 = new PieceofCandy(true,"patch kid",60);
        PieceofCandy2.printinfo();

        Student Student1;
        Student1 = new Student("Dasha","a cat",25);
        Student1.printinfo();

        Student Student2;
        Student2 = new Student ("Indra","an astronaut", 47);
        Student2.printinfo();
    }

}
