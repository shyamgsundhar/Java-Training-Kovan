package org.kovan.intern.oops_and_architectural_thinking.enums_and_complex_state;

enum OrderState {

    NEW {
        @Override
        public OrderState next() {
            System.out.println("Ordered Processing");
            return PROCESSING;
        }
    },

    PROCESSING {
        @Override
        public OrderState next() {
            System.out.println("Order Shipping");
            return SHIPPED;
        }
    },

    SHIPPED {
        @Override
        public OrderState next() {
            System.out.println("Order Delivering");
            return DELIVERED;
        }
    },

    DELIVERED {
        @Override
        public OrderState next() {
            throw new IllegalStateException("Order already delivered");
        }
    };

    public abstract OrderState next();
}
class Order {

    private OrderState state = OrderState.NEW;

    public OrderState getState() {
        return state;
    }

    public void moveNext() {
        state = state.next();
    }
}

public class StateMachineDemo {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getState());
        order.moveNext();

        System.out.println(order.getState());
        order.moveNext();

        System.out.println(order.getState());
        order.moveNext();

        System.out.println(order.getState());

       // order.moveNext();
    }
}
