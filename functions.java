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

        String[] returns = {expression, Integer.toString(a), Integer.toString(b), Integer.toString(c)};
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

    public static String standardToVertex(String[] standardFormInfo){
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

        return vertexForm;

    }

    public static String[] factoredToStandard(String [] factoredFormInfo){
        // array: factored form, a, factor 1, factor 2
        int a = Integer.parseInt(factoredFormInfo[1]);
        int factor1 = Integer.parseInt(factoredFormInfo[2]);
        int factor2 = Integer.parseInt(factoredFormInfo[3]);
        int b = (-1)*(factor1+factor2)*a;
        int c = factor1 * factor2 * a;

        String standardForm = a + "x^2 + " + b + "x" + c;
        String[] returns = {standardForm, Integer.toString(a), Integer.toString(b), Integer.toString(c)};
        return returns;
    }

    public static String factoredToVertex(String [] info){
        // array: factored form, a, factor 1, factor 2
        String[] standardForm = factoredToStandard(info);
        // array: standard form, a, b, c
        String vertexForm = standardToVertex(standardForm);

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

    public static void main(String[] args){
        String[] function = factoredForm(true, true);
        String vertexForm = factoredToVertex(function);

        System.out.println(function[0]);
        System.out.println(function[0]);
        System.out.println(vertexForm);
    }
    
}
