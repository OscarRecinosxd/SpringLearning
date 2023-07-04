<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>List of todos</title>
  </head>
  <body>
    <h1>Welcome ${username} your todos</h1>
    <p>Your todos are ${todos}</p>

    <table>
      <thead>
        <tr>
          <th>id</th>
          <th>username</th>
          <th>description</th>
          <th>date</th>
          <th>isDone</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todos}" var="todo"> 
          <tr>
            <td>${todo.id}</td>
            <td>${todo.username}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
