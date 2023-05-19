const modal = document.getElementById('modal')
const add_button = document.getElementById('add-btn')
const add_close_span = document.getElementById('modal-close')

add_button.onclick = function () {
    modal.style.display = "block"
}

add_close_span.onclick = function () {
    modal.style.display = "none"
}

const edit_modal = document.getElementById('edit-modal')
const edit_close_span = document.getElementById('edit-modal-close')

function openEditModal(id, username, firstName, lastName, birthday, email, phoneNumber, address) {
    edit_modal.style.display = "block"
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