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
    const input_value = document.getElementById('username-input').value
    const regex = /[a-zA-Z0-9]{4,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
    } else {
        error.style.display = "block"
    }
}

function firstNameValidation() {
    const error = document.getElementById('error-firstName')
    const input_value = document.getElementById('firstName-input').value
    const regex = /[a-zA-Z]{1,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
    } else {
        error.style.display = "block"
    }
}

function lastNameValidation() {
    const error = document.getElementById('error-lastName')
    const input_value = document.getElementById('lastName-input').value
    const regex = /[a-zA-Z]{1,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
    } else {
        error.style.display = "block"
    }
}

function birthdayValidation() {
    const error = document.getElementById('error-birthday');
    const input_value = document.getElementById('birthday-input').value;

    if (input_value !== "") {
        const today = new Date();
        const birthday = new Date(input_value);

        if (birthday <= today) {
            error.style.display = "none";
        } else {
            error.style.display = "block";
        }
    } else {
        error.style.display = "block";
    }
}

function emailValidation() {
    const error = document.getElementById('error-email');
    const input_value = document.getElementById('email-input').value;
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (regex.test(input_value)) {
        error.style.display = "none";
    } else {
        error.style.display = "block";
    }
}

function phoneNumberValidation() {
    const error = document.getElementById('error-phoneNumber')
    const input_value = document.getElementById('phoneNumber-input').value
    const regex = /^[+][0-9]{12}/
    if (regex.test(input_value)) {
        error.style.display = "none"
    } else {
        error.style.display = "block"
    }
}

function addressValidation() {
    const error = document.getElementById('error-address')
    const input_value = document.getElementById('address-input').value
    const regex = /[a-zA-Z0-9]{1,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
    } else {
        error.style.display = "block"
    }
}
