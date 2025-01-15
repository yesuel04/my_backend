$(function(){
    var i = 0;//클릭한 인덱스 번호
    var k = 0;//현재 인덱스 번호 current
    var repeat; //자동슬라이드 관리 변수명

    $('.pager li').on('click',click_slide);

    function click_slide(){
        $('.pager li').off('click');

        i = $(this).index();
        if(i > k){
            $('.imgs li').eq(k).css('left','0').animate({'left':'-100%'},600);
            $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600,function(){
                $('.pager li').on('click',click_slide);
            });

        }else if(i < k){
            $('.imgs li').eq(k).css('left','0').animate({'left':'100%'},600);
            $('.imgs li').eq(i).css('left','-100%').animate({'left':'0'},600,function(){
                $('.pager li').on('click',click_slide);
            });
        }else{
            $('.pager li').on('click',click_slide);
        }
        $('.pager li').removeClass('on');
        $('.pager li').eq(i).addClass('on');
        k = i;
    }

    timer();

    function timer(){
        repeat = setInterval(function(){
            i++;
            if(i==5){
                i=0;
            }
            $('.imgs li').eq(i-1).css('left','0').animate({'left':'-100%'},600);
            $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600);

            $('.pager li').removeClass('on');
            $('.pager li').eq(i).addClass('on');
            k = i;

        }, 3000);
    }

    $('.imgs li').mouseover(function(){
        clearInterval(repeat);
    });
    $('.imgs li').mouseleave(function(){
        timer();
    });
    $('.next').on('click', next_slide);
    $('.prev').on('click', prev_slide);

    function next_slide(){
        $(".next").off("click"); // next버튼 기능 멈춤
        $(document).off("keydown"); //키보드 사용 멈춤
        clearInterval(repeat); //자동슬라이드 멈춤

        i++;
        if(i == 5){
            i = 0;
        }
        $(".imgs li").eq(i).css("left", "100%").animate({
            "left": 0
        }, 600);
        $(".imgs li").eq(i - 1).css("left", "0%").animate({
            "left": "-100%"
        }, 600, function () {
            $(".next").on("click", next_slide);
            $(document).on("keydown", pressKey);
            timer();
        });
        $(".pager li").removeClass("on").eq(i).addClass("on");
        k = i; 

    }

    function prev_slide(){
        $(".prev").off("click"); // next버튼 기능 멈춤
        $(document).off("keydown"); //키보드 사용 멈춤
        clearInterval(repeat); //자동슬라이드 멈춤
        i--;
      
        $(".imgs li").eq(i).css("left", "-100%").animate({
            "left": 0
        }, 600);
        $(".imgs li").eq(i + 1).css("left", "0%").animate({
            "left": "100%"
        }, 600, function () {
            $(".prev").on("click", prev_slide);
            $(document).on("keydown", pressKey);
            timer();
        });
        if(i == -1){
            i = 4
        }
        $(".pager li").removeClass("on").eq(i).addClass("on");
        k = i; 

    }

    $(document).on('keydown', pressKey);

    function pressKey(e){
        if(e.keyCode == 65 || e.keyCode == 37){
            prev_slide();
        }else if(e.keyCode == 68 || e.keyCode == 39){
            next_slide();
        }
    }
});