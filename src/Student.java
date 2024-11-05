public class Student {
    String name;
    String costume;
    int nCandy;

    public Student (String paramname, String paramcostume, int paramncandy){

        name = paramname;
        costume = paramcostume;
        nCandy = paramncandy;

    }
    public void printinfo(){
        System.out.println(name + " dressed up as " + costume + " and got " + nCandy + " pieces of candy.");
    }
}
