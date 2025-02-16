
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>SumCalculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <h1 align="center">Sum Calculator </h1>
    <body>
        <form align="center" action="SumCalculatorServlet.do" method="post">
            <input type="text" name="param1" required=""/><br/>
            <input type="text" name="param2" required=""/><br/>
            
             <p>The sum is <%=request.getAttribute("result")%></p>
            
            <input type="submit"/>
            
           
            
            
        </form>
      
    </body>
</html>
