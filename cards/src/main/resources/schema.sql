CREATE TABLE IF NOT EXISTS cards (
  card_id SERIAL PRIMARY KEY,
  mobile_number VARCHAR(15) NOT NULL,
  card_number VARCHAR(100) NOT NULL,
  card_type VARCHAR(100) NOT NULL,
  total_limit INTEGER NOT NULL,
  amount_used INTEGER NOT NULL,
  available_amount INTEGER NOT NULL,
  created_at DATE NOT NULL,
  created_by VARCHAR(20) NOT NULL,
  updated_at DATE,
  updated_by VARCHAR(20)
);