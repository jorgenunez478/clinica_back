-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-09-2023 a las 05:32:20
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `appointment_type`
--

CREATE TABLE `appointment_type` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `description` longtext NOT NULL,
  `duration_minutes` int(11) NOT NULL,
  `color_hex_code` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `appointment_type`
--

INSERT INTO `appointment_type` (`id`, `name`, `description`, `duration_minutes`, `color_hex_code`) VALUES
(1, 'Cita de revisión odontológica primera vez', 'Cita de revisión odontológica primera vez', 30, '00b5e2'),
(3, 'Cita de revisión odontológica control', 'Cita de revisión odontológica control', 22, '20b4e2'),
(4, 'Cita de revisión odontológica segunda vez', 'Cita de revisión odontológica segunda vez', 45, '01c1e2');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `appointment_type`
--
ALTER TABLE `appointment_type`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `appointment_type`
--
ALTER TABLE `appointment_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
