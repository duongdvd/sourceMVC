<%--
  Created by IntelliJ IDEA.
  User: Duong
  Date: 9/11/2018
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/resources/layout/taglib.jsp" %>
<%@ include file="/resources/layout/headerResource.jsp"%>

<head>
    <title>Title</title>
    <c:set value="Home" var="ctx"/>
</head>
<body>
<div class="login-box-body" style="width: 500px">
    <s:form method="POST" action="/getdata" modelAttribute="datatest">

        <div class="form-group has-feedback">
            <input type="text" class="textbox form-control" id="loginId" name="name"
                   placeholder="hihihi" value="${datatest.name}"/>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
            <input type="text" class="textbox form-control" id="address" name="address"
                   placeholder="hihi" value="${datatest.address}"/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
            <input type="text" class="textbox form-control" id="phone" name="phone"
                   placeholder="hihi" value="${datatest.phone}"/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="row">
            <div class="col-xs-4 col-xs-offset-8">
                <button type="submit" class="btn btn-primary btn-block btn-flat btn-submit">Submit</button>
            </div>
            <!-- /.col -->
        </div>
    </s:form>
</div>
</body>
</html>
