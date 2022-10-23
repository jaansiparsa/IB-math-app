public class quadraticsQ6 {
    String difficulty = "easy";
    Boolean int_vertex;
    String[] function = functions.standardForm(false, int_vertex);
    String question = "";
    
    quadraticsQ6(){
        int_vertex = TOF();
    }

    quadraticsQ6(Boolean int_vertex){
        this.int_vertex = int_vertex;
    }

    public Boolean TOF(){
        double random = Math.random();
        if (random > 0.5){
            return true;
        } else {
            return false;
        }
    }

}
