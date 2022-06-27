create sequence hibernate_sequence start with 1 increment by 1;


/*
 * A place must have the following fields:
 * - name
 * - slug
 * - city
 * - state
 * - created at 
 * - updated at
 */
-- DROP TABLE IF EXISTS Place;
-- CREATE TABLE Place (
--     id integer NOT NULL,
--     name VARCHAR(255) NOT NULL,
--     slug varchar(255) NOT NULL,
--     city varhar(255) NOT NULL,
--     state varchar(255) NOT NULL,
--     created_at timestamp NOT NULL,
--     updated_at timestamp NOT NULL,
--     PRIMARY KEY (id)
-- );

create table Place (
    id bigint not null, 
    city varchar(255), 
    createdAt varchar(255), 
    name varchar(255), 
    slug varchar(255), 
    state varchar(255), 
    updatedAt varchar(255), 
    primary key (id)
);

insert into Place (id, city, createdAt, name, slug, state, updatedAt) values (1, 'São Paulo', '2018-01-01 00:00:00', 'São Paulo', 'sao-paulo', 'SP', '2018-01-01 00:00:00');