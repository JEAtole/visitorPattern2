public class Sofa implements Furniture{

    private int shipmentCost;
    private int distance;
    private String shippingType;

    public Sofa(int distance, String shippingType) {
        this.distance = distance;
        this.shippingType = shippingType;
    }

    @Override
    public void accept(Shipping shipping) {
        shipping.ship(this);
    }

    public void setShipmentCost(int shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getShipmentCost() {
        return shipmentCost;
    }

    @Override
    public String getShippingType() {
        return shippingType;
    }
}
