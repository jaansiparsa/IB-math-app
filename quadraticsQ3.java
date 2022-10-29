public class quadraticsQ3 extends quadratics {
    String difficulty = "easy";
    String[] standard = functions.standardForm(false, true);
    // returns list: expression, a, b, c, factor 1, factor 2
    String c = standard[3];
    String factor1 = standard[4];
    String factor2 = standard[5];
    // array : expression, a, x coordinate of vertex, y coordinate of vertex
    String[] vertexForm = functions.standardToVertex(standard);
    String h = vertexForm[2];
    String k = vertexForm[3];

    String answer = "<html>ai) " + c + "<br>\naii) " + factor1 + " and " + factor2 + "<br>\nb) h: " + h  + ", k = " + k + "</html>";

    String question = "<html>Let f(x) = " + standard[0] + ".<br>\n\ta) For the graph of y = f(x), find:<br>\n      i) The y-intercept;<br>\n      ii) The x-intercepts.<br>\n\tb) The function f can be<br>expressed in the form<br>f(x) = a(x-h)^2 + k.\nFind the value of h and <br>the value of k.<br>\n\t";

    public quadraticsQ3(){
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
