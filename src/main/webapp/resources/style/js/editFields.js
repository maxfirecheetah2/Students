$(document).ready(function () {
    $('.filterable .btn-filter').click(function () {
        var $panel = $(this).parents('.filterable'),
            $filters = $panel.find('.filters input'),
            $tbody = $panel.find('.table tbody'),
            $fltrs = $panel.find('.filters textarea');
        if ($filters.prop('disabled') == true) {
            $filters.prop('disabled', false);
            $fltrs.prop('disabled', false);
            $filters.first().focus();
        } else {
            $filters.prop('disabled', true);
            $fltrs.prop('disabled', true);
            $tbody.find('.no-result').remove();
            $tbody.find('tr').show();
        }
    });
});
