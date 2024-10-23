$(function(){
    
    //화면의 사이즈를 조절했을 시 모바일 화면에서 뜨는 것들이 
    //pc사이즈에서 뜨지 않도록 조절.
    $(window).resize(function(){
        var w = $(this).width();
        // console.log(w);

        if(w<850){

        }else{
            if($('.mobile_nav').hasClass('active')==true){
                $('.mobile_nav').removeClass('active');
                $('.transparency').removeClass('active');
                $('.sub').css('dispaly','none');
            }
        }
    });

    // pc화면에서 네비에 마우스오버시 하위 네비가 뜸
    $('.nav > ul').mouseover(function(){
        $(this).addClass('over');
    });
    $('.nav > ul').mouseleave(function(){
        $(this).removeClass('over');
    });

    //모바일 화면에서 햄버거 메뉴 열기, 닫기
    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active');
        $('.transparency').addClass('active');
        return false;
    });
    $('.close').click(function(){
        $('.mobile_nav').removeClass('active');
        $('.transparency').removeClass('active');

        $('.sub').css('dispaly','none');
        return false;
    });

    //햄버거 메뉴에서 하위 메뉴 열고 닫기
    $('.mobile_nav ul li a').click(function(){
        var mTab = $(this).next().css('display');

        if(mTab == 'none'){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
        }else{
            $(this).next('.sub').slideUp();
        }
        return false;
    });
});