<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>List of todos</title>
  </head>
  <body>

    <div class="container">
      <h1>Your todos</h1>
      <table class="table">
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
              <td><a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
              <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <a href="add-todo" class="btn btn-success">Add todo</a>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>
