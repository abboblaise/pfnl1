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
// ---    Sun Sep 18 08:04:02 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LocaliteImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idlocalite,
        Nomlocalite,
        Iddepartement,
        Localite,
        IddepartementLocalite,
        Departement,
        Collectepfnl;
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


    public static final int IDLOCALITE = AttributesEnum.Idlocalite.index();
    public static final int NOMLOCALITE = AttributesEnum.Nomlocalite.index();
    public static final int IDDEPARTEMENT = AttributesEnum.Iddepartement.index();
    public static final int LOCALITE = AttributesEnum.Localite.index();
    public static final int IDDEPARTEMENTLOCALITE = AttributesEnum.IddepartementLocalite.index();
    public static final int DEPARTEMENT = AttributesEnum.Departement.index();
    public static final int COLLECTEPFNL = AttributesEnum.Collectepfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LocaliteImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Localite");
    }


    /**
     * Gets the attribute value for Idlocalite, using the alias name Idlocalite.
     * @return the value of Idlocalite
     */
    public BigDecimal getIdlocalite() {
        return (BigDecimal) getAttributeInternal(IDLOCALITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idlocalite.
     * @param value value to set the Idlocalite
     */
    public void setIdlocalite(BigDecimal value) {
        setAttributeInternal(IDLOCALITE, value);
    }

    /**
     * Gets the attribute value for Nomlocalite, using the alias name Nomlocalite.
     * @return the value of Nomlocalite
     */
    public String getNomlocalite() {
        return (String) getAttributeInternal(NOMLOCALITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomlocalite.
     * @param value value to set the Nomlocalite
     */
    public void setNomlocalite(String value) {
        setAttributeInternal(NOMLOCALITE, value);
    }

    /**
     * Gets the attribute value for Iddepartement, using the alias name Iddepartement.
     * @return the value of Iddepartement
     */
    public BigDecimal getIddepartement() {
        return (BigDecimal) getAttributeInternal(IDDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Iddepartement.
     * @param value value to set the Iddepartement
     */
    public void setIddepartement(BigDecimal value) {
        setAttributeInternal(IDDEPARTEMENT, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getLocalite() {
        return (RowIterator) getAttributeInternal(LOCALITE);
    }

    /**
     * @return the associated entity LocaliteImpl.
     */
    public LocaliteImpl getIddepartementLocalite() {
        return (LocaliteImpl) getAttributeInternal(IDDEPARTEMENTLOCALITE);
    }

    /**
     * Sets <code>value</code> as the associated entity LocaliteImpl.
     */
    public void setIddepartementLocalite(LocaliteImpl value) {
        setAttributeInternal(IDDEPARTEMENTLOCALITE, value);
    }

    /**
     * @return the associated entity DepartementImpl.
     */
    public DepartementImpl getDepartement() {
        return (DepartementImpl) getAttributeInternal(DEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the associated entity DepartementImpl.
     */
    public void setDepartement(DepartementImpl value) {
        setAttributeInternal(DEPARTEMENT, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCollectepfnl() {
        return (RowIterator) getAttributeInternal(COLLECTEPFNL);
    }

    /**
     * @param idlocalite key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idlocalite) {
        return new Key(new Object[] { idlocalite });
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
            BigDecimal id = getLastId("getLastidLocalite1");
            this.setIdlocalite(id);
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

