package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


public class Mets {

    private int metsId;
    private String nomMet;
    private int profile_pic_id;
    private int Quantity;
    private Float price;


    private int numeroDeCommande;

    public Mets() {
    }

    public Mets(String nomMet,  Float price) {
        this.metsId = 0;
        this.nomMet = nomMet;
        Quantity = 1;
        this.price = price;
        this.profile_pic_id = 0;
    }

    public Mets(int metsId, String nomMet, int quantity, Float price, int profile_pic_id) {
        this.metsId = metsId;
        this.nomMet = nomMet;
        Quantity = quantity;
        this.price = price;
        this.profile_pic_id = profile_pic_id;
    }

    public String getNomMet() {
        return nomMet;
    }

    public int getQuantity() {
        return Quantity;
    }

    public Float getPrice() {
        return price;
    }

    public int getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(int pProfile_pic_id) {
        profile_pic_id = pProfile_pic_id;
    }
}
