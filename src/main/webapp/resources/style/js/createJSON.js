$(document).ready(function () {
    $('#sendJSON').click(function () {
        var jsonObj = [];
        $('.data').each(function() {

            var id = $(this).attr("name");
            var mark = $(this).val();

            item = {};
            item ["id"] = id;
            item ["mark"] = mark;

            jsonObj.push(item);
        });

        var jsonString = JSON.stringify(jsonObj);
        alert(jsonString);
    });
});

