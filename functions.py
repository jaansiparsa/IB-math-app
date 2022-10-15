import random
def standard_form(leading_coef, int_vertex):
    min_factor = -10
    max_factor = 10

    # if this needs to have a vertex with integer coordinates, then the sum of the factors must be even
    if int_vertex == True:
        factor1 = 1
        factor2 = 0
        while (factor1 + factor2)%2 == 1:
            factor1 = random.randint(min_factor, max_factor)
            factor2 = random.randint(min_factor, max_factor)
    else:
        factor1 = random.randint(min_factor, max_factor)
        factor2 = random.randint(min_factor, max_factor)  

    # choose leading coefficient value, not allowed to be 0 or 1
    min_a = -3
    max_a = 3
    a = 0
    while a == 0 or a ==1:
        a = random.randint(min_a, max_a)

    b = -1 * (factor1 + factor2)
    c = factor1 * factor2

    if leading_coef == False:
        if b>= 0 and c>=0:
            expression = "x^2 + " + str(b) + "x" + " + " + str(c)
        elif b>=0 and c<0:
            expression = "x^2 + " + str(b) + "x" + " - " + str(abs(c))
        elif b<0 and c>=0:
            expression = "x^2 - " + str(abs(b)) + "x" + " + " + str(c)
        else:
            expression = "x^2 - " + str(abs(b)) + "x" + " - " + str(abs(c))
    if leading_coef == True:
        if a >= 0:
            if b>= 0 and c>=0:
                expression = str(a) + "x^2 + " + str(a*b) + "x" + " + " + str(a*c)
            elif b>=0 and c<0:
                expression = str(a) + "x^2 + " + str(a*b) + "x" + " - " + str(abs(a*c))
            elif b<0 and c>=0:
                expression = str(a) + "x^2 - " + str(abs(a*b)) + "x" + " + " + str(a*c)
            else:
                expression = str(a) + "x^2 - " + str(abs(a*b)) + "x" + " - " + str(abs(a*c))
        else:
            if b>= 0 and c>=0:
                expression = str(a) + "x^2 - " + str(abs(a)*b) + "x" + " - " + str(abs(a)*c)
            elif b>=0 and c<0:
                expression = str(a) + "x^2 - " + str(abs(a)*b) + "x" + " + " + str(abs(a*c))
            elif b<0 and c>=0:
                expression = str(a) + "x^2 + " + str(abs(a*b)) + "x" + " - " + str(abs(a)*c)
            else:
                expression = str(a) + "x^2 + " + str(abs(a*b)) + "x" + " + " + str(abs(a*c))
    return expression

def factored_form(leading_coef, int_vertex):
    min_factor = -10
    max_factor = 10

    # if this needs to have a vertex with integer coordinates, then the sum of the factors must be even
    if int_vertex == True:
        factor1 = 1
        factor2 = 0
        while (factor1 + factor2)%2 == 1:
            factor1 = random.randint(min_factor, max_factor)
            factor2 = random.randint(min_factor, max_factor)
    else:
        factor1 = random.randint(min_factor, max_factor)
        factor2 = random.randint(min_factor, max_factor)  

    # choose leading coefficient value, not allowed to be 0 or 1
    min_a = -3
    max_a = 3
    a = 0
    while a == 0 or a ==1:
        a = random.randint(min_a, max_a)

    if factor1 >= 0 and factor2 >= 0:
        expression = str(a) + "(x -" + str(factor1) + ")(x -" + str(factor2) + ")"
    if factor1 >= 0 and factor2 < 0:
        expression = str(a) + "(x -" + str(factor1) + ")(x +" + str(abs(factor2)) + ")"
    if factor1 < 0 and factor2 >=0:
        expression = str(a) + "(x +" + str(abs(factor1)) + ")(x -" + str(factor2) + ")"
    else:
        expression = str(a) + "(x +" + str(abs(factor1)) + ")(x +" + str(abs(factor2)) + ")"

def vertex_form(leading_coef):

    # choose coordinates for a vertex
    min_value = -10
    max_value = 10
    x_vertex = random.randint(min_value, max_value)
    y_vertex = random.randint(min_value, max_value)

    # choose leading coefficient value, not allowed to be 0 or 1
    min_a = -3
    max_a = 3
    a = 0
    while a == 0 or a == 1:
        a = random.randint(min_a, max_a)

    if leading_coef == False:
        expression = ""
    else:
        expression = str(a)
    
    if x_vertex >= 0 and y_vertex > 0:
        expression += "(x - " + str(x_vertex) + ")^2 + " + str(y_vertex)
    elif x_vertex >= 0 and y_vertex < 0:
        expression += "(x - " + str(x_vertex) + ")^2 - " + str(abs(y_vertex))
    elif x_vertex < 0 and y_vertex > 0:
        expression += "(x + " + str(abs(x_vertex)) + ")^2 + " + str(y_vertex)
    else:
        expression += "(x + " + str(abs(x_vertex)) + ")^2 + " + str(abs(y_vertex))
    
    return expression

