public class DistanceBasedShipping implements Shipping{

    @Override
    public void ship(Chair chair) {
        chair.setShipmentCost(5 * chair.getDistance());
    }

    @Override
    public void ship(Table table) {
        table.setShipmentCost(10 * table.getDistance());
    }

    @Override
    public void ship(Sofa sofa) {
        sofa.setShipmentCost(15 * sofa.getDistance());
    }
}
