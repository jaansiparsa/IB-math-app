public class quadraticsQ4 {
    String difficulty = "easy";
    String[] function = functions.vertexForm(true);
    String xVertex = function[2];
    String yVertex = function[3];
    String vertex = "V(" + xVertex + ", " + yVertex +")";
    String point = functions.vertexFormPoint(function, "P");
    String question = "Let f(x) = a(x - h)^2 + k.\nThe vertex of the graph is at " + vertex + " and the graph passes through " + point + ".\n\ta) Write down the values of h and k.\n\tb) Find the value of a.";

    public quadraticsQ4(){

    }

    public String getDifficulty(){
        return difficulty;
    }
    public String getQuestion(){
        return question;
    }
}
