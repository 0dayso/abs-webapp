$(function(){
	//切换左边的菜单，点击菜单时，当前点击的菜单高亮显示，同时关闭其他的一级菜单
	
	$(".treeview-menu > li").click(function(){
		$('.sidebar-menu li').each(function(){
			$(this).removeClass("current-slide-menu");
		});
		$(this).addClass("current-slide-menu");
	});
});