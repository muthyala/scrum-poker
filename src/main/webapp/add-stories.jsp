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
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <h3 class="muted">Scrum Poker</h3>
    </div>
    <form action="/project/${project.getId()}/stories" method="post">
        <fieldset>
            <legend>Add User Stories</legend>
            <label>
                <textarea name="story" placeholder="As a &lt;role&gt;, I want &lt;feature&gt;, so that &lt;goal&gt;"
                          style="width: 100%" rows="3"></textarea>
            </label>
            <button type="submit" class="btn btn-primary">Next</button>
        </fieldset>
    </form>
</div>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
