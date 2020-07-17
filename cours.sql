-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 16 Mars 2015 à 14:29
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `cours`
--

-- --------------------------------------------------------

--
-- Structure de la table `c`
--

CREATE TABLE IF NOT EXISTS `c` (
  `idE` int(11) NOT NULL,
  `nomU` char(5) NOT NULL,
  `departement` char(30) NOT NULL,
  `decision` text NOT NULL,
  PRIMARY KEY (`idE`,`nomU`,`departement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `c`
--

INSERT INTO `c` (`idE`, `nomU`, `departement`, `decision`) VALUES
(123, 'INSA', 'informatique', 'O'),
(123, 'UCB', 'electronique', 'N'),
(123, 'UCB', 'informatique', 'O'),
(123, 'UJM', 'electronique', 'O'),
(234, 'INSA', 'biologie', 'N'),
(345, 'UJF', 'bioinformatique', 'O'),
(345, 'UJM', 'bioinformatique', 'N'),
(345, 'UJM', 'electronique', 'N'),
(345, 'UJM', 'informatique', 'O'),
(543, 'UJF', 'informatique', 'N'),
(678, 'UCB', 'histoire', 'O'),
(765, 'UCB', 'histoire', 'O'),
(765, 'UJM', 'histoire', 'N'),
(765, 'UJM', 'psychologie', 'O'),
(876, 'UCB', 'informatique', 'N'),
(876, 'UJF', 'biologie', 'O'),
(876, 'UJF', 'biologiemarine', 'N'),
(898, 'INSA', 'informatique', 'O'),
(898, 'UCB', 'informatique', 'O');

-- --------------------------------------------------------

--
-- Structure de la table `e`
--

CREATE TABLE IF NOT EXISTS `e` (
  `idE` int(11) NOT NULL,
  `nomE` text NOT NULL,
  `moyenneLycee` int(11) NOT NULL,
  `effectifLycee` int(11) NOT NULL,
  PRIMARY KEY (`idE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `e`
--

INSERT INTO `e` (`idE`, `nomE`, `moyenneLycee`, `effectifLycee`) VALUES
(123, 'Ana', 20, 1000),
(234, 'Bob', 18, 1500),
(345, 'Chloe', 18, 500),
(456, 'Damien', 20, 1000),
(543, 'Chloe', 17, 2000),
(567, 'Eleonore', 15, 2000),
(654, 'Ana', 20, 1000),
(678, 'Farid', 19, 200),
(765, 'Joana', 15, 1500),
(789, 'Gisele', 17, 800),
(876, 'Irene', 20, 400),
(898, 'Hector', 19, 800);

-- --------------------------------------------------------

--
-- Structure de la table `u`
--

CREATE TABLE IF NOT EXISTS `u` (
  `nomU` char(5) NOT NULL,
  `ville` text NOT NULL,
  `effectif` int(11) NOT NULL,
  PRIMARY KEY (`nomU`),
  KEY `effectif` (`effectif`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `u`
--

INSERT INTO `u` (`nomU`, `ville`, `effectif`) VALUES
('INSA', 'Lyon', 36000),
('UCB', 'Lyon', 15000),
('UJF', 'Grenoble', 10000),
('UJM', 'Saint-Etienne', 21000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
