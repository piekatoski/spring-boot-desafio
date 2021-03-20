create table user(
  user_id BIGINT AUTO_INCREMENT,
  name TEXT NOT NULL,
  mail TEXT NOT NULL,
  password TEXT NOT NULL,
  login VARCHAR(20) NOT NULL,
  company_id BIGINT NOT NULL,
  dtregister TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  active BOOLEAN NOT NULL DEFAULT true,
  CONSTRAINT user_pk PRIMARY KEY (user_id),
  CONSTRAINT user_company_id_fk FOREIGN key (company_id) REFERENCES company(company_id)
);