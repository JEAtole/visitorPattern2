public class FurniCo {
    public static void main(String[] args) {

        Shipping flatRateShipping = new FlatRateShipping();
        Shipping distanceBasedShipping = new DistanceBasedShipping();

        // Chair

        Furniture smallChair = new Chair(10, "Flat Rate Shipping");
        smallChair.accept(flatRateShipping);
        printOrder(smallChair);

        Furniture bigChair = new Chair(10, "Distance Based Shipping");
        bigChair.accept(distanceBasedShipping);
        printOrder(bigChair);

        // Table

        Furniture smallTable = new Table(10, "Flat Rate Shipping");
        smallTable.accept(flatRateShipping);
        printOrder(smallTable);

        Furniture bigTable = new Table(10, "Distance Based Shipping");
        bigTable.accept(distanceBasedShipping);
        printOrder(bigTable);

        // Sofa

        Furniture smallSofa = new Sofa(10, "Flat Rate Shipping");
        smallSofa.accept(flatRateShipping);
        printOrder(smallSofa);

        Furniture bigSofa = new Sofa(10, "Distance Based Shipping");
        bigSofa.accept(distanceBasedShipping);
        printOrder(bigSofa);

    }

    public static void printOrder(Furniture item) {
        String output = "";
        output += "Item to Ship: " + item.getClass().getSimpleName() + "\n";
        output += "Shipping Type: " + item.getShippingType() + "\n";
        output += "Shipping Cost: Php " + item.getShipmentCost() + "\n";
        System.out.println(output);
    }
}
