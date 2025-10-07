-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2025 at 06:55 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cusID` int(11) NOT NULL,
  `cusName` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `address` varchar(25) NOT NULL,
  `gender` enum('Male','Female','Other') NOT NULL,
  `email` varchar(20) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `bed` enum('Single','Double','Triple') NOT NULL,
  `roomtype` enum('A/C','Non-A/C') NOT NULL,
  `days` int(11) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cusID`, `cusName`, `mobile`, `address`, `gender`, `email`, `nationality`, `bed`, `roomtype`, `days`, `price`, `date`) VALUES
(1, 'Sachin', '0776089657', 'Chilaw', 'Male', 'sachin@gmail.com', 'Sri Lankan', 'Single', 'A/C', 2, 1000, '2025-10-03'),
(2, 'Samith', '0776089765', 'Negombo', 'Male', 'samith@gmail.com', 'Japan', 'Single', 'A/C', 2, 1000, '2025-10-03'),
(3, 'Rashen', '0776089765', 'Colombo', 'Male', 'rashen@gmail.com', 'Italy', 'Single', 'A/C', 1, 1000, '2025-10-05');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empID` int(11) NOT NULL,
  `fName` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `address` varchar(25) NOT NULL,
  `hireDate` date NOT NULL DEFAULT current_timestamp(),
  `jobTitle` enum('Restaurant Manager','F&B Manager','Waiter','Room Service Attendant','Bartender') NOT NULL,
  `salary` int(11) NOT NULL,
  `status` enum('Active','On_Leave') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empID`, `fName`, `Lname`, `mobile`, `address`, `hireDate`, `jobTitle`, `salary`, `status`) VALUES
(1, 'Sachin', 'Fernando', '0776086754', 'Wennappuwa', '2025-10-06', 'Bartender', 75000, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomID` int(11) NOT NULL,
  `roomType` varchar(20) NOT NULL,
  `bed` varchar(20) NOT NULL,
  `price` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomID`, `roomType`, `bed`, `price`) VALUES
(1, 'A/C', 'Single', 2500),
(3, 'A/C', 'Double', 1500);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(10) NOT NULL,
  `uName` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(25) NOT NULL,
  `address` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `uName`, `email`, `password`, `address`) VALUES
(1, 'Admin', 'admin@gmail.com', 'admin123', 'colombo'),
(2, 'Sachin', 'sachin@gmail.com', 'sachin123', 'Chilaw');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cusID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`empID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cusID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `empID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `roomID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
