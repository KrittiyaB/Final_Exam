public class Product {

    private int[] product;
    private int price = 100;
    private int discount = 0;

    public Product(int a, int b, int c, int d, int e) {
        product = new int[5];
        product[0] = a;
        product[1] = b;
        product[2] = c;
        product[3] = d;
        product[4] = e;
    }

    public double calDiscount() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(product[i] > 0){
                count++;
            }
        }

        if(count == 2){
            return 0.95;
        }else if(count == 3){
            return 0.9;
        }else if(count == 4){
            return 0.8;
        }else if(count == 5){
            return 0.75;
        }
        return 1;
    }

    public int total() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + (product[i] * price);

        }
        total = (int) (total*calDiscount());
        return total;
    }


}
