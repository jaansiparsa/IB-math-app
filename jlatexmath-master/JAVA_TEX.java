// import JSoup;


import java.io.IOException;

public class JAVA_TEX {
    public static void main(String[] args) {

        String demo_latex = "\\begin{array}{|c|l|||r|c|}";
        demo_latex += "\\hline";
        demo_latex += "\\text{Matrix}&\\multicolumn{2}{|c|}{\\text{Multicolumns}}&\\text{Font sizes commands}\\cr";
        demo_latex += "\\hline";
        demo_latex += "\\begin{pmatrix}\\alpha_{11}&\\cdots&\\alpha_{1n}\\cr\\hdotsfor{3}\\cr\\alpha_{n1}&\\cdots&\\alpha_{nn}\\end{pmatrix}&\\Large \\text{Large Right}&\\small \\text{small Left}&\\tiny \\text{tiny Tiny}\\cr";
        demo_latex += "\\hline";
        demo_latex += "\\multicolumn{4}{|c|}{\\Huge \\text{Huge Multicolumns}}\\cr";
        demo_latex += "\\hline";
        demo_latex += "\\end{array}";

        try {
            Convert.toSVG(demo_latex, "demo_latex.svg", false);
            Convert.toSVG(demo_latex, "demo_latex_shaped.svg", true);
            Convert.SVGTo("demo_latex.svg", "demo_latex.pdf", Convert.PDF);
            Convert.SVGTo("demo_latex_shaped.svg", "demo_latex_shaped.pdf", Convert.PDF);
            Convert.SVGTo("demo_latex.svg", "demo_latex.ps", Convert.PS);
            Convert.SVGTo("demo_latex.svg", "demo_latex.eps", Convert.EPS);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}

    
}
