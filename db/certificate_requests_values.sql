USE `RDCRMS`;

CREATE TABLE `CERTIFICATE_REQUESTS` (
      `APPLICATION_ID` BIGINT PRIMARY KEY AUTO_INCREMENT,
      `FULL_NAME` VARCHAR(40),
      `AADHAAR_CARD_NUMBER` BIGINT,
      `GENDER` VARCHAR(10),
      `DATE_OF_BIRTH` DATE,
      `FATHER_NAME` VARCHAR(40),
      `MOTHER_NAME` VARCHAR(40),
      `VILLAGE` VARCHAR(30),
      `MANDAL` VARCHAR(20),
      `DISTRICT` VARCHAR(30),
      `STATE` VARCHAR(15),
      `COUNTRY` VARCHAR(15),
      `EMAIL` VARCHAR(30),
      `MOBILE_NUMBER` BIGINT,
      `RATION_CARD_NUMBER` BIGINT,
      `TYPE_OF_DOCUMENT` VARCHAR(30),
      `PURPOSE_OF_CERTIFICATE` VARCHAR(20),
       `SUBMITTED_DATE` TINYINT,
      `SUBMITTED_MONTH` VARCHAR(10),
      `SUBMITTED_YEAR` INT,
       `DESIGNATION` VARCHAR(20),
       `YEARLY_INCOME` DECIMAL,
      `TYPE_OF_HOUSE` VARCHAR(20),
      `PHYSICALLY_HANDICAPPED` VARCHAR(5),
      `GOVERNMENT_EMPLOYEE` VARCHAR(5),
      `CASTE` VARCHAR(5),
      `SUB_CASTE` VARCHAR(20),
      `DATE_OF_DEATH` DATE,
      `STATUS` VARCHAR(10),
      `COMMENTS` VARCHAR(50),
      `CREATED_AT` DATE,
      `UPDATED_AT` DATE
);

INSERT INTO `CERTIFICATE_REQUESTS` (
    APPLICATION_ID, FULL_NAME, AADHAAR_CARD_NUMBER, GENDER, DATE_OF_BIRTH, 
    FATHER_NAME, MOTHER_NAME, VILLAGE, MANDAL, DISTRICT, 
    STATE, COUNTRY, EMAIL, MOBILE_NUMBER, RATION_CARD_NUMBER, 
    TYPE_OF_DOCUMENT, PURPOSE_OF_CERTIFICATE, SUBMITTED_DATE, SUBMITTED_MONTH, SUBMITTED_YEAR, 
    DESIGNATION, YEARLY_INCOME, TYPE_OF_HOUSE, PHYSICALLY_HANDICAPPED, GOVERNMENT_EMPLOYEE, 
    CASTE, SUB_CASTE, DATE_OF_DEATH, STATUS, COMMENTS, 
    CREATED_AT, UPDATED_AT
) VALUES
(1, 'Mungara Charan Sai', '945271849457', 'Male', '2003-05-20',
 'Seshaiah', NULL, 'Krishnapatnam', 'Muthukur', 'Nellore',
 'andhra pradesh', 'india', NULL, NULL, NULL,
 'Caste', 'study', NULL, NULL, NULL,
 NULL, NULL, NULL, 'No', NULL,
 'bc', 'd', NULL, 'completed', NULL,
 '2024-11-22', '2024-11-22'),

(2, 'Mungara SaiCharan', '945271849457', 'Male', '2003-05-20',
 'Seshaiah', NULL, 'Krishnapatnam', 'Muthukur', 'Nellore',
 'andhra pradesh', 'india', NULL, '9182763608', '2817984607',
 'Income', NULL, NULL, NULL, NULL,
 NULL, 60000, 'Normal House', NULL, NULL,
 'bc', NULL, NULL, 'completed', NULL,
 '2024-11-22', '2024-11-22'),

(3, 'Charan Kumar', '945271849421', 'Male', '2003-05-20',
 'Seshaiah', 'Subbamma', 'Muthukur', 'Muthukur', 'Nellore',
 'andhra pradesh', 'india', NULL, NULL, NULL,
 'Birth', NULL, NULL, NULL, NULL,
 NULL, NULL, NULL, NULL, NULL,
 NULL, NULL, NULL, 'Rejected', NULL,
 '2024-11-22', '2024-11-22'),

(5, 'reddy sai', '321213232323', 'Male', '2024-11-30',
 'cherry', 'Subbamma', 'KRISHNAPATNAM', 'MUTHUKUR', 'SPSR NELLORE',
 'andhra pradesh', 'INDIA', NULL, NULL, NULL,
 'Birth', NULL, NULL, NULL, NULL,
 NULL, NULL, NULL, NULL, NULL,
 NULL, NULL, NULL, 'inprogress', NULL,
 '2024-11-22', '2024-11-22'),

(6, 'reddy reddy', '121212121212', 'Male', '2024-11-10',
 'daddy', NULL, 'Karol Bagh', 'Karol Bagh', 'Central Delhi',
 'Delhi(UT)', 'INDIA', NULL, NULL, NULL,
 'Caste', 'dfff', NULL, NULL, NULL,
 NULL, NULL, NULL, 'Yes', NULL,
 'bc', 'd', NULL, 'Inprogress', NULL,
 '2024-11-22', '2024-11-22'),

(7, 'Sai', NULL, 'male', NULL,
 'reddy', 'lucky', 'KRISHNAPATNAM', 'MUTHUKUR', 'SPSR NELLORE',
 'andhra pradesh', 'INDIA', NULL, NULL, NULL,
 'Death', NULL, NULL, NULL, NULL,
 NULL, NULL, NULL, NULL, NULL,
 NULL, NULL, '2024-12-28', 'Inprogress', NULL,
 '2024-12-31', '2024-12-31'),

(8, 'Mungara Charan Sai', '945271849457', 'Male', '2025-01-23',
 'seshaiah', NULL, 'KRISHNAPATNAM', 'MUTHUKUR', 'SPSR NELLORE',
 'andhra pradesh', 'INDIA', NULL, NULL, NULL,
 'Caste', 'study', NULL, NULL, NULL,
 NULL, NULL, NULL, 'No', NULL,
 'bc', 'd', NULL, 'Inprogress', NULL,
 '2025-01-05', '2025-01-05'),

(9, 'Sai', '945271849457', 'Male', '2025-03-31',
 'daddy', NULL, 'KRISHNAPATNAM', 'MUTHUKUR', 'SPSR NELLORE',
 'ANDHRA PRADESH', 'INDIA', NULL, NULL, NULL,
 'Caste', 'Time pass', NULL, NULL, NULL,
 NULL, NULL, NULL, 'Yes', NULL,
 'bc', 'a', NULL, 'Inprogress', NULL,
 '2025-03-07', '2025-03-07');