//The Builder Pattern is perfect when you need
// to construct complex objects step-by-step,
// especially if some fields are optional.
// It helps you avoid the problem of constructor overloading,
// where you end up writing multiple constructors
// with different parameter combinations.

package BuilderDesignPattern;

public class ComputerApp {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().setHdd(500)
                .setRam(16)
                .setGpuEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer computer1 = new Computer.ComputerBuilder().setHdd(1000)
                .setRam(12)
                .build();

        System.out.println(computer);
        System.out.println(computer1);
    }
}
