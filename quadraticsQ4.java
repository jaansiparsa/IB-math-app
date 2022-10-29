public class quadraticsQ4 extends quadratics {
    String difficulty = "easy";
    String[] function = functions.vertexForm(true);
    String a = function[1];
    String xVertex = function[2];
    String yVertex = function[3];
    String vertex = "V(" + xVertex + ", " + yVertex +")";
    String point = functions.vertexFormPoint(function, "P");
    String question = "<html>Let f(x) = a(x - h)^2 + k.<br>\nThe vertex of the graph is at " + vertex + "<br>and the graph passes through " + point + ".\n\t<br>a) Write down the values of h and k.<br>\n\tb) Find the value of a.</html>";
    String answer = "<html>a) h = " + xVertex + ", k = " + yVertex + "\n<br>b) " + a +"</html>";

    public quadraticsQ4(){

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
