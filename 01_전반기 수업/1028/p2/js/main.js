$(function(){

    var gap = 103;
    
    
    var top1 = $('.area1').offset().top;
    var top2 = $('.area2').offset().top;
    var top3 = $('.area3').offset().top;
    var top4 = $('.area4').offset().top;
    var top5 = $('.area5').offset().top;
    console.log(top1, top2, top3, top4, top5);
    
    $(window).scroll(function(){
        var h = $(window).scrollTop();
        console.log(h);
        
        if(h < top2 - gap){
            $('.area1').addClass('on');
        }else if(h < top3 - gap){
            $('.area2').addClass('on');
        }else if(h < top4 - gap){
            $('.area3').addClass('on');
        }else if(h < top5 - gap){
            $('.area4').addClass('on');
        }else{
            $('.area5').addClass('on');
        }
    });
    $(window).trigger('scroll');
    // 페이지가 실행되자마자 한번 스크롤함.



    // $(window).scroll(function(){

    //     var sct = $(this).scrollTop();

    //     if(sct >= 10 && sct <=2000){
    //         $('.area1').addClass('on');
    //     }else{
    //         $('.area1').removeClass('on');
    //     }

    //     if(sct >= 400 && sct <=3000){
    //         $('.area2').addClass('on');
    //     }else{
    //         $('.area2').removeClass('on');
    //     }

    //     if(sct >= 900 && sct <=3000){
    //         $('.area3').addClass('on');
    //     }else{
    //         $('.area3').removeClass('on');
    //     }

    //     if(sct >= 1600 && sct <=3000){
    //         $('.area4').addClass('on');
    //     }else{
    //         $('.area4').removeClass('on');
    //     }

    //     if(sct >= 2200 && sct <=3000){
    //         $('.area5').addClass('on');
    //     }else{
    //         $('.area5').removeClass('on');
    //     }

    // });

});