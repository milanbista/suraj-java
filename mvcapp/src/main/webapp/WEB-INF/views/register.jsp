<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
</head>
<body>

    <h2>User Registration</h2>

    <form action="/mvcapp/signup" method="POST">
        <div>
            <label for="firstName">First Name:</label><br>
            <input type="text" id="firstName" name="firstName" required>
        </div>
        <br>
        <div>
            <label for="lastName">Last Name:</label><br>
            <input type="text" id="lastName" name="lastName" required>
        </div>
        <br>
        <div>
            <label for="username">Username:</label><br>
            <input type="text" id="username" name="username" required>
        </div>
        <br>
        <div>
            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" required>
        </div>
        <br>
        <div>
            <label for="email">Email:</label><br>
            <input type="email" id="email" name="email" required>
        </div>
        <br>
        <div>
            <label for="age">Age:</label><br>
            <input type="number" id="age" name="age" min="0">
        </div>
        <br>
        <div>
            <label for="phoneNumber">Phone Number:</label><br>
            <input type="tel" id="phoneNumber" name="phoneNumber" pattern="[0-9]{10}" placeholder="1234567890">
        </div>
        <br>
        <div>
            <input type="submit" value="Register">
        </div>
    </form>

</body>
</html>
