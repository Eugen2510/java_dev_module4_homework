SELECT client.name, count(project.id) AS project_count
FROM project
JOIN client ON client.id = project.client_id
GROUP BY client_id
HAVING count(project.id) IN (
    SELECT count(client_id) FROM project
    GROUP BY client_id
    ORDER BY count(client_id) DESC
    LIMIT 1
);