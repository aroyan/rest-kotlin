CREATE TABLE IF NOT EXISTS messages  (
   id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
   text                   VARCHAR      NOT NULL
   );

CREATE TABLE IF NOT EXISTS todos (
    id              VARCHAR(60)     DEFAULT RANDOM_UUID() PRIMARY KEY,
    name            VARCHAR(100)    NOT NULL,
    is_completed    CHAR
)