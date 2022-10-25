public class rationalFuncQ1 {
    String difficulty = "easy";
    String[] function = functions.rationalFuncDeg1();
    // list - 0: rational function, 1: x intercept, 2: y incercept, 3: horizontal asymptote, 4: vertical asymptote, 5: domain, 6: range
    String expression = function[0];
    String verticalAsymptote = function[4];
    String question = "Consider the graph y = f(x) where f(x) = " + expression + " and x is not equal to " + verticalAsymptote + ".\n\ta) Find the coordinates of:\n\t\ti)The x-intercept;\n\t\tii)The y-intercept.\n\tb) Find the equation of:\n\t\ti) he horizontal asymptote;\n\t\tii) The vertical asymptote.\n\tc) What is the domain of the function?\n\td) What is the range of the function?";
    String answer = "ai) " + function[1] + "\naii) " + function[2] + "\nbi) " + function[3] + "\nbii) " + function[4] + "\nc) " + function[5] + "\nd) " + function[6];

    public rationalFuncQ1(){

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
