-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Apr 20, 2022 alle 11:47
-- Versione del server: 10.4.22-MariaDB
-- Versione PHP: 8.0.13


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cloud2022`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `scienziati`
--

CREATE TABLE `scienziati` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `_date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `scienziati`
--

INSERT INTO `scienziati` (`id`, `nome`, `_date`) VALUES
(1, 'Albert Einstein (1879 - 1955)', NULL),
(2, 'Isaac Newton (1643 - 1727)', NULL),
(3, 'Stephen Hawking (1942- 2018)', NULL),
(4, 'Marie Curie (1867 - 1934)', NULL),
(5, 'Galileo Galilei (1564 - 1642)', NULL),
(6, 'Blaise Pascal (1623 - 1662)', NULL),
(7, 'Charles Darwin (1809 - 1882)', NULL),
(8, 'Nicolaus Copernico (1473 - 1543)', NULL),
(9, 'Benjamin Franklin (1706 - 1790)', NULL),
(10, 'Alexander Fleming (1881 - 1955)', NULL),
(11, 'Johannes Kepler (1571 - 1630)', NULL),
(12, 'Louis Pasteur (1822 - 1895)', NULL),
(13, 'Gregor Mendel (1822 - 1884)', NULL),
(14, 'Michael Faraday (1791 - 1867)', NULL),
(15, 'Max Planck (1858 - 1947)', NULL),
(16, 'Thomas Alva Edison (1847 - 1931)', NULL),
(17, 'Archimede di Siracusa (287 a.C. - 212 a.C.)', NULL),
(18, 'Leonardo da Vinci (1452 - 1519)', NULL),
(19, 'Louis Gay-Lussac (1778 - 1850)', NULL),
(20, 'Nikola Tesla (1856 - 1943)', NULL),
(21, 'Rudolf Hertz (1857 - 1894)', NULL),
(22, 'Ibn al-Haytham (964 - 1040)', NULL),
(23, 'Robert Hooke (1635 - 1703)', NULL),
(24, 'Santiago Ramón y Cajal (1852 - 1934)', NULL),
(25, 'Aristotele (384 a.C.-322 a.C.)', NULL),
(26, 'Pierre Simon Laplace (1749 - 1827)', NULL),
(27, 'Miguel Servet (1509 - 1553)', NULL),
(28, 'Erwin Schrodinger (1887 - 1961)', NULL),
(29, 'Severo Ochoa (1905 - 1993)', NULL),
(30, 'Karl Landsteiner (1868 - 1943)', NULL),
(31, 'Alfred Nobel (1833 - 1896)', NULL),
(32, 'Werner Karl Heisenberg (1901 - 1976)', NULL),
(33, 'Carl Friedrich Gauss (1777 - 1855)', NULL),
(34, 'Tim Berners-Lee (1955)', NULL),
(35, 'Pitagora (579 a.C. - 475 a.C.)', NULL),
(36, 'Sofia Kovalévskaya (1850 - 1891)', NULL),
(37, 'John Dalton (1766 - 1844)', NULL),
(38, 'James Dewey Watson (1928)', NULL),
(39, 'René Descartes (1596 - 1650)', NULL),
(40, 'Robert Boyle (1627 - 1691)', NULL),
(41, 'Gottfried Leibniz', NULL),
(42, 'Peter Higgs', NULL),
(43, 'Georg Simon Ohm', NULL),
(44, 'Isacco Asimov', NULL),
(45, 'Alexander Graham Bell', NULL),
(46, 'Niels Bohr', NULL),
(47, 'Mario Molina', NULL),
(48, 'Alessandro Volta', NULL),
(49, 'Guillermo Marconi', NULL),
(50, 'Joseph Fourier', NULL),
(51, 'Richard Feynman', NULL),
(52, 'Ernest Rutherford', NULL),
(53, 'Francis Crick', NULL),
(54, 'Edwin Hubble', NULL),
(55, 'Rosalind Franklin', NULL),
(56, 'Enrico Fermi', NULL),
(57, 'Carlos Linneo', NULL),
(58, 'Paul Dirac', NULL),
(59, 'Linus Pauling', NULL),
(60, 'Robert Oppenheimer', NULL),
(61, 'Rachel Carson', NULL),
(62, 'Antoine Lavoisier', NULL),
(63, 'James Clerk Maxwell', NULL),
(64, 'Heinrich Rudolf Hertz', NULL),
(65, 'William Thomson', NULL);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `scienziati`
--
ALTER TABLE `scienziati`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `scienziati`
--
ALTER TABLE `scienziati`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
