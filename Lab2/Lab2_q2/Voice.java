class Voice {

    private Animal[] animals; 
    private void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }
    private void hear() {
        if (animals == null) {
            System.out.println("Error: Animals are not prepared yet. Please prepare voices first.");
            return;
        }
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
    public void templateMethod() {
        prepareVoice(); 
        System.out.println("Animals are ready to make their voices!");
        hear();         
    }
}
