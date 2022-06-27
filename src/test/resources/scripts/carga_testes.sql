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
DROP TABLE IF EXISTS Place;
CREATE TABLE Place (
    id integer NOT NULL,
    name varchar(255) NOT NULL,
    slug varchar(255) NOT NULL,
    city varhar(255) NOT NULL,
    state varchar(255) NOT NULL,
    created_at timestamp NOT NULL,
    updated_at timestamp NOT NULL,
    PRIMARY KEY (id)
);