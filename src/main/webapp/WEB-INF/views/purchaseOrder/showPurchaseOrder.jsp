<%--
  Created by IntelliJ IDEA.
  User: duanxifeng
  Date: 2016-8-14
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="../jquery/themes/default/easyui.css" rel="stylesheet" type="text/css"/>
    <link href="../jquery/themes/icon.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<h1>PurchaseOrderALL</h1>

<table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
       data-options="singleSelect:true,pagination:true,collapsible:true,url:'GetPurchaseOrderAll',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'pkid',width:120">pkid</th>
        <th data-options="field:'purchaseOrderCode',width:120">purchaseOrderCode</th>
        <th data-options="field:'investorName',width:120">investorName</th>
    </tr>
    </thead>
</table>


<script src="../jquery/script/jquery.min.js" type="text/javascript"></script>
<script src="../jquery/script/jquery.easyui.min.js" type="text/javascript"></script>
<script src="../jquery/script/easyloader.js" type="text/javascript"></script>

</body>
</html>
