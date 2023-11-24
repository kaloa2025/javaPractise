package BuilderPattern;

public class Person {
    private int id;
    private String name;
    private long mobile;
    private Gender gender;
    private String add;

    public void setId(int id) {
        this.id = id;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }
    public int getId() {
        return id;
    }
    public long getMobile() {
        return mobile;
    }
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id+name+mobile+gender;
    }

    public void printSummary()
    {
        System.out.println(id+name+mobile+gender);
    }

}

// id name mobile (enum)gender
// setter/getter
// to string
// 
    