$(document).ready(function() {
	$("#cityName").autocomplete({
		source : contextUrl+"common/cityInfos",
		minLength : 0,
		select: function( event, ui ) {
			setCityCode(ui);
		},
		change: function( event, ui ) {
			if(!ui.item || typeof(ui.item)=="undefined"){
				//当鼠标不选列表中的值，失焦后ui.item为null
				if($.trim($('#cityName').val()).length != 0){
					//如果录入简码查询
					$.ajax({
						type : "POST",
						data:{cityName: $('#cityName').val().trim()},
						url : contextUrl + 'common/cityInfo',
						success : function(result){
							var data = $.parseJSON(result);
							if (0 == data.code) {
								$('#cityCode').val(data.data);
							} else {
								$('#cityCode').val('none');
							}
						}
					});
				}else{
					$('#cityCode').val('');
				}
			}else{
				setCityCode(ui);
			}
			
		}
	});
	
});


function setCityCode(ui){
	if(ui.item && typeof(ui.item)!="undefined"){
		$("#cityCode").val(ui.item.tmp);
	}
}