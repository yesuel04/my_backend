    var ham = document.querySelector('.ham');
    var nav = document.querySelector('.nav');
    ham.addEventListener('click',function(){
        if(ham.classList.contains('on')){ //ham 클래스 on있으면
            slideUp();
            ham.classList.remove('on');
            nav.classList.remove('active');
        }else{
            ham.classList.add('on');
            nav.classList.add('active');
        }
    
    });
    var menuLiA = document.querySelectorAll('.nav>ul>li>a');
    var sub = document.querySelectorAll('.sub');
    menuLiA.forEach(function(item){
        item.addEventListener('click',function(){
            var subHeight = getComputedStyle(this.nextElementSibling).height;
            if(subHeight == '0px'){
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