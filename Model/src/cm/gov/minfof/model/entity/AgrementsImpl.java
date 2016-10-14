package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import java.sql.Date;

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
// ---    Sat Sep 17 10:21:21 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AgrementsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idagrements,
        Datedebut,
        Datefin,
        Numagreement,
        Descriptioncontenuagreements,
        Nomdetenteur;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int IDAGREMENTS = AttributesEnum.Idagrements.index();
    public static final int DATEDEBUT = AttributesEnum.Datedebut.index();
    public static final int DATEFIN = AttributesEnum.Datefin.index();
    public static final int NUMAGREEMENT = AttributesEnum.Numagreement.index();
    public static final int DESCRIPTIONCONTENUAGREEMENTS = AttributesEnum.Descriptioncontenuagreements.index();
    public static final int NOMDETENTEUR = AttributesEnum.Nomdetenteur.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AgrementsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Agrements");
    }


    /**
     * Gets the attribute value for Idagrements, using the alias name Idagrements.
     * @return the value of Idagrements
     */
    public BigDecimal getIdagrements() {
        return (BigDecimal) getAttributeInternal(IDAGREMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idagrements.
     * @param value value to set the Idagrements
     */
    public void setIdagrements(BigDecimal value) {
        setAttributeInternal(IDAGREMENTS, value);
    }


    /**
     * Gets the attribute value for Datedebut, using the alias name Datedebut.
     * @return the value of Datedebut
     */
    public Date getDatedebut() {
        return (Date) getAttributeInternal(DATEDEBUT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Datedebut.
     * @param value value to set the Datedebut
     */
    public void setDatedebut(Date value) {
        setAttributeInternal(DATEDEBUT, value);
    }

    /**
     * Gets the attribute value for Datefin, using the alias name Datefin.
     * @return the value of Datefin
     */
    public Date getDatefin() {
        return (Date) getAttributeInternal(DATEFIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for Datefin.
     * @param value value to set the Datefin
     */
    public void setDatefin(Date value) {
        setAttributeInternal(DATEFIN, value);
    }


    /**
     * Gets the attribute value for Numagreement, using the alias name Numagreement.
     * @return the value of Numagreement
     */
    public String getNumagreement() {
        return (String) getAttributeInternal(NUMAGREEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Numagreement.
     * @param value value to set the Numagreement
     */
    public void setNumagreement(String value) {
        setAttributeInternal(NUMAGREEMENT, value);
    }

    /**
     * Gets the attribute value for Descriptioncontenuagreements, using the alias name Descriptioncontenuagreements.
     * @return the value of Descriptioncontenuagreements
     */
    public String getDescriptioncontenuagreements() {
        return (String) getAttributeInternal(DESCRIPTIONCONTENUAGREEMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Descriptioncontenuagreements.
     * @param value value to set the Descriptioncontenuagreements
     */
    public void setDescriptioncontenuagreements(String value) {
        setAttributeInternal(DESCRIPTIONCONTENUAGREEMENTS, value);
    }


    /**
     * Gets the attribute value for Nomdetenteur, using the alias name Nomdetenteur.
     * @return the value of Nomdetenteur
     */
    public String getNomdetenteur() {
        return (String) getAttributeInternal(NOMDETENTEUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomdetenteur.
     * @param value value to set the Nomdetenteur
     */
    public void setNomdetenteur(String value) {
        setAttributeInternal(NOMDETENTEUR, value);
    }


    /**
     * @param idagrements key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idagrements) {
        return new Key(new Object[] { idagrements });
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
            BigDecimal id = getLastId("getlastidagrement1");
            this.setIdagrements(id);
        }
        super.doDML(operation, e);
    }
    
    public BigDecimal getLastId(String viewName) {
        BigDecimal lastId = new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext()) {
            //System.out.println("entree dans la condition hasNext");
            Row r = vo.next();
            //System.out.println("row = " + r);
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}
