create table posts
(
    post_id     int,
    foreign key (post_id)
        REFERENCES boards (id) ON UPDATE CASCADE,
    post_number int         null,
    purpose     varchar(32) null
);
