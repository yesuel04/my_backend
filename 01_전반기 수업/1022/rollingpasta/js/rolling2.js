var slideTabs = document.querySelectorAll('.img_tab .tab img');
slideTabs.forEach(function(img){

    img.addEventListener('mouseover', function(){
        var newSrc = img.getAttribute('data-on');
        console.log(newSrc);
        img.setAttribute('src', newSrc);
    });

    img.addEventListener('mouseout', function(){
        var orgSrc = img.getAttribute('data-off');
        console.log(orgSrc);
        img.setAttribute('src', orgSrc);
    });

});