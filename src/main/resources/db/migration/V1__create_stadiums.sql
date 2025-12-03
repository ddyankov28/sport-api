-- V1__create_stadiums.sql
-- Create Stadiums table (columns match StadiumEntity fields)
CREATE TABLE IF NOT EXISTS Stadiums (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    team VARCHAR(255),
    city VARCHAR(255),
    capacity INT,
    longitude DOUBLE,
    latitude DOUBLE,
    short_code VARCHAR(255)
    );

-- Insert Austrian Bundesliga stadiums (2024-25 season)
INSERT INTO Stadiums (name, team, city, capacity, longitude, latitude, short_code) VALUES
('BWT X Oberösterreichische Arena', 'SV Ried', 'Ried im Innkreis', 7678, 13.488889, 48.203056, 'ried'),
('Generali Arena','Austria Wien','Vienna',17656, 16.386845, 48.161949, 'austria-vienna'),
('Hofmann Personal Stadion','Blau-Weiß Linz','Linz',5595, 14.298817, 48.316390, 'bw_linz'),
('Merkur Arena','Grazer AK','Graz',16364, 15.454567, 47.046125, 'gak'),
('Raiffeisen Arena','LASK','Linz',19080, 14.276667, 48.293639, 'lask'),
('Allianz Stadion','SK Rapid','Vienna',28600, 16.265280, 48.197780, 'rapid'),
('Red Bull Arena','Red Bull Salzburg','Wals-Siezenheim',30188, 12.998330, 47.816390, 'rb_salzburg'),
('Stadion Schnabelholz','Rheindorf Altach','Altach',8500, 9.635330, 47.352331, 'altach'),
('Merkur Arena','Sturm Graz','Graz',16364, 15.454567, 47.046125, 'sturm'),
('Profertil Arena Hartberg','TSV Hartberg','Hartberg',4635, 15.977750, 47.277600, 'hartberg'),
('Lavanttal-Arena','Wolfsberger AC','Wolfsberg',7300, 14.851400, 46.825300, 'wac'),
('Tivoli Stadion Tirol','WSG Tirol','Innsbruck',16008, 11.411160, 47.256010, 'tirol');
