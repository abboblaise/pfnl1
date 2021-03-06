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
// ---    Sat Aug 06 09:56:37 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PartiesProduitsPfnlImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpartiesproduitspfnl,
        Idpartiesrecoltees,
        Idproduitspfnl,
        Idunitemesure,
        Idunitemesureexport,
        PartiesProduitsPfnl,
        IdpartiesrecolteesPartiesProduitsPfnl,
        PartiesProduitsPfnl1,
        IdproduitspfnlPartiesProduitsPfnl,
        PartiesRecoltees,
        PartiesRecoltees1,
        FamillePfnl,
        FamillePfnl1,
        ProduitsPfnl,
        ProduitsPfnl1,
        ProduitsPfnl2,
        Unitemesure,
        Unitemesure1,
        Detailscollectepfnl,
        Detailsexportpfnl;
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


    public static final int IDPARTIESPRODUITSPFNL = AttributesEnum.Idpartiesproduitspfnl.index();
    public static final int IDPARTIESRECOLTEES = AttributesEnum.Idpartiesrecoltees.index();
    public static final int IDPRODUITSPFNL = AttributesEnum.Idproduitspfnl.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDUNITEMESUREEXPORT = AttributesEnum.Idunitemesureexport.index();
    public static final int PARTIESPRODUITSPFNL = AttributesEnum.PartiesProduitsPfnl.index();
    public static final int IDPARTIESRECOLTEESPARTIESPRODUITSPFNL =
        AttributesEnum.IdpartiesrecolteesPartiesProduitsPfnl.index();
    public static final int PARTIESPRODUITSPFNL1 = AttributesEnum.PartiesProduitsPfnl1.index();
    public static final int IDPRODUITSPFNLPARTIESPRODUITSPFNL =
        AttributesEnum.IdproduitspfnlPartiesProduitsPfnl.index();
    public static final int PARTIESRECOLTEES = AttributesEnum.PartiesRecoltees.index();
    public static final int PARTIESRECOLTEES1 = AttributesEnum.PartiesRecoltees1.index();
    public static final int FAMILLEPFNL = AttributesEnum.FamillePfnl.index();
    public static final int FAMILLEPFNL1 = AttributesEnum.FamillePfnl1.index();
    public static final int PRODUITSPFNL = AttributesEnum.ProduitsPfnl.index();
    public static final int PRODUITSPFNL1 = AttributesEnum.ProduitsPfnl1.index();
    public static final int PRODUITSPFNL2 = AttributesEnum.ProduitsPfnl2.index();
    public static final int UNITEMESURE = AttributesEnum.Unitemesure.index();
    public static final int UNITEMESURE1 = AttributesEnum.Unitemesure1.index();
    public static final int DETAILSCOLLECTEPFNL = AttributesEnum.Detailscollectepfnl.index();
    public static final int DETAILSEXPORTPFNL = AttributesEnum.Detailsexportpfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PartiesProduitsPfnlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.PartiesProduitsPfnl");
    }


    /**
     * Gets the attribute value for Idpartiesproduitspfnl, using the alias name Idpartiesproduitspfnl.
     * @return the value of Idpartiesproduitspfnl
     */
    public BigDecimal getIdpartiesproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIESPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpartiesproduitspfnl.
     * @param value value to set the Idpartiesproduitspfnl
     */
    public void setIdpartiesproduitspfnl(BigDecimal value) {
        setAttributeInternal(IDPARTIESPRODUITSPFNL, value);
    }

    /**
     * Gets the attribute value for Idpartiesrecoltees, using the alias name Idpartiesrecoltees.
     * @return the value of Idpartiesrecoltees
     */
    public BigDecimal getIdpartiesrecoltees() {
        return (BigDecimal) getAttributeInternal(IDPARTIESRECOLTEES);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpartiesrecoltees.
     * @param value value to set the Idpartiesrecoltees
     */
    public void setIdpartiesrecoltees(BigDecimal value) {
        setAttributeInternal(IDPARTIESRECOLTEES, value);
    }

    /**
     * Gets the attribute value for Idproduitspfnl, using the alias name Idproduitspfnl.
     * @return the value of Idproduitspfnl
     */
    public BigDecimal getIdproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idproduitspfnl.
     * @param value value to set the Idproduitspfnl
     */
    public void setIdproduitspfnl(BigDecimal value) {
        setAttributeInternal(IDPRODUITSPFNL, value);
    }


    /**
     * Gets the attribute value for Idunitemesure, using the alias name Idunitemesure.
     * @return the value of Idunitemesure
     */
    public BigDecimal getIdunitemesure() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idunitemesure.
     * @param value value to set the Idunitemesure
     */
    public void setIdunitemesure(BigDecimal value) {
        setAttributeInternal(IDUNITEMESURE, value);
    }

    /**
     * Gets the attribute value for Idunitemesureexport, using the alias name Idunitemesureexport.
     * @return the value of Idunitemesureexport
     */
    public BigDecimal getIdunitemesureexport() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESUREEXPORT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idunitemesureexport.
     * @param value value to set the Idunitemesureexport
     */
    public void setIdunitemesureexport(BigDecimal value) {
        setAttributeInternal(IDUNITEMESUREEXPORT, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPartiesProduitsPfnl() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNL);
    }

    /**
     * @return the associated entity PartiesProduitsPfnlImpl.
     */
    public PartiesProduitsPfnlImpl getIdpartiesrecolteesPartiesProduitsPfnl() {
        return (PartiesProduitsPfnlImpl) getAttributeInternal(IDPARTIESRECOLTEESPARTIESPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity PartiesProduitsPfnlImpl.
     */
    public void setIdpartiesrecolteesPartiesProduitsPfnl(PartiesProduitsPfnlImpl value) {
        setAttributeInternal(IDPARTIESRECOLTEESPARTIESPRODUITSPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPartiesProduitsPfnl1() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNL1);
    }

    /**
     * @return the associated entity PartiesProduitsPfnlImpl.
     */
    public PartiesProduitsPfnlImpl getIdproduitspfnlPartiesProduitsPfnl() {
        return (PartiesProduitsPfnlImpl) getAttributeInternal(IDPRODUITSPFNLPARTIESPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity PartiesProduitsPfnlImpl.
     */
    public void setIdproduitspfnlPartiesProduitsPfnl(PartiesProduitsPfnlImpl value) {
        setAttributeInternal(IDPRODUITSPFNLPARTIESPRODUITSPFNL, value);
    }

    /**
     * @return the associated entity PartiesRecolteesImpl.
     */
    public PartiesRecolteesImpl getPartiesRecoltees() {
        return (PartiesRecolteesImpl) getAttributeInternal(PARTIESRECOLTEES);
    }

    /**
     * Sets <code>value</code> as the associated entity PartiesRecolteesImpl.
     */
    public void setPartiesRecoltees(PartiesRecolteesImpl value) {
        setAttributeInternal(PARTIESRECOLTEES, value);
    }

    /**
     * @return the associated entity PartiesRecolteesImpl.
     */
    public PartiesRecolteesImpl getPartiesRecoltees1() {
        return (PartiesRecolteesImpl) getAttributeInternal(PARTIESRECOLTEES1);
    }

    /**
     * Sets <code>value</code> as the associated entity PartiesRecolteesImpl.
     */
    public void setPartiesRecoltees1(PartiesRecolteesImpl value) {
        setAttributeInternal(PARTIESRECOLTEES1, value);
    }

    /**
     * @return the associated entity FamillePfnlImpl.
     */
    public FamillePfnlImpl getFamillePfnl() {
        return (FamillePfnlImpl) getAttributeInternal(FAMILLEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity FamillePfnlImpl.
     */
    public void setFamillePfnl(FamillePfnlImpl value) {
        setAttributeInternal(FAMILLEPFNL, value);
    }

    /**
     * @return the associated entity FamillePfnlImpl.
     */
    public FamillePfnlImpl getFamillePfnl1() {
        return (FamillePfnlImpl) getAttributeInternal(FAMILLEPFNL1);
    }

    /**
     * Sets <code>value</code> as the associated entity FamillePfnlImpl.
     */
    public void setFamillePfnl1(FamillePfnlImpl value) {
        setAttributeInternal(FAMILLEPFNL1, value);
    }

    /**
     * @return the associated entity ProduitsPfnlImpl.
     */
    public ProduitsPfnlImpl getProduitsPfnl() {
        return (ProduitsPfnlImpl) getAttributeInternal(PRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity ProduitsPfnlImpl.
     */
    public void setProduitsPfnl(ProduitsPfnlImpl value) {
        setAttributeInternal(PRODUITSPFNL, value);
    }

    /**
     * @return the associated entity ProduitsPfnlImpl.
     */
    public ProduitsPfnlImpl getProduitsPfnl1() {
        return (ProduitsPfnlImpl) getAttributeInternal(PRODUITSPFNL1);
    }

    /**
     * Sets <code>value</code> as the associated entity ProduitsPfnlImpl.
     */
    public void setProduitsPfnl1(ProduitsPfnlImpl value) {
        setAttributeInternal(PRODUITSPFNL1, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProduitsPfnl2() {
        return (RowIterator) getAttributeInternal(PRODUITSPFNL2);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUnitemesure() {
        return (RowIterator) getAttributeInternal(UNITEMESURE);
    }

    /**
     * @return the associated entity UnitemesureImpl.
     */
    public UnitemesureImpl getUnitemesure1() {
        return (UnitemesureImpl) getAttributeInternal(UNITEMESURE1);
    }

    /**
     * Sets <code>value</code> as the associated entity UnitemesureImpl.
     */
    public void setUnitemesure1(UnitemesureImpl value) {
        setAttributeInternal(UNITEMESURE1, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailsexportpfnl() {
        return (RowIterator) getAttributeInternal(DETAILSEXPORTPFNL);
    }


    /**
     * @param idpartiesproduitspfnl key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idpartiesproduitspfnl) {
        return new Key(new Object[] { idpartiesproduitspfnl });
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
            BigDecimal id = getLastId("getLastIdartiesProduitsPfnl1");
            setIdpartiesproduitspfnl(id);
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
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
    
    public ViewObject rechercherVue(String viewName) {
        ViewObject vo = this.getDBTransaction()
                            .getRootApplicationModule()
                            .findViewObject(viewName);
        return vo; 
        }
}

