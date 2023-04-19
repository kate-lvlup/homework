CREATE TABLE reg_app_db.public.users
(
    user_id      bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    username     varchar(255) UNIQUE,
    password     varchar(255),
    first_name   varchar(255) NOT NULL,
    last_name    varchar(255) NOT NULL,
    birth_date   date,
    email        varchar(255) NOT NULL,
    phone_number varchar,
    address      varchar,
    isAvailable  boolean
)