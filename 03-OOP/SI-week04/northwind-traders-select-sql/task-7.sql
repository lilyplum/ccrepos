-- YOUR SOLUTION HERE
SELECT DISTINCT ship_country
FROM orders
WHERE order_date >= '1997-01-01'
AND order_date <= '1998-12-31'
AND ship_country ILIKE '%s%';

