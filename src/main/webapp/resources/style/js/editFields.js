$(document).ready(function () {
    $('.filterable .btn-filter').click(function () {
        var $panel = $(this).parents('.filterable'),
            $filters = $panel.find('.filters input'),
            $fltrs = $panel.find('.filters textarea');
        if ($filters.prop('disabled') == true) {
            $filters.prop('disabled', false);
            $fltrs.prop('disabled', false);
        } else {
            $filters.prop('disabled', true);
            $fltrs.prop('disabled', true);
        }
    });
});
