SELECT 'youngest' AS type, name, birthday
FROM worker
WHERE birthday IN (
    SELECT MAX(birthday)
    FROM worker
)

UNION

SELECT 'oldest' AS type, name, birthday
FROM worker
WHERE birthday IN (
    SELECT MIN(birthday)
    FROM worker
);