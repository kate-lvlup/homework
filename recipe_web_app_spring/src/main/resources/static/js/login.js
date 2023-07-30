function usernameValidation() {
    const error = document.getElementById('error-userName')
    const input_value = document.getElementById('username-input').value
    const regex = /[a-zA-Z0-9]{4,}/
    if (regex.test(input_value)) {
        document.getElementById('username-input').style.border = "2px solid green"
        document.getElementById('username-input').style.boxShadow = "10px 5px 5px green"
        error.style.display = "none"
    } else {
        error.style.display = "block"
        document.getElementById('username-input').style.border = "2px solid red"
        document.getElementById('username-input').style.boxShadow = "10px 5px 5px red"
    }
}

function passwordValidation() {
    const error = document.getElementById('error-password')
    const input_value = document.getElementById('password-input').value
    const regex = /^(?=.*[!@#$%])(?=\S+$).{4,}$/
    if (regex.test(input_value)) {
        document.getElementById('password-input').style.border = "2px solid green"
        document.getElementById('password-input').style.boxShadow = "10px 5px 5px green"
        error.style.display = "none"
    } else {
        error.style.display = "block"
        document.getElementById('password-input').style.border = "2px solid red"
        document.getElementById('password-input').style.boxShadow = "10px 5px 5px red"
    }
}

function firstNameValidation() {
    const error = document.getElementById('error-firstName')
    const input_value = document.getElementById('firstName-input').value
    const regex = /[a-zA-Z]{1,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
        document.getElementById('firstName-input').style.border = "2px solid green"
        document.getElementById('firstName-input').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('firstName-input').style.border = "2px solid red"
        document.getElementById('firstName-input').style.boxShadow = "10px 5px 5px red"
    }
}

function lastNameValidation() {
    const error = document.getElementById('error-lastName')
    const input_value = document.getElementById('lastName-input').value
    const regex = /[a-zA-Z]{1,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
        document.getElementById('lastName-input').style.border = "2px solid green"
        document.getElementById('lastName-input').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('lastName-input').style.border = "2px solid red"
        document.getElementById('lastName-input').style.boxShadow = "10px 5px 5px red"
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
            document.getElementById('birthday-input').style.border = "2px solid green"
            document.getElementById('birthday-input').style.boxShadow = "10px 5px 5px green"
            const year = birthday.getFullYear();
            const month = String(birthday.getMonth() + 1).padStart(2, "0");
            const day = String(birthday.getDate()).padStart(2, "0");
            return `${year}-${month}-${day}`;
        } else {
            error.style.display = "block";
            document.getElementById('birthday-input').style.border = "2px solid red"
            document.getElementById('birthday-input').style.boxShadow = "10px 5px 5px red"
        }
    } else {
        error.style.display = "block";
        document.getElementById('birthday-input').style.border = "2px solid red"
        document.getElementById('birthday-input').style.boxShadow = "10px 5px 5px red"
    }
}

function emailValidation() {
    const error = document.getElementById('error-email');
    const input_value = document.getElementById('email-input').value;
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (regex.test(input_value)) {
        error.style.display = "none";
        document.getElementById('email-input').style.border = "2px solid green"
        document.getElementById('email-input').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block";
        document.getElementById('email-input').style.border = "2px solid red"
        document.getElementById('email-input').style.boxShadow = "10px 5px 5px red"
    }
}

function phoneNumberValidation() {
    const error = document.getElementById('error-phoneNumber')
    const input_value = document.getElementById('phoneNumber-input').value
    const regex = /^[+][0-9]{12}/
    if (regex.test(input_value)) {
        error.style.display = "none"
        document.getElementById('phoneNumber-input').style.border = "2px solid green"
        document.getElementById('phoneNumber-input').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('phoneNumber-input').style.border = "2px solid red"
        document.getElementById('phoneNumber-input').style.boxShadow = "10px 5px 5px red"
    }
}

function addressValidation() {
    const error = document.getElementById('error-address')
    const input_value = document.getElementById('address-input').value
    const regex = /[a-zA-Z0-9]{1,}/
    if (regex.test(input_value)) {
        error.style.display = "none"
        document.getElementById('address-input').style.border = "2px solid green"
        document.getElementById('address-input').style.boxShadow = "10px 5px 5px green"
    } else {
        error.style.display = "block"
        document.getElementById('address-input').style.border = "2px solid red"
        document.getElementById('address-input').style.boxShadow = "10px 5px 5px red"
    }
}








