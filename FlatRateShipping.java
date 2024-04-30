public class FlatRateShipping implements Shipping{

    @Override
    public void ship(Chair chair) {
        chair.setShipmentCost(10);
    }

    @Override
    public void ship(Table table) {
        table.setShipmentCost(20);
    }

    @Override
    public void ship(Sofa sofa) {
        sofa.setShipmentCost(30);
    }
}
