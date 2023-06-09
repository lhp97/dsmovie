
    create table tb_movie (
       id int8 generated by default as identity,
        count int4,
        image varchar(255),
        score float8,
        title varchar(255),
        primary key (id)
    );

    create table tb_role (
       id int8 generated by default as identity,
        authority varchar(255),
        primary key (id)
    );

    create table tb_score (
       value float8,
        movie_id int8 not null,
        user_id int8 not null,
        primary key (movie_id, user_id)
    );

    create table tb_user (
       id int8 generated by default as identity,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        primary key (id)
    );

    create table tb_user_role (
       user_id int8 not null,
        role_id int8 not null,
        primary key (user_id, role_id)
    );

    alter table if exists tb_user 
       add constraint UK_4vih17mube9j7cqyjlfbcrk4m unique (email);

    alter table if exists tb_score 
       add constraint FK23yhb6qop0f6hnb72hcorm3cv 
       foreign key (movie_id) 
       references tb_movie;

    alter table if exists tb_score 
       add constraint FKl8lgmbrjoav0thqqtqx6vrr4k 
       foreign key (user_id) 
       references tb_user;

    alter table if exists tb_user_role 
       add constraint FKea2ootw6b6bb0xt3ptl28bymv 
       foreign key (role_id) 
       references tb_role;

    alter table if exists tb_user_role 
       add constraint FK7vn3h53d0tqdimm8cp45gc0kl 
       foreign key (user_id) 
       references tb_user;
