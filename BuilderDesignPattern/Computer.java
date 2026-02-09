package BuilderDesignPattern;

public class Computer {
    //1.make every thing private
    private int hdd;
    private int ram;
    private boolean gpuEnabled;
    private boolean bluetoothEnabled;

    //2. make constructor private
    //so only builder can access it from inner class
    private Computer(ComputerBuilder builder){
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.gpuEnabled = builder.gpuEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    //3. static inner builder class
    public static class ComputerBuilder{
        private int hdd;
        private int ram;
        private boolean gpuEnabled;
        private boolean bluetoothEnabled;

        public ComputerBuilder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGpuEnabled(boolean gpuEnabled) {
            this.gpuEnabled = gpuEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [ HDD = "+hdd+", RAM = "+ram+", GPU Enabled = "+gpuEnabled+", Bluetooth Enabled = "+bluetoothEnabled+" ]";
    }
}
