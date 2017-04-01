<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>项目列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="/bootstrap-3.3.7/dist/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="/bootstrap-table/bootstrap-table.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/bootstrap-table/bootstrap-table.js"></script>
    <script type="text/javascript" src="/bootstrap-table/bootstrap-table-zh-CN.min.js"></script>
    <style rel="stylesheet" type="text/css">
        .pagination-detail {display: none}
    </style>
</head>
<body style="margin: 0px;padding: 0px;">
    <div id="nav" style="margin-top: 10px;padding-left: 15px;font-size: 12px;line-height: 18px;height: 18px;background: #ffffff">
        项目管理
    </div>
    <HR style="border:1 dashed #987cb9;margin-top: 5px;margin-bottom: 5px;" color=#987cb9 SIZE=1>
    <div id="query" style="margin-left: 15px;">
        <input placeholder="请输入项目名称">
        <button>查询</button>
    </div>
    <HR style="border:1 dashed #987cb9;margin-top: 5px;margin-bottom: 3px;" color=#987cb9 SIZE=1>

    <div id="resultList" style="margin-left: 15px;font-size: 14px;margin-right: 15px;">
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
        <table id="table_proInfo" width="300">
        </table>
    </div>
    <script type="text/javascript">
        $("#table_proInfo").bootstrapTable({
            url:"/project/list",
            classes:'table table-hover',
            method: 'get', //请求方式（*）
            toolbar: '#toolbar', //工具按钮用哪个容器
            striped: true, //是否显示行间隔色
            cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true, //是否显示分页（*）
            paginationLoop:false,
            onlyInfoPagination:false,
            sortable: false, //是否启用排序
            sortOrder: "asc", //排序方式
            sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1, //初始化加载第一页，默认第一页
            pageSize: 10, //每页的记录行数（*）
//            pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
            showHeader:true,
            search: true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true, //是否显示所有的列
            showRefresh: true, //是否显示刷新按钮
            minimumCountColumns: 2, //最少允许的列数
            clickToSelect: true, //是否启用点击选中行
//            height: 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID", //每一行的唯一标识，一般为主键列
            showToggle:true, //是否显示详细视图和列表视图的切换按钮
            cardView: false, //是否显示详细视图
            detailView: false, //是否显示父子表
            columns:[{
                field: 'id',
                title:'项目'
            },{
                field: 'name',
                title:'名称'
            }
            ]

        });
    </script>
</body>
</html>