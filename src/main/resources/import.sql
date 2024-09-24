insert into pessoas (nome, cpf, idade, pais_origem) values('FulanoBD', '123.123.123-45',20,'BRASIL');
insert into pessoas (nome, cpf, idade, pais_origem) values('BeltranoBD', '123.123.123-45',35,'EUA');
insert into pessoas (nome, cpf, idade, pais_origem) values('JoaoBD', '123.123.123-45',20,'CANADA');
insert into discentes (id_pessoa, nivel, rm, status) values(1, 'GRADUACAO', 'RM1234', 'ATIVO');
insert into discentes (id_pessoa, nivel, rm, status) values(2, 'GRADUACAO', 'RM4567', 'ATIVO');
insert into discentes (id_pessoa, nivel, rm, status) values(3, 'GRADUACAO', 'RM8910', 'INATIVO');

insert into role(nome) values('ROLE_USER');
insert into role(nome) values('ROLE_ADMIN');

insert into usuario(username,password) values('usuario','$2a$12$VPuOcHACav3IKhuiUE/kQeMuRBkdM/KtF8H3Eo2uZsvdTL08kfVS2');
insert into usuario(username,password) values('administrador','$2a$12$tELcETO7DlLIo6jH5DSjP.jWHYiK8YEgSP86dsPv522huX0rpLGqG');
insert into usuario(username,password) values('jaci','$2a$12$e4lmJnI4erSAftIlzppmXuuuL4yBBhJS2gxACxD3t9lNw8s1E7nLu');

insert into usuario_roles_associacao(id_role,id_usuario) values(1,1);
insert into usuario_roles_associacao(id_role,id_usuario) values(2,2);
insert into usuario_roles_associacao(id_role,id_usuario) values(2,3);

