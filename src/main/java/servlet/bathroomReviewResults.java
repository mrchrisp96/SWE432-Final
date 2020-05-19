
package servlet;
// Import Java Libraries
import java.io.*;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

//Import Servlet Libraries
import javax.servlet.RequestDispatcher;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet( name = "results", urlPatterns = {"/final/results"} )
public class bathroomReviewResults extends HttpServlet {

// Location of servlet.
static String RESOURCE_FILE = "allReviews.txt";


// Other strings.

/** *****************************************************
 *  Overrides HttpServlet's doPost().
 *  Converts the values in the form, performs the operation
 *  indicated by the submit button, and sends the results
 *  back to the client.
********************************************************* */
public void doPost (HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    PrintBody(out, request);
    PrintTail(out);
}  // End doPost

/** *****************************************************
 *  Overrides HttpServlet's doGet().
 *  Prints an HTML page with a blank form.
********************************************************* */
public void doGet (HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException
{
    //   RequestDispatcher view = request.getRequestDispatcher(indexpage);
    String predicate = request.getParameter("predicate");
    
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
    //    if(building != null) {
    //        try {
    //            File file = new File("allReview.txt");
    //            if (file.createNewFile()) {
    //                System.out.println("File created: " + file.getName());
    //            } else {
    //                System.out.println("File already exists.");
    //            }
    //            // Add the reviews here
    //            FileWriter myWriter = new FileWriter("allReviews.txt");
    //            myWriter.write(building + "," + cleanliness + "," + odor + "," + wouldUseAgain + "," + userComments + "\n");
    //            myWriter.close();
    //        } catch (IOException e) {
    //            System.out.println("An error occurred.");
    //            e.printStackTrace();
    //        }
    //    }
   PrintBody(out, request);
   PrintTail(out);
} // End doGet

/** *****************************************************
 *  Prints the <head> of the HTML page, no <body>.
********************************************************* */
    
//private void printTruthTable(integer N, integer index, integer array truthVals) {
//   if (index == N) {
//       for (i=0; i<N; i++) {
//           print(truthVals[i] + " ");
//       }
//   } else {
//      for (i=0; i<2; i++) {
//         truthVals[index] = i;
//         printTruthTable(N, index + 1, truthVals);
//      }
//   }
//}


/** *****************************************************
 *  Prints the <BODY> of the HTML page with the form data
 *  values from the parameters.
********************************************************* */
private void PrintBody (PrintWriter out, HttpServletRequest request)
{
    
    String predicate = request.getParameter("predicate");
    
    out.println("<html>");
    out.println("<head>");
//
    out.println("  <style type=\"text/css\">");
    out.println("  h1{");
    out.println("    text-align: center;");
    out.println("    font-size:3em;");
    out.println("  }");
    out.println("  h3{");
    out.println("  text-align: center;");
    out.println("    font-size:1.25em;");
    out.println("  }");
    out.println("  p{");
    out.println("    text-align: center;");
    out.println("    font-size:2em;");
    out.println("  }");
    out.println("  body{");
    out.println("      background-color: lightblue;");
    out.println("    padding-left: 10em;");
    out.println("    padding-right: 10em;");
    out.println("  }");
    out.println("   table, th, td {");
    out.println("       word-wrap: break-word;");
    out.println("       border: 1px solid black;");
    out.println("       padding: 10px;");
    out.println("       text-align: left;");
    out.println("       width: 100%;");
    out.println("       table-layout: fixed;");
    out.println("   }");
    out.println("   hr.rounded {");
    out.println("       border-top: 5px solid black;");
    out.println("       border-radius: 5px;");
    out.println("   }");
//    out.println("   td {");
//    out.println("       white-space:pre-line;");
//    out.println("   }");
    out.println("  </style>");
    out.println("</head>");
    out.println("");
    out.println("<body>");
    out.println("<h1>SWE432 Final Exam Results</h1>");
    if(predicate != null) {
        List<String> predicateList = new ArrayList<String>(Arrays.asList(predicate.split(",")));
        for(int i = 0; i < predicateList.size(); i++) {
//            String lowerPred = predicateList[i].toLowerCase();
//            List<String> predicateSplit = new ArrayList<String>(Arrays.asList(lowerPred.split(" ")));
//            List<String> values = new ArrayList<String>();
//            List<String> operator = new ArrayList<String>();
//            for(int y = 0; y < predicateSplit.size(); y++) {
//                if(predicateSplit[y] != "and" || predicateSplit[y] != "or" || predicateSplit[y] != "||" || predicateSplit[y] != "&&") {
//                    values.append(predicateSplit[i]);
//                } else {
//                    operator.append(predicateSplit[i]);
//                }
//            }
            
            out.println("<p>" + predicateList + "</p>");
            out.println("    <table text-align=\"left\" id=\"your-results\">");
            out.println("        <tr>");
            for(int i = 0; i < values.size(); i++) {
                out.println("            <th>" + values[i] + "</th>");
            }
            out.println("        </tr>");
//            for(int x = 0; x < )
            out.println("        <tr>");
            out.println("            <th>" + values[i] + "</th>");
            out.println("            <th>" + values[i] + "</th>");
            out.println("            <th>" + values[i] + "</th>");
            out.println("        </tr>");
            out.println("   </table>");
            out.println("<br/><br/>");
        }
    } else {
        out.println("<p>Click the link below to start a new truth table!</p>");
        out.println("<p>");
        out.println("<a href=\"https://swe432-final.herokuapp.com/final\">New Review</a>");
        out.println("</p>");
    }

    out.println("<hr class=\"rounded\">");
    
    out.println("  <br/><br/>");
    out.println("");
    out.println("</body>");
    out.println("</html>");

    
} // End PrintBody

/** *****************************************************
 *  Overloads PrintBody (out,lhs,rhs,rslt) to print a page
 *  with blanks in the form fields.
********************************************************* */
//private void PrintBody (PrintWriter out)
//{
//   PrintBody(out);
//}

/** *****************************************************
 *  Prints the bottom of the HTML page.
********************************************************* */
private void PrintTail (PrintWriter out)
{
   out.println("");
   out.println("</html>");
} // End PrintTail

}  // End twoButtons
