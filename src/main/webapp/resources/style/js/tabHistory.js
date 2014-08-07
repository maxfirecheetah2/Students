$(document).ready(function () {

    if (localStorage["userCats"]){
        $('#toggleDemo').collapse({
            show: true
        })
    }

    $('#userCats').click(function(){
        if(localStorage["userCats"]){
            localStorage.removeItem("userCats");
        }
        else{
            localStorage["userCats"] = true;
        }
    });


    if (localStorage["actions"]){
        $('#toggleDemo2').collapse({
            show: true
        })
    }

    $('#actions').click(function(){
        if(localStorage["actions"]){
            localStorage.removeItem("actions");
        }
        else{
            localStorage["actions"] = true;
        }
    });



});