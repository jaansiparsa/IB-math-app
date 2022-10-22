public class functions {
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

    public static String factored_form(Boolean leading_coef, Boolean int_vertex){
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
    return expression;

    }

    public static String vertex_form(Boolean leading_coef){

    // choose coordinates for a vertex
    int min_value = -10;
    int max_value = 10;
    int x_vertex = (int)(Math.random()*Math.abs(max_value-min_value+1))-Math.abs(min_value);
    int y_vertex = (int)(Math.random()*Math.abs(max_value-min_value+1))-Math.abs(min_value);

    // choose leading coefficient value, not allowed to be 0 or 1
    int min_a = -3;
    int max_a = 3;
    int a = 0;
    while (a == 0 || a == 1){
        a = (int)(Math.random()*Math.abs(max_a-min_a+1))-Math.abs(min_a);
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
        expression += "(x + " + Math.abs(x_vertex) + ")^2 + " + Math.abs(y_vertex);
    
    return expression;

    }

    public static String standardToVertex(Boolean leading_coef){
        // array: standard form, a, b, c
        String[] info = standardForm(leading_coef, true);

        int a = Integer.parseInt(info[1]);
        int b = Integer.parseInt(info[2])*a;
        int c = Integer.parseInt(info[3])*a;

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

    // public static String

    public static void main(String [] args){
        standardToVertex(true);
    }
    
}
