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

//    $('.tab a').click(function(){
//        var id = (this).id;
//        if(localStorage[id]){
//            localStorage.removeItem(id);
//        }
//        else{
//            localStorage[id] = true;
//        }
//    });

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
});