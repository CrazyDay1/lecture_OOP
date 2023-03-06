public class Address {
    String street1;
    String street2;
    String postcode;
    String city;
    String state;

    public Address(){
        this.street1 = "";
        this.street2 = "street2";
        this.postcode = "postcode";
        this.city = "city";
        this.state = "state";
    }

    public Address(String street1, String street2, String postcode, String city, String state){
        this.street1 = street1;
        this.street2 = street2;
        this.postcode = postcode;
        this.city = city;
        this.state = state;
    }

    public String getAddress(){
        return street1 + street2 + postcode + city + state;
    }

    public void setStreet1(String street1){
        this.street1 = street1;
    }

    public String getStreet1(){
        return street1;
    }

    public void setStreet2(String street2){
        this.street2 = street2;
    }

    public String getStreet2(){
        return street2;
    }

    public void setPostcode(String postcode){
        this.postcode = postcode;
    }

    public String getPostcode(){
        return postcode;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
