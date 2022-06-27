

/*
 * A place must have the following fields:
 * - name
 * - slug
 * - city
 * - state
 * - created at 
 * - updated at
 */


create table Place (
    id int8 NOT NULL GENERATED by default AS IDENTITY,
    city varchar(255), 
    createdAt timestamp, 
    name varchar(255), 
    slug varchar(255), 
    state varchar(255), 
    updatedAt timestamp, 
    primary key (id)
);

INSERT INTO Place (city, createdAt, name, slug, state, updatedAt) VALUES ('São Paulo', '2018-01-01 00:00:00', 'São Paulo', 'sao-paulo', 'SP', '2018-01-01 00:00:00');
create sequence hibernate_sequence start with 2 increment by 1;