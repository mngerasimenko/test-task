CREATE TABLE IF NOT EXISTS bk_client (
    client_id INT IDENTITY not null,
    fio VARCHAR(100) not null,
    email VARCHAR(50) not null,
    passport VARCHAR(100) not null,
    PRIMARY KEY (client_id)
);