$(document).ready(function(){
    var addFormGroup = function (event) {

        var $formGroup = $(this).closest('.form-group');
        var $multipleFormGroup = $formGroup.closest('.multiple-form-group');
        var $formGroupClone = $formGroup.clone();

        $(this)
            .toggleClass('btn-success btn-add btn-danger btn-remove')
            .html('–');

        $formGroupClone.find('input').val('');
        $formGroupClone.find('.concept').text('English Level');
        $formGroupClone.insertAfter($formGroup);

        var $lastFormGroupLast = $multipleFormGroup.find('.form-group:last');
        if ($multipleFormGroup.data('max') <= countFormGroup($multipleFormGroup)) {
            $lastFormGroupLast.find('.btn-add').attr('disabled', true);
        }
    };

    var removeFormGroup = function (event) {

        var $formGroup = $(this).closest('.form-group');
        var $multipleFormGroup = $formGroup.closest('.multiple-form-group');

        var $lastFormGroupLast = $multipleFormGroup.find('.form-group:last');
        if ($multipleFormGroup.data('max') >= countFormGroup($multipleFormGroup)) {
            $lastFormGroupLast.find('.btn-add').attr('disabled', false);
        }

        $formGroup.remove();
    };

    var selectFormGroup = function (event) {
        var $formGroup = $(this).closest('.form-group');
        var $selectGroup = $(this).closest('.input-group-select');
        var param = $(this).attr("id").replace("#skill", "");
        var concept = $(this).text();

        $selectGroup.find('.concept').text(concept);
        $selectGroup.find('.input-group-select-val').val(param);
        $formGroup.find('input').attr("name","marks["+param+"]");

    }

    var countFormGroup = function ($form) {
        return $form.find('.form-group').length;
    };

    var mark;
    var check = function(event){
        $(this).val($(this).val().replace(/[^\d]/,''));
        if(parseInt($(this).val(),10) <= 10){
            mark = $(this).val();
        }
        if (parseInt($(this).val(),10) > 10){
            $(this).val(mark);
        }
    };

    $(document).on('click', '.btn-add', addFormGroup);
    $(document).on('click', '.btn-remove', removeFormGroup);
    $(document).on('click', '.dropdown-menu a', selectFormGroup);

    $(document).on('keyup', '.field', check);


});
