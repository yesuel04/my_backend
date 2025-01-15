$(function(){

    setTimeout(function(){
        $('.slider li .text0').addClass('on');
        $('.slider li .atext0').addClass('on');
    }, 1000);
 
    var bx = $('.slider').bxSlider({
        auto : true,
        controls : false,
        pager: false,
        mode: 'fade',
        pause : 5000,

        onSlideBefore:function(){
            // var n = s.getCurrentSlide();
            //         var w = $('#page ul li').width();
            //         // console.log(n);
            //         if(n==0){
            //             $('#focus').css('left','0');
            //         }else{
            //             $('#focus').stop().animate({left:n*w}, 600);
            //         }
        },
        onSlideAfter:function(){
            var k = bx.getCurrentSlide();
            $('.slider li').find('h2').removeClass('on');
            $('.slider li').find('p').removeClass('on');
            $('.slider li .text' + k).addClass('on');
            $('.slider li .atext' + k).addClass('on');
        },
        
    });


});