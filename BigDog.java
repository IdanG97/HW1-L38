class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooof");
    }

    @Override
    public void greets(Dog anotherDog) {
        System.out.println("Woooooof");
    }

    public void greets(BigDog anotherBigDog) {
        System.out.println("Wooooooooof");
    }
}
