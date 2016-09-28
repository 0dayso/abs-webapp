$(function() {
	$('#staffList').bootstrapTable({
		url: url + 'queryStaffInfoPage',
        cache: false,
        pagination : true,
        pageList: [10,20],
        sidePagination:'server',//设置为服务器端分页
		columns : [ {
			field : 'id',
			title : 'ID'
		},{
			field : 'erpCode',
			title : '员工账号'
		}, {
			field : 'erpName',
			title : '员工姓名'
		}, {
			field : 'dept',
			title : '部门'
		},				{
			field : 'cellphone',
			title : '员工手机号'
		} ]
	});
	
	
	$('#search').click(function() {
		queryData();
	});
	
	
});


function queryData(){
	$('#staffList').bootstrapTable('refresh', {
		url: url + 'queryStaffInfoPage?erpCode='+$("#erpCode").val()+'&erpName='+$("#erpName").val()+'&cellphone='+$('#cellphone').val()+'&dept='+$('#dept').val()
    });
}




