-- SELECT *
-- FROM suppliers
-- WHERE country
--           LIKE 'Canada';
--
-- SELECT *
-- FROM employees
-- WHERE title
--           LIKE 'Sales Representative'
--   AND country
--           LIKE 'Norway';

-- SELECT *
-- FROM order_details
-- INNER JOIN orders o
--     on o.order_id = order_details.order_id
-- WHERE quantity >= 20
-- AND unit_price > 20

-- SELECT *
-- FROM orders
-- WHERE
--     EXTRACT(DOW FROM order_date) = 1
-- AND EXTRACT(DOW FROM shipped_date) = 5;



