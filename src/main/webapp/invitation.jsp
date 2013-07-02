<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
            <li class="active"><a href="/">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <h3 class="muted">Scrum Poker</h3>
    </div>
    <form action="/project/${project.getId()}/invite" method="post">
        <fieldset>
            <legend>Join Project</legend>
            <label>
                <input type="name" placeholder="Joe Bloggs"/>
            </label>
            <button type="submit" class="btn btn-primary">Join Project</button>
        </fieldset>
    </form>
</div>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
