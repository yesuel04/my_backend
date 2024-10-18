 // 탭메뉴 스크립트

 const targetLink = document.querySelectorAll('.tab_menu a');
 const tabContent = document.querySelectorAll('#tabContent > div');

 targetLink.forEach(function(link){
     link.addEventListener('click', function(e){
         e.preventDefault(); //링크 금지

         let orgTarget = e.target.getAttribute('href');
         let tabTarget = orgTarget.replace('#', '');

         tabContent.forEach(function(content){
             content.style.display = "none";
         });

         document.getElementById(tabTarget).style.display = "block";

         targetLink.forEach(function(link2){
             link2.classList.remove('active');
             e.target.classList.add('active');
         });
     });
 });


 // 슬라이드 스크립트

 var list = document.querySelector('.banner');
 var listLi = document.querySelectorAll('.banner li');
 var show_num = 1;
 var total = listLi.length;
 var li_width = document.querySelector('.banner > li').offsetWidth;

 var copyobj = listLi[0].cloneNode(true);
 list.append(copyobj);

 var num = 0;

 function autoplay(){
     if(num==5){
         num = 0;
         list.style.transition = 'none';
         list.style.marginLeft = 0;
     }
     setTimeout(function(){
         num++;
         list.style.transition = 'margin-left 0.5s';
         list.style.marginLeft = -li_width * num + "px";
     },50);
 }
 setInterval(autoplay, 3000);


 var next = document.querySelector('.next');
 var prev = document.querySelector('.prev');

 next.addEventListener('click', function(){
     if(num==5){
         num = 0;
         list.style.transition = 'none';
         list.style.marginLeft = 0;
     }
     setTimeout(function(){
         num++;
         list.style.transition = 'margin-left 0.5s';
         list.style.marginLeft = -li_width * num + "px";
     },50);
 });

 prev.addEventListener('click', function(){
     if(num==0){
         num = 5;
         list.style.transition = 'none';
         list.style.marginLeft = -li_width * num + "px";
     }
     setTimeout(function(){
         num--;
         list.style.transition = 'margin-left 0.5s';
         list.style.marginLeft = -li_width * num + "px";
     },50);
 });

