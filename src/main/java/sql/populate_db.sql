INSERT INTO worker (name, birthday, level, salary)
VALUES
('Victor Chumak', '1998-12-01', 'Middle', 2500),
('Devid Famer', '1966-05-20', 'Senior', 10000),
('Bob Dillan', '1988-11-02', 'Trainee', 300),
('Tatiana Prikhodko', '2003-12-12', 'Junior', 700),
('Vsevjlod Kirilov', '1989-10-25', 'Junior', 850),
('Mary Janne', '1990-03-17', 'Middle', 3000),
('Rostislav Nikitin', '2001-12-22', 'Junior', 600),
('Ilon Musk', '1970-07-14', 'Senior', 8500),
('Ivan Piddubniy', '1966-05-20', 'Senior', 80000),
('Ilon Musk', '1970-03-17', 'Senior', 80000),
('Katerina Petrova', '1989-06-17', 'Trainee', 500),
('Some Man', '1990-01-02', 'Junior', 750);

INSERT INTO client (name)
VALUES
('WOG'),
('PRIVAT BANK'),
('The Best Ukrain Company'),
('FOP Sereduk'),
('Marshal corp'),
('NBA'),
('Amazon');

INSERT INTO project (client_id, start_date, finish_date)
VALUES
(1, '2020-02-03', '2021-11-22'),
(3, '2018-02-03', '2022-12-31'),
(1, '2021-10-18', '2021-11-19'),
(4, '2023-01-01', '2025-05-14'),
(2, '2010-11-11', '2014-12-20'),
(7, '2018-07-03', '2023-09-01'),
(5,  '2017-04-03', '2024-01-01'),
(5, '2021-11-22', '2022-03-03'),
(1, '2014-12-25', '2018-07-03'),
(6, '2011-10-22', '2012-03-03'),
(3, '2017-11-22', '2022-03-03');

INSERT INTO project_worker
VALUES
(1,2),
(1,5),
(1,9),
(2,3),
(2,7),
(2,1),
(3,12),
(4,6),
(4,9),
(5,1),
(5, 11),
(6, 8),
(7,12),
(7,3),
(7, 5),
(8,8),
(8, 12),
(9,1),
(9,5),
(10,4),
(11,2);