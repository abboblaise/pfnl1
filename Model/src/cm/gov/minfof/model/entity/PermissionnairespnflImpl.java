package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 12 15:29:45 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PermissionnairespnflImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Nomouraisonsociale,
        Statut,
        Siegesocial,
        Nbreemploye,
        Contact,
        Mail,
        Codepnfl,
        Iddepartements,
        Natureactivite,
        Numceqe,
        Idpermissionnairespnfl,
        Nui,
        Idpays,
        Profession,
        Typepersonne,
        Adressep,
        Sexe,
        Permissionnairespnfl,
        IddepartementsPermissionnairespnfl,
        Permissionnairespnfl1,
        IdpaysPermissionnairespnfl,
        Detailscollectepfnl;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int NOMOURAISONSOCIALE = AttributesEnum.Nomouraisonsociale.index();
    public static final int STATUT = AttributesEnum.Statut.index();
    public static final int SIEGESOCIAL = AttributesEnum.Siegesocial.index();
    public static final int NBREEMPLOYE = AttributesEnum.Nbreemploye.index();
    public static final int CONTACT = AttributesEnum.Contact.index();
    public static final int MAIL = AttributesEnum.Mail.index();
    public static final int CODEPNFL = AttributesEnum.Codepnfl.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int NATUREACTIVITE = AttributesEnum.Natureactivite.index();
    public static final int NUMCEQE = AttributesEnum.Numceqe.index();
    public static final int IDPERMISSIONNAIRESPNFL = AttributesEnum.Idpermissionnairespnfl.index();
    public static final int NUI = AttributesEnum.Nui.index();
    public static final int IDPAYS = AttributesEnum.Idpays.index();
    public static final int PROFESSION = AttributesEnum.Profession.index();
    public static final int TYPEPERSONNE = AttributesEnum.Typepersonne.index();
    public static final int ADRESSEP = AttributesEnum.Adressep.index();
    public static final int SEXE = AttributesEnum.Sexe.index();
    public static final int PERMISSIONNAIRESPNFL = AttributesEnum.Permissionnairespnfl.index();
    public static final int IDDEPARTEMENTSPERMISSIONNAIRESPNFL =
        AttributesEnum.IddepartementsPermissionnairespnfl.index();
    public static final int PERMISSIONNAIRESPNFL1 = AttributesEnum.Permissionnairespnfl1.index();
    public static final int IDPAYSPERMISSIONNAIRESPNFL = AttributesEnum.IdpaysPermissionnairespnfl.index();
    public static final int DETAILSCOLLECTEPFNL = AttributesEnum.Detailscollectepfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PermissionnairespnflImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Permissionnairespnfl");
    }


    /**
     * Gets the attribute value for Nomouraisonsociale, using the alias name Nomouraisonsociale.
     * @return the value of Nomouraisonsociale
     */
    public String getNomouraisonsociale() {
        return (String) getAttributeInternal(NOMOURAISONSOCIALE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomouraisonsociale.
     * @param value value to set the Nomouraisonsociale
     */
    public void setNomouraisonsociale(String value) {
        setAttributeInternal(NOMOURAISONSOCIALE, value);
    }

    /**
     * Gets the attribute value for Statut, using the alias name Statut.
     * @return the value of Statut
     */
    public Integer getStatut() {
        return (Integer) getAttributeInternal(STATUT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Statut.
     * @param value value to set the Statut
     */
    public void setStatut(Integer value) {
        setAttributeInternal(STATUT, value);
    }

    /**
     * Gets the attribute value for Siegesocial, using the alias name Siegesocial.
     * @return the value of Siegesocial
     */
    public String getSiegesocial() {
        return (String) getAttributeInternal(SIEGESOCIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Siegesocial.
     * @param value value to set the Siegesocial
     */
    public void setSiegesocial(String value) {
        setAttributeInternal(SIEGESOCIAL, value);
    }

    /**
     * Gets the attribute value for Nbreemploye, using the alias name Nbreemploye.
     * @return the value of Nbreemploye
     */
    public Integer getNbreemploye() {
        return (Integer) getAttributeInternal(NBREEMPLOYE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nbreemploye.
     * @param value value to set the Nbreemploye
     */
    public void setNbreemploye(Integer value) {
        setAttributeInternal(NBREEMPLOYE, value);
    }

    /**
     * Gets the attribute value for Contact, using the alias name Contact.
     * @return the value of Contact
     */
    public String getContact() {
        return (String) getAttributeInternal(CONTACT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Contact.
     * @param value value to set the Contact
     */
    public void setContact(String value) {
        setAttributeInternal(CONTACT, value);
    }

    /**
     * Gets the attribute value for Mail, using the alias name Mail.
     * @return the value of Mail
     */
    public String getMail() {
        return (String) getAttributeInternal(MAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mail.
     * @param value value to set the Mail
     */
    public void setMail(String value) {
        setAttributeInternal(MAIL, value);
    }

    /**
     * Gets the attribute value for Codepnfl, using the alias name Codepnfl.
     * @return the value of Codepnfl
     */
    public String getCodepnfl() {
        return (String) getAttributeInternal(CODEPNFL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codepnfl.
     * @param value value to set the Codepnfl
     */
    public void setCodepnfl(String value) {
        setAttributeInternal(CODEPNFL, value);
    }

    /**
     * Gets the attribute value for Iddepartements, using the alias name Iddepartements.
     * @return the value of Iddepartements
     */
    public BigDecimal getIddepartements() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddepartements.
     * @param value value to set the Iddepartements
     */
    public void setIddepartements(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENTS, value);
    }

    /**
     * Gets the attribute value for Natureactivite, using the alias name Natureactivite.
     * @return the value of Natureactivite
     */
    public String getNatureactivite() {
        return (String) getAttributeInternal(NATUREACTIVITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Natureactivite.
     * @param value value to set the Natureactivite
     */
    public void setNatureactivite(String value) {
        setAttributeInternal(NATUREACTIVITE, value);
    }

    /**
     * Gets the attribute value for Numceqe, using the alias name Numceqe.
     * @return the value of Numceqe
     */
    public String getNumceqe() {
        return (String) getAttributeInternal(NUMCEQE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Numceqe.
     * @param value value to set the Numceqe
     */
    public void setNumceqe(String value) {
        setAttributeInternal(NUMCEQE, value);
    }

    /**
     * Gets the attribute value for Idpermissionnairespnfl, using the alias name Idpermissionnairespnfl.
     * @return the value of Idpermissionnairespnfl
     */
    public BigDecimal getIdpermissionnairespnfl() {
        return (BigDecimal) getAttributeInternal(IDPERMISSIONNAIRESPNFL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpermissionnairespnfl.
     * @param value value to set the Idpermissionnairespnfl
     */
    public void setIdpermissionnairespnfl(BigDecimal value) {
        setAttributeInternal(IDPERMISSIONNAIRESPNFL, value);
    }


    /**
     * Gets the attribute value for Nui, using the alias name Nui.
     * @return the value of Nui
     */
    public String getNui() {
        return (String) getAttributeInternal(NUI);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nui.
     * @param value value to set the Nui
     */
    public void setNui(String value) {
        setAttributeInternal(NUI, value);
    }

    /**
     * Gets the attribute value for Idpays, using the alias name Idpays.
     * @return the value of Idpays
     */
    public BigDecimal getIdpays() {
        return (BigDecimal) getAttributeInternal(IDPAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpays.
     * @param value value to set the Idpays
     */
    public void setIdpays(BigDecimal value) {
        setAttributeInternal(IDPAYS, value);
    }

    /**
     * Gets the attribute value for Profession, using the alias name Profession.
     * @return the value of Profession
     */
    public String getProfession() {
        return (String) getAttributeInternal(PROFESSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Profession.
     * @param value value to set the Profession
     */
    public void setProfession(String value) {
        setAttributeInternal(PROFESSION, value);
    }

    /**
     * Gets the attribute value for Typepersonne, using the alias name Typepersonne.
     * @return the value of Typepersonne
     */
    public Integer getTypepersonne() {
        return (Integer) getAttributeInternal(TYPEPERSONNE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Typepersonne.
     * @param value value to set the Typepersonne
     */
    public void setTypepersonne(Integer value) {
        setAttributeInternal(TYPEPERSONNE, value);
    }

    /**
     * Gets the attribute value for Adressep, using the alias name Adressep.
     * @return the value of Adressep
     */
    public String getAdressep() {
        return (String) getAttributeInternal(ADRESSEP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Adressep.
     * @param value value to set the Adressep
     */
    public void setAdressep(String value) {
        setAttributeInternal(ADRESSEP, value);
    }

    /**
     * Gets the attribute value for Sexe, using the alias name Sexe.
     * @return the value of Sexe
     */
    public Integer getSexe() {
        return (Integer) getAttributeInternal(SEXE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Sexe.
     * @param value value to set the Sexe
     */
    public void setSexe(Integer value) {
        setAttributeInternal(SEXE, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPermissionnairespnfl() {
        return (RowIterator) getAttributeInternal(PERMISSIONNAIRESPNFL);
    }

    /**
     * @return the associated entity PermissionnairespnflImpl.
     */
    public PermissionnairespnflImpl getIddepartementsPermissionnairespnfl() {
        return (PermissionnairespnflImpl) getAttributeInternal(IDDEPARTEMENTSPERMISSIONNAIRESPNFL);
    }

    /**
     * Sets <code>value</code> as the associated entity PermissionnairespnflImpl.
     */
    public void setIddepartementsPermissionnairespnfl(PermissionnairespnflImpl value) {
        setAttributeInternal(IDDEPARTEMENTSPERMISSIONNAIRESPNFL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPermissionnairespnfl1() {
        return (RowIterator) getAttributeInternal(PERMISSIONNAIRESPNFL1);
    }

    /**
     * @return the associated entity PermissionnairespnflImpl.
     */
    public PermissionnairespnflImpl getIdpaysPermissionnairespnfl() {
        return (PermissionnairespnflImpl) getAttributeInternal(IDPAYSPERMISSIONNAIRESPNFL);
    }

    /**
     * Sets <code>value</code> as the associated entity PermissionnairespnflImpl.
     */
    public void setIdpaysPermissionnairespnfl(PermissionnairespnflImpl value) {
        setAttributeInternal(IDPAYSPERMISSIONNAIRESPNFL, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL);
    }


    /**
     * @param idpermissionnairespnfl key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idpermissionnairespnfl) {
        return new Key(new Object[] { idpermissionnairespnfl });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT)
        {
            BigDecimal id = getLastId("getLastIdPermissionnairePfnl1");
            setIdpermissionnairespnfl(id);
        }
        super.doDML(operation, e);
    }
    
    public BigDecimal getLastId(String viewName)
    {
        BigDecimal lastId=new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext())
        {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

