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

