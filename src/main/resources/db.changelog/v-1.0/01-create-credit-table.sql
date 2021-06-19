CREATE TABLE IF NOT EXISTS bk_credit (
    credit_id INT IDENTITY not null,
    limit DOUBLE,
    procent DOUBLE,
    PRIMARY KEY (credit_id)
);