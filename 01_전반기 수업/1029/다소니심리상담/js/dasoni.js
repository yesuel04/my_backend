$(function(){

    $('.nav > ul > li').mouseover(function(){
        $('.nav ul li ul').css('display', 'block');
        $('.nav_bg').addClass('open');
    });
    $('.nav > ul > li').mouseout(function(){
        $('.nav ul li ul').css('display', '');
        $('.nav_bg').removeClass('open');
    });
});