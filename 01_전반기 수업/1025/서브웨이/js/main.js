$(function(){

    var clone = $('#section1 .slide .sg a').eq(0).clone().css('left', '400%');
    $("#section1 .slide .sg").append(clone);
    var i = 0;

    $("#section1 .slide .dot a").click(function(){
        i = $(this).index();
        $("#section1 .slide .sg").stop().animate({"margin-left":-i*100+"%"},700);
        $("#section1 .slide .dot a").removeClass("on");
        $(this).addClass("on");
    });

    setInterval(autoplay, 5000);

    function autoplay(){
        if(i == 4){
            i=0;
            $("#section1 .slide .sg").css("margin-left",0);
        }
        i++;
        $("#section1 .slide .sg").stop().animate({
            "margin-left":-i*100+"%"
        },700);

        if(i==4){
            $("#section1 .slide .dot a").removeClass("on");
            $("#section1 .slide .dot a").eq(0).addClass("on");
        }else{
            $("#section1 .slide .dot a").removeClass("on");
            $("#section1 .slide .dot a").eq(i).addClass("on");
        }
    }
    
});