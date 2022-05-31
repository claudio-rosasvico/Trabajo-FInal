-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2022 a las 06:20:27
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Portfolio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase_estudios`
--

CREATE TABLE `clase_estudios` (
  `idClase_estudios` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clase_estudios`
--

INSERT INTO `clase_estudios` (`idClase_estudios`, `Nombre`) VALUES
(1, 'Primario incompleto'),
(2, 'Primario completo'),
(3, 'Secundario incompleto'),
(4, 'Secundario completo'),
(5, 'Universitario incompleto'),
(6, 'Universitario completo'),
(7, 'Posgrado'),
(8, 'Terciario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudios`
--

CREATE TABLE `estudios` (
  `idEstudios` int(11) NOT NULL,
  `Institución` varchar(45) NOT NULL,
  `Título` varchar(45) DEFAULT NULL,
  `Persona_idPersona` int(11) NOT NULL,
  `Clase_estudios_idClase_estudios` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudios`
--

INSERT INTO `estudios` (`idEstudios`, `Institución`, `Título`, `Persona_idPersona`, `Clase_estudios_idClase_estudios`) VALUES
(1, 'Rivadavia', NULL, 1, 2),
(2, 'Nacional', 'Humanitario', 1, 4),
(3, 'UNR', 'Medicina', 1, 6),
(4, 'Medalla Milagrosa', NULL, 2, 2),
(5, 'ENET', 'Tecnico', 2, 4),
(6, 'UNER', 'Trabajo Social', 2, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia_laboral`
--

CREATE TABLE `experiencia_laboral` (
  `idExperiencia_laboral` int(11) NOT NULL,
  `Cargo` varchar(45) NOT NULL,
  `Institución` varchar(45) NOT NULL,
  `Descripción` varchar(200) NOT NULL,
  `Fecha_de_inicio` date NOT NULL,
  `Fecha_final` date DEFAULT NULL,
  `Trabajo_actual?` tinyint(4) NOT NULL,
  `Persona_idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencia_laboral`
--

INSERT INTO `experiencia_laboral` (`idExperiencia_laboral`, `Cargo`, `Institución`, `Descripción`, `Fecha_de_inicio`, `Fecha_final`, `Trabajo_actual?`, `Persona_idPersona`) VALUES
(1, 'Empleado', 'Dirección de Capacitación', 'Organización de talleres. Planificación de capacitaciones.', '2012-01-01', '2016-01-01', 0, 2),
(2, 'Director de Políticas de Apoyo Emprendedor', 'Ministerio de Producción', 'Coordinación y ejecución de Programa Jóvenes Emprendedores', '2016-01-01', '2020-01-01', 0, 2),
(3, 'Director General Desarrollo Emprendedor', 'Ministerio de Producción', 'Coordinación de Politicas de Apoyo Emprendedor', '2020-01-01', NULL, 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Teléfono` varchar(30) DEFAULT NULL,
  `Mail` varchar(30) DEFAULT NULL,
  `Localidad` varchar(30) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `Nombre`, `Apellido`, `Teléfono`, `Mail`, `Localidad`, `Fecha_Nacimiento`) VALUES
(1, 'Paula', 'Cabrera', '3434685', NULL, 'Parana', '1981-08-28'),
(2, 'Claudio', 'Rosas Vico', '3434685339', 'claudio.rosasvico@gmail.com', 'Parana', '1987-07-13');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clase_estudios`
--
ALTER TABLE `clase_estudios`
  ADD PRIMARY KEY (`idClase_estudios`);

--
-- Indices de la tabla `estudios`
--
ALTER TABLE `estudios`
  ADD PRIMARY KEY (`idEstudios`,`Persona_idPersona`,`Clase_estudios_idClase_estudios`),
  ADD KEY `fk_Estudios_Persona` (`Persona_idPersona`),
  ADD KEY `fk_Estudios_Clase_estudios1` (`Clase_estudios_idClase_estudios`);

--
-- Indices de la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD PRIMARY KEY (`idExperiencia_laboral`,`Persona_idPersona`),
  ADD KEY `fk_Experiencia_laboral_Persona1` (`Persona_idPersona`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clase_estudios`
--
ALTER TABLE `clase_estudios`
  MODIFY `idClase_estudios` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `estudios`
--
ALTER TABLE `estudios`
  MODIFY `idEstudios` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  MODIFY `idExperiencia_laboral` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estudios`
--
ALTER TABLE `estudios`
  ADD CONSTRAINT `fk_Estudios_Clase_estudios1` FOREIGN KEY (`Clase_estudios_idClase_estudios`) REFERENCES `clase_estudios` (`idClase_estudios`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Estudios_Persona` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD CONSTRAINT `fk_Experiencia_laboral_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
