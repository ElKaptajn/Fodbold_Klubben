package com.company;

public class MemberPlayer implements Comparable<MemberPlayer>{
    private String fName;
    private String lName;
    private int age;
    private int team;

    public MemberPlayer(String fName, String lName, int age, int team){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.team = team;
    }
    public MemberPlayer(){

    }

    @Override
    public String toString(){
        String fullName = fName + " " + lName;
        return String.format("\nName: %-20s Age: %-3d Team: %-3d",fullName,age,team);
    }

    @Override
    public int compareTo(MemberPlayer other) {
        if(team < other.team){
            return -1;
        }else if(team > other.team){
            return 1;
        }else {
            for(int i = 0; i < fName.length() || i < other.fName.length(); i++){
                if(fName.charAt(i) < other.fName.charAt(i)){
                    return -1;
                }else if(fName.charAt(i) > other.fName.charAt(i)){
                    return 1;
                }
            }
            for(int j = 0; j < lName.length() || j < other.lName.length(); j++){
                if(lName.charAt(j) < other.lName.charAt(j)){
                    return -1;
                }else if(lName.charAt(j) > other.lName.charAt(j)){
                    return 1;
                }
            }
        }
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }
}