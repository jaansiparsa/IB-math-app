# object class that creates a question
import functions

class quadraticsQ1:
    difficulty = "easy"
    expression = functions.standard_form(False, False)
    
    question = "Let f(x) = " + expression + ".\n\ta) Write down the y-intercept of the graph y=f(x); \n\tb) Solve the equation f(x) = 0;\n\tc) Find the equation of the axis of symmetry of the graph of y=f(x)."

    def get_difficulty(self):
        return quadraticsQ1.difficulty
    def get_question(self):
        return quadraticsQ1.question


class quadraticsQ3:
    difficulty = "easy"
    expression = functions.factored_form(False, True)

    question = "Let f(x) = " + expression + ".\nFor the graph of f(x), find:\n\ta) The y-intercept;\n\tb) The x-intercept(s);\n\tc) The coordinates of the vertex."

    def get_difficulty(self):
        return quadraticsQ1.difficulty
    def get_question(self):
        return quadraticsQ1.question

