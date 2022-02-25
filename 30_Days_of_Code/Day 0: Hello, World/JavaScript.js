<!DOCTYPE html>
<html>
<title>Web Page Design</title>
<head>
<script>
function sayHello() {
   
   //get the Input Data from user
   let word = prompt("Enter the word");

   // User give the value, the value print otherwise "no value" is print
   if(word != "") {
       document.write(word);
   }
  else {
    document.write("No Value");
  } 
}
sayHello();
</script>
</head>
<body>
</body>
</html>