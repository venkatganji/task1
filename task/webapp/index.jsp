<!doctype html>
<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="style.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="script.js"></script>
   <title>CSS MenuMaker</title>
</head>
<body>

<div id='cssmenu'>
<ul>
   <li><a href='#'><span>Home</span></a></li>
   <li class='active has-sub'><a href='#'><span>Products</span></a>
      <ul>
         <li class='has-sub'><a href='marchant.jsp'><span>merchant</span></a>
         </li>
         <li class='has-sub'><a href='fabrication.jsp'><span>fabrication</span></a>
         </li>
      </ul>
   </li>
   <li><a href='about.jsp'><span>About</span></a></li>
   <li class='last'><a href='cantact.jsp'><span>Contact</span></a></li>
   <li class='last'><a href="login-jsp/login.html"><span>login</span></a></li>
</ul>
</div>

</body>
<html>
