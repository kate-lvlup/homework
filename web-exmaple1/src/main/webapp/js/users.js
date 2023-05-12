var modal = document.getElementById('modal')
var add_button = document.getElementById('add-btn')
var close_span = document.getElementById('modal-close')

add_button.onclick = function () {
    modal.style.display = "block"
}

close_span.onclick = function () {
    modal.style.display = "none"
}

