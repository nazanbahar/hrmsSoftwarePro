
--job titles table
INSERT INTO job_titles(title) 
VALUES
('Software Developer'),
('Software Architect')
RETURNING*;


