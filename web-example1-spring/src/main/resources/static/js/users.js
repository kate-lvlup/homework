const modal = document.getElementById('modal')
const add_button = document.getElementById('add-btn')
const add_close_span = document.getElementById('modal-close')

add_button.onclick = function () {
    modal.style.display = "flex"
}

add_close_span.onclick = function () {
    modal.style.display = "none"
    const clear_username = document.getElementById('username-input')
    const clear_firstName = document.getElementById('firstName-input')
    const clear_lastName = document.getElementById('lastName-input')
    const clear_birthday = document.getElementById('birthday-input')
    const clear_email = document.getElementById('email-input')
    const clear_phoneNumber = document.getElementById('phoneNumber-input')
    const clear_address = document.getElementById('address-input')

    clear_username.value = ""
    clear_firstName.value = ""
    clear_lastName.value = ""
    clear_birthday.value = ""
    clear_email.value = ""
    clear_phoneNumber.value = ""
    clear_address.value = ""
}

const edit_modal = document.getElementById('edit-modal')
const edit_close_span = document.getElementById('edit-modal-close')

function openEditModal(id, username, firstName, lastName, birthday, email, phoneNumber, address) {
    edit_modal.style.display = "flex"
    const edit_id = document.getElementById('edit-id')
    const edit_username = document.getElementById('edit-username')
    const edit_firstName = document.getElementById('edit-firstName')
    const edit_lastName = document.getElementById('edit-lastName')
    const edit_birthday = document.getElementById('edit-birthday')
    const edit_email = document.getElementById('edit-email')
    const edit_phoneNumber = document.getElementById('edit-phoneNumber')
    const edit_address = document.getElementById('edit-address')

    edit_id.value = id
    edit_username.value = username
    edit_firstName.value = firstName
    edit_lastName.value = lastName
    edit_birthday.value = birthday
    edit_email.value = email
    edit_phoneNumber.value = phoneNumber
    edit_address.value = address
}

edit_close_span.onclick = function () {
    edit_modal.style.display = "none"
}

function usernameValidation() {
    const error = document.getElementById('error-userName')
    const error_update = document.getElementById('error-username_update')
    const input_value = document.getElementById('username-input').value
    const edit_username = document.getElementById('edit-username').value
    const regex = /[a-zA-Z0-9]{4,}/
    if (regex.test(input_value) || regex.test(edit_username)) {
        document.getElementById('username-input').style.border = "2px solid green"
        document.getElementById('username-input').style.boxShadow = "10px 5px 5px green"
        document.getElementById('edit-username').style.border = "2px solid green"
        document.getElementById('edit-username').style.boxShadow = "10px 5px 5px green"
        error.style.display = "none"
        error_update.style.display = "none"
    } else {
        error.style.display = "block"
        error_update.style.display = "block"
        document.getElementById('username-input').style.border = "2px solid red"
        document.getElementById('username-input').style.boxShadow = "10px 5px 5px red"
        document.getElementById('edit-username').style.border = "2px solid red"
        document.getElementById('edit-username').style.boxShadow = "10px 5px 5px red"
    }
}


function firstNameValidation() {
    const error = document.getElementById('error-firstName')
    const error_update = document.getElementById('error-username_update')
    const input_value = document.getElementById('firstName-input').value
    const edit_firstName = document.getElementById('edit-firstName').value
    const regex = /[a-zA-Z]{1,}/
    if (regex.test(input_value) || regex.test(edit_firstName)) {
        error.style.display = "none"
        error_update.style.display = "none"
        document.getElementById('firstName-input').style.border = "2px solid green"
        document.getElementById('firstName-input').style.boxShadow = "10px 5px 5px green"
        document.getElementById('edit-firstName').style.border = "2px solid green"
        document.getElementById('edit-firstName').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('firstName-input').style.border = "2px solid red"
        document.getElementById('firstName-input').style.boxShadow = "10px 5px 5px red"
        error_update.style.display = "block"
        document.getElementById('edit-firstName').style.border = "2px solid red"
        document.getElementById('edit-firstName').style.boxShadow = "10px 5px 5px red"
    }
}

function lastNameValidation() {
    const error = document.getElementById('error-lastName')
    const error_update = document.getElementById('error-lastName_update')
    const input_value = document.getElementById('lastName-input').value
    const input_value_update = document.getElementById('edit-lastName').value
    const regex = /[a-zA-Z]{1,}/
    if (regex.test(input_value) || regex.test(input_value_update)) {
        error.style.display = "none"
        document.getElementById('lastName-input').style.border = "2px solid green"
        document.getElementById('lastName-input').style.boxShadow = "10px 5px 5px green"
        error_update.style.display = "none"
        document.getElementById('edit-lastName').style.border = "2px solid green"
        document.getElementById('edit-lastName').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('lastName-input').style.border = "2px solid red"
        document.getElementById('lastName-input').style.boxShadow = "10px 5px 5px red"
        error_update.style.display = "block"
        document.getElementById('edit-lastName').style.border = "2px solid red"
        document.getElementById('edit-lastName').style.boxShadow = "10px 5px 5px red"
    }
}

function birthdayValidation() {
    const error = document.getElementById('error-birthday');
    const input_value = document.getElementById('birthday-input').value;
    const error_update = document.getElementById('error-birthday_update');
    const input_value_update = document.getElementById('edit-birthday').value;
    if (input_value !== "" || input_value_update !== "") {
        const today = new Date();
        const birthday = new Date(input_value || input_value_update);

        if (birthday <= today) {
            error.style.display = "none";
            document.getElementById('birthday-input').style.border = "2px solid green"
            document.getElementById('birthday-input').style.boxShadow = "10px 5px 5px green"
            error_update.style.display = "none";
            document.getElementById('edit-birthday').style.border = "2px solid green"
            document.getElementById('edit-birthday').style.boxShadow = "10px 5px 5px green"
        } else {
            error.style.display = "block";
            document.getElementById('birthday-input').style.border = "2px solid red"
            document.getElementById('birthday-input').style.boxShadow = "10px 5px 5px red"
            error_update.style.display = "block";
            document.getElementById('edit-birthday').style.border = "2px solid red"
            document.getElementById('edit-birthday').style.boxShadow = "10px 5px 5px red"
        }
    } else {
        error.style.display = "block";
        error_update.style.display = "block";
    }
}

function emailValidation() {
    const error = document.getElementById('error-email');
    const input_value = document.getElementById('email-input').value;
    const error_update = document.getElementById('error-email_update');
    const input_value_update = document.getElementById('edit-email').value;
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (regex.test(input_value) || regex.test(input_value_update)) {
        error.style.display = "none";
        document.getElementById('email-input').style.border = "2px solid green"
        document.getElementById('email-input').style.boxShadow = "10px 5px 5px green"
        error_update.style.display = "none";
        document.getElementById('edit-email').style.border = "2px solid green"
        document.getElementById('edit-email').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block";
        document.getElementById('email-input').style.border = "2px solid red"
        document.getElementById('email-input').style.boxShadow = "10px 5px 5px red"
        error_update.style.display = "block";
        document.getElementById('edit-email').style.border = "2px solid red"
        document.getElementById('edit-email').style.boxShadow = "10px 5px 5px red"
    }
}

function phoneNumberValidation() {
    const error = document.getElementById('error-phoneNumber')
    const input_value = document.getElementById('phoneNumber-input').value
    const error_update = document.getElementById('error-phoneNumber_update')
    const input_value_update = document.getElementById('edit-phoneNumber').value
    const regex = /^[+][0-9]{12}/
    if (regex.test(input_value) || regex.test(input_value_update)) {
        error.style.display = "none"
        document.getElementById('phoneNumber-input').style.border = "2px solid green"
        document.getElementById('phoneNumber-input').style.boxShadow = "10px 5px 5px green"
        error_update.style.display = "none"
        document.getElementById('edit-phoneNumber').style.border = "2px solid green"
        document.getElementById('edit-phoneNumber').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('phoneNumber-input').style.border = "2px solid red"
        document.getElementById('phoneNumber-input').style.boxShadow = "10px 5px 5px red"
        error_update.style.display = "block"
        document.getElementById('edit-phoneNumber').style.border = "2px solid red"
        document.getElementById('edit-phoneNumber').style.boxShadow = "10px 5px 5px red"
    }
}

function addressValidation() {
    const error = document.getElementById('error-address')
    const input_value = document.getElementById('address-input').value
    const error_update = document.getElementById('error-address_update')
    const input_value_update = document.getElementById('edit-address').value
    const regex = /[a-zA-Z0-9]{1,}/
    if (regex.test(input_value) || regex.test(input_value_update)) {
        error.style.display = "none"
        document.getElementById('address-input').style.border = "2px solid green"
        document.getElementById('address-input').style.boxShadow = "10px 5px 5px green"
        error_update.style.display = "none"
        document.getElementById('edit-address').style.border = "2px solid green"
        document.getElementById('edit-address').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('address-input').style.border = "2px solid red"
        document.getElementById('address-input').style.boxShadow = "10px 5px 5px red"
        error_update.style.display = "block"
        document.getElementById('edit-address').style.border = "2px solid red"
        document.getElementById('edit-address').style.boxShadow = "10px 5px 5px red"
    }
}








