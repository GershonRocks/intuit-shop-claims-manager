CREATE TABLE users (
                       id UUID PRIMARY KEY,
                       name VARCHAR(255),
                       email VARCHAR(255),
                       address VARCHAR(255)
);

CREATE TABLE purchases (
                           id UUID PRIMARY KEY,
                           userId UUID,
                           productId UUID,
                           productName VARCHAR(255),
                           price DECIMAL,
                           purchaseDate TIMESTAMP,
                           FOREIGN KEY (userId) REFERENCES users(id)
);

CREATE TABLE complaints (
                            id UUID PRIMARY KEY,
                            userId UUID,
                            purchaseId UUID,
                            subject VARCHAR(255),
                            content TEXT,
                            FOREIGN KEY (userId) REFERENCES users(id),
                            FOREIGN KEY (purchaseId) REFERENCES purchases(id)
);
