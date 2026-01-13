<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h2>Login</h2>

<form action="login" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <button type="submit">Login</button>
</form>

<p style="color:red">${error}</p>

</body>
</html>
