interface Batsman{
    void pull();
    void cover_drive();
    void straight_drive();
}

class Match implements Batsman{
    public void pull(){
        System.out.println("Hitman");
    }
    public void cover_drive(){
        System.out.println("King");
    }
    public void straight_drive(){
        System.out.println("Master Blaster");
    }
}

public class Impinterface {
    public static void main(String[] args) {

        Match obj= new Match();
        obj.pull();
        obj.cover_drive();
        obj.straight_drive();
        
    }

}
