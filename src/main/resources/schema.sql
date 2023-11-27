CREATE TABLE users (
                       id UUID PRIMARY KEY,
                       fullName VARCHAR(255),
                       emailAddress VARCHAR(255),
                       physicalAddress VARCHAR(255)
);

CREATE TABLE purchases (
                           id UUID PRIMARY KEY,
                           userId UUID,
                           productId UUID,
                           productName VARCHAR(255),
                           pricePaidAmount DECIMAL,
                           priceCurrency VARCHAR(255),
                           discount_percent FLOAT,
                           merchantId UUID,
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
