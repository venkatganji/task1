<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 19px 0;
     border: 1px dashed #ccc;
     display: inline-block;
    border-radius: 30px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>
</head>
<body>

<h3>Using CSS to style an HTML Form</h3>

<div>
  <form action="addFeedback">
 <!--  <label for="name">id</label>
  <input type="text" id="id" name="id" placeholder="Your id..">-->
  
    <label for="name">name</label>
    <input type="text" id="name" name="name" placeholder="Your name..">

    <label for="email">email</label>
    <input type="text" id="email" name="email" placeholder="Your email..">

    <label for="reg">registration</label>
    <select id="reg" name="reg">
      <option value="online">Australia</option>
      <option value="venkat">Canada</option>
      <option value="course">USA</option>
    </select>
    
    <label for="code">code</label>
    <input type="text" id="code" name="code" placeholder="Your code..">
    
    <label for="msg">message</label>
    <textarea rows="10" cols="50"
     id="msg" name="msg" placeholder="Your message...">
    </textarea>
  
    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>
