package be.ae.services.model;


import lombok.Getter;

public enum Type {
    CHECKINGS("checkings"),
    SAVING("savings");

    @Getter
    private String type;

     Type(String type) {
        this.type = type;
    }
}
