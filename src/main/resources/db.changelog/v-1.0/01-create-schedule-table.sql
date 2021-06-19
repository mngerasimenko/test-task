CREATE TABLE IF NOT EXISTS bk_schedule (
    schedule_id INT IDENTITY not null,
    payment_am DOUBLE,
    body_am DOUBLE,
    percent_am DOUBLE,
    PRIMARY KEY (schedule_id)
);