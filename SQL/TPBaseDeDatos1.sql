
----------------------------------------------
--------------------------CREACION DE TABLAS--
-- ===========================================
-- Tabla: Alumno
-- ===========================================
CREATE TABLE alumno (
    n_matr      INT,
    nom         VARCHAR(50) NOT NULL DEFAULT 'desconocido',
    ape         VARCHAR(50) NOT NULL DEFAULT 'desconocido',
    fec_ing     DATE,
    loc         VARCHAR(20) NOT NULL DEFAULT 'desconocido',

    CONSTRAINT pk_alumno 
        PRIMARY KEY (n_matr),

    CONSTRAINT chk_alumno_n_matr 
        CHECK (n_matr > 0),

    CONSTRAINT chk_alumno_fec_ing 
        CHECK (fec_ing BETWEEN '1900-01-01' AND CURRENT_DATE)
);


-- ===========================================
-- Tabla: Materia
-- ===========================================
CREATE TABLE materia (
    id_mat      INT,
    nom         VARCHAR(50) NOT NULL DEFAULT 'desconocido',
    anio_carr   INT NOT NULL,

    CONSTRAINT pk_materia_id_mat 
        PRIMARY KEY (id_mat),

	CONSTRAINT chk_materia_id_mat 
        CHECK (id_mat > 0),

    CONSTRAINT chk_materia_anio_carr 
        CHECK (anio_carr BETWEEN 1 AND 5)
		
);

-- ===========================================
-- Tabla: Departamento
-- ===========================================
CREATE TABLE departamento(
	id_dept		VARCHAR(20) NOT NULL,
	nom_dept	VARCHAR(20) NOT NULL DEFAULT 'desconocido',

	CONSTRAINT pk_departamento	
		PRIMARY KEY (id_dept)
);

-- ===========================================
-- Tabla: Profesor
-- ===========================================
CREATE TABLE profesor (
    leg 		INT NOT NULL,
    nom 		VARCHAR(50) NOT NULL DEFAULT 'desconocido',
    anio_ing 	INT,
	
	CONSTRAINT pk_profesor 
		PRIMARY KEY (leg),
	
	CONSTRAINT chk_profesor_anio_ing 
		CHECK (anio_ing BETWEEN 1950
		AND EXTRACT(YEAR FROM CURRENT_DATE))
);

-- ===========================================
-- Tabla: Universidad
-- ===========================================
CREATE TABLE universidad (
	cod_uni		VARCHAR(6) NOT NULL,
	nom_uni 	VARCHAR(50) NOT NULL DEFAULT 'desconocido',

	CONSTRAINT pk_universidad_cod 
		PRIMARY KEY(cod_uni)
);

-- ===========================================
-- Tabla: Curso
-- ===========================================

CREATE TABLE curso (
    id_mat   INT,
    com      INT,
    anio     INT,
    cuat     INT,
    aula     VARCHAR(50) NOT NULL DEFAULT 'desconocido',

    CONSTRAINT pk_curso 
        PRIMARY KEY (id_mat, com, anio, cuat),

    CONSTRAINT fk_curso_materia 
        FOREIGN KEY (id_mat)
        REFERENCES Materia (id_mat),

    CONSTRAINT chk_curso_id_mat 
        CHECK (id_mat > 0),

    CONSTRAINT chk_curso_com 
        CHECK (com > 0),

    CONSTRAINT chk_curso_cuat 
        CHECK (cuat BETWEEN 1 AND 2)
);
-- ALTER TABLE curso
-- ALTER COLUMN aula TYPE VARCHAR(50);


-- ===========================================
-- Tabla: Carrera
-- ===========================================
CREATE TABLE carrera(
    id_carr     VARCHAR(6) NOT NULL,
    id_dept     VARCHAR(20) NOT NULL,
    nom_carr    VARCHAR(50) NOT NULL DEFAULT 'desconocido',

    CONSTRAINT pk_carrera 
        PRIMARY KEY (id_carr),

    CONSTRAINT fk_carrera_departamento 
        FOREIGN KEY (id_dept)
        REFERENCES departamento (id_dept)
);
-- ALTER TABLE carrera
-- ALTER COLUMN nom_carr TYPE VARCHAR(50);


-- ===========================================
-- Tabla: Se_inscribe
-- Relación N a N entre Alumno y Curso
-- ===========================================
CREATE TABLE se_inscribe (
    n_matr 		INT,
    id_mat 		INT,
    com    		INT,
    anio   		INT,
    cuat   		INT,
	nota_curs	INT,
	
	CONSTRAINT pk_se_inscribe 
		PRIMARY KEY (n_matr, id_mat, com, anio, cuat),
    
	CONSTRAINT fk_se_inscribe_alumno 
		FOREIGN KEY (n_matr) 
		REFERENCES alumno(n_matr),
    
	CONSTRAINT fk_se_inscribe_curso 
		FOREIGN KEY (id_mat, com, anio, cuat)
        REFERENCES curso(id_mat, com, anio, cuat),

	CONSTRAINT chk_se_inscribe_nota_curs 
		CHECK (nota_curs BETWEEN 0 AND 10)
);

-- ALTER TABLE se_inscribe
-- ADD COLUMN nota_curs INT CHECK (nota_curs BETWEEN 0 AND 10);
-- ===========================================
-- Tabla: Titulo
-- Relación N a 1 con Profesor y Universidad
-- ===========================================
CREATE TABLE titulo (
    n_reg_nac   INT,
    nom_tit     VARCHAR(50),
    cod_uni     VARCHAR(50),
    leg         INT,

    CONSTRAINT pk_titulo_n_reg_nac 
        PRIMARY KEY (n_reg_nac),

    CONSTRAINT fk_titulo_profesor 
        FOREIGN KEY (leg)
        REFERENCES profesor (leg),

    CONSTRAINT fk_titulo_universidad
        FOREIGN KEY (cod_uni)
        REFERENCES universidad (cod_uni)
);

-- ===========================================
-- Tabla: Tiene
-- Relación N a N entre Profesor y Curso
-- ===========================================
CREATE TABLE tiene (
    id_mat   	INT,
    leg			INT,
    com     	INT,
    anio		INT,
    cuat		INT,
	
    CONSTRAINT pk_tiene
        PRIMARY KEY (id_mat, com, leg, anio, cuat),

    CONSTRAINT fk_tiene_curso 
        FOREIGN KEY (id_mat, com, anio, cuat)
        REFERENCES curso (id_mat, com, anio, cuat),

    CONSTRAINT fk_tiene_profesor 
        FOREIGN KEY (leg)
        REFERENCES profesor (leg)
);

-- ===========================================
-- Tabla: Posee
-- Relación N a N entre Carrera y Materia
-- ===========================================
CREATE TABLE posee (
    id_carr     VARCHAR(20) NOT NULL,
    id_mat      INT NOT NULL,

    CONSTRAINT pk_posee 
        PRIMARY KEY (id_carr, id_mat),

    CONSTRAINT fk_posee_carrera
        FOREIGN KEY (id_carr)
        REFERENCES carrera (id_carr),

    CONSTRAINT fk_posee_materia
        FOREIGN KEY (id_mat)
        REFERENCES materia (id_mat)
);


--_------------------------------------------------_--


------------------POBLACION DE TABLAS--------------------

-- ===========================================
-- Tabla: Alumno
-- ===========================================
INSERT INTO Alumno (n_matr, nom, ape, fec_ing, loc)
VALUES
-- Alumnos 1-10
    (1,  'Juan',      'Pérez',      '2022-03-10', 'Merlo'),
    (2,  'María',     'Gómez',      '2021-08-15', 'Merlo'),
    (3,  'Lucas',     'Fernández',  '2023-02-01', DEFAULT),
    (4,  'Sofía',     'Martínez',   '2020-07-05', 'Moreno'),
    (5,  'Diego',     'Suárez',     '2024-04-12', 'Moreno'),
    (6,  'Valentina', 'Morales',    '2023-03-02', 'Moreno'),
    (7,  'Nicolás',   'Romero',     '2022-11-23', 'Moreno'),
    (8,  'Camila',    'Rojas',      '2021-06-10', 'Moreno'),
    (9,  'Martín',    'Benítez',    '2023-09-17', 'Moreno'),
    (10, 'Julieta',   'López',      '2020-05-08', 'Merlo'),

-- Alumnos 11-20
    (11, 'Ignacio',   'Vega',       '2021-03-11', 'Moron'),
    (12, 'Agustina',  'Molina',     '2022-07-19', 'Merlo'),
    (13, 'Tomás',     'Sánchez',    '2023-04-25', 'Moreno'),
    (14, 'Carla',     'Ríos',       '2021-02-10', 'San Antonio de Padua'),
    (15, 'Federico',  'Luna',       '2020-12-03', 'San Antonio de Padua'),
    (16, 'Brenda',    'Cáceres',    '2024-02-15', DEFAULT),
    (17, 'Mateo',     'Ponce',      '2022-08-30', 'San Antonio de Padua'),
    (18, 'Paula',     'Leiva',      '2023-01-10', 'Merlo'),
    (19, 'Julián',    'Campos',     '2021-10-09', 'Castelar'),
    (20, 'Romina',    'Navarro',    '2020-06-22', 'Castelar'),

-- Alumnos 21-30
    (21, 'Ezequiel',  'Peralta',    '2023-09-14', 'Merlo'),
    (22, 'Juan',      'Pérez',      '2024-03-19', 'Castelar'),
    (23, 'Lucía',     'Silva',      '2022-11-30', 'San Antonio de Padua'),
    (24, 'Juan',      'Perez',      '2021-01-15', 'Merlo'),
    (25, 'Andrés',    'Domínguez',  '2020-09-07', 'San Antonio de Padua'),
    (26, 'Carolina',  'Herrera',    '2023-07-01', 'San Antonio de Padua'),
    (27, 'Gonzalo',   'Bustos',     '2022-05-10', 'Moron'),
    (28, 'Florencia', 'Correa',     '2024-02-02', 'Merlo'),
    (29, 'Franco',    'Ledesma',     '2023-03-09', 'Merlo'),
    (30, 'Sebastián', 'Acuña',      '2021-08-20', 'Moron'),

-- Alumnos 31-40
    (31, 'Tamara',    'Roldán',     '2023-06-11', 'Moreno'),
    (32, 'Rodrigo',   'Salas',      '2022-09-25', 'Moreno'),
    (33, 'Pilar',     'Vázquez',    '2021-02-28', 'Castelar'),
    (34, 'Maximiliano','Juárez',    '2020-04-03', 'San Antonio de Padua'),
    (35, 'María',     'Gómez',       '2023-10-12', DEFAULT),
    (36, 'Cintia',    'Toledo',     '2024-05-14', 'Castelar'),
    (37, 'Alan',      'Montenegro', '2022-11-01', 'Moron'),
    (38, 'Fernanda',  'Bustamante', '2023-01-09', 'Moron'),
    (39, 'Hernán',    'Aguilar',    '2021-07-04', 'Moron'),
    (40, 'Bruno',     'Torres',     '2020-10-30', 'Moron'),

-- Alumnos 41-50
    (41, 'Martín',    'Benítez',      '2023-12-20', 'Moron'),
    (42, 'Micaela',   'Soria',      '2021-09-13', 'Castelar'),
    (43, 'Axel',      'Gutiérrez',  '2022-02-24', DEFAULT),
    (44, 'Celeste',   'Ibáñez',     '2020-11-05', 'Castelar'),
    (45, 'Franco',    'Ledesma',    '2023-03-18', 'Merlo'),
    (46, 'Juan',      'Fuentes',      '2024-01-22', 'Merlo'),
    (47, 'Tatiana',   'Bravo',      '2022-10-16', 'Merlo'),
    (48, 'Esteban',   'Villar',     '2021-05-12', 'Merlo'),
    (49, 'Noelia',    'Durán',      '2020-08-26', 'Castelar'),
    (50, 'Sol',       'Fernandez',      '2023-06-30', 'Merlo');


-- ===========================================
-- Tabla: Materia
-- ===========================================

-- ===========================================
-- Carrera: Ingeniería en Sistemas (SIS01)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (1,  'Programación I', 2),
    (2,  'Base de Datos I', 2),
    (3,  'Matemática I', 1),
    (4,  'Física I', 1),
    (5,  'Algoritmos y Estructuras de Datos', 2),
    (6,  'Sistemas Operativos', 3),
    (7,  'Ingeniería de Software', 4),
    (8,  'Redes de Computadoras', 3),
    (9,  'Seguridad Informática', 5),
    (10, 'Inteligencia Artificial', 5);

-- ===========================================
-- Carrera: Licenciatura en Informática (SIS02)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (100,  'Programación I', 2),
    (200,  'Base de Datos I', 2),
    (11, 'Análisis Matemático', 1),
    (12, 'Programación Avanzada', 3),
    (13, 'Sistemas Distribuidos', 4),
    (14, 'Inteligencia Artificial Aplicada', 5);

-- ===========================================
-- Carrera: Contador Público (ECO01)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (15, 'Introducción a la Contabilidad', 1),
    (16, 'Matemática Financiera', 2),
    (17, 'Derecho Comercial', 2),
    (18, 'Contabilidad Intermedia', 2),
    (19, 'Impuestos I', 3),
    (20, 'Costos y Presupuestos', 3),
    (21, 'Auditoría', 4),
    (22, 'Finanzas Empresariales', 4),
    (23, 'Gestión Ética y Profesional', 5),
    (24, 'Ética Profesional', 5);

-- ===========================================
-- Carrera: Licenciatura en Administración (ECO02)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (25, 'Administración I', 1),
    (26, 'Economía General', 1),
    (27, 'Estadística I', 2),
    (28, 'Comercialización', 2),
    (29, 'Contabilidad Gerencial', 3),
    (30, 'Gestión de Recursos Humanos', 3),
    (31, 'Dirección Estratégica', 4),
    (32, 'Finanzas II', 4),
    (33, 'Emprendimientos', 5),
    (34, 'Ética Profesional', 5);

-- ===========================================
-- Carrera: Abogacía (DER01)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (35, 'Introducción al Derecho', 1),
    (36, 'Derecho Civil I', 1),
    (37, 'Derecho Penal I', 2),
    (38, 'Derecho Constitucional', 2),
    (39, 'Derecho Laboral', 3),
    (40, 'Derecho Internacional Público', 3),
    (41, 'Derecho Procesal Civil', 4),
    (42, 'Derecho Penal II', 4),
    (43, 'Derecho Comercial', 5),
    (44, 'Derecho Tributario', 5);

-- ===========================================
-- Carrera: Medicina (SAL01)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (45, 'Anatomía I', 1),
    (46, 'Histología', 1),
    (47, 'Fisiología', 2),
    (48, 'Bioquímica', 2),
    (49, 'Patología General', 3),
    (50, 'Farmacología', 3),
    (51, 'Clínica Médica I', 4),
    (52, 'Cirugía I', 4),
    (53, 'Pediatría', 5),
    (54, 'Medicina Preventiva', 5);

-- ===========================================
-- Carrera: Enfermería (SAL02)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (450, 'Anatomía I', 1),
    (460, 'Histología', 1),
    (470, 'Fisiología', 2),
    (480, 'Bioquímica', 2),
    (55, 'Cuidados del Paciente', 3),
    (56, 'Enfermería Clínica', 4),
    (57, 'Gestión en Salud', 5);

-- ===========================================
-- Carrera: Arquitectura (ARQ01)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (58, 'Diseño Arquitectónico I', 1),
    (59, 'Historia de la Arquitectura', 1),
    (60, 'Materiales de Construcción', 2),
    (61, 'Estructuras I', 2),
    (62, 'Instalaciones I', 3),
    (63, 'Diseño Urbano', 3),
    (64, 'Proyecto Ejecutivo', 4),
    (65, 'Gestión de Obras', 4),
    (66, 'Diseño Arquitectónico V', 5),
    (67, 'Urbanismo Avanzado', 5);

-- ===========================================
-- Carrera: Licenciatura en Psicología (PSI01)
-- ===========================================
INSERT INTO Materia (id_mat, nom, anio_carr)
VALUES
    (68, 'Psicología General', 1),
    (69, 'Neuroanatomía', 1),
    (70, 'Desarrollo Infantil', 2),
    (71, 'Psicología Social', 2),
    (72, 'Psicopatología I', 3),
    (73, 'Psicología Clínica', 3),
    (74, 'Evaluación Psicológica', 4),
    (75, 'Orientación Vocacional', 4),
    (76, 'Ética Profesional', 5),
    (77, 'Terapia Cognitiva', 5);


-- ===========================================
-- Tabla: Departamento
-- ===========================================

INSERT INTO departamento (id_dept, nom_dept)
VALUES
    ('SIS', 'Sistemas'),
    ('ECO', 'Ciencias Económicas'),
    ('DER', 'Derecho'),
    ('SAL', 'Ciencias de la Salud'),
    ('ARQ', 'Arquitectura'),
    ('PSI', 'Psicología');

-- ===========================================
-- Tabla: Profesor
-- ===========================================

INSERT INTO profesor (leg, nom, anio_ing)
VALUES
    -- Ingeniería en Sistemas
    (1,  'Carlos Domínguez', 2010),
    (2,  'Laura Méndez', 2015),
    (3,  'Jorge Herrera', 2012),
    (4,  'Silvia Torres', 2018),
    (5,  'Mariano Godoy', 2013),

    -- Contador Público
    (6,  'Ana Rodríguez', 2009),
    (7,  'Roberto Fernández', 2011),
    (8,  'Patricia Díaz', 2016),
    (9,  'Eduardo López', 2014),
    (10, 'Gabriela Muñoz', 2019),

    -- Abogacía
    (11, 'Fernando Gómez', 2008),
    (12, 'Natalia Cabrera', 2013),
    (13, 'Martín Suárez', 2016),
    (14, 'Paula Romero', 2017),
    (15, 'Héctor Rivas', 2010),

    -- Licenciatura en Administración
    (16, 'Claudia Navarro', 2012),
    (17, 'Julio Paredes', 2018),
    (18, 'María Eugenia Torres', 2014),
    (19, 'Ricardo Funes', 2019),
    (20, 'Luciana Díaz', 2016),

    -- Medicina
    (21, 'José Benítez', 2005),
    (22, 'Valeria Acosta', 2011),
    (23, 'Sergio Ledesma', 2017),
    (24, 'Patricia Silva', 2019),
    (25, 'Marcos Roldán', 2010),

    -- Arquitectura
    (26, 'Esteban Quiroga', 2008),
    (27, 'Florencia Maldonado', 2013),
    (28, 'Andrés Cabrera', 2015),
    (29, 'Rocío Vega', 2020),
    (30, 'Hernán Oliva', 2011),

    -- Licenciatura en Psicología
    (31, 'Verónica Paz', 2009),
    (32, 'Pablo Sánchez', 2014),
    (33, 'Carolina Bravo', 2017),
    (34, 'Luis Giménez', 2018),
    (35, 'Elena Torres', 2021);

-- ===========================================
-- Tabla: Universidad
-- ===========================================

INSERT INTO universidad (cod_uni, nom_uni)
VALUES
    ('UTN', 'Universidad Tecnológica Nacional'),
    ('UBA', 'Universidad de Buenos Aires'),
    ('UNLP', 'Universidad Nacional de La Plata'),
    ('UNR', 'Universidad Nacional de Rosario'),
    ('UADE', 'Universidad Argentina de la Empresa'),
    ('UNL', 'Universidad Nacional del Litoral'),
    ('UNER', 'Universidad Nacional de Entre Ríos'),
    ('UNC', 'Universidad Nacional de Córdoba'),
    ('UCES', 'Universidad de Ciencias Empresariales y Sociales'),
    ('UNNE', 'Universidad Nacional del Nordeste'),
    ('UNSAM', 'Universidad Nacional de San Martín'),
    ('USAL', 'Universidad del Salvador'),
    ('HITAL', 'Hospital Italiano de Buenos Aires');
	

-- ===========================================
-- Tabla: Curso
-- ===========================================

-- Ingeniería en Sistemas (id_mat 1–10)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (1, 2, 2023, 1, 'Edificio A - Aula 1.01'),
    (2, 2, 2023, 2, 'Edificio A - Lab Redes'),
	(2, 2, 2024, 2, 'Edificio B - Lab Redes'),
    (2, 1, 2025, 2, 'Edificio B - Laboratorio 1'),
    (3, 2, 2024, 1, 'Edificio B - Laboratorio 1'),
    (4, 4, 2024, 2, 'Edificio A - Aula 3.15'),
    (5, 1, 2024, 1, 'Edificio B - Laboratorio 2'),
    (6, 1, 2025, 2, 'desconocido'),
	(7, 1, 2024, 1, 'Edificio A - Aula 1.04'),
    (7, 2, 2025, 1, 'Edificio A - Aula 1.04'),
	(8, 2, 2025, 2, 'Edificio A - Aula 1.05'),  
    (9, 3, 2024, 1, 'Edificio B - Laboratorio 3'),
    (10, 2, 2023, 2, 'Edificio A - Aula 1.06');
	
-- Contador Público (id_mat 11–20)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (11, 1, 2023, 1, 'Edificio C - Aula 2.01'),
    (12, 1, 2023, 2, 'Edificio C - Aula 2.02'),
    (13, 1, 2024, 1, 'Edificio C - Aula 2.03'),
    (14, 1, 2024, 2, 'Edificio C - Aula 2.04'),
    (15, 1, 2024, 1, 'desconocido'),
    (16, 3, 2025, 2, 'Edificio C - Lab Finanzas'),
    (17, 1, 2025, 1, 'Edificio C - Aula 2.06'),
    (18, 2, 2025, 2, 'Edificio C - Aula 2.07'), 
    (19, 1, 2023, 1, 'Edificio C - Laboratorio 4'),
    (20, 1, 2023, 2, 'Edificio C - Aula 2.08');

-- Abogacía (id_mat 21–30)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (21, 1, 2023, 1, 'Edificio D - Aula 3.01'),
    (22, 1, 2023, 2, 'Edificio D - Aula Magna Derecho'),
    (23, 2, 2024, 1, 'Edificio D - Aula 3.03'), 
    (24, 1, 2024, 2, 'Edificio D - Aula 3.04'),
    (25, 1, 2024, 1, 'desconocido'),
    (26, 2, 2025, 2, 'Edificio D - Aula 3.05'), 
    (27, 2, 2025, 1, 'Edificio D - Aula 3.06'), 
    (28, 2, 2025, 2, 'Edificio D - Aula 3.07'), 
    (29, 1, 2023, 1, 'Edificio D - Aula 3.08'),
    (30, 1, 2023, 2, 'Edificio D - Aula 3.09');

-- Licenciatura en Administración (id_mat 31–40)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (31, 1, 2023, 1, 'Edificio E - Aula 4.01'),
    (32, 1, 2023, 2, 'Edificio E - Aula 4.02'),
    (33, 2, 2024, 1, 'Edificio E - Lab Finanzas'), 
    (34, 2, 2024, 2, 'Edificio E - Aula 4.04'), 
    (35, 1, 2024, 1, 'desconocido'),
    (36, 1, 2025, 2, 'Edificio E - Aula 4.05'),
    (37, 1, 2025, 1, 'Edificio E - Aula 4.06'),
    (38, 2, 2025, 2, 'Edificio E - Aula 4.07'), 
    (39, 1, 2023, 1, 'Edificio E - Laboratorio 5'),
    (40, 1, 2023, 2, 'Edificio E - Aula 4.08');

-- Medicina (id_mat 41–50)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (41, 1, 2023, 1, 'Edificio F - Aula 5.01'),
    (42, 2, 2023, 2, 'Edificio F - Lab Anatomía'), 
    (43, 1, 2024, 1, 'Edificio F - Aula 5.03'),
    (44, 2, 2024, 2, 'Edificio F - Aula 5.04'), 
    (45, 1, 2024, 1, 'Edificio F - Laboratorio 6'),
    (46, 1, 2025, 2, 'Edificio F - Aula 5.05'),
    (47, 1, 2025, 1, 'Edificio F - Aula 5.06'),
    (48, 2, 2025, 2, 'desconocido'),
    (49, 1, 2023, 1, 'Edificio F - Aula 5.07'),
    (50, 1, 2023, 2, 'Edificio F - Aula 5.08');

-- Arquitectura (id_mat 51–60)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (51, 1, 2023, 1, 'Edificio G - Aula 6.01'),
    (52, 2, 2023, 2, 'Taller Arquitectura'), 
    (53, 1, 2024, 1, 'Edificio G - Taller 2'),
    (54, 1, 2024, 2, 'Edificio G - Aula 6.02'),
    (55, 1, 2024, 1, 'desconocido'),
    (56, 1, 2025, 2, 'Edificio G - Aula 6.03'),
    (57, 1, 2025, 1, 'Edificio G - Aula 6.04'),
    (58, 1, 2025, 2, 'Edificio G - Aula 6.05'),
    (59, 1, 2023, 1, 'Edificio G - Aula 6.06'),
    (60, 1, 2023, 2, 'Edificio G - Aula 6.07');

-- Licenciatura en Psicología (id_mat 61–70)
INSERT INTO curso (id_mat, com, anio, cuat, aula) 
VALUES
    (61, 1, 2023, 1, 'Edificio H - Aula 7.01'),
    (62, 2, 2023, 2, 'Edificio H - Aula 7.02'), 
    (63, 1, 2024, 1, 'Edificio H - Lab Psicología'),
    (64, 2, 2024, 2, 'Edificio H - Aula 7.04'), 
    (65, 1, 2024, 1, 'Edificio H - Aula 7.05'),
    (66, 1, 2025, 2, 'Edificio H - Aula 7.06'),
    (67, 1, 2025, 1, 'Edificio H - Aula 7.07'),
    (68, 2, 2025, 2, 'desconocido'), 
    (69, 1, 2023, 1, 'Edificio H - Aula 7.08'),
    (70, 1, 2023, 2, 'Edificio H - Aula 7.09');

-- ===========================================
-- Tabla: Carrera
-- ===========================================

INSERT INTO carrera (id_carr, id_dept, nom_carr)
VALUES
    ('SIS01', 'SIS', 'Ingeniería en Sistemas'),
    ('SIS02', 'SIS', 'Lic. en Informática'),
    ('ECO01', 'ECO', 'Contador Público'),
    ('ECO02', 'ECO', 'Lic. en Administración'),
    ('DER01', 'DER', 'Abogacía'),
    ('SAL01', 'SAL', 'Medicina'),
    ('SAL02', 'SAL', 'Enfermería'),
    ('ARQ01', 'ARQ', 'Arquitectura'),
    ('PSI01', 'PSI', 'Lic. en Psicología');

-- DROP TABLE IF EXISTS se_inscribe;

-- ===========================================
-- Tabla: se_inscribe 
-- ===========================================
-- ===========================================
-- Ingeniería en Sistemas (id_mat 1–10)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (1, 2, 2, 2023, 2, 2),(1, 2, 1, 2025, 2, 7), 
	(1, 5, 1, 2024, 1, 7), (1, 7, 2, 2025, 1, 8),
    (4, 6, 1, 2025, 2, 5), (4, 2, 1, 2025, 2, 6), 
	(4, 8, 2, 2025, 2, 8), (4, 7, 2, 2025, 1, 6),
    (9, 7, 2, 2025, 1, 9), (9, 9, 3, 2024, 1, 4), 
	(9, 2, 2, 2024, 2, 8), (9, 10, 2, 2023, 2, 7),
    (15, 1, 2, 2023, 1, 6), (15, 16, 3, 2025, 2, 5), 
	(15, 5, 1, 2024, 1, 8), (15, 7, 2, 2025, 1, 8),
    (21, 2, 2, 2023, 2, 0), (21, 7, 1, 2024, 1, 7),
	(21, 2, 2, 2024, 2, 9),(21, 8, 2, 2025, 2, 4),
    (27, 6, 1, 2025, 2, 9), (27, 9, 3, 2024, 1, 6), 
	(27, 7, 2, 2025, 1, 5), (27, 8, 2, 2025, 2, 6), 
    (33, 5, 1, 2024, 1, 8), (33, 10, 2, 2023, 2, 7),
	(33, 8, 2, 2025, 2, 7),
    (38, 8, 2, 2025, 2, 3), (38, 9, 3, 2024, 1, 5);

-- ===========================================
-- Contador Público (id_mat 11–20)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (2, 11, 1, 2023, 1, 7), (2, 12, 1, 2023, 2, 6),
    (8, 14, 1, 2024, 2, 8), (8, 15, 1, 2024, 1, 5), 
	(8, 16, 3, 2025, 2, 7),
    (13, 13, 1, 2024, 1, 9), (13, 17, 1, 2025, 1, 6),
    (18, 18, 2, 2025, 2, 4), (18, 19, 1, 2023, 1, 7),
    (24, 11, 1, 2023, 1, 8), (24, 20, 1, 2023, 2, 6),
    (30, 12, 1, 2023, 2, 5), (30, 13, 1, 2024, 1, 6), 
	(30, 15, 1, 2024, 1, 9),
    (36, 17, 1, 2025, 1, 7), (36, 18, 2, 2025, 2, 8);

-- ===========================================
-- Abogacía (id_mat 21–30)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (3, 21, 1, 2023, 1, 6), (3, 22, 1, 2023, 2, 7),
    (7, 23, 2, 2024, 1, 8), (7, 24, 1, 2024, 2, 5),
    (14, 25, 1, 2024, 1, 6), (14, 26, 2, 2025, 2, 7), 
	(14, 27, 2, 2025, 1, 9),
    (19, 28, 2, 2025, 2, 6), (19, 29, 1, 2023, 1, 5), 
	(19, 30, 1, 2023, 2, 7),
    (26, 21, 1, 2023, 1, 8), (26, 23, 2, 2024, 1, 6),
    (32, 22, 1, 2023, 2, 7), (32, 24, 1, 2024, 2, 5), 
	(32, 28, 2, 2025, 2, 8),
    (40, 25, 1, 2024, 1, 6), (40, 26, 2, 2025, 2, 7);

-- ===========================================
-- Licenciatura en Administración (id_mat 31–40)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (5, 31, 1, 2023, 1, 7), (5, 32, 1, 2023, 2, 6), 
	(5, 34, 2, 2024, 2, 8),
    (10, 33, 2, 2024, 1, 5), (10, 35, 1, 2024, 1, 6),
	(10, 36, 1, 2025, 2, 6),
    (17, 36, 1, 2025, 2, 7), (17, 37, 1, 2025, 1, 8),
    (22, 38, 2, 2025, 2, 6), (22, 39, 1, 2023, 1, 5),
    (25, 31, 1, 2023, 1, 7), (25, 33, 2, 2024, 1, 6),
	(25, 35, 1, 2024, 1, 8),
    (31, 34, 2, 2024, 2, 5), (31, 36, 1, 2025, 2, 7),
    (37, 37, 1, 2025, 1, 6), (37, 38, 2, 2025, 2, 8), 
	(37, 39, 1, 2023, 1, 7), (37, 36, 1, 2025, 2, 8),
    (45, 31, 1, 2023, 1, 6), (45, 32, 1, 2023, 2, 7);

-- ===========================================
-- Medicina (id_mat 41–50)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (6, 41, 1, 2023, 1, 7), (6, 43, 1, 2024, 1, 6),
    (12, 42, 2, 2023, 2, 5), (12, 44, 2, 2024, 2, 8), 
	(12, 45, 1, 2024, 1, 6),
    (20, 46, 1, 2025, 2, 7), (20, 47, 1, 2025, 1, 8),
    (28, 48, 2, 2025, 2, 6), (28, 49, 1, 2023, 1, 5),
    (34, 41, 1, 2023, 1, 7), (34, 42, 2, 2023, 2, 6), 
	(34, 44, 2, 2024, 2, 5),
    (39, 45, 1, 2024, 1, 8), (39, 46, 1, 2025, 2, 7),
    (44, 47, 1, 2025, 1, 6), (44, 48, 2, 2025, 2, 7), 
	(44, 49, 1, 2023, 1, 8);

-- ===========================================
-- Arquitectura (id_mat 51–60)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (11, 51, 1, 2023, 1, 7), (11, 52, 2, 2023, 2, 6),
    (16, 53, 1, 2024, 1, 8), (16, 55, 1, 2024, 1, 5),
    (23, 54, 1, 2024, 2, 6), (23, 56, 1, 2025, 2, 7),
    (29, 57, 1, 2025, 1, 8), (29, 58, 1, 2025, 2, 5),
    (41, 51, 1, 2023, 1, 7), (41, 54, 1, 2024, 2, 6),
    (46, 55, 1, 2024, 1, 7), (46, 56, 1, 2025, 2, 6),
    (48, 57, 1, 2025, 1, 8);

-- ===========================================
-- Licenciatura en Psicología (id_mat 61–70)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs) 
VALUES
    (42, 61, 1, 2023, 1, 6), (42, 63, 1, 2024, 1, 7),
    (43, 62, 2, 2023, 2, 5), (43, 65, 1, 2024, 1, 8),
    (47, 66, 1, 2025, 2, 6), (47, 67, 1, 2025, 1, 7),
    (49, 68, 2, 2025, 2, 5),
    (50, 69, 1, 2023, 1, 6), (50, 70, 1, 2023, 2, 7);

-- ===========================================
-- Materias optativas o mixtas (casos especiales)
-- ===========================================
INSERT INTO se_inscribe (n_matr, id_mat, com, anio, cuat, nota_curs)
VALUES
    (5, 11, 1, 2023, 1, 7),    
    (9, 35, 1, 2024, 1, 6),    
    (17, 41, 1, 2023, 1, 8),   
    (24, 21, 1, 2023, 1, 5),   
    (31, 52, 2, 2023, 2, 7),   
    (38, 67, 1, 2025, 1, 6);   

-- ===========================================
-- Tabla: Titulo
-- ===========================================

-- ===========================================
-- Ingeniería en Sistemas (leg 1–5)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(1001,'Ingeniero en Sistemas de Información','UTN',1),
	(1002,'Magíster en Ciencia de Datos','UBA',1),
	(1003,'Ingeniero en Computación','UNLP',2),
	(1004,'Doctor en Ciencias de la Computación','UBA',2),
	(1005,'Ingeniero Electrónico','UTN',3),
	(1006,'Licenciado en Informática','UNR',4),
	(1007,'Magíster en Ingeniería de Software','UNLP',4),
	(1008,'Especialista en Seguridad Informática','UBA',4),
	(1009,'Licenciado en Informática','UADE',5);

-- ===========================================
-- Contador Público (leg 6–10)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(2001,'Contador Público Nacional','UBA',6),
	(2002,'Posgrado en Auditoría','UNL',7),
	(2003,'Licenciado en Administración','UNER',7),
	(2004,'Magíster en Finanzas','UBA',7),
	(2005,'Especialista en Tributación','UNR',8),
	(2006,'Diplomatura en Control de Gestión','UADE',9),
	(2007,'Licenciado en Administración Pública','UBA',10);

-- ===========================================
-- Abogacía (leg 11–15)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(3001,'Abogado','UBA',11),
	(3002,'Especialista en Derecho Penal','UNLP',11),
	(3003,'Doctor en Derecho','UNC',12),
	(3004,'Abogado','UCES',13),
	(3005,'Escribano Público','UNNE',13),
	(3006,'Magíster en Derecho Constitucional','UBA',14),
	(3007,'Diplomado en Derecho Laboral','UNR',15);

-- ===========================================
-- Licenciatura en Administración (leg 16–20)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(4001,'Licenciado en Administración','UNR',16),
	(4002,'Postgrado en Recursos Humanos','UNSAM',17),
	(4003,'Magíster en Dirección Estratégica','UBA',17),
	(4004,'Especialista en Gestión Empresarial','UNLP',18),
	(4005,'Diplomado en Emprendimientos','UADE',19),
	(4006,'Licenciado en Economía','UBA',20),
	(4007,'Master en Finanzas Corporativas','UNR',20);

-- ===========================================
-- Medicina (leg 21–25)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(5001,'Médico','UBA',21),
	(5002,'Especialista en Clínica Médica','HITAL',21),
	(5003,'Magíster en Salud Pública','UBA',22),
	(5004,'Médico Cirujano','UNR',23),
	(5005,'Especialista en Pediatría','UNLP',24),
	(5006,'Doctor en Medicina Preventiva','UBA',25);

-- ===========================================
-- Arquitectura (leg 26–30)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(6001,'Arquitecto','UBA',26),
	(6002,'Doctor en Urbanismo','UNLP',27),
	(6003,'Magíster en Diseño Urbano','UNC',28),
	(6004,'Arquitecto','UNNE',29),
	(6005,'Posgrado en Gestión de Obras','UTN',30);

-- ===========================================
-- Licenciatura en Psicología (leg 31–35)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(7001,'Licenciado en Psicología','UBA',31),
	(7002,'Posgrado en Neuropsicología','USAL',32),
	(7003,'Magíster en Psicología Clínica','UNR',33),
	(7004,'Especialista en Psicopatología','UBA',34),
	(7005,'Diplomado en Evaluación Psicológica','UNLP',35);

-- ===========================================
-- Profesores con títulos de otras carreras (optativas/extras)
-- ===========================================
INSERT INTO titulo (n_reg_nac, nom_tit, cod_uni, leg) 
VALUES
	(8001,'Licenciado en Educación','UNSAM',3),   
	(8002,'Doctor en Filosofía','UBA',6),        
	(8003,'Licenciado en Matemática','UBA',14), 
	(8004,'Ingeniero Industrial','UTN',1);       


-- ===========================================
-- Tabla: Tiene
-- ===========================================

-- Ingeniería en Sistemas (id_mat 1–10)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (1, 2, 1, 2023, 1), (2, 2, 1, 2023, 2), (3, 2, 1, 2024, 1),			
    (4, 4, 2, 2024, 2), (5, 1, 2, 2024, 1),  							
    (6, 1, 3, 2025, 2), (7, 2, 3, 2025, 1),  							
    (8, 2, 4, 2025, 2),  												
    (9, 3, 5, 2024, 1), (10, 2, 5, 2023, 2); 							

-- Contador Público (id_mat 11–20)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (11, 1, 6, 2023, 1), (12, 1, 6, 2023, 2),  							
    (13, 1, 7, 2024, 1), (14, 1, 7, 2024, 2),  							
    (15, 1, 8, 2024, 1),  												
    (16, 3, 9, 2025, 2), (17, 1, 9, 2025, 1),  						
    (18, 2, 10, 2025, 2), 												
    (19, 1, 11, 2023, 1), (20, 1, 11, 2023, 2);	 						

-- Abogacía (id_mat 21–30)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (21, 1, 11, 2023, 1), (22, 1, 11, 2023, 2), (23, 2, 11, 2024, 1),	
    (24, 1, 12, 2024, 2), 												
    (25, 1, 13, 2024, 1),(26, 2, 13, 2025, 2), 						
    (27, 2, 14, 2025, 1), 											
    (28, 2, 15, 2025, 2); 												

-- Licenciatura en Administración (id_mat 31–40)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (31, 1, 16, 2023, 1), (32, 1, 16, 2023, 2), 						
    (33, 2, 17, 2024, 1), 												
    (34, 2, 18, 2024, 2), (35, 1, 18, 2024, 1), 						
    (36, 1, 19, 2025, 2), 												
    (37, 1, 20, 2025, 1); 												

-- Medicina (id_mat 41–50)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (41, 1, 21, 2023, 1), (42, 2, 21, 2023, 2), 						
    (43, 1, 22, 2024, 1), 												
    (44, 2, 23, 2024, 2), (45, 1, 23, 2024, 1), 						
    (46, 1, 24, 2025, 2), 												
    (47, 1, 25, 2025, 1), 												
    (48, 2, 26, 2025, 2); 												

-- Arquitectura (id_mat 51–60)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (51, 1, 26, 2023, 1), (52, 2, 26, 2023, 2), 						
    (53, 1, 27, 2024, 1), 											
    (54, 1, 28, 2024, 2), 											
    (55, 1, 29, 2024, 1), 												
    (56, 1, 30, 2025, 2), (57, 1, 30, 2025, 1); 						

-- Psicología (id_mat 61–70)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (61, 1, 31, 2023, 1), (62, 2, 31, 2023, 2),						 	
    (63, 1, 32, 2024, 1), 												
    (64, 2, 33, 2024, 2), 												
    (65, 1, 34, 2024, 1), 												
    (66, 1, 35, 2025, 2); 											

-- Materias optativas (cruzadas)
INSERT INTO tiene (id_mat, com, leg, anio, cuat) 
VALUES
    (8, 2, 16, 2025, 2),  											
    (10, 2, 17, 2023, 2), 												
    (22, 1, 18, 2023, 2), 												
    (31, 1, 18, 2023, 1); 												



-- ===========================================
-- Tabla: Posee
-- ===========================================

-- Ingeniería en Sistemas (SIS01)
INSERT INTO posee (id_carr, id_mat)
VALUES 
    ('SIS01', 1), ('SIS01', 2), ('SIS01', 3), ('SIS01', 4),
    ('SIS01', 5), ('SIS01', 6), ('SIS01', 7), ('SIS01', 8),
    ('SIS01', 9), ('SIS01', 10);

-- Licenciatura en Informática (SIS02)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('SIS02', 1), ('SIS02', 2), ('SIS02', 11), ('SIS02', 12),
    ('SIS02', 13), ('SIS02', 14);

-- Contador Público (ECO01)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('ECO01', 15), ('ECO01', 16), ('ECO01', 17), ('ECO01', 18),
    ('ECO01', 19), ('ECO01', 20), ('ECO01', 21), ('ECO01', 22),
    ('ECO01', 23), ('ECO01', 24);

-- Licenciatura en Administración (ECO02)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('ECO02', 25), ('ECO02', 26), ('ECO02', 27), ('ECO02', 28),
    ('ECO02', 29), ('ECO02', 30), ('ECO02', 31), ('ECO02', 32),
    ('ECO02', 33), ('ECO02', 34);

-- Abogacía (DER01)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('DER01', 35), ('DER01', 36), ('DER01', 37), ('DER01', 38),
    ('DER01', 39), ('DER01', 40), ('DER01', 41), ('DER01', 42),
    ('DER01', 43), ('DER01', 44);

-- Medicina (SAL01)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('SAL01', 45), ('SAL01', 46), ('SAL01', 47), ('SAL01', 48),
    ('SAL01', 49), ('SAL01', 50), ('SAL01', 51), ('SAL01', 52),
    ('SAL01', 53), ('SAL01', 54);

-- Enfermería (SAL02)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('SAL02', 45), ('SAL02', 46), ('SAL02', 47), ('SAL02', 48),
    ('SAL02', 55), ('SAL02', 56), ('SAL02', 57);

-- Arquitectura (ARQ01)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('ARQ01', 58), ('ARQ01', 59), ('ARQ01', 60), ('ARQ01', 61),
    ('ARQ01', 62), ('ARQ01', 63), ('ARQ01', 64), ('ARQ01', 65),
    ('ARQ01', 66), ('ARQ01', 67);

-- Licenciatura en Psicología (PSI01)
INSERT INTO posee (id_carr, id_mat)
VALUES
    ('PSI01', 68), ('PSI01', 69), ('PSI01', 70), ('PSI01', 71),
    ('PSI01', 72), ('PSI01', 73), ('PSI01', 74), ('PSI01', 75),
    ('PSI01', 76), ('PSI01', 77);


-----------------------------------CONSULTAS------------------------
----------------------------A---------------------------
--Listar los datos completos de las materias, la cantidad de alumnos
--que aprobaron el final este año y
--la cantidad de alumnos que aprobaron la materia el final el año pasado.
--Solo considerar materias que este año cuenten con más de 3 finales aprobados.





SELECT DISTINCT
    m.*, 
    si.anio, 
       (SELECT COUNT(*)
        FROM se_inscribe si3
        WHERE si3.id_mat = m.id_mat
          AND si3.anio = 2025
          AND si3.nota_curs >= 4
    	) AS cant_aprob_2025,
		(SELECT COUNT(*)
        FROM se_inscribe si4
        WHERE si4.id_mat = m.id_mat
          AND si4.anio = 2024
          AND si4.nota_curs >= 4
    	) AS cant_aprob_2024
FROM materia m
JOIN se_inscribe si 
    ON si.id_mat = m.id_mat
    AND si.anio = 2025
    AND si.nota_curs >= 4
WHERE (
    SELECT COUNT(*)
    FROM se_inscribe si2
    WHERE si2.id_mat = m.id_mat
    AND si2.anio = 2025
    AND si2.nota_curs >= 4
) > 3


----------------B)--------------------------------------------------
--Listar los datos completos de el o los alumnos que más finales aprobaron este año.  



SELECT a.*, ap.cant_aprob
FROM alumno a
JOIN ( SELECT n_matr, COUNT(*) AS cant_aprob
       FROM se_inscribe
       WHERE anio = 2025
       AND nota_curs >= 4
       GROUP BY n_matr) ap ON a.n_matr = ap.n_matr
WHERE ap.cant_aprob = (
      SELECT MAX(contador)
      FROM (
          SELECT COUNT(*) AS contador
          FROM se_inscribe
          WHERE anio = 2025 AND nota_curs >= 4
          GROUP BY n_matr)
		  );


-----------------------------------------C-----------------------------
------------
-- Alumnos que aprobaron más finales en 2025 que en 2024, 
--mostrando la cantidad de finales aprobados en cada uno de 
--esos años junto con sus datos personales.


SELECT
al.n_matr AS alumno,
al.nom AS nombre,
al.ape AS apellido,
al.fec_ing AS ingreso,
al.loc AS localidad,

(SELECT COUNT(*)
FROM se_inscribe si
JOIN curso c
ON si.id_mat = c.id_mat
WHERE si.n_matr = al.n_matr
AND si.nota_curs >= 4
AND c.anio = 2025) AS aprobados_2025,
(SELECT COUNT(*)
FROM se_inscribe si
JOIN curso c
ON si.id_mat = c.id_mat
WHERE si.n_matr = al.n_matr
AND si.nota_curs >= 4
AND c.anio = 2024) AS aprobados_2024
FROM alumno al
WHERE
(SELECT COUNT(*)
FROM se_inscribe si
JOIN curso c
ON si.id_mat = c.id_mat
WHERE si.n_matr = al.n_matr
AND si.nota_curs >= 4
AND c.anio = 2025)
>
(SELECT COUNT(*)
FROM se_inscribe si
JOIN curso c
ON si.id_mat = c.id_mat
WHERE si.n_matr = al.n_matr
AND si.nota_curs >= 4
AND c.anio = 2024)
ORDER BY aprobados_2025 DESC;

-----------------------------------------D-----------------------------
------------
-- Localidades que no poseen alumnos cursando BD1 en 2025


SELECT
a.loc AS localidad,
n_matr AS alumno,
ape AS apellido,
nom AS nombre,
fec_ing AS ingreso
FROM alumno a
WHERE NOT EXISTS (
SELECT 'cursan BD1 en 2025'
FROM se_inscribe si
JOIN curso c
ON si.id_mat = c.id_mat
JOIN materia m
ON m.id_mat = c.id_mat
WHERE si.n_matr = a.n_matr
AND si.anio = 2025
AND m.nom ILIKE '%base de datos i%'
)
ORDER BY a.loc ASC;

--------------------------------E-------------------------------------
-- Listar los datos completos de las materias que tienen
--más inscriptos este año que la cantidad de 
--alumnos inscriptos en "Base de Datos I".  


SELECT  m.id_mat, m.nom, m.anio_carr, COUNT( DISTINCT
si.n_matr) AS inscriptos
FROM se_inscribe si
INNER JOIN curso c ON si.id_mat = c.id_mat AND si.anio =2025 AND
c.anio = 2025
INNER JOIN materia m ON c.id_mat = m.id_mat
GROUP BY m.id_mat, m.nom, m.anio_carr
HAVING COUNT( DISTINCT si.n_matr) >(SELECT COUNT(*) FROM se_inscribe si
INNER JOIN cursos c ON si.id_mat = c.id_mat AND si.anio=2025 AND c.anio = 2025
INNER JOIN materias m ON c.id_mat = m.id_mat
WHERE m.nom='Base de Datos I');


-------------------F-------------------------------------------------
--Listar los alumnos que tienen el mismo nombre y 
--apellido que algún otro alumno. No usar cláusula COUNT.


SELECT  a.*
FROM alumno a
INNER JOIN alumno b
ON a.nom = b.nom
AND a.ape = b.ape
AND a.n_matr <> b.n_matr;


































