const targetLink = document.querySelectorAll('.tab_menu a');
const tabContent = document.querySelectorAll('#tabContent > div');

// targetLink 배열을 forEach로 순회.
targetLink.forEach(function(link){
    link.addEventListener('click', function(e){
        e.preventDefault(); //링크 금지

        let orgTarget = e.target.getAttribute('href');
        //클릭(e.target) - this로 변경가능.
        //getAttribute 는 href, src 속성값을 읽어옴.
        let tabTarget = orgTarget.replace('#', '');
        // #tab1 에서 #을 빈문자열로 교체 > tab1.

        //모든 tabContent를 안 보이게 설정.
        tabContent.forEach(function(content){
            content.style.display = "none";
        });

        // 클릭한 탭만 보이게 설정.
        document.getElementById(tabTarget).style.display = "block";

        // 클릭한 탭만 색이 바뀌도록 설정.
        targetLink.forEach(function(link2){
            link2.classList.remove('active');
            e.target.classList.add('active');
        });
    });
});