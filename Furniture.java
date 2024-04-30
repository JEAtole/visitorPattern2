public interface Furniture {
    void accept(Shipping shipping);
    int getDistance();
    int getShipmentCost();
    String getShippingType();

}
