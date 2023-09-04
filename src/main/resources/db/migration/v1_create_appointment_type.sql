CREATE TABLE IF NOT EXIST appointment_type (
    id SERIAL,
    name varchar(255),
    description varchar(255),
    duration_minutes integer,
    color_hex_code varchar(6)
    constraint appointment_type primary key (id)
);