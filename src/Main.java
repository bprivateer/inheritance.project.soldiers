public class Main {
    public static void main(String[] args){
        ArmySoldier armySoldier = new ArmySoldier();
        Marine marine = new Marine();
        NavySoldier sailor = new NavySoldier();
        ArtillerySoldier artillerySoldier = new ArtillerySoldier();

        armySoldier.speak();
        armySoldier.kick();
        armySoldier.eat();
        armySoldier.sleep();
        armySoldier.walk();
        System.out.println();
        System.out.println(armySoldier.speak());
        System.out.println(armySoldier.eat());
        System.out.println(armySoldier.walk());
        System.out.println(armySoldier.sleep());
        System.out.println(armySoldier.kick());


        marine.speak();
        marine.punch();
        marine.eat();
        marine.sleep();
        marine.walk();
        System.out.println();
        System.out.println(marine.speak());
        System.out.println(marine.punch());
        System.out.println(marine.eat());
        System.out.println(marine.sleep());
        System.out.println(marine.walk());


        sailor.speak();
        sailor.eat();
        sailor.sleep();
        sailor.walk();
        sailor.aquaticCombat();
        System.out.println();
        System.out.println(sailor.eat());
        System.out.println(sailor.sleep());
        System.out.println(sailor.walk());
        System.out.println(sailor.speak());
        System.out.println(sailor.aquaticCombat());




    }

}
