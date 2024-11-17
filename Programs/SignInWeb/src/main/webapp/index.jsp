<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Form</title>
    <style>
        body {
            font-size: 18px;
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
        }
        .form {
            width: 90%;
            max-width: 400px;
            background-color: white;
            padding: 2rem;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(1, 1, 1, 0.2);
        }
        .heading-background {
            text-align: center;
            border-radius: 8px;
            background-color: #007acc;
            color: white;
            padding: 1rem;
            margin-bottom: 1.5rem;
        }
        .heading-background h1 {
            margin: 0;
            font-size: 1.8rem;
        }
        .details {
            display: flex;
            flex-direction: column;
            gap: 1.5rem;
            background-color: #FF7F50;
            border-radius: 12px;
            padding: 1.5rem;
        }
        .userName input, .email input {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-size: 1rem;
            box-sizing: border-box;
        }

        input::placeholder {
            color: #aaa;
        }
        @media (max-width: 600px) {
            .form {
                padding: 1rem;
            }
            .heading-background h1 {
                font-size: 1.5rem;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form" method = "post" action =  "signUp">
            <form>
                <div class="heading-background">
                    <h1>Welcome</h1>
                </div>

                <div class="details">
                    <div class="userName">
                        <input type="text" placeholder="Enter Username" name="userName">
                    </div>
                    <div class="email">
                        <input type="email" placeholder="Enter your Email" name="email">
                    </div>

                    <div>
                    	<input type = "submit" value = "Submit"/>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
