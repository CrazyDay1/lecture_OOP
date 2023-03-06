// createed by team in Bangalore
public class Teacher {
    // data
    Name name = new Name();
    Info info = new Info();
    private Address address = new Address();

    public void setName(Name name) {
        this.name = name;
    }

    public String getName(){return name.getFname();}

    public void setIC(String ic){
        info.setIC(ic);
    }

    public String getIC(){
        return info.getIC();
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public String getAddress(){
        return address.getAddress();
    }

    public void setQualification(String qualification){
        info.setQualification(qualification);
    }

    public String getQualification(){
        return info.getQualification();
    }

    public void setNumyearexp(int numyearexp){
        info.setNumyearexp(numyearexp);
    }

    public int getNumyearexp(){
        return info.getNumyearexp();
    }

    public void setDateJoined(String Date){
        info.setDateJoined(Date);
    }

    public String getDateJoined(){
        return info.getDateJoined();
    }

    public void setYearInCentre(String yearInCentre){
         info.setYearInCentre(yearInCentre);
    }

    public String getYearInCentre(){
        return info.getYearInCentre();
    }

}