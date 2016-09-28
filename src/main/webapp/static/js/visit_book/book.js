$(function() {
	$('#bookList').bootstrapTable({
		url: url + 'queryBookInfoPage',
        cache: false,
        pagination : true,
        pageList: [10,20],
        sidePagination:'server',//设置为服务器端分页
		columns : [ {
			field : 'id',
			title : 'ID',
			visible : false
		},{
			field : 'erpCode',
			title : '员工账号'
		}, {
			field : 'erpName',
			title : '员工姓名'
		}, {
			field : 'visitName',
			title : '访客姓名'
		},				{
			field : 'cellphone',
			title : '访客手机号'
		}, {
			field : 'bookTime',
			title : '预约时间'
		}, {
			field : 'comment',
			title : '预约内容'
		}, {
			field : 'operation',
			title : '操作',
			align : 'center',
			formatter : function(value, row, index) {
				return operateFormatter(value, row, index);
			}
		} ]
	});
	
	
	$('#search').click(function() {
		queryData();
	});
	
	$('#bookModal').on('hidden.bs.modal', function (e) {
		var modal = $(this);
		modal.find('.modal-body input').val("");
		$("#message").hide();
	});
	
	$("#saveBookButton").click(function(){
		var book = getBook();
		$.ajax({
			type : "post",
			url: url + 'saveOrUpdateBook',
			async:false,
			data: book,
			dataType:'json',
			success :function(result){
				try{
					if(result.code== 0){
						messageShow("保存成功","alert alert-success");
						queryData();
						$('#bookModal').modal('hide');
					}else{
						messageShow("保存失败","alert alert-danger");
					}
				}catch(e){
				}
			}
		});
	});
	
	
});


function queryData(){
	$('#bookList').bootstrapTable('refresh', {
		url: url + 'queryBookInfoPage?erpCode='+$("#erpCode").val()+'&visitName='+$("#visitName").val()+'&cellphone='+$('#cellphone').val()+'&period='+$('#daterange-btn').val()
    });
}

function addRow(){
	$('#bookModal').modal('show');
}



function operateFormatter(value, row, index) {
    return '<a  style="cursor:pointer" onClick="return editBook('+ row.id +');"   >修改</a>'+
    		'&nbsp;&nbsp;&nbsp;<a style="cursor:pointer" onClick="return delBook('+ row.id +');" >删除</a>';
}



function editBook(id){
	var datas=$('#bookList').bootstrapTable('getData');
	$('#bookModal').modal('show');
	var row = getSelectRow(datas,id);
	
	$('#id').val(id);
	$('#formErpCode').val(row.erpCode);
	$('#formVisitName').val(row.visitName);
	$('#formCellphone').val(row.cellphone);
	$('#formBookTime').val(row.bookTime);
	$('#formComment').val(row.comment);
}

/**
 * 获取form值，组成json对象
 */
function getBook(){
	var book = {
		id:0,erpCode:'',visitName:'',cellphone:'',bookTime:'',comment:''
	};
	
	//赋值
	book.id = $('#id').val();
	book.erpCode = $('#formErpCode').val();
	book.visitName = $('#formVisitName').val();
	book.cellphone = $('#formCellphone').val();
	book.bookTime = $('#formBookTime').val();
	book.comment = $('#formComment').val();
	return book;
}

function delBook(id){
	var delUrl=url + 'deleteBook?id=' + id;
	$.ajax({
		async:false,
		url:delUrl,
		data:null,
		success:function(data){
			var result = eval('('+data+')');
			try{
				if(result && result.code==0){
					try{
						queryData();
					}catch (e) {
					}
				}else{
					alert(result.msg);
				}
			}catch(e){
				alert('解析响应失败!');
			}
		}
	});
}


function messageShow(message,classStyle){
	$("#message").hide();
	$("#message").removeClass();
	$("#message").addClass(classStyle);
	$("#message").html(message);
	$("#message").show();
}


