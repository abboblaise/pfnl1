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
// ---    Sat Aug 06 07:41:30 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CommuneImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idcommunes,
        Nomcommune,
        Iddepartements,
        Commune,
        IddepartementsCommune,
        Departement,
        Region,
        Departement1;
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


    public static final int IDCOMMUNES = AttributesEnum.Idcommunes.index();
    public static final int NOMCOMMUNE = AttributesEnum.Nomcommune.index();
    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int COMMUNE = AttributesEnum.Commune.index();
    public static final int IDDEPARTEMENTSCOMMUNE = AttributesEnum.IddepartementsCommune.index();
    public static final int DEPARTEMENT = AttributesEnum.Departement.index();
    public static final int REGION = AttributesEnum.Region.index();
    public static final int DEPARTEMENT1 = AttributesEnum.Departement1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CommuneImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Commune");
    }


    /**
     * Gets the attribute value for Idcommunes, using the alias name Idcommunes.
     * @return the value of Idcommunes
     */
    public BigDecimal getIdcommunes() {
        return (BigDecimal) getAttributeInternal(IDCOMMUNES);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idcommunes.
     * @param value value to set the Idcommunes
     */
    public void setIdcommunes(BigDecimal value) {
        setAttributeInternal(IDCOMMUNES, value);
    }

    /**
     * Gets the attribute value for Nomcommune, using the alias name Nomcommune.
     * @return the value of Nomcommune
     */
    public String getNomcommune() {
        return (String) getAttributeInternal(NOMCOMMUNE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomcommune.
     * @param value value to set the Nomcommune
     */
    public void setNomcommune(String value) {
        setAttributeInternal(NOMCOMMUNE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCommune() {
        return (RowIterator) getAttributeInternal(COMMUNE);
    }

    /**
     * @return the associated entity CommuneImpl.
     */
    public CommuneImpl getIddepartementsCommune() {
        return (CommuneImpl) getAttributeInternal(IDDEPARTEMENTSCOMMUNE);
    }

    /**
     * Sets <code>value</code> as the associated entity CommuneImpl.
     */
    public void setIddepartementsCommune(CommuneImpl value) {
        setAttributeInternal(IDDEPARTEMENTSCOMMUNE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDepartement() {
        return (RowIterator) getAttributeInternal(DEPARTEMENT);
    }

    /**
     * @return the associated entity RegionImpl.
     */
    public RegionImpl getRegion() {
        return (RegionImpl) getAttributeInternal(REGION);
    }

    /**
     * Sets <code>value</code> as the associated entity RegionImpl.
     */
    public void setRegion(RegionImpl value) {
        setAttributeInternal(REGION, value);
    }

    /**
     * @return the associated entity DepartementImpl.
     */
    public DepartementImpl getDepartement1() {
        return (DepartementImpl) getAttributeInternal(DEPARTEMENT1);
    }

    /**
     * Sets <code>value</code> as the associated entity DepartementImpl.
     */
    public void setDepartement1(DepartementImpl value) {
        setAttributeInternal(DEPARTEMENT1, value);
    }


    /**
     * @param idcommunes key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idcommunes) {
        return new Key(new Object[] { idcommunes });
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
            BigDecimal id = getLastId("getLastIdCommunes1");
            setIdcommunes(id);
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
