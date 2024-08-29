CREATE TABLE IF NOT EXISTS customer (
  customer_id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  mobile_number VARCHAR(20) NOT NULL,
  created_at DATE NOT NULL,
  created_by VARCHAR(20) NOT NULL,
  updated_at DATE,
  updated_by VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS accounts (
  customer_id INTEGER NOT NULL,
  account_number SERIAL PRIMARY KEY,
  account_type VARCHAR(100) NOT NULL,
  branch_address VARCHAR(200) NOT NULL,
  created_at DATE NOT NULL,
  created_by VARCHAR(20) NOT NULL,
  updated_at DATE,
  updated_by VARCHAR(20),
  FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);