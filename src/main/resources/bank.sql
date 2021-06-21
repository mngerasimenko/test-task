DROP TABLE IF EXISTS bk_bank;
DROP TABLE IF EXISTS bk_credit;
DROP TABLE IF EXISTS kredit;
DROP TABLE IF EXISTS bk_client;

CREATE TABLE IF NOT EXISTS bk_client (
client_id INT IDENTITY not null,
fio VARCHAR(100) not null,
telephone VARCHAR(15),
email VARCHAR(50) not null,
passport VARCHAR(100) not null,
PRIMARY KEY (client_id)
);

CREATE TABLE IF NOT EXISTS bk_credit (
credit_id INT IDENTITY not null,
limit_am DOUBLE,
percent_am DOUBLE,
PRIMARY KEY (credit_id)
);

CREATE TABLE IF NOT EXISTS bk_bank (
bank_id INT IDENTITY not null,
client_id INT not null,
credit_id INT not null,
PRIMARY KEY (bank_id),
FOREIGN KEY (client_id) REFERENCES bk_client(client_id) ON DELETE RESTRICT,
FOREIGN KEY (credit_id) REFERENCES bk_credit(credit_id) ON DELETE RESTRICT
);

INSERT INTO bk_client (fio, telephone, email, passport)
VALUES
('Ivanov I.I.', '+78479758833', 'email@kuku.ru', '2329 2909033'),
('Petrov P.P.', '+73434567823', 'rtegt@kuku.ru', '2329 4565533'),
('Sidorov S.S.', '+73545665353', 'sidor@kuku.ru', '2329 5544332');

INSERT INTO bk_credit (limit_am, percent_am)
VALUES
(12000000.0, 10.0),
(100000.0, 19.5),
(999000.0, 5.9);

INSERT INTO bk_bank (client_id, credit_id)
VALUES
(0, 0),
(0, 1),
(2, 2);