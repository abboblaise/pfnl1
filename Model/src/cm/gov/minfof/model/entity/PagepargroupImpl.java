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
// ---    Mon Dec 05 10:06:49 CET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PagepargroupImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpagepargroup,
        Idpage,
        Idgroupe,
        Pagepargroup,
        IdgroupePagepargroup,
        Pagepargroup1,
        IdpagePagepargroup,
        Pageprojet,
        Pageprojet1,
        Groupeutilisateur;
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
    public static final int IDPAGEPARGROUP = AttributesEnum.Idpagepargroup.index();
    public static final int IDPAGE = AttributesEnum.Idpage.index();
    public static final int IDGROUPE = AttributesEnum.Idgroupe.index();
    public static final int PAGEPARGROUP = AttributesEnum.Pagepargroup.index();
    public static final int IDGROUPEPAGEPARGROUP = AttributesEnum.IdgroupePagepargroup.index();
    public static final int PAGEPARGROUP1 = AttributesEnum.Pagepargroup1.index();
    public static final int IDPAGEPAGEPARGROUP = AttributesEnum.IdpagePagepargroup.index();
    public static final int PAGEPROJET = AttributesEnum.Pageprojet.index();
    public static final int PAGEPROJET1 = AttributesEnum.Pageprojet1.index();
    public static final int GROUPEUTILISATEUR = AttributesEnum.Groupeutilisateur.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PagepargroupImpl() {
    }

    /**
     * Gets the attribute value for Idpagepargroup, using the alias name Idpagepargroup.
     * @return the value of Idpagepargroup
     */
    public BigDecimal getIdpagepargroup() {
        return (BigDecimal) getAttributeInternal(IDPAGEPARGROUP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpagepargroup.
     * @param value value to set the Idpagepargroup
     */
    public void setIdpagepargroup(BigDecimal value) {
        setAttributeInternal(IDPAGEPARGROUP, value);
    }

    /**
     * Gets the attribute value for Idpage, using the alias name Idpage.
     * @return the value of Idpage
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) getAttributeInternal(IDPAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpage.
     * @param value value to set the Idpage
     */
    public void setIdpage(BigDecimal value) {
        setAttributeInternal(IDPAGE, value);
    }

    /**
     * Gets the attribute value for Idgroupe, using the alias name Idgroupe.
     * @return the value of Idgroupe
     */
    public BigDecimal getIdgroupe() {
        return (BigDecimal) getAttributeInternal(IDGROUPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idgroupe.
     * @param value value to set the Idgroupe
     */
    public void setIdgroupe(BigDecimal value) {
        setAttributeInternal(IDGROUPE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPagepargroup() {
        return (RowIterator) getAttributeInternal(PAGEPARGROUP);
    }

    /**
     * @return the associated entity PagepargroupImpl.
     */
    public PagepargroupImpl getIdgroupePagepargroup() {
        return (PagepargroupImpl) getAttributeInternal(IDGROUPEPAGEPARGROUP);
    }

    /**
     * Sets <code>value</code> as the associated entity PagepargroupImpl.
     */
    public void setIdgroupePagepargroup(PagepargroupImpl value) {
        setAttributeInternal(IDGROUPEPAGEPARGROUP, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPagepargroup1() {
        return (RowIterator) getAttributeInternal(PAGEPARGROUP1);
    }

    /**
     * @return the associated entity PagepargroupImpl.
     */
    public PagepargroupImpl getIdpagePagepargroup() {
        return (PagepargroupImpl) getAttributeInternal(IDPAGEPAGEPARGROUP);
    }

    /**
     * Sets <code>value</code> as the associated entity PagepargroupImpl.
     */
    public void setIdpagePagepargroup(PagepargroupImpl value) {
        setAttributeInternal(IDPAGEPAGEPARGROUP, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPageprojet() {
        return (EntityImpl) getAttributeInternal(PAGEPROJET);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPageprojet(EntityImpl value) {
        setAttributeInternal(PAGEPROJET, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPageprojet1() {
        return (EntityImpl) getAttributeInternal(PAGEPROJET1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPageprojet1(EntityImpl value) {
        setAttributeInternal(PAGEPROJET1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getGroupeutilisateur() {
        return (EntityImpl) getAttributeInternal(GROUPEUTILISATEUR);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setGroupeutilisateur(EntityImpl value) {
        setAttributeInternal(GROUPEUTILISATEUR, value);
    }

    /**
     * @param idpagepargroup key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idpagepargroup) {
        return new Key(new Object[] { idpagepargroup });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Pagepargroup");
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
            //System.out.println("actif = " + getActif());
            BigDecimal id = getLastId("getLastidPagepargroupe1");
            setIdpagepargroup(id);
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
            System.out.println("last Id = " + lastId);
            vo.closeRowSet();
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

