public class quadraticsQ3 extends quadratics {
    String difficulty = "easy";
    String expression = functions.standardForm(false, true)[0];
    String question = "Let f(x) = " + expression + ".\n\ta) For the graph of y = f(x), find:\n\t\ti) The y-intercept;\n\t\tii) The x-intercepts.\n\tb) The function f can be expressed in the form f(x) = a(x-h)^2 + k. Find the value of h and the value of k.\n\tc) Sketch the graph of y = f(x) on the graph below. Clearly label the intercepts with the axes, and the vertex.";

    public quadraticsQ3(){
    }

    public String getDifficulty(){
        return difficulty;
    }
    public String getQuestion(){
        return question;
    }
}
