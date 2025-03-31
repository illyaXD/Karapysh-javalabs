CREATE TABLE students (
                          id SERIAL PRIMARY KEY,
                          last_name VARCHAR(50) NOT NULL,
                          first_name VARCHAR(50) NOT NULL,
                          middle_name VARCHAR(50),
                          birth_date DATE NOT NULL,
                          record_book_number VARCHAR(20) UNIQUE NOT NULL
);

INSERT INTO students (last_name, first_name, middle_name, birth_date, record_book_number) VALUES
                                                                                              ('Smith', 'Daniel', 'Oliver', '2000-01-25', 'S001'),
                                                                                              ('Johnson', 'William', 'Isaac', '2001-02-18', 'S002'),
                                                                                              ('Brown', 'Roman', 'Sebastian', '2002-03-09', 'S003'),
                                                                                              ('Davis', 'Ethan', 'Michael', '2000-04-30', 'S004'),
                                                                                              ('Miller', 'Anna', 'Evelyn', '2001-05-12', 'S005'),
                                                                                              ('Wilson', 'James', 'Benjamin', '2002-07-27', 'S006'),
                                                                                              ('Moore', 'Olivia', 'Charlotte', '2000-08-14', 'S007'),
                                                                                              ('Taylor', 'Timothy', 'Gregory', '2001-09-25', 'S008'),
                                                                                              ('Anderson', 'Sophia', 'Madeline', '2002-10-07', 'S009'),
                                                                                              ('Thomas', 'George', 'Dmitri', '2000-11-10', 'S010'),
                                                                                              ('Jackson', 'Arthur', 'Alexander', '2001-12-28', 'S011'),
                                                                                              ('White', 'Maria', 'Stephanie', '2002-01-05', 'S012'),
                                                                                              ('Harris', 'Alexander', 'Frederick', '2000-02-21', 'S013'),
                                                                                              ('Martin', 'Alice', 'Victoria', '2001-03-14', 'S014'),
                                                                                              ('Thompson', 'Michael', 'Andrew', '2002-04-22', 'S015'),
                                                                                              ('Garcia', 'Emma', 'Patricia', '2000-05-26', 'S016'),
                                                                                              ('Martinez', 'Brandon', 'Julian', '2001-07-11', 'S017'),
                                                                                              ('Robinson', 'Irene', 'Stella', '2002-08-19', 'S018'),
                                                                                              ('Clark', 'Victor', 'Nicholas', '2000-09-03', 'S019'),
                                                                                              ('Rodriguez', 'Mason', 'Eugene', '2001-10-29', 'S020');
