$('.m_menu li').click(function(){
    var i = $(this).index();
    // alert(i);

    var a = $('.m_menu .sub').eq(i).css('display');
    if(a=='none'){
        $('.m_menu .sub').css('display', 'none');
        $('.m_menu .sub').eq(i).css('display', 'block');
    }else if(a=='block'){
        $('.m_menu .sub').css('display', 'none');
    }
    
});