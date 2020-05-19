
package servlet;
// Import Java Libraries
import java.io.*;
import java.util.*;

//Import Servlet Libraries
import javax.servlet.RequestDispatcher;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet( name = "final", urlPatterns = {"/final"} )
public class bathroomReview extends HttpServlet {

// Location of servlet.
//static String Domain  = "bathroomreview.herokuapp.com";


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
   PrintBody(out);
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
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   PrintBody(out);
   PrintTail(out);
} // End doGet

/** *****************************************************
 *  Prints the <head> of the HTML page, no <body>.
********************************************************* */

/** *****************************************************
 *  Prints the <BODY> of the HTML page with the form data
 *  values from the parameters.
********************************************************* */
private void PrintBody (PrintWriter out)
{
    
    out.println("<html>");
    out.println("<head>");
    out.println ("<script>");
    out.println ("  function setFocus(){");
    out.println ("    document.persist2file.NAME.focus();");
    out.println ("  }");
    out.println ("</script>");
        
    out.println("<style type=\"text/css\">");
    out.println("   h1{");
    out.println("       text-align: center;");
    out.println("       font-size:3em;");
    out.println("   }");
    out.println("   h3{");
    out.println("   text-align: center;");
    out.println("       font-size:1.25em;");
    out.println("   }");
    out.println("   p{");
    out.println("       text-align: center;");
    out.println("   }");
    out.println("   body{");
    out.println("       background-color: lightblue;");
    out.println("       padding-left: 10em;");
    out.println("       padding-right: 10em;");
    out.println("   }");
    out.println("   form{");
    out.println("       text-align: center;");
    out.println("   }");
    out.println("   #root{");
    out.println("       text-align: center;");
    out.println("       font-size:1.25em;");
    out.println("       }");
    out.println("   </style>");
    out.println("</head>");
    out.println("");

//    out.println("<script type=\"text/babel\">");
//    out.println("const Hello = () => {");
//    out.println("return (");
//    out.println("<h1>GMU Bathroom Reviewer</h1>");
//    out.println(");");
//    out.println("}");
//    out.println("ReactDOM.render(<Hello/>, document.getElementById('root'));");
//    out.println("</script>");
    
    out.println("<body>");
    out.println("");
    out.println("<h1>SWE432 Final Exam</h1>");
    out.println("<p>Truth Table</p>");
    out.println("<p>Christopher Park, G00906790</p>");
    out.println("<form method=\"post\" name=\"persist2file\" onsubmit=\"getScore(event);\" action=\"https://swe432-final.herokuapp.com/final/results\" id=\"myForm\">");
    out.println("");
    out.println("<h3>");
    out.println("    Input a boolean predicate");
    out.println("</h3>");
    out.println("");
    out.println("<textarea id=\"predicate\" name=\"predicate\" form=\"myForm\" style=\"width:700px; height:150px;\" rows=\"50\" cols=\"300\" placeholder=\"Enter your predicate...\"></textarea>");
    out.println("");
    out.println("  <br/><br/>");
    out.println("");
    out.println("");
    out.println("<button type=\"submit\" formmethod=\"post\" form=\"myForm\" value=\"Submit\">Submit</button>");
    out.println("");
    out.println("<div id=\"message\"></div>");
    out.println("<p><a href=\"https://github.com/mrchrisp96/SWE432-Final\" target=\"_blank\">GitHub code for final</a></p>");
    out.println("<p>Examples: A OR B, A AND B, A | B, A & B, etc...</p>");
    out.println("<p>Note, please make sure to split different predicates by a comma and the predicate by a space!</p>");

    out.println("</form>");
    out.println("");
//    out.println("</div>");
    out.println("<script type=\"text/javascript\" src=\"javascript/App.js\"></script>");
    out.println("<script>");
    out.println("function getScore(event) {");
    out.println("   var textarea = document.getElementById(\"predicate\").value.toLowerCase();");
    out.println("   if(textarea) {");
    out.println("       if((textarea.indexOf(\"or\") != -1) || (textarea.indexOf(\"and\") != -1) || (textarea.indexOf(\"&\") != -1) || (textarea.indexOf(\"and\") != -1) || (textarea.indexOf(\"or\") != -1) || (textarea.indexOf(\"|\") != -1)) {");
    out.println("           window.alert(\"Please insert a valid predicate!\");");
    out.println("           event.preventDefault();");
    out.println("       }");
    out.println("   } else {");
    out.println("       window.alert(\"Please input a predicate!\");");
    out.println("       event.preventDefault();");
    out.println("   }");
    out.println("}");
    out.println("</script>");
    out.println("</body>");
//    out.println("</html>");
    
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
