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
// ---    Sat Aug 06 08:18:25 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FamillePfnlImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idfamillepfnl,
        Nomfamille,
        PartiesProduitsPfnl,
        PartiesProduitsPfnl1,
        ProduitsPfnl;
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
    public static final int IDFAMILLEPFNL = AttributesEnum.Idfamillepfnl.index();
    public static final int NOMFAMILLE = AttributesEnum.Nomfamille.index();
    public static final int PARTIESPRODUITSPFNL = AttributesEnum.PartiesProduitsPfnl.index();
    public static final int PARTIESPRODUITSPFNL1 = AttributesEnum.PartiesProduitsPfnl1.index();
    public static final int PRODUITSPFNL = AttributesEnum.ProduitsPfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FamillePfnlImpl() {
    }

    /**
     * Gets the attribute value for Idfamillepfnl, using the alias name Idfamillepfnl.
     * @return the value of Idfamillepfnl
     */
    public BigDecimal getIdfamillepfnl() {
        return (BigDecimal) getAttributeInternal(IDFAMILLEPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idfamillepfnl.
     * @param value value to set the Idfamillepfnl
     */
    public void setIdfamillepfnl(BigDecimal value) {
        setAttributeInternal(IDFAMILLEPFNL, value);
    }

    /**
     * Gets the attribute value for Nomfamille, using the alias name Nomfamille.
     * @return the value of Nomfamille
     */
    public String getNomfamille() {
        return (String) getAttributeInternal(NOMFAMILLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomfamille.
     * @param value value to set the Nomfamille
     */
    public void setNomfamille(String value) {
        setAttributeInternal(NOMFAMILLE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPartiesProduitsPfnl() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNL);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPartiesProduitsPfnl1() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNL1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProduitsPfnl() {
        return (RowIterator) getAttributeInternal(PRODUITSPFNL);
    }

    /**
     * @param idfamillepfnl key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idfamillepfnl) {
        return new Key(new Object[] { idfamillepfnl });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.FamillePfnl");
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
            BigDecimal id = getLastId("getLastIdFamilles1");
            setIdfamillepfnl(id);
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

