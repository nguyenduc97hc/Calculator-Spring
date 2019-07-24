<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Email Validation</title>
</head>
<body>

<h1>Sandwich Condiment</h1>
<form action="/calculator" method="post">
  <label>First Num</label>
  <input type="text" name="firstNum" value="${firstNum}"><br>
  <select name="operator">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select>
  <br>
  <label>Second Num</label>
  <input type="text" name="secondNum" value="${secondNum}">
  <br>
  <input type="submit" value="Tinh">
</form>
Result : ${result};
</body>
</html>