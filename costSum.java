import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class costSum {
    private String productName;
    private Integer cost;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public costSum(String productName, Integer cost) {
        this.productName = productName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "costSum{" +
                "productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }

    public static void main(String[] args) {
        List<costSum> productList=new ArrayList<costSum>();
        productList.add(new costSum("Car",10000));
        productList.add(new costSum("Bike",8500));
        productList.add(new costSum("Scooter",6500));
        Optional<Integer> totalCost=productList.stream().map(costSum -> costSum.getCost()).reduce((a, b)->a+b);
        System.out.println(totalCost);
        Optional<costSum> minOpt=productList.stream().min((e1, e2)->e1.getCost().compareTo(e2.getCost()));
        if(minOpt.isPresent()){
            System.out.println(minOpt);
        }
    }


}
