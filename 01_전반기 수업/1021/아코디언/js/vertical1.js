var sub = document.querySelectorAll('.sub');
var menuLiA = document.querySelectorAll('.m_menu>li>a');

menuLiA.forEach(function(item){
    item.addEventListener('click', function(){
        var subHeight = getComputedStyle(this.nextElementSibling).height;
        // alert(subHeight);
        //getComputedStyle은 Dom요소의 현재 스타일을 가져오기 위한 메소드.
        //이 메소드를 사용하면 특정 요소에 적용된 모든 스타일 속성과 그값에 대한 정보를 얻는다.

        if(subHeight === '0px'){
            slideUp();
            this.nextElementSibling.style.height = '108px';
        }else{
            this.nextElementSibling.style.height = '0px';
        }
    });
});
function slideUp(){
    sub.forEach(function(item){
        item.style.height = '0px';
    });
}