var sub = document.querySelectorAll('.sub');
function slideUp(){
    // sub.forEach(function(item){
    //     item.style.height='0px';
    // });
    for(var i = 0; i < sub.length; i++){
        sub[i].style.height='0px';
    }
}
var menuLia = document.querySelectorAll('.m_menu>li>a');

// menuLia.forEach(function(item){
//     item.addEventListener('click',function(){
//         var subHeight = getComputedStyle(this.nextElementSibling).height;
//         // alert(subHeight);
//         if(subHeight==='0px'){
//             slideUp();
//             this.nextElementSibling.style.height = '108px';
//         }else{
//             this.nextElementSibling.style.height = '0px';
//         }
//     });
// });

for(var i = 0; i < menuLia.length ; i++ ){
    menuLia[i].addEventListener('click',function(){
        var subHeight =   getComputedStyle(this.nextElementSibling).height;

    if(subHeight === '0px'){
        slideUp();  //현재 열려있는 sub를 모두 닫고
        this.nextElementSibling.style.height = '108px';
    } else{
        this.nextElementSibling.style.height = '0px';
    }   
    });
   
}