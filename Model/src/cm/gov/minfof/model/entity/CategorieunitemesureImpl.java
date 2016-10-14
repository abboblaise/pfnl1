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
// ---    Sat Sep 17 10:17:17 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CategorieunitemesureImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idcategorieunitemesure,
        Libellecategorie,
        Unitemesure;
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


    public static final int IDCATEGORIEUNITEMESURE = AttributesEnum.Idcategorieunitemesure.index();
    public static final int LIBELLECATEGORIE = AttributesEnum.Libellecategorie.index();
    public static final int UNITEMESURE = AttributesEnum.Unitemesure.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CategorieunitemesureImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Categorieunitemesure");
    }


    /**
     * Gets the attribute value for Idcategorieunitemesure, using the alias name Idcategorieunitemesure.
     * @return the value of Idcategorieunitemesure
     */
    public BigDecimal getIdcategorieunitemesure() {
        return (BigDecimal) getAttributeInternal(IDCATEGORIEUNITEMESURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idcategorieunitemesure.
     * @param value value to set the Idcategorieunitemesure
     */
    public void setIdcategorieunitemesure(BigDecimal value) {
        setAttributeInternal(IDCATEGORIEUNITEMESURE, value);
    }

    /**
     * Gets the attribute value for Libellecategorie, using the alias name Libellecategorie.
     * @return the value of Libellecategorie
     */
    public String getLibellecategorie() {
        return (String) getAttributeInternal(LIBELLECATEGORIE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Libellecategorie.
     * @param value value to set the Libellecategorie
     */
    public void setLibellecategorie(String value) {
        setAttributeInternal(LIBELLECATEGORIE, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUnitemesure() {
        return (RowIterator) getAttributeInternal(UNITEMESURE);
    }


    /**
     * @param idcategorieunitemesure key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idcategorieunitemesure) {
        return new Key(new Object[] { idcategorieunitemesure });
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
            BigDecimal id = getLastId("getLastIdCategorieUniteMesure1");
            setIdcategorieunitemesure(id);
        }
        super.doDML(operation, e);
    }
    
    public BigDecimal getLastId(String viewName) {
        //System.out.println("entree dans getLastId");
        BigDecimal lastId=new BigDecimal(0);
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        vo.executeQuery();
        if (vo.hasNext()) {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
            //System.out.println("last Id = " + lastId);
            vo.closeRowSet();
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}
