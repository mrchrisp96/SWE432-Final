
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
//    out.println("<script src=\"https://unpkg.com/react@16.4.1/umd/react.production.min.js\"></script>");
//    out.println("<script src=\"https://unpkg.com/react-dom@16.4.1/umd/react-dom.production.min.js\"></script>");
//    out.println("<script src=\"https://unpkg.com/babel-standalone@6.15.0/babel.min.js\"></script>");
//
//    out.println("<script src=\"js/react.development.min.js\"></script>");
//    out.println("<script src=\"js/react-dom.development.min.js\"></script>");
//    out.println("<script src=\"js/browser.min.js\"></script>");
        
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
    out.println("<h1>GMU Bathroom Reviewer</h1>");
    out.println("<p>This web app allows you to review the bathrooms of a building at GMU in Fairfax</p>");
    out.println("<h3>Please select a building</h3>");
    out.println("<form method=\"post\" onsubmit=\"getScore(event);\" action=\"https://bathroomreview.herokuapp.com/assignment8/results\" id=\"myForm\">");
    out.println("<select name=\"building\" id=\"building\">");
    out.println("    <option value=\"Volgenau School of Engineering\" selected=\"selected\">Volgenau School of Engineering</option>");
    out.println("    <option value=\"Music Theater Building\">Music Theater Building</option>");
    out.println("    <option value=\"SUB1\">Sub1</option>");
    out.println("    <option value=\"The Hub\">The Hub</option>");
    out.println("    <option value=\"deLaski Performing Arts Building\">deLaski Performing Arts Building</option>");
    out.println("    <option value=\"Planetary Hall\">Planetary Hall</option>");
    out.println("    <option value=\"Innovation Hall\">Innovation Hall</option>");
    out.println("");
    out.println("</select>");
    out.println("");
    out.println("    <h3>");
    out.println("        Cleanliness");
    out.println("    </h3>");
    out.println("    <p style=“text-align:justify”>");
    out.println("            <input type=\"radio\" name=\"cleanliness\" id=\"veryDirty\" value=\"Very Dirty\" checked/>");
    out.println("    <label for=\"veryDirty\">Very Dirty</label>");
    out.println("            <input type=\"radio\" name=\"cleanliness\" id=\"dirty\" value=\"Dirty\" />");
    out.println("    <label for=\"dirty\">Dirty</label>");
    out.println("            <input type=\"radio\" name=\"cleanliness\" id=\"slightlyMessy\" value=\"Slightly Messy\" />");
    out.println("    <label for=\"slightlyMessy\">Slightly Messy</label>");
    out.println("            <input type=\"radio\" name=\"cleanliness\" id=\"mostlyClean\" value=\"Mostly Clean\" />");
    out.println("    <label for=\"mostlyClean\">Mostly Clean</label>");
    out.println("            <input type=\"radio\" name=\"cleanliness\" id=\"completelyClean\" value=\"Completely Clean\" />");
    out.println("    <label for=\"completelyClean\">Completely Clean</label>");
    out.println("    </p>");
    out.println("");
    out.println("");
    out.println("    <h3>");
    out.println("        Odor");
    out.println("    </h3>");
    out.println("    <p style=“text-align:justify”>");
    out.println("    <input type=\"radio\" name=\"odor\" id=\"unbearable\" value=\"Unbearable\" checked/>");
    out.println("        <label for=\"unbearable\">Unbearable</label>");
    out.println("    <input type=\"radio\" name=\"odor\" id=\"unpleasant\" value=\"Unpleasant\" />");
    out.println("        <label for=\"unpleasant\">Unpleasant</label>");
    out.println("    <input type=\"radio\" name=\"odor\" id=\"moderate\" value=\"Moderate\" />");
    out.println("        <label for=\"moderate\">Moderate</label>");
    out.println("    <input type=\"radio\" name=\"odor\" id=\"unnoticeable\" value=\"Unnoticeable\" />");
    out.println("        <label for=\"unnoticeable\">Unnoticeable</label>");
    out.println("    <input type=\"radio\" name=\"odor\" id=\"fresh\" value=\"Fresh\" />");
    out.println("        <label for=\"fresh\">Fresh</label><br/>");
    out.println("    </p>");
    out.println("");
    out.println("    <h3>");
    out.println("    Would you use this restroom again?<br/>");
    out.println("  </h3>");
    out.println("  <input type=\"radio\" name=\"wouldUseAgain\" id=\"yes\" value=\"Yes\" />");
    out.println("      <label for=\"yes\">Yes</label><br/>");
    out.println("  <input type=\"radio\" name=\"wouldUseAgain\" id=\"no\" value=\"No\" checked/>");
    out.println("      <label for=\"no\">No</label><br/>");
    out.println("");
    out.println("<h3>");
    out.println("    Any additional comments");
    out.println("</h3>");
    out.println("");
    out.println("");
    out.println("<textarea id=\"userComments\" name=\"userComments\" form=\"myForm\" style=\"width:700px; height:150px;\" rows=\"50\" cols=\"300\" placeholder=\"Enter your message...\"></textarea>");
    out.println("");
    out.println("  <br/><br/>");
    out.println("");
    out.println("");
    out.println("<button type=\"submit\" formmethod=\"post\" form=\"myForm\" value=\"Submit\">Submit</button>");
    out.println("");
    out.println("<div id=\"message\"></div>");
    out.println("    <p><a href=\"https://github.com/mrchrisp96/SWE432-Final\">GitHub Executable Code</a></p>");
    out.println("</form>");
    out.println("");
//    out.println("</div>");
    out.println("<script type=\"text/javascript\" src=\"javascript/App.js\"></script>");
    out.println("<script>");
    out.println("function getScore(event) {");

    out.println("   var i = 0;");
    out.println("   var odor = -1;");
    out.println("   var clean = -1;");
    out.println("   var would = 0;");
    
    out.println("   var buildingStr;");
    out.println("   var cleanStr;");
    out.println("   var odorStr;");
    out.println("   var commentStr;");
    
    out.println("   var textarea = document.getElementById(\"userComments\").value.toLowerCase();");
    out.println("   let cIDs = [\"veryDirty\",\"dirty\",\"slightlyMessy\",\"mostlyClean\",\"completelyClean\"];");
    out.println("   let oIDs = [\"unbearable\",\"unpleasant\",\"moderate\",\"unnoticeable\",\"fresh\"];");
    out.println("   while (i<5) {");
    out.println("     if (document.getElementById(cIDs[i]).checked){");
    out.println("       clean = i;");
    out.println("       cleanStr = document.getElementById(cIDs[i]);");
    out.println("     }");
    out.println("     if (document.getElementById(oIDs[i]).checked){");
    out.println("       odor = i;");
    out.println("       odorStr = document.getElementById(oIDs[i]);");
    out.println("     }");
    out.println("     i = i + 1;");
    out.println("   }");
    out.println("   if (document.getElementById(\"yes\").checked) {");
    out.println("     would = 1;");
    out.println("   }");
    out.println("");
    out.println("   let score = (12 * clean) + (8 * odor) + (would * 20);");
    out.println("   if(textarea) {");
    out.println("       if((textarea.indexOf(\"fuck\") != -1) || (textarea.indexOf(\"shit\") != -1) || (textarea.indexOf(\"gay\") != -1) || (textarea.indexOf(\"fag\") != -1)) {");
    out.println("           window.alert(\"Please omit innapropriate words!\");");
    out.println("           event.preventDefault();");
    out.println("       } else {");
    out.println("           window.alert(\"Restroom review score: \" + score + \" out of 100\");");
//    out.println("           commentStr = document.getElementById(\"userComments\").value;");
//    out.println("           buildingStr = document.getElementById(\"building\").value;");
//    out.println("           let payLoad = [buildingStr, cleanStr, odorStr, would, commentStr]\n");
//    out.println("           set fso = CreateObject(\"Scripting.FileSystemObject\");");
//    out.println("           set s = fso.CreateTextFile(\"allReviews.txt\", True);");
//    out.println("           s.writeline(\"Building: \" + buildingStr);");
//    out.println("           s.writeline(\"Cleanliness: \" + buildingStr);");
//    out.println("           s.writeline(\"Odor: \" + buildingStr);");
//    out.println("           s.writeline(\"Would: \" + buildingStr);");
//    out.println("           s.writeline(\"Comment: \" + buildingStr);");
//    out.println("           s.writeline(\"-\");");
//    out.println("           s.Close();");
    out.println("       }");
    out.println("   } else {");
    out.println("       window.alert(\"Please input a comment!\");");
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
