CREATE TABLE IF NOT EXISTS bk_credit (
    credit_id INT IDENTITY not null,
    limit DOUBLE,
    percent DOUBLE,
    PRIMARY KEY (credit_id)
);