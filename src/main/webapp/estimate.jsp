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
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#focusBtn').on('click', function () {
                $('#invite').focus();

                return false;
            });

            setInterval(function () {
                $.ajax({
                    url: "/project/${project.getId()}/story",
                    dataType: "json",
                    accepts: {
                        text: "application/json"
                    },
                    success: function (data) {

                    }}).done();
            }, 5000);
        });
    </script>
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
    <form action="/project/${project.getId()}/stories" method="post">
        <fieldset>
            <legend>Start Estimating</legend>
            <p>Share this URL with your team:</p>

            <label>
                <div class="input-append">
                    <input id="invite" type="text"
                           value="http://localhost:8080/project/${project.getId()}/invite" style="width: 25em;"/>
                    <button class="btn" id="focusBtn"><i class="icon-pencil"></i></button>
                </div>
            </label>
            <button type="submit" class="btn btn-primary">Start Estimating</button>
        </fieldset>
    </form>
</div>
</body>
</html>
