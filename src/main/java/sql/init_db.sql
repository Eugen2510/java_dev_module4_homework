CREATE TABLE IF NOT EXISTS worker(
    id IDENTITY PRIMARY KEY,
    name VARCHAR(1000) NOT NULL,
    birthday DATE,
    level VARCHAR (7) NOT NULL,
    salary INT,
    CONSTRAINT check_worker_name
        CHECK (LENGTH(name) >= 2),
    CONSTRAINT check_birthday
        CHECK (YEAR(birthday) > 1900),
    CONSTRAINT check_level
        CHECK(level IN ('Trainee', 'Junior', 'Middle', 'Senior')),
    CONSTRAINT check_salary
        CHECK (salary >= 100 AND salary <= 100000)
);

CREATE TABLE IF NOT EXISTS client(
    id IDENTITY PRIMARY KEY,
    name VARCHAR(1000) NOT NULL,
    CONSTRAINT check_client_name
        CHECK (LENGTH(name) >= 2)
);

CREATE TABLE IF NOT EXISTS project(
    id IDENTITY PRIMARY KEY,
    client_id BIGINT,
    start_date DATE,
    finish_date DATE,
    CONSTRAINT check_interval
        CHECK (start_date < finish_date),
    FOREIGN KEY (client_id) REFERENCES client (id)
);

CREATE TABLE IF NOT EXISTS project_worker(
    project_id BIGINT,
    worker_id BIGINT,
    PRIMARY KEY (project_id, worker_id),
    FOREIGN KEY (project_id) REFERENCES project(id),
    FOREIGN KEY (worker_id) REFERENCES worker(id)
);




