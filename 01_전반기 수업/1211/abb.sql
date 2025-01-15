use CelebDB;

create table Team(
    team_id INT AUTO_INCREMENT PRIMARY KEY,
    team_name VARCHAR(50) not null,
    city VARCHAR(50),
    created_at timestamp default current_timestamp
);

create table Player(
    player_id int AUTO_INCREMENT PRIMARY KEY,
    player_name varchar(50) not null,
    position varchar(20),
    age int,
    team_id int,
    foreign key (team_id) references Team(team_id) on delete cascade
);

-- 팀 데이터 삽입
INSERT INTO Team (team_name, city) VALUES
('Lions', 'Seoul'),
('Tigers', 'Busan'),
('Bears', 'Incheon');

-- 선수 데이터 삽입 (참조 키 포함)
INSERT INTO Player (player_name, position, age, team_id) VALUES
('Kim Minsoo', 'Pitcher', 25, 1), -- Lions 팀 (team_id = 1)
('Lee Joon', 'Catcher', 28, 1),  -- Lions 팀
('Park Sungwoo', 'Batter', 30, 2), -- Tigers 팀 (team_id = 2)
('Choi Hyunwoo', 'Pitcher', 24, 3); -- Bears 팀 (team_id = 3)