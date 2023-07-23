-- YOUR SOLUTION HERE
SELECT order_id, shipped_date
FROM orders
WHERE shipped_date >= '1996-08-01'
AND shipped_date < '1996-09-01';

