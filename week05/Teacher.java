package week05;

class Teacher {
    int id;
    Branch branch;

    Teacher (int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }

    int getId() {
        return id;
    }

    Branch getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Teacher ID: " + this.id + " Teacher's Branch: " + this.branch + " -> " + branch.info;
    }
}
