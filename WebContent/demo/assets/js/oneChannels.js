
$(function() {

    //左侧列表点击附加样式
    $(".sidebar-menu >li >a").on("click", function() {
    		$('.sidebar-menu >li').removeClass('active');
        $(this).parent().addClass('active');
    });
    
    

});
