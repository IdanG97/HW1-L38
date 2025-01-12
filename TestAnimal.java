public class TestAnimal {
        public static void main(String[] args) {
                Animal cat = new Cat("Kitty");
                Animal dog = new Dog("Buddy");
                Dog anotherDog = new Dog("Charlie");
                BigDog bigDog = new BigDog("Max");
                BigDog anotherBigDog = new BigDog("Rocky");

                // Test
                cat.greets();

                dog.greets();
                ((Dog) dog).greets(anotherDog);

                bigDog.greets();
                bigDog.greets(anotherDog);
                bigDog.greets(anotherBigDog);
        }
}
