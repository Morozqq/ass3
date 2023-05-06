public class MyTestingClass {
    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        // Custom hash function using prime number multiplication
        int hash = 17;
        hash = 31 * hash + id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyTestingClass) {
            MyTestingClass other = (MyTestingClass) obj;
            return id == other.id;
        }
        return false;
    }
}