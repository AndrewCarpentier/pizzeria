package fr.andrew.bean;

public class Pizza {
    private Integer id;
    private String libelle;
    private String reference;
    private Integer prix;
    private String url_image;

    public Pizza() {
    }

    public Pizza(Integer id, String libelle, String reference, Integer prix, String url_image) {
        this.id = id;
        this.libelle = libelle;
        this.reference = reference;
        this.prix = prix;
        this.url_image = url_image;
    }


    //GETTER & SETTER
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

}
