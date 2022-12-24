INSERT INTO account(id,name,email)
SELECT 1, 'TT123', 'tt123@gmail.com'
FROM dual WHERE not EXISTS
(select 1 from account where id = 1);

INSERT INTO account(id,name,email)
SELECT 2, 'TT223', 'tt223@gmail.com'
FROM dual WHERE not EXISTS
(select 1 from account where id = 2);