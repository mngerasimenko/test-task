CREATE TABLE IF NOT EXISTS bk_offer (
    offer_id INT IDENTITY not null,
    client_id INT not null,
    credit_id INT not null,
    amount DOUBLE not null,
    schedule_id INT not null,
    PRIMARY KEY (offer_id),
    FOREIGN KEY (client_id) REFERENCES bk_client(client_id) ON DELETE RESTRICT,
    FOREIGN KEY (credit_id) REFERENCES bk_credit(credit_id) ON DELETE RESTRICT,
    FOREIGN KEY (schedule_id) REFERENCES bk_schedule(schedule_id) ON DELETE RESTRICT
);