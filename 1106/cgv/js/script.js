var show_num = 3;
var total = $('.slideBox').length;
var li_w = $('.slideBox').eq(0).width();
alert(total);

var num = 0;

$('.rightbtn').click(function(){
    if(num==total){
        num = 0;
        $('.listWrap').css('margin-left', '0');
    }
    num++;
    $('.listWrap').stop().animate({marginLeft: -li_w * num},500);
    return false;
});

$('.leftbtn').click(function(){
    if(num==0){
        num = 5;
        $('.listWrap').css('margin-left', -li_w * num);
    }
    num--;
    $('.listWrap').stop().animate({marginLeft: -li_w * num},500);
    return false;
});