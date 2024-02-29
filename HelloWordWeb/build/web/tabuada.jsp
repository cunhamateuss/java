<%-- 
    Document   : tabuada
    Created on : 05/09/2023, 14:12:16
    Author     : a
--%>

<%@include file="shared/corpo.jsp"%>


        <h2>Tabuada</h2>
        <table class="table table-striped" >
                <% for (int i=1;i<=10; i++){%>
                <tr>
                    <td><%="2 x "+ i +" = " + (i*2) %></td>
                </tr>
                <%}%>
      </table>
<%@include file="shared/footer.jsp" %>
