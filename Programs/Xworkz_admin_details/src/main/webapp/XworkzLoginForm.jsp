<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Application</title>

  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: white;
    }
    h3 {
      text-align: center;
      color: grey;
      margin-top: 20px;
    }
    .container {
      width: 50%;
      margin: 0 auto;
      background-color: pink;
      padding: 25px;
      border-radius: 8px;
      box-shadow: black;
      margin-top: 20px;
    }
    .form-group {
      margin-bottom: 10px;
    }
    .msg {
      color: #d9534f;
      text-align: center;
      margin-bottom: 10px;
    }
    .button-container {
      display: flex;
      justify-content: center;
    }
  </style>
</head>
<body>

  <div class="container">
    <h3>Xworkz Login Form&#128516</h3>

    <div class="msg">${msg}</div>

    <form action="enter" method="post">
      <div class="form-group">
        <label for="name" class="font-weight-bold">User Name</label>
        <input type="text" class="form-control" name="name" value="${message.name}">
      </div>

      <div class="form-group">
        <label for="age" class="font-weight-bold">Age</label>
        <input type="number" class="form-control" name="age" value="${message.age}">
      </div>

      <div class="form-group">
        <label for="mobNo" class="font-weight-bold">Mobile Number</label>
        <input type="number" class="form-control" name="mobNo" value="${message.mobNo}">
      </div>

      <div class="form-group">
        <label for="email" class="font-weight-bold">Email</label>
        <input type="email" class="form-control" name="email" value="${message.email}">
      </div>

      <div class="form-group">
        <label for="password" class="font-weight-bold">Password</label>
        <input type="password" class="form-control" name="password" value="${message.password}">
      </div>

      <div class="form-group">
        <label for="confirmPassword" class="font-weight-bold">Confirm Password</label>
        <input type="password" class="form-control" name="confirmPassword" value="${message.confirmPassword}">
      </div>

      <div class="form-group">
        <div class="button-container">
          <input type="submit" class="btn btn-success" value="Submit">
        </div>
      </div>
    </form>
  </div>



</body>
</html>
