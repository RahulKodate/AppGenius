package model;

import java.util.ArrayList;

/**
 *
 * @author rahulkodate
 */
public class CommunityDirectory {

    private ArrayList<Community> communityDirectory;

    public CommunityDirectory() {
        this.communityDirectory = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    // create & add
    public Community AddCommunity() {
        Community p = new Community();
        communityDirectory.add(p);
        return p;
    }
    // delete

    public void deleteCommunity(Community p) {
        communityDirectory.remove(p);
    }
    // search - community

    public ArrayList<Community> searchCommunity(String s) {
        ArrayList<Community> searchCommunityDirectory = new ArrayList<>();
        for (Community p : communityDirectory) {
            if (p.getCommunityName().toLowerCase().startsWith(s.toLowerCase())) {
                searchCommunityDirectory.add(p);
            }
        }
        return searchCommunityDirectory;
    }

    // search - community by hospital
    public ArrayList<Community> getHouseCommunityDirectory(String s) {
        ArrayList<Community> searchCommunityDirectory = new ArrayList<>();
        for (Community p : communityDirectory) {
            System.out.println(p.getHouse());
            if (p.getHouse().getName().toLowerCase().startsWith(s.toLowerCase())) {
                System.out.println("inside if");
                searchCommunityDirectory.add(p);
            }
        }
        return searchCommunityDirectory;
    }

    public void printCommunity(CommunityDirectory dd) {
        ArrayList<Community> dc = dd.getCommunityDirectory();
        for (Community p : dc) {
            System.out.println(p.getCommunityName());

        }
    }
}
