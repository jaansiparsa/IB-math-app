public class quadraticsQ5 extends quadratics {
    String difficulty = "easy";
    String[] function = functions.standardForm(true, true);
    String standardFunction = function[0];
    String vertexFunction = functions.standardToVertex(function);
    String question = "a) Express " + standardFunction + " in the form a(x + b)^2 + c, where a, b, c are all integers.\nb) Given that f(x) = " + vertexFunction.substring(vertexFunction.indexOf("(")+1, vertexFunction.indexOf(")")) + " and g(f(x)) = " + standardFunction + ", find g(x).";
    String answer = "a) " + vertexFunction + "\nb) g(x) = " + vertexFunction.substring(0, vertexFunction.indexOf("(")) + "x" + vertexFunction.substring(vertexFunction.indexOf(")") + 1);

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
