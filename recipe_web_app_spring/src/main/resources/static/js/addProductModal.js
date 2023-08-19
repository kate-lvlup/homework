function showModalAddProduct() {
    document.getElementById('addProductModal').style.display = 'block';
    document.getElementById('productNameError').style.display = 'none';
    const clear_product_name = document.getElementById('productName')
    clear_product_name.value = ""
}

function hideModalAddProduct() {
    document.getElementById('addProductModal').style.display = 'none';
    document.getElementById('productNameError').style.display = 'none';
    const clear_product_name = document.getElementById('productName')
    clear_product_name.value = ""
}

function showModalAddRecipe() {
    document.getElementById('addRecipeModal').style.display = 'block';
}

function hideModalAddRecipe() {
    document.getElementById('addRecipeModal').style.display = 'none';
}

function handleCheckboxClick(labelName, inputFieldId) {
    let checkboxes = document.getElementsByName('checkbox');
    let inputField = document.getElementById(inputFieldId);

    let selectedLabels = [];
    for (let i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            selectedLabels.push(checkboxes[i].value);
        }
    }

    inputField.value = selectedLabels.join(', ');
}

function submitForm() {
    let inputField = document.getElementById('inputField');
    let selectedValues = inputField.value.split(', ');

    let form = document.getElementById('myForm');
    let input = document.createElement('input');
    input.type = 'hidden';
    input.name = 'selectedValues';
    input.value = JSON.stringify(selectedValues);

    form.appendChild(input);
    form.submit();
}


function handleCheckboxClick2(labelName, inputFieldId) {
    let checkboxes = document.getElementsByName('checkbox');
    let inputField2 = document.getElementById(inputFieldId);

    let selectedLabels = [];
    for (let i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            selectedLabels.push(checkboxes[i].value);
        }
    }

    inputField2.value = selectedLabels.join(', ');
}

function submitForm2() {
    let inputField2 = document.getElementById('inputField2');
    let selectedValues = inputField2.value.split(', ');

    let form2 = document.getElementById('myForm2');
    let input = document.createElement('input');
    input.type = 'hidden';
    input.name = 'selectedValues';
    input.value = JSON.stringify(selectedValues);

    form2.appendChild(input);
    // form2.submit();
}


function handleCheckboxClick3(labelName, inputFieldId) {
    let checkboxes = document.getElementsByName('checkbox');
    let inputField3 = document.getElementById(inputFieldId);

    let selectedLabels = [];
    for (let i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            selectedLabels.push(checkboxes[i].value);
        }
    }

    inputField3.value = selectedLabels.join(', ');
}

function submitForm3() {
    let inputField3 = document.getElementById('inputField3');
    let selectedValues = inputField3.value.split(', ');

    let form3 = document.getElementById('myForm3');
    let input = document.createElement('input');
    input.type = 'hidden';
    input.name = 'selectedValues';
    input.value = JSON.stringify(selectedValues);

    form3.appendChild(input);
    form3.submit();
}



