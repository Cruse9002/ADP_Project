<?php
// Replace with your actual username and password
$valid_username = 'ADPteam05';
$valid_password = 'adpproject@05';

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $username = $_POST["username"];
    $password = $_POST["password"];

    if ($username === $valid_username && $password === $valid_password) {
        // If the credentials are correct, redirect to the homepage or authenticated page
        header("Location: Home%20page.html");
        exit();
    } else {
        // If the credentials are incorrect, display an error message
        echo "Invalid username or password. Please try again.";
    }
}
?>
