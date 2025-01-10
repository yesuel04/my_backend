$(function(){
    var pop_prev = $('.slide_but p .prev');
    var pop_next = $('.slide_but p .next');
    var pop_pause = $('.slide_but p .pause');

    var popCurrent = 0;
    var popIndex = 0;
    var total = $('.pop_slide li').length; // 11개

    pop_next.click(function(){
        popIndex = popCurrent + 1;
        if(popIndex == total) popIndex = 0;

        var pop_cu = $('.pop_slide li').eq(popCurrent);
        var pop_ne = $('.pop_slide li').eq(popIndex);

        pop_cu.css('left', 0).stop().animate({'left':'-100%'});
        pop_ne.css('left', '100%').stop().animate({'left':'0'});

        popCurrent = popIndex;
        $('.slide_but p strong').text(popIndex+1);

    });

    pop_prev.click(function(){
        popIndex = popCurrent - 1;
        if(popIndex == -1) popIndex = total - 1;

        var pop_cu = $('.pop_slide li').eq(popCurrent);
        var pop_ne = $('.pop_slide li').eq(popIndex);

        pop_cu.css('left', 0).stop().animate({'left':'100%'});
        pop_ne.css('left', '-100%').stop().animate({'left':'0'});

        popCurrent = popIndex;
        $('.slide_but p strong').text(popIndex+1);

    });

    var id;
    id = setInterval(popAuto,3000);

    function popAuto(){
        pop_next.trigger('click');
    }

    pop_pause.click(function(){
        if($(this).hasClass('play') == false){
            $(this).addClass('play');
            clearInterval(id);
        }else{
            $(this).removeClass('play');
            id = setInterval(popAuto,3000);
        }
    });
    
});

