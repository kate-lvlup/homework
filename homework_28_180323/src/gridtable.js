const edit_buttons = document.querySelectorAll('.edit-btn')
const delete_buttons = document.querySelectorAll('.delete-btn')
const add_button = document.getElementById('add-btn')

add_button.addEventListener("click", () => {
    const table_list = document.querySelector('.table-list');

    const table_list_item = document.createElement('div');
    table_list_item.className = "table-list-item grid-table";

    table_list.append(table_list_item);

    const item_user = document.createElement('div');
    const item_date = document.createElement('div');
    const item_email = document.createElement('div');
    const item_status = document.createElement('div');
    const item_actions = document.createElement('div');

    item_user.className = "item-user";
    item_date.className = "item_date";
    item_email.className = "item-email";
    item_status.className = "item_status";
    item_actions.className = "item-actions";

    const name_input = document.createElement('input');
    const icon_user = document.createElement('i');
    icon_user.className = "bi bi-person-circle";
    name_input.style.margin = "0 0 0 32px";
    item_user.append(icon_user);
    item_user.append(name_input);

    const email_input = document.createElement('input');
    item_email.append(email_input);

    item_status.innerHTML = '<span class="badge badge-pill badge-primary">Success</span>';

    const edit_button = document.createElement('button');
    edit_button.className = "btn btn-primary edit-btn";
    edit_button.innerHTML = '<i class="bi bi-pen"></i>';
    item_actions.append(edit_button);

    const delete_button = document.createElement('button');
    delete_button.className = "btn btn-danger delete-btn";
    delete_button.innerHTML = '<i class="bi bi-trash"></i>';
    item_actions.append(delete_button);

    table_list_item.append(item_user);
    table_list_item.append(item_date);
    table_list_item.append(item_email);
    table_list_item.append(item_status);
    table_list_item.append(item_actions);

})

edit_buttons.forEach(button => {
    button.addEventListener("click", () => {
        const item = event.target.closest('.table-list-item');

        const name = item.querySelector('.name');
        const email = item.querySelector('.email');

        const name_input = document.createElement('input');
        const email_input = document.createElement('input');

        name_input.value = name.textContent;
        email_input.value = email.textContent;

        const item_user = item.querySelector('.item-user');
        const item_email = item.querySelector('.item-email');
        const item_actions = item.querySelector('.item-actions');

        item_user.replaceChild(name_input, name);
        item_email.replaceChild(email_input, email);

        const delete_button = item.querySelector('.delete-btn');
        const edit_button = item.querySelector('.edit-btn')
        delete_button.style.visibility = 'hidden';
        edit_button.style.visibility = 'hidden';

        const saveButton = document.createElement('button');
        saveButton.className = 'btn btn-success';
        saveButton.innerHTML = '<i class= "bi bi-check"></i>';
        item_actions.prepend(saveButton);

        saveButton.addEventListener("click", () => {
            name.textContent = name_input.value;
            email.textContent = email_input.value;
            item_user.append(name);
            item_email.append(email);
            name_input.remove();
            email_input.remove();
            item_actions.removeChild(saveButton);
            delete_button.style.visibility = 'visible';
            edit_button.style.visibility = 'visible';
        })
    })
})

delete_buttons.forEach(button => {
    button.addEventListener("click", () => {
        const item = event.target.closest('.table-list-item');
        item.remove();
    })
})