public class Container {
    private int currentCapacity;

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void addAmount(int amount) {
        if (amount > 0) {
            if (this.currentCapacity + amount <= 100) {
                this.currentCapacity = this.currentCapacity + amount;
            }else{
                this.currentCapacity=100;
            }
        }
    }



    public void removeAmount(int amount) {
        if (amount > 0) {
            if (this.currentCapacity >= amount && amount > 0) {
                this.currentCapacity = this.currentCapacity - amount;
            }else {
                this.currentCapacity=0;
            }
        }
    }

    @Override
    public String toString() {
        return this.currentCapacity+"/100";
    }
}
