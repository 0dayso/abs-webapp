$(document).ready(function() {
	
	function ConfirmModal(){
		var callback = function(){};
		var params = undefined;
		function init(title,content){
			var modal = '<div class="modal fade" id="confirm-modal" '+
						' tabindex="-1" role="dialog" aria-labelledby="dialog-title" aria-hidden="true">'+
						' <div class="modal-dialog">'+
						'   <div class="modal-content">'+
						'    <div class="modal-header">'+
						'      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>'+
						'      <h4 class="modal-title" id="confirm-title"></h4>'+
						'    </div>'+
						'   <div class="modal-body" id="confirm-content">'+
						'   	Are you sure!'+
						'   </div>'+
						'   <div class="modal-footer">'+
						'       <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>'+
						'       <button type="button" class="btn btn-primary" data-dismiss="modal" id="ok">确定</button>'+
						'     </div>'+
						'  </div>'+
						' </div>'+
						'</div>';
			$("body").append(modal);
			setTitle(title);
			setContent(content);
			$('#ok').click(confirm);
		}
		init();
		function setTitle(title){
			$('#confirm-title').html(title);
		}
		function setContent(content){
			$('#confirm-content').html(content);
		}
		
		function show(){
			$('#confirm-modal').modal('show');
		}
		function hide(){
			$('#confirm-modal').modal('hide');
		}
		function confirm(){
			hide();
			if(typeof(callback) != 'undefined'){
				callback(params);
			}
		}
		function register(cb,agrs){
			callback = cb;
			params = agrs;
		}
		return {
			setTitle:setTitle,
			setContent:setContent,
			show:show,
			hide:hide,
			confirm:confirm,
			register:register
		};
	};
	window.confirmDialog = new ConfirmModal();
});