public class quadraticsQ1 {
    String difficulty = "easy";
    String expression = functions.standardForm(false, false)[0];
    String question = "Let f(x) = " + expression + ".\n\ta) Write down the y-intercept of the graph y=f(x); \n\tb) Solve the equation f(x) = 0;\n\tc) Find the equation of the axis of symmetry of the graph of y=f(x).";

    quadraticsQ1(){
    }

    public String getDifficulty(){
        return difficulty;
    }

    public String getQuestion(){
        return question;
    }

}
