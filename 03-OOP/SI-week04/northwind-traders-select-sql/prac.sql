-- SELECT *
-- FROM products
-- INNER JOIN categories
--     ON products.category_id = categories.category_id
-- WHERE category_name LIKE '%Dairy%';
--
-- SELECT *
-- FROM orders
-- WHERE ship_country
-- LIKE 'France';
--
-- SELECT *
-- FROM employees
-- WHERE country
-- LIKE 'France';
--
-- SELECT *
-- FROM suppliers
-- WHERE country
-- LIKE '%france%';
--
-- SELECT *
-- FROM products
-- WHERE unit_price > 20;
--
-- SELECT *
-- FROM products
-- INNER JOIN categories c on c.category_id = products.category_id
-- WHERE category_name
-- LIKE '%Meat%'
--
-- SELECT *
-- FROM orders
-- WHERE ship_country
-- LIKE '%Ger%'
--
-- SELECT *
-- FROM employees
-- WHERE country
-- LIKE 'Germany';
-- --
-- SELECT *
-- FROM products
-- WHERE unit_price < 5;
--
-- SELECT *
-- FROM products
-- INNER JOIN categories c
--     on c.category_id = products.category_id
-- WHERE category_name
-- LIKE 'Produce'

-- SELECT *
-- FROM orders
-- WHERE ship_country
-- LIKE 'Brazil'

-- SELECT *
-- FROM employees
-- WHERE country
-- LIKE 'Brazil';

-- SELECT *
-- FROM suppliers
-- WHERE country
-- LIKE 'Brazil';

-- SELECT *
-- FROM products
-- WHERE units_in_stock = 0;

-- SELECT *
-- FROM products
-- INNER JOIN categories c on c.category_id = products.category_id
-- WHERE category_name
-- LIKE '%Sea%'

-- SELECT *
-- FROM orders
-- WHERE ship_country
-- LIKE 'Canada';

-- SELECT *
-- FROM employees
-- WHERE country
-- LIKE 'Canada';

-- SELECT *
-- FROM suppliers
-- WHERE country
-- LIKE 'Canada';

-- SELECT *
-- -- FROM products
-- -- WHERE unit_price > 50;

-- MEDIUM Queries

-- SELECT *
-- FROM orders
-- INNER JOIN order_details od on orders.order_id = od.order_id
-- WHERE shipped_date >= '1997-01-01-'
-- AND shipped_date <= '1997-12-31'
-- AND (unit_price * quantity) < 500;

-- SELECT DISTINCT e.*
-- FROM employees e
-- WHERE title LIKE '%Sales Representative%'
-- AND EXISTS (
--     SELECT 1
--     FROM orders
--              INNER JOIN orders o on e.employee_id = o.employee_id
--     WHERE o.ship_country LIKE '%USA%'
--     );


-- TODO: List all products that have been ordered at least once but never shipped.

-- SELECT *
-- FROM orders
-- WHERE shipped_date > orders.required_date;

-- SELECT DISTINCT *
-- FROM orders
-- INNER JOIN customers c on c.customer_id = orders.customer_id
-- WHERE extract(YEAR FROM order_date) = 1998

-- SELECT DISTINCT c.customer_id, contact_name, o1.order_date
-- FROM customers c
--          INNER JOIN orders o1 ON c.customer_id = o1.customer_id
--          LEFT JOIN orders o2 ON c.customer_id = o2.customer_id
--             AND EXTRACT(YEAR FROM o2.order_date) = 1997
-- WHERE EXTRACT(YEAR FROM o1.order_date) = 1998
--   AND o2.order_id IS NULL;

-- HARD Queries
-- SELECT *
-- FROM products
-- LEFT JOIN order_details od on products.product_id = od.product_id
-- WHERE od.product_id IS NULL;

-- SELECT *
-- FROM orders
-- WHERE EXTRACT(DOW FROM order_date) = 1
-- AND EXTRACT(DOW FROM shipped_date) = 5;

-- TODO: List all employees who have never had a sale over $1000.

-- SELECT DISTINCT first_name
-- FROM employees
-- INNER JOIN orders o on employees.employee_id = o.employee_id
-- INNER JOIN order_details od on o.order_id = od.order_id
-- WHERE (unit_price * quantity) < 1000;

-- SELECT DISTINCT *
-- FROM customers c
--          LEFT JOIN (
--     SELECT DISTINCT o.customer_id
--     FROM orders o
--              INNER JOIN order_details od ON o.order_id = od.order_id
--              INNER JOIN products p ON od.product_id = p.product_id
--              INNER JOIN categories c ON p.category_id = c.category_id
--     WHERE c.category_name = 'Beverages'
-- ) b ON c.customer_id = b.customer_id
-- WHERE b.customer_id IS NULL;

-- SELECT *
-- FROM products
-- INNER JOIN order_details od on products.product_id = od.product_id
-- INNER JOIN orders o on od.order_id = o.order_id
-- WHERE quantity > 10;




