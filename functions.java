public class functions {

    // Generates function in standard form. You can pick whether it has a leading coefficient or integer vertex. 
    public static String[] standardForm(Boolean leading_coef, Boolean int_vertex){
        String expression;
        
        int min_factor = -10;
        int max_factor = 10 ;

        int factor1;
        int factor2;
        // if this needs to have a vertex with integer coordinates, then the sum of the factors must be even
        do {
            factor1 = (int)(Math.random()*Math.abs(max_factor-min_factor+1))-Math.abs(min_factor);
            factor2 = (int)(Math.random()*Math.abs(max_factor-min_factor+1))-Math.abs(min_factor);
        }
        while (int_vertex==true && (Math.abs((factor1 + factor2)%2) == 1));

        int b = -1 * (factor1 + factor2);
        int c = factor1 * factor2; 


        // choose leading coefficient value, not allowed to be 0 or 1
        int min_a = -3;
        int max_a = 3;
        int a = 0;
        while (a == 0 || a ==1){
            a = (int)(Math.random()*Math.abs(max_a-min_a+1))-Math.abs(min_a);
        }

        if (leading_coef == false){
            if (b>= 0 && c>=0)
                expression = "x^2 + " + b + "x" + " + " + c;
            else if (b>=0 && c<0)
                expression = "x^2 + " + b + "x" + " - " + Math.abs(c);
            else if (b<0 && c>=0)
                expression = "x^2 - " + Math.abs(b) + "x" + " + " + c;
            else
                expression = "x^2 - " + Math.abs(b) + "x" + " - " + Math.abs(c);
        } else {
            if (a >= 0){
                if (b>= 0 && c>=0)
                    expression = (a) + "x^2 + " + (a*b) + "x" + " + " + (a*c);
                else if (b>=0 && c<0)
                    expression = (a) + "x^2 + " + (a*b) + "x" + " - " + Math.abs(a*c);
                else if (b<0 && c>=0)
                    expression = (a) + "x^2 - " + Math.abs(a*b) + "x" + " + " + (a*c);
                else
                    expression = (a) + "x^2 - " + Math.abs(a*b) + "x" + " - " + Math.abs(a*c);
            } else {
                if (b>= 0 && c>=0)
                    expression = (a) + "x^2 - " + (Math.abs(a)*b) + "x" + " - " + (Math.abs(a)*c);
                else if (b>=0 && c<0)
                    expression = (a) + "x^2 - " + (Math.abs(a)*b) + "x" + " + " + (Math.abs(a*c));
                else if (b<0 && c>=0)
                    expression = (a) + "x^2 + " + (Math.abs(a*b)) + "x" + " - " + (Math.abs(a)*c);
                else
                    expression = (a) + "x^2 + " + (Math.abs(a*b)) + "x" + " + " + (Math.abs(a*c));
            }
        }

        String[] returns = {expression, Integer.toString(a), Integer.toString(b), Integer.toString(c), Integer.toString(factor1), Integer.toString(factor2)};
        // returns list: expression, a, b, c, factor 1, factor 2
        return returns;
    }

    public static String[] factoredForm(Boolean leading_coef, Boolean int_vertex){
    int min_factor = -10;
    int max_factor = 10;
    int factor1;
    int factor2;

    // if this needs to have a vertex with integer coordinates, then the sum of the factors must be even
    do {
        factor1 = (int)(Math.random()*Math.abs(max_factor-min_factor+1))-Math.abs(min_factor);
        factor2 = (int)(Math.random()*Math.abs(max_factor-min_factor+1))-Math.abs(min_factor);
    }
    while (int_vertex==true && (Math.abs((factor1 + factor2)%2) == 1));

    // choose leading coefficient value, not allowed to be 0 or 1
    int min_a = -3;
    int max_a = 3;
    int a = 0;
    String expression;

    while (a == 0 || a == 1){
        a = (int)(Math.random()*Math.abs(max_a-min_a+1))-Math.abs(min_a);
    }

    if (factor1 >= 0 && factor2 >= 0){
        expression = a + "(x - " + factor1 + ")(x - " + factor2 + ")";
    } else if (factor1 >= 0 && factor2 < 0){
        expression = a + "(x - " + factor1 + ")(x + " + Math.abs(factor2) + ")";
    } else if (factor1 < 0 && factor2 >=0){
        expression = a + "(x + " + Math.abs(factor1) + ")(x - " + factor2 + ")";
    } else {
        expression = a + "(x + " + Math.abs(factor1) + ")(x + " + Math.abs(factor2) + ")";
    }
    String[] returns = {expression, Integer.toString(a), Integer.toString(factor1), Integer.toString(factor2)};
    return returns;

    }

    public static String[] vertexForm(Boolean leading_coef){

    // choose coordinates for a vertex
    int min_value = -10;
    int max_value = 10;
    int x_vertex = (int)(Math.random()*Math.abs(max_value-min_value+1))-Math.abs(min_value);
    int y_vertex = (int)(Math.random()*Math.abs(max_value-min_value+1))-Math.abs(min_value);

    // choose leading coefficient value, not allowed to be 0 or 1
    int min_a = -3;
    int max_a = 3;
    int a = 1;
    if (leading_coef == true){
        while (a == 0 || a == 1){
            a = (int)(Math.random()*Math.abs(max_a-min_a+1))-Math.abs(min_a);
        }
    }


    String expression = "";
    if (leading_coef == true)
        expression += a;
    
    if (x_vertex >= 0 && y_vertex > 0)
        expression += "(x - " + x_vertex + ")^2 + " + y_vertex;
    else if (x_vertex >= 0 && y_vertex < 0)
        expression += "(x - " + x_vertex + ")^2 - " + Math.abs(y_vertex);
    else if (x_vertex < 0 && y_vertex > 0)
        expression += "(x + " + Math.abs(x_vertex) + ")^2 + " + y_vertex;
    else
        expression += "(x + " + Math.abs(x_vertex) + ")^2 - " + Math.abs(y_vertex);
    
    String[] returns = {expression, Integer.toString(a), Integer.toString(x_vertex), Integer.toString(y_vertex)};
    return returns;

    }

    public static String[] standardToVertex(String[] standardFormInfo){
        // array: standard form, a, b, c

        int a = Integer.parseInt(standardFormInfo[1]);
        int b = Integer.parseInt(standardFormInfo[2])*a;
        int c = Integer.parseInt(standardFormInfo[3])*a;

        // standard to vertex is ax^2 + bx + c to a(x + b^2/2a)^2 + c - b^2/4a
        int xVertex = (-1)*(b/(2*a));
        int yVertex = c - (b*b/(4*a));
        String vertexForm = "" + a;
        if (xVertex >= 0)
            vertexForm += "(x - " + xVertex + ")^2";
        else
            vertexForm += "(x + " + Math.abs(xVertex) + ")^2";
        if (yVertex >= 0)
            vertexForm += " + " + yVertex;
        else
            vertexForm += " - " + Math.abs(yVertex);

        // array : expression, a, x coordinate of vertex, y coordinate of vertex
        String[] returns = {vertexForm, Integer.toString(a), Integer.toString(xVertex), Integer.toString(yVertex)};
        return returns;

    }

    public static String[] factoredToStandard(String [] factoredFormInfo){
        // array: factored form, a, factor 1, factor 2
        int a = Integer.parseInt(factoredFormInfo[1]);
        int factor1 = Integer.parseInt(factoredFormInfo[2]);
        int factor2 = Integer.parseInt(factoredFormInfo[3]);
        int b = (-1)*(factor1+factor2)*a;
        int c = factor1 * factor2 * a;

        // String standardForm = a + "x^2 + " + b + "x" + c;
        String standardForm;
        if (b>=0 && c>=0){
            standardForm = a + "x^2 + " + b + "x + " + c;
        }
        else if (b>=0 && c<0){
            standardForm = a + "x^2 + " + b + "x - " + Math.abs(c);
        }
        else if (b<0 && c>=0){
            standardForm = a + "x^2 - " + Math.abs(b) + "x + " + c;
        }
        else{
            standardForm = a + "x^2 - " + Math.abs(b) + "x - " + Math.abs(c);
        }
        // array: expression, a, b/a, c/a, factor 1, factor 2
        String[] returns = {standardForm, Integer.toString(a), Integer.toString(b/a), Integer.toString(c/a), Integer.toString(factor1), Integer.toString(factor2)};
        return returns;
    }

    public static String[] standardToFactored(String[] info){
        // array: expression, a, b/a, c/a, factor 1, factor 2
        String expression;
        int factor1 = Integer.parseInt(info[4]);
        int factor2 = Integer.parseInt(info[5]);
        if (factor1>=0 && factor2>=0){
            expression = info[1] + "(x - " + factor1 + ")(x - " + factor2 + ")";
        } else if (factor1>=0){
            expression = info[1] + "(x - " + factor1 + ")(x + " + Math.abs(factor2) + ")";
        } else if (factor1<0 && factor2 >= 0){
            expression = info[1] + "(x + " + Math.abs(factor1) + ")(x - " + factor2 + ")";
        } else {
            expression = info[1] + "(x + " + Math.abs(factor1) + ")(x + " + Math.abs(factor2) + ")";
        }
        String[] returns = {expression, info[1], info[4], info[5]};
        return returns;
        
    }

    public static String[] factoredToVertex(String [] info){
        // array: factored form, a, factor 1, factor 2
        String[] standardForm = factoredToStandard(info);
        // array: standard form, a, b, c
        String[] vertexForm = standardToVertex(standardForm);

        return vertexForm;
    }

    // public static String

    public static String vertexFormPoint(String[] function, String name){
        int a = Integer.parseInt(function[1]);
        int xVertex = Integer.parseInt(function[2]);
        int yVertex = Integer.parseInt(function[3]);

        // how far the x-coordinate of the point should be from the vertex
        int range = 5;
        int xPoint = (int)(Math.random()*range + 1 + xVertex);
        int yPoint = a*(xPoint - xVertex)*(xPoint - xVertex) + yVertex;
        String point = name + "(" + xPoint + ", " + yPoint + ")";

        return point;

    }

    public static String[] rationalFuncDeg1(){
        // choose min and max for x intercept / vertical asymptote
        int minX = -10;
        int maxX = 10;

        int xIntercept = minX + (int)(Math.random()*(maxX-minX+1));
        int verticalAsymptote = xIntercept;
        while (verticalAsymptote == xIntercept){
            verticalAsymptote = minX + (int)(Math.random()*(maxX-minX+1));
        }

        // leading coefficients for numerator and demonimator
        int minA = -5;
        int maxA = 5;
        int numA;
        int denomA;
        do {
        numA = (int)(Math.random()*(maxA-minA+1));
        denomA = (int)(Math.random()*(maxA-minA+1));
        } while (numA == 0 || denomA == 0);

        String numerator = "";
        if (numA*xIntercept >=0){
            numerator += numA + "x - " + numA*xIntercept;
        }   else{
            numerator += numA + "x + " + Math.abs(numA*xIntercept);
        }
        String denominator = "";
        if (denomA*verticalAsymptote>=0){
            denominator += denomA + "x - " + denomA*verticalAsymptote;
        } else{
            denominator += denomA + "x + " + Math.abs(denomA*verticalAsymptote);
        }

        String rationalFunction = "(" + numerator + ")/(" + denominator + ")";
        Float horizontalAsymptote = (float)numA / denomA;
        Float yIntercept = (float)(numA*xIntercept)/(denomA*verticalAsymptote);
        String domain = "(-infty, " + verticalAsymptote + ") U (" + verticalAsymptote + ", infty)";
        String range = "(-infty, " + horizontalAsymptote + ") U (" + horizontalAsymptote + ", infty)";

        // list - 0: rational function, 1: x intercept, 2: y incercept, 3: horizontal asymptote, 4: vertical asymptote, 5: domain, 6: range
        String[] returns = {rationalFunction, Integer.toString(xIntercept), Float.toString(yIntercept), Float.toString(horizontalAsymptote), Float.toString(verticalAsymptote), domain, range};
        

        return returns;
    }

    public static void main(String[] args){
        // still have to test these functions
        /*String[] function = factoredForm(true, true);
        String vertexForm = factoredToVertex(function);

        System.out.println(function[0]);
        System.out.println(function[0]);
        System.out.println(vertexForm);*/

        rationalFuncDeg1();
    }
    
}
