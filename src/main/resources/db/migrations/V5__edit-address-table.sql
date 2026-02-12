ALTER TABLE address ADD CONSTRAINT address_event FOREIGN KEY(event_id)
REFERENCES events (id)