-- Criação da tabela contact
CREATE TABLE contact (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(11) NOT NULL,
    birth_date DATE NOT NULL
);

-- Criação da tabela address
CREATE TABLE address (
    id SERIAL PRIMARY KEY,
    contact_id INTEGER NOT NULL,
    street VARCHAR(255) NOT NULL,
    number INTEGER NOT NULL,
    zip_code VARCHAR(7) NOT NULL,
    CONSTRAINT fk_address_contact
        FOREIGN KEY (contact_id)
        REFERENCES contact (id)
        ON DELETE CASCADE
);
