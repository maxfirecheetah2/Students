$(document).ready(function () {
    $('.selectpicker').selectpicker();
    $('.ex-disable').click(function () {
        $('.disable-example').prop('disabled', true);
        $('.disable-example').selectpicker('refresh');
    });
    $('.ex-enable').click(function () {
        $('.disable-example').prop('disabled', false);
        $('.disable-example').selectpicker('refresh');
    });

});
