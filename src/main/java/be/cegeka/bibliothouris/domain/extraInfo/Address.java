package be.cegeka.bibliothouris.domain.extraInfo;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private String addressID;

    @Column(name = "number")
    private String number;

    @Column(name = "streetname")
    private String sreetname;

    @Column(name = "city")
    private String city;

    public Address(){}

    public Address(String id, String city, String streetname, String addressNumber){
        this.addressID=id;
        this.city = city;
        this.sreetname =streetname;
        this.number = addressNumber;
    }

    public String getAddressID() {
        return addressID;
    }

    public String getCity() {
        return city;
    }

    public String getNumber() {
        return number;
    }

    public String getSreetname() {
        return sreetname;
    }
}
