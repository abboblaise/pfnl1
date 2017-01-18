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
// ---    Sun Sep 18 15:25:43 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransporteurImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idtransporteur,
        Nui,
        Nom,
        Adresse,
        Telephone,
        Vehicule;
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


    public static final int IDTRANSPORTEUR = AttributesEnum.Idtransporteur.index();
    public static final int NUI = AttributesEnum.Nui.index();
    public static final int NOM = AttributesEnum.Nom.index();
    public static final int ADRESSE = AttributesEnum.Adresse.index();
    public static final int TELEPHONE = AttributesEnum.Telephone.index();
    public static final int VEHICULE = AttributesEnum.Vehicule.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransporteurImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Transporteur");
    }


    /**
     * Gets the attribute value for Idtransporteur, using the alias name Idtransporteur.
     * @return the value of Idtransporteur
     */
    public BigDecimal getIdtransporteur() {
        return (BigDecimal) getAttributeInternal(IDTRANSPORTEUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idtransporteur.
     * @param value value to set the Idtransporteur
     */
    public void setIdtransporteur(BigDecimal value) {
        setAttributeInternal(IDTRANSPORTEUR, value);
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
     * Gets the attribute value for Nom, using the alias name Nom.
     * @return the value of Nom
     */
    public String getNom() {
        return (String) getAttributeInternal(NOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nom.
     * @param value value to set the Nom
     */
    public void setNom(String value) {
        setAttributeInternal(NOM, value);
    }

    /**
     * Gets the attribute value for Adresse, using the alias name Adresse.
     * @return the value of Adresse
     */
    public String getAdresse() {
        return (String) getAttributeInternal(ADRESSE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Adresse.
     * @param value value to set the Adresse
     */
    public void setAdresse(String value) {
        setAttributeInternal(ADRESSE, value);
    }

    /**
     * Gets the attribute value for Telephone, using the alias name Telephone.
     * @return the value of Telephone
     */
    public String getTelephone() {
        return (String) getAttributeInternal(TELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Telephone.
     * @param value value to set the Telephone
     */
    public void setTelephone(String value) {
        setAttributeInternal(TELEPHONE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getVehicule() {
        return (RowIterator) getAttributeInternal(VEHICULE);
    }


    /**
     * @param idtransporteur key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idtransporteur) {
        return new Key(new Object[] { idtransporteur });
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
        if (operation == DML_INSERT) {
            BigDecimal id = getLastId("getLastIdTransporteur1");
            setIdtransporteur(id);
        }
        super.doDML(operation, e);
    }
    
    public BigDecimal getLastId(String viewName) {
        BigDecimal lastId=new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext()) {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

