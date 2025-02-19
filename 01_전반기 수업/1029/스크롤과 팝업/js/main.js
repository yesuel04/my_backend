$(function(){

    var dTop = $('#floatdiv').offset().top;

    $(window).scroll(function(){
        var sct = $(window).scrollTop();
        $('#sTop').text(sct);
        if(sct >= 100){
            $('nav').addClass('fixed');
        }else{
            $('nav').removeClass('fixed');
        }

        // $('#floatdiv').stop().animate({top:dTop+sct}, 500);
        $('#floatdiv').stop().animate({top:dTop+sct},500);

        
        // $('section > div').each(function(i){
        //     if(sct >= $('section>div').eq(i).offset().top){
        //         $('nav ul li').removeClass('on');
        //         $('nav ul li').eq(i).addClass('on');
        //         $('#floatdiv ul li').removeClass('on');
        //         $('#floatdiv ul li').eq(i).addClass('on');
        //     }
        // });
        
        for(var a=0; a<6; a++){
            if(sct >= $('section > div').eq(a).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(a).addClass('on');
                $('#floatdiv ul li').removeClass('on');
                $('#floatdiv ul li').eq(a).addClass('on');
            }
        }

        // if(sct >= $('section > div').eq(0).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(0).addClass('on');
        //     $('#floatdiv ul li').removeClass('on');
        //     $('#floatdiv ul li').eq(0).addClass('on');
        // }
        // if(sct >= $('section > div').eq(1).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(1).addClass('on');
        //     $('#floatdiv ul li').removeClass('on');
        //     $('#floatdiv ul li').eq(1).addClass('on');
        // }
        // if(sct >= $('section > div').eq(2).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(2).addClass('on');
        //     $('#floatdiv ul li').removeClass('on');
        //     $('#floatdiv ul li').eq(2).addClass('on');
        // }
        // if(sct >= $('section > div').eq(3).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(3).addClass('on');
        //     $('#floatdiv ul li').removeClass('on');
        //     $('#floatdiv ul li').eq(3).addClass('on');
        // }
        // if(sct >= $('section > div').eq(4).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(4).addClass('on');
        //     $('#floatdiv ul li').removeClass('on');
        //     $('#floatdiv ul li').eq(4).addClass('on');
        // }
        // if(sct >= $('section > div').eq(5).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(5).addClass('on');
        //     $('#floatdiv ul li').removeClass('on');
        //     $('#floatdiv ul li').eq(5).addClass('on');
        // }
    });

    $('nav ul li').click(function(){
        var i = $(this).index();

        var offset_nav = $('section > div').eq(i).offset().top;
        // alert(offset_nav);
        $('html, body').stop().animate({scrollTop:offset_nav}, 1000);

        // $('nav ul li').removeClass('on');
        // $('nav ul li').eq(i).addClass('on');
        return false;
    });

    $('#floatdiv ul li').click(function(){
        var i = $(this).index();

        var offset_nav = $('section > div').eq(i).offset().top;
        // alert(offset_nav);
        $('html, body').stop().animate({scrollTop:offset_nav}, 1000);

        return false;
    });


    // // 한 화면씩 스크롤 하고 싶을 때 사용.
    // $('section > div').mousewheel(function(event, d){
    //     // event는 마우스휠의 정보
    //     // d는 이동 방향
    //     // 마우스휠을 위로 스크롤하면 양수(+1), 아래로 움직이면 음수(-1)
    //     if(d > 0){ // 휠 위로
    //         var prev = $(this).prev().offset().top;
    //         $('html, body').stop().animate({scrollTop:prev}, 1000, 'easeOutBounce');
    //     }
    //     if(d < 0){ // 휠 아래로
    //         var next = $(this).next().offset().top;
    //         $('html, body').stop().animate({scrollTop:next}, 1000, 'easeOutBounce');
    //     }
    // });

    // 팝업1
    $('#popup').draggable();
    
    if($.cookie('pop')!='no'){
        $('#popup').show();
        // $('#popup').css('display', 'block');
    }
    $('#popup area:eq(0)').click(function(){
        $('#popup').fadeOut('fast');
    });
    $('#popup area:eq(1)').click(function(){
        $.cookie('pop', 'no', {expires:1});
        // 하루동안 pop에 no 값을 저장.
        // 하루동안 보지 않기.
        $('#popup').fadeOut('fast');
        // 서서히 사라짐.
    });
    

    //팝업2
    $('#notice_wrap').draggable();

    if($.cookie('popup') == 'none'){
        $('#notice_wrap').hide();
    }
    var chk = $('#expiresChk');

    $('.closeBtn').on('click', closePop);

    function closePop(){
        if(chk.is(':checked')){
            $.cookie('popup', 'none', {expires:3});
            //chk 변수(체크박스)가 checked를 가지고 있으면
            //popup 에 none 을 3일동안 저장.
        }
        $('#notice_wrap').fadeOut('fast');
    }

});