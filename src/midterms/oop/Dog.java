package midterms.oop;

class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for dog name
    public String getName() {
        return name;
    }

    // Setter for dog name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for dog breed
    public String getBreed() {
        return breed;
    }

    // Setter for dog breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Display Dog information 
    public void displayInfo() {
        System.out.println("Dog Name: " + getName() + ", Breed: " + getBreed());
    }

    //MAIN
    public static void main(String[] args) {
        // Initial Two Dogs 
        Dog dog1 = new Dog("Whitey", "Poodle");
        Dog dog2 = new Dog("Brownie", "Chow Chow");

        // Display initial dogs
        System.out.println("Initial Dog Details:");
        dog1.displayInfo();
        dog2.displayInfo();

        // Update information of Dogs 
        dog1.setName("Ellie");
        dog1.setBreed("Shi tzu");

        dog2.setName("Zoe");
        dog2.setBreed("Belgian Malinois");

        // Display updated information 
        System.out.println("\nUpdated Dog Details:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
