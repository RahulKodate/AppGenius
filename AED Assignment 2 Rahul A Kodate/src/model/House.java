package model;

/**
 *
 * @author Rishabh
 */
public class House {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String address;
//    private Community community;
//
//    public Community getCommunity() {
//        return community;
//    }
//
//    public void setCommunity(Community community) {
//        this.community = community;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
