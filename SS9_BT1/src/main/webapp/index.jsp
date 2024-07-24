<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="resources/css/style.css">
  <title>Calculator</title>

</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="display-discount" method="post">
  <div class="control">
    <label for="description">Product Description:</label>
    <input type="text" id="description" name="description">
  </div>
 <div class="control">
   <label for="price">Price:</label>
   <input type="text" id="price" name="price">
 </div>
  <div class="control">
    <label for="discountPercent">Discount Percent:</label>
    <input type="text" id="discountPercent" name="discountPercent"><br><br>
  </div>
  <div class="control">
    <input type="submit" value="Calculate Discount">
  </div>
</form>

</body>
</html>