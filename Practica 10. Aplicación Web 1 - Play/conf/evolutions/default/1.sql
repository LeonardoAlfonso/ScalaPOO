# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  idbook                        bigint auto_increment not null,
  nombre                        varchar(255),
  autor                         varchar(255),
  constraint pk_book primary key (idbook)
);

create table user (
  iduser                        bigint auto_increment not null,
  nombre                        varchar(255),
  autor                         integer not null,
  rol                           varchar(255),
  constraint pk_user primary key (iduser)
);


# --- !Downs

drop table if exists book;

drop table if exists user;

