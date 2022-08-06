package com.entity;

/**
 * @@IbrahimaFAYE
 * Class définissant les attributs d'un utilisateur
 */
public class User{
    private int idU;
    private String nomU;
    private String prenomU;
    private String emailU;
    private Role roleU;

    public User(){
        super();
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getNomU() {
        return nomU;
    }

    public void setNomU(String nomU) {
        this.nomU = nomU;
    }

    public String getPrenomU() {
        return prenomU;
    }

    public void setPrenomU(String prenomU) {
        this.prenomU = prenomU;
    }

    public String getEmailU() {
        return emailU;
    }

    public Role getRoleU(){
        return roleU;
    }

    public void setRoleU(Role roleU){
        this.roleU = roleU;
    }

    public void setEmailU(String emailU) {
        this.emailU = emailU;
    }

    public User(int idU, String nomU, String prenomU, String emailU, Role roleU) {
        this.idU = idU;
        this.nomU = nomU;
        this.prenomU = prenomU;
        this.emailU = emailU;
        this.roleU = roleU;
    }
}
