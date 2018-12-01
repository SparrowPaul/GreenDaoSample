package com.sparrowpaul.greendaosample.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class FavoriteQuote {

    @org.greenrobot.greendao.annotation.Id(autoincrement = true)
    private Long Id; //primary key
    private String details;
    @Generated(hash = 553006959)
    public FavoriteQuote(Long Id, String details) {
        this.Id = Id;
        this.details = details;
    }
    @Generated(hash = 1942181934)
    public FavoriteQuote() {
    }
    public Long getId() {
        return this.Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getDetails() {
        return this.details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}
