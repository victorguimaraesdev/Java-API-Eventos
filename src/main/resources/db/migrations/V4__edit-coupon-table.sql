ALTER TABLE coupon ADD CONSTRAINT coupon_event FOREIGN KEY (event_id)
REFERENCES events (id) 