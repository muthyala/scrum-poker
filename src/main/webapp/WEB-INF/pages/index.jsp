<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Scrum Poker</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<div class="container">
    <div class="hero-unit">
        <h1>Hello</h1>

        <p>Scrum Poker is a quick and easy scrum estimation tool for your distributed team.</p>

        <form action="/session" method="post">
            <input type="text" placeholder="Your session name"/>
            <button type="submit" class="btn btn-primary">Start</button>
        </form>
    </div>
</div>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>
</body>
</html>
