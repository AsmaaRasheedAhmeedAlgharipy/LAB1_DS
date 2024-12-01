public class flower {

        private String name;
        private int petals;
        private float price;

        // Constructor to initialize the variables
        public flower(String name, int petals, float price) {
            this.name = name;
            this.petals = petals;
            this.price = price;
        }

        // Getter and setter methods for each variable

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPetals() {
            return petals;
        }

        public void setPetals(int petals) {
            this.petals = petals;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public static void main(String[] args) {
            flower rose = new flower("Rose", 10, 15.99f);
            System.out.println("Flower name: " + rose.getName());
            System.out.println("Number of petals: " + rose.getPetals());
            System.out.println("Price: $" + rose.getPrice());

            // Modify the price
            rose.setPrice(20.99f);
            System.out.println("New price: $" + rose.getPrice());

    }
    }

