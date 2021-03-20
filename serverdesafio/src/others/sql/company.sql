create table company(
  company_id BIGINT AUTO_INCREMENT,
  name TEXT,
  name_fantasy TEXT,
  phone BIGINT,
  mail TEXT,
  situation TEXT,
  district TEXT,
  street TEXT,
  number_address INT,
  complement TEXT,
  city TEXT,
  uf VARCHAR(2),
  dtopen DATE,
  legal_nature TEXT,
  cnpj BIGINT NOT NULL,
  dtregister TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT company_pk PRIMARY KEY (company_id)
);

