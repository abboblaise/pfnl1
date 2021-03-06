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
// ---    Fri Aug 05 22:21:32 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartementImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Iddepartements,
        Nomdepartement,
        Codedepartement,
        Idregions,
        Nomcheflieu,
        Departement,
        IdregionsDepartement,
        Region,
        Commune,
        Commune1,
        Collectepfnl,
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


    public static final int IDDEPARTEMENTS = AttributesEnum.Iddepartements.index();
    public static final int NOMDEPARTEMENT = AttributesEnum.Nomdepartement.index();
    public static final int CODEDEPARTEMENT = AttributesEnum.Codedepartement.index();
    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int NOMCHEFLIEU = AttributesEnum.Nomcheflieu.index();
    public static final int DEPARTEMENT = AttributesEnum.Departement.index();
    public static final int IDREGIONSDEPARTEMENT = AttributesEnum.IdregionsDepartement.index();
    public static final int REGION = AttributesEnum.Region.index();
    public static final int COMMUNE = AttributesEnum.Commune.index();
    public static final int COMMUNE1 = AttributesEnum.Commune1.index();
    public static final int COLLECTEPFNL = AttributesEnum.Collectepfnl.index();
    public static final int DETAILSCOLLECTEPFNL = AttributesEnum.Detailscollectepfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartementImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Departement");
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
     * Gets the attribute value for Nomdepartement, using the alias name Nomdepartement.
     * @return the value of Nomdepartement
     */
    public String getNomdepartement() {
        return (String) getAttributeInternal(NOMDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomdepartement.
     * @param value value to set the Nomdepartement
     */
    public void setNomdepartement(String value) {
        setAttributeInternal(NOMDEPARTEMENT, value);
    }

    /**
     * Gets the attribute value for Codedepartement, using the alias name Codedepartement.
     * @return the value of Codedepartement
     */
    public String getCodedepartement() {
        return (String) getAttributeInternal(CODEDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codedepartement.
     * @param value value to set the Codedepartement
     */
    public void setCodedepartement(String value) {
        setAttributeInternal(CODEDEPARTEMENT, value);
    }

    /**
     * Gets the attribute value for Idregions, using the alias name Idregions.
     * @return the value of Idregions
     */
    public BigDecimal getIdregions() {
        return (BigDecimal) getAttributeInternal(IDREGIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idregions.
     * @param value value to set the Idregions
     */
    public void setIdregions(BigDecimal value) {
        setAttributeInternal(IDREGIONS, value);
    }

    /**
     * Gets the attribute value for Nomcheflieu, using the alias name Nomcheflieu.
     * @return the value of Nomcheflieu
     */
    public String getNomcheflieu() {
        return (String) getAttributeInternal(NOMCHEFLIEU);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomcheflieu.
     * @param value value to set the Nomcheflieu
     */
    public void setNomcheflieu(String value) {
        setAttributeInternal(NOMCHEFLIEU, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDepartement() {
        return (RowIterator) getAttributeInternal(DEPARTEMENT);
    }

    /**
     * @return the associated entity DepartementImpl.
     */
    public DepartementImpl getIdregionsDepartement() {
        return (DepartementImpl) getAttributeInternal(IDREGIONSDEPARTEMENT);
    }

    /**
     * Sets <code>value</code> as the associated entity DepartementImpl.
     */
    public void setIdregionsDepartement(DepartementImpl value) {
        setAttributeInternal(IDREGIONSDEPARTEMENT, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public CommuneImpl getCommune() {
        return (CommuneImpl) getAttributeInternal(COMMUNE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setCommune(CommuneImpl value) {
        setAttributeInternal(COMMUNE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCommune1() {
        return (RowIterator) getAttributeInternal(COMMUNE1);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public CollectepfnlImpl getCollectepfnl() {
        return (CollectepfnlImpl) getAttributeInternal(COLLECTEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setCollectepfnl(CollectepfnlImpl value) {
        setAttributeInternal(COLLECTEPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailscollectepfnl() {
        return (RowIterator) getAttributeInternal(DETAILSCOLLECTEPFNL);
    }


    /**
     * @param iddepartements key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal iddepartements) {
        return new Key(new Object[] { iddepartements });
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
            BigDecimal id = getLastId("getLastIdDepartements1");
            setIddepartements(id);
        }
        super.doDML(operation, e);
    }
    
    public BigDecimal getLastId(String viewName) {
        System.out.println("entree dans getLastId");
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

