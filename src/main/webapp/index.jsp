<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Scrum Poker</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<div class="container">
    <div class="masthead">
        <ul class="nav nav-pills pull-right">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <h3 class="muted">Scrum Poker</h3>
    </div>
    <form action="/project" method="post">
        <fieldset>
            <legend>Create a new project</legend>
            <label>
                <input name="name" type="text" placeholder="Your project name"/>
            </label>
            <button type="submit" class="btn btn-primary">Next</button>
        </fieldset>
    </form>
</div>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
