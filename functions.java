public class functions {
    public static String standard_form(Boolean leading_coef, Boolean int_vertex){
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

     
        return expression;
    }

    public static void main(String [] args){
        System.out.println(standard_form(false, true));
    }
}
