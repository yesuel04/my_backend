$(function(){

    var pdt = 0;

    $(window).scroll(function(){

        // 스크롤 탑의 높이(숫자값)만 가져오기.
        var sct = $(window).scrollTop();

        // 중앙 이미지(새우깡)
        // 바깥에 pdt 선언.
        pdt = sct * 0.001;
        if(pdt <= 1){
            $('#pdt_basic').css('opacity', pdt);
        }
        // $('#pdt_basic').css('transform',"rotate("+sct+"deg)");

        // 스크롤을 100만큼 내렸을 때, 네비를 위에 착 붙도록 만들기.
        if(sct >= 100){
            $('nav').addClass('fixed');
        }else{
            $('nav').removeClass('fixed');
        }

        // 스크롤 탑의 높이가 아티클 높이보다 길때(클때) 네비 색상 변하기.
        // + 네비 클릭할 때 스크롤이 이동하면서 네비 글씨 색상도 같이 변함.
        for(var a=0; a<6; a++){
            if(sct >= $('section > article').eq(a).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(a).addClass('on');
            }
        }


    });
    
    // 네비 클릭할 때 클릭한 리스트의 인덱스 값을 가져오고
    // 같은 인덱스값의 아티클로 스르륵 움직이게 만들기.
    $('nav ul li').click(function(){

        var i = $(this).index();

        var navi = $('section > article').eq(i).offset().top;
        $('html, body').stop().animate({scrollTop:navi}, 1000);

        return false;
    });

    // 마우스 휠을 내리면 부드럽게 하나씩 알아서 이동
    $('section > article').mousewheel(function(event, d){
        if(d>0){
            var prev = $(this).prev().offset().top;
            $('html, body').stop().animate({scrollTop:prev}, 1000);
        }

        if(d<0){
            var next = $(this).next().offset().top;
            $('html, body').stop().animate({scrollTop:next}, 1000);
        }
    });


    // 팝업1
    // 팝업창을 잡고 움직일 수 있게 함.
    $('#popup').draggable();
    // css 상에서 display:none을 했음으로 안 보이는 게 기본인 상태.
    if($.cookie('pop')!='no'){
        $('#popup').show();
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

    // 팝업2
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