-- YOUR SOLUTION HERE
SELECT *
FROM orders
WHERE ship_country
LIKE 'Sweden'
ORDER BY employee_id ASC;