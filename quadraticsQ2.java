public class quadraticsQ2 {
    String difficulty = "easy";
    String expression = functions.factored_form(false, true);

    String question = "Let f(x) = " + expression + ".\nFor the graph of f(x), find:\n\ta) The y-intercept;\n\tb) The x-intercept(s);\n\tc) The coordinates of the vertex.";

    public String getDifficulty(){
        return difficulty;
    }
    public String getQuestion(){
        return question;
    }
}