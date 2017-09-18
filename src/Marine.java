public class Marine extends Soldier implements HandToHandCombat {

    public String speak(){
        return "oorah";
    }

//    @Override
//    public String punch() {
//        return null;
//    }

        public String punch(){
        return "PUNCH!";
    }
    public String eat(){
        return "MARINE EATS";
    }

    public String sleep(){
        return "MARINE SLEEPS";
    }

    public String walk(){
        return "MARINE WALKS";
    }



}
