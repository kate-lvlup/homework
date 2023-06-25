function showModalAddProduct() {
    document.getElementById('addProductModal').style.display = 'block';
}

function hideModalAddProduct() {
    document.getElementById('addProductModal').style.display = 'none';
}

function showModalAddRecipe() {
    document.getElementById('addRecipeModal').style.display = 'block';
}

function hideModalAddRecipe() {
    document.getElementById('addRecipeModal').style.display = 'none';
}

function handleCheckboxClick(labelName, inputFieldId) {
    var checkboxes = document.getElementsByName('checkbox');
    var inputField = document.getElementById(inputFieldId);

    var selectedLabels = [];
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            selectedLabels.push(checkboxes[i].value);
        }
    }

    inputField.value = selectedLabels.join(', ');
}

function submitForm() {
    var inputField = document.getElementById('inputField');
    var selectedValues = inputField.value.split(', ');

    var form = document.getElementById('myForm');
    var input = document.createElement('input');
    input.type = 'hidden';
    input.name = 'selectedValues';
    input.value = JSON.stringify(selectedValues);

    form.appendChild(input);
    form.submit();
}





function handleCheckboxClick2(labelName, inputFieldId) {
    var checkboxes = document.getElementsByName('checkbox');
    var inputField2 = document.getElementById(inputFieldId);

    var selectedLabels = [];
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            selectedLabels.push(checkboxes[i].value);
        }
    }

    inputField2.value = selectedLabels.join(', ');
}

function submitForm2() {
    var inputField2 = document.getElementById('inputField2');
    var selectedValues = inputField2.value.split(', ');

    var form2 = document.getElementById('myForm2');
    var input = document.createElement('input');
    input.type = 'hidden';
    input.name = 'selectedValues';
    input.value = JSON.stringify(selectedValues);

    form2.appendChild(input);
    form2.submit();
}
