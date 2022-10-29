public class quadraticsQ5 extends quadratics {
    String difficulty = "easy";
    String[] function = functions.standardForm(true, true);
    String standardFunction = function[0];
    String[] vertexFunction = functions.standardToVertex(function);
    String vertexForm = vertexFunction[0];
    String question = "<html>a) Express " + standardFunction + " in the form<br>a(x + b)^2 + c, where a, b, c are all integers.<br>\nb) Given that f(x) = " + vertexForm.substring(vertexForm.indexOf("(")+1, vertexForm.indexOf(")")) + "<br>and g(f(x)) = " + standardFunction + ", find g(x).</html>";
    String answer = "<html>a) " + vertexFunction[0] + "<br>\nb) g(x) = " + vertexForm.substring(0, vertexForm.indexOf("(")) + "x" + vertexForm.substring(vertexForm.indexOf(")") + 1) + "</html>";

    public quadraticsQ5(){

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
