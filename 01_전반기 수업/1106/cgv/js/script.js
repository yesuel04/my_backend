var show_num = 5;
var total = $('.slideBox').length;
var li_w = $('.slideBox').eq(0).width();
// var li_w = $('.movieChart').width();
// alert(li_w);

var num = 0;

$('.rightbtn').click(function(){
    if(num==4)return;
    num++;
    $('.listWrap').stop().animate({marginLeft: -(li_w + 32) * 4 * num},500);
    return false;
});

$('.leftbtn').click(function(){
    if(num==1)return;
    num--;
    $('.listWrap').stop().animate({marginLeft: -(li_w + 32) * 4 * num},500);
    return false;
});