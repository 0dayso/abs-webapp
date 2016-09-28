$(function() {
	$('#visitList').bootstrapTable({
		url: url + 'queryVisitInfoPage',
        cache: false,
        pagination : true,
        pageList: [10,20],
        sidePagination:'server',//设置为服务器端分页
		columns : [ {
			field : 'id',
			title : 'ID'
		},{
			field : 'visitName',
			title : '访客姓名'
		}, {
			field : 'identityCard',
			title : '访客身份证'
		}, {
			field : 'cellphone',
			title : '访客手机号'
		}, {
			field : 'address',
			title : '访客地址'
		}, {
			field : 'note',
			title : '访问原由'
		} ]
	});
	
	
	$('#search').click(function() {
		queryData();
	});
	
	
});


function queryData(){
	$('#visitList').bootstrapTable('refresh', {
		url: url + 'queryVisitInfoPage?visitName='+$("#visitName").val()+'&identityCard='+$("#identityCard").val()+'&cellphone='+$('#cellphone').val()+'&address='+$('#address').val()
    });
}




