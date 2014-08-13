$(document).ready(function () {

    var tab = document.getElementById("toggleDemo");
    var tab2 = document.getElementById("toggleDemo2");

    if (localStorage["userCats"]){
        tab.className = "in";
        tab.style.height = "auto";
    }
    if (localStorage["actions"]){
        tab2.className = "in";
        tab2.style.height = "auto";
    }
    $('#userCats').click(function(){
        if(localStorage["userCats"]){
            localStorage.removeItem("userCats");
        }
        else{
            localStorage["userCats"] = true;
        }
    });
    $('#actions').click(function(){
        if(localStorage["actions"]){
            localStorage.removeItem("actions");
        }
        else{
            localStorage["actions"] = true;
        }
    });

//    var $div = document.getElementsByClassName("tab");
//    var $a = $div.parent("li").child("a");
//
//    if (localStorage[$a.id]){
//        $div.className = "in";
//        $div.style.height = "auto";
//    }
//    $a.click(function(){
//        if(localStorage[$a.id]){
//            localStorage.removeItem($a.id);
//        }
//        else{
//            localStorage[$a.id] = true;
//        }
//    });

});