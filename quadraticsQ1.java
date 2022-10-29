
public class quadraticsQ1 extends quadratics{
    String difficulty = "easy";
    // returns list: expression, a, b, c
    String[] function = functions.standardForm(false, false);
    String expression = function[0];
    String c = function[3];
    String[] factored = functions.standardToFactored(function);
    String factor1 = factored[2];
    String factor2 = factored[3];
    String [] vertex = functions.standardToVertex(function);
    String xVertex = vertex[2];
    String question = "<html>Let f(x) = " + expression + ".<br>\n\ta) Write down the y-intercept of the graph y=f(x);<br> \n\tb) Solve the equation f(x) = 0;<br>\n\tc) Find the equation of the axis of<br>symmetry of the graph of y=f(x).</html>";
    String answer = "<html>a) " + c + "<br>\nb) x = " + factor1 + "and x = " + factor2 + "<br>\nc) y = " + xVertex;
    public quadraticsQ1(){
    }

    public String getDifficulty(){
        return difficulty;
    }

    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return c;
    }

}
