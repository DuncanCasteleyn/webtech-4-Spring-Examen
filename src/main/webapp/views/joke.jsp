<%@ page language='java' contentType='text/html; charset=UTF-8'
         pageEncoding='UTF-8'%>
<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>

<html>
<head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>

    <title>Joke generator</title>
</head>

<body>

<div class='well'>
    <h1>Make a joke about a specific person</h1>
    <br/>
    <form method=GET action='joke_post' onsubmit='return validate()'>
        <div class='form-group row'>
            <div class='col-xs-4'>
                <label for='firstName'>First Name : </label>
                <input type='text' class='form-control' name='firstName' id='firstName'>
            </div>
        </div>
        <div class='form-group row'>
            <div class='col-xs-4'>
                <label for='lastName'>Last Name : </label>
                <input type='text' class='form-control' name='lastName' id='lastName'>
            </div>
        </div>

        <input type=SUBMIT value='Get a Joke'>
    </form>
</div>

</body>
</html>