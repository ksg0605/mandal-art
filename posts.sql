create table posts
(
    post_id     int,
    foreign key (post_id)
        REFERENCES boards (id) ON UPDATE CASCADE,
    post_number int AUTO_INCREMENT primary key,
    purpose     varchar(32) null
);
