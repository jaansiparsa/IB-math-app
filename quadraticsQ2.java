public class quadraticsQ2 extends quadratics{
    String difficulty = "easy";
    // array: factored form, a, factor 1, factor 2
    String[] expression = functions.factoredForm(false, true);
    // array: expression, a, b, c
    String[] standard = functions.factoredToStandard(expression);
    String c = Integer.toString(Integer.parseInt(standard[3])*Integer.parseInt(standard[1]));
    String factor1 = expression[2];
    String factor2 = expression[3];
    // array : expression, a, x coordinate of vertex, y coordinate of vertex
    String[] vertexForm = functions.factoredToVertex(expression);
    String vertex = "(" + vertexForm[2] + ", " + vertexForm[3] + ")";

    String question = "<html>Let f(x) = " + expression[0] + ".<br>\nFor the graph of f(x), find:<br>\n\ta) The y-intercept;<br>\n\tb) The x-intercept(s);<br>\n\tc) The coordinates of the vertex.</html>";
    String answer = "<html>a) " + c + "\n<br>b) " + factor1 + " and " + factor2 + "\n<br>c) " + vertex + "</html>";

    public quadraticsQ2(){

    }
    
    public String getDifficulty(){
        return difficulty;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
}
