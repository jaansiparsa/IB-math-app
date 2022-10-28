public class quadraticsQ2 extends quadratics{
    String difficulty = "easy";
    String expression = functions.factoredForm(false, true)[0];

    String question = "Let f(x) = " + expression + ".\nFor the graph of f(x), find:\n\ta) The y-intercept;\n\tb) The x-intercept(s);\n\tc) The coordinates of the vertex.";

    public quadraticsQ2(){

    }
    
    public String getDifficulty(){
        return difficulty;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return "temp";
    }
}
