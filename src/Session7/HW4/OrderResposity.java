package Session7.HW4;

import Session7.HW1.Order;

interface OrderRepository {
    void save(Order order);
    void findAll();
}
