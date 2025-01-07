public class Restaurant {

    int orderId;
    String dish;
    int tableNo;

    Restaurant next;
    Restaurant prev;

    public Restaurant(int orderId, String dish, int tableNo) {
        this.orderId = orderId;
        this.dish = dish;
        this.tableNo = tableNo;
    }
    
}
