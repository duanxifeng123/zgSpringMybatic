<%--
  Created by IntelliJ IDEA.
  User: duanxifeng
  Date: 2016-8-6
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../../jquery/themes/default/easyui.css" rel="stylesheet" type="text/css"/>
    <link href="../../jquery/themes/icon.css" rel="stylesheet" type="text/css"/>
</head>
<body>

${requestScope.userinfo.uname}
<h1>1111111111111</h1>

<div ></div>

<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">Add</a>
<div class="easyui-panel" title="Register" style="width:400px;padding:30px 60px"></div>


    <table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
           data-options="singleSelect:true,pagination:true,collapsible:true,url:'../showUserList',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'id',width:120">id</th>
            <th data-options="field:'uname',width:120">uname</th>
            <th data-options="field:'unumber',width:120">unumber</th>
            <th data-options="field:'courseInfos',width:200">courseInfos</th>
        </tr>
        </thead>
    </table>

    <script src="../../jquery/script/jquery.min.js" type="text/javascript"></script>
    <script src="../../jquery/script/jquery.easyui.min.js" type="text/javascript"></script>
    <script src="../../jquery/script/easyloader.js" type="text/javascript"></script>

</body>
</html>
