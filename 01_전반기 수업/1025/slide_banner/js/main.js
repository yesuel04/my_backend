$(function(){
    var visual = $('#brandVisual > ul > li');
    var button1 = $('#buttonList > li');
    var current = 0;
    var id;

    button1.click(function(){
        var i = $(this).index();
        // alert(i);
        button1.removeClass('on');
        button1.eq(i).addClass('on');
        move(i);
    });

    function timer(){
        id = setInterval(function(){
            var n = current + 1;
            if(n==3){
                n=0;
            }
            button1.eq(n).trigger('click');
            //버튼1을 3초마다 n의 값에 따라 클릭하라고 강제로 명령.
        }, 3000);
    }
    timer();

    function move(i){
        if(current == i) return;
        //현재 활성화된 button과 클릭한 버튼이 같으면 빠져 나간다.
        var curr = visual.eq(current);
        var next = visual.eq(i);
        curr.css('left','0').stop().animate({'left' : '-100%'}, 500);
        next.css('left','100%').stop().animate({'left' : '0%'}, 500);
        current = i;
    }
});