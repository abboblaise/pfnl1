package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

public class UserData {
    private BigDecimal idutilisateur;
    private String loginuser;
    private String nonuser;
    private String telephone;
    private int niveauintervention;
    private BigDecimal idregion;
    private BigDecimal iddepartement;
    private BigDecimal idgroupe;
    private Boolean estadmin ;


    public void setIdutilisateur(BigDecimal idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public void setEstadmin(Boolean estadmin) {
        this.estadmin = estadmin;
    }

    public Boolean getEstadmin() {
        return estadmin;
    }

    public BigDecimal getIdutilisateur() {
        return idutilisateur;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setNonuser(String nonuser) {
        this.nonuser = nonuser;
    }

    public String getNonuser() {
        return nonuser;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setNiveauintervention(int niveauintervention) {
        this.niveauintervention = niveauintervention;
    }

    public int getNiveauintervention() {
        return niveauintervention;
    }

    public void setIdregion(BigDecimal idregion) {
        this.idregion = idregion;
    }

    public BigDecimal getIdregion() {
        return idregion;
    }

    public void setIddepartement(BigDecimal iddepartement) {
        this.iddepartement = iddepartement;
    }

    public BigDecimal getIddepartement() {
        return iddepartement;
    }

    public void setIdgroupe(BigDecimal idgroupe) {
        this.idgroupe = idgroupe;
    }

    public BigDecimal getIdgroupe() {
        return idgroupe;
    }
}
