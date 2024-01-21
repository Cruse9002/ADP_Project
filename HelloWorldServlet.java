import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
  
public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(
            "<html>\r\n" + //
                    "<head>\r\n" + //
                    "    <style>\r\n" + //
                    "        body {\r\n" + //
                    "  font-family: Arial, sans-serif;\r\n" + //
                    "  background-color: #f0f0f0;\r\n" + //
                    "  margin: 0;\r\n" + //
                    "  padding: 0;\r\n" + //
                    "  display: flex;\r\n" + //
                    "  justify-content: center;\r\n" + //
                    "  align-items: center;\r\n" + //
                    "  height: 100vh;\r\n" + //
                    "}\r\n" + //
                    "\r\n" + //
                    ".container {\r\n" + //
                    "  background-color: #fff;\r\n" + //
                    "  border-radius: 5px;\r\n" + //
                    "  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);\r\n" + //
                    "  padding: 20px;\r\n" + //
                    "  width: 300px;\r\n" + //
                    "}\r\n" + //
                    "\r\n" + //
                    "h2 {\r\n" + //
                    "  text-align: center;\r\n" + //
                    "  margin-bottom: 20px;\r\n" + //
                    "  color: #333;\r\n" + //
                    "}\r\n" + //
                    "\r\n" + //
                    "form {\r\n" + //
                    "  display: flex;\r\n" + //
                    "  flex-direction: column;\r\n" + //
                    "}\r\n" + //
                    "\r\n" + //
                    "    </style>\r\n" + //
                    "    <title>Login Page</title>\r\n" + //
                    "    <script>\r\n" + //
                    "        function validatePassword() {\r\n" + //
                    "            var passwordInput = document.getElementById(\"password\");\r\n" + //
                    "            var password = passwordInput.value;\r\n" + //
                    "\r\n" + //
                    "            var passwordPattern = /^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$/;\r\n" + //
                    "\r\n" + //
                    "            if (!passwordPattern.test(password)) {\r\n" + //
                    "                alert(\"Password must contain at least 8 characters with at least one letter, one digit, and one special character (@ $ ! % * # ? &).\");\r\n" + //
                    "                passwordInput.focus();\r\n" + //
                    "                return false;\r\n" + //
                    "            }\r\n" + //
                    "\r\n" + //
                    "            return true;\r\n" + //
                    "        }\r\n" + //
                    "    </script>\r\n" + //
                    "</head>\r\n" + //
                    "<body>\r\n" + //
                    "    <div class=\"container\">\r\n" + //
                    "        <h2>Login</h2>\r\n" + //
                    "        <form method=\"post\" action=\"login_validate.php\" onsubmit=\"return validatePassword()\">\r\n" + //
                    "            <label for=\"username\">Username:</label>\r\n" + //
                    "            <input type=\"text\" id=\"username\" name=\"username\" required><br>\r\n" + //
                    "\r\n" + //
                    "            <label for=\"password\">Password:</label>\r\n" + //
                    "            <input type=\"password\" id=\"password\" name=\"password\" required><br>\r\n" + //
                    "\r\n" + //
                    "            <input type=\"submit\" value=\"Login\">\r\n" + //
                    "        </form>\r\n" + //
                    "    </div>\r\n" + //
                    "</body>\r\n" + //
                    "</html>\r\n" + //
                    "");
        out.close();
    }
}