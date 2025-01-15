$(function(){
    var clone = $('.imgs li').eq(0).clone();

    $('.imgs').append(clone);

    var i = 0;
    var repeat;

    $('.pager li').click(function(){
        i = $(this).index();
        $('.imgs').stop().animate({'margin-left':-i*100+"%"}, 500);
        $('.pager li').removeClass('on');
        $(this).addClass('on');
        
    });

    //다음 버튼
    // $('.next').click(function(){
    //     i++;
    //     if(i==5){
    //         i=0;
    //         $('.imgs').stop().animate({'margin-left':"0%"});
    //     }
    //     $('.imgs').stop().animate({'margin-left':-i*100+"%"}, 500);
    //     $('.pager li').removeClass('on');
    //     $('.pager li').eq(i).addClass('on');
    // });
    $('.next').click(function(){
        i++;
        if(i==5){
            $('.imgs').stop().animate({'margin-left':-i*100+"%"}, 500,
            function(){
                $('.imgs').css('margin-left',0);
            }); 
            i=0;
        }else{
            $('.imgs').stop().animate({'margin-left':-i*100+"%"}, 500);
        }
        $('.pager li').removeClass('on');
        $('.pager li').eq(i).addClass('on');
    });


    //이전 버튼
    $('.prev').click(function(){
        if(i==0){
            i=5;
            $('.imgs').stop().animate({'margin-left':-i*100+"%"});
        }
        i--;
        $('.imgs').stop().animate({'margin-left':-i*100+"%"}, 500);
        $('.pager li').removeClass('on');
        $('.pager li').eq(i).addClass('on');
    });

});