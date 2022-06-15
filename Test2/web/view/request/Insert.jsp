<%-- 
    Document   : Insert
    Created on : Jun 15, 2022, 8:09:03 AM
    Author     : Tkien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert" method="POST">
            <table>
                <tr>
                    <td>Reason: </td>
                    <td><input type = "text" name = "reason"> </td>
                </tr>
                <tr>
                    <td>From: </td>
                    <td><input type = "date" name = "name"> </td>
                </tr>
                <tr>
                    <td>To: </td>
                    <td><input type = "date" name = "name"> </td>
                </tr>
                <tr>
                    <td>Created by: </td>
                    <td><select name="cb">
                            <c:forEach items="${requestScope.depts}" var="d">
                                <option
                                    value="${d.departmentId}">${d.departmentName}
                                </option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Reviewed by: </td>
                    <td><select name="rb">
                            <c:forEach items="${requestScope.depts}" var="d">
                                <option
                                    value="${d.departmentId}">${d.departmentName}
                                </option>
                            </c:forEach>
                        </select>
                    </td>
                    <td><input type="submit" value="Save"/></td>
                </tr>

            </table>
        </form>
    </body>
</html>
