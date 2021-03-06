package cm.gov.minfof.model.entity;

import cm.gov.minfof.model.entity.common.Longtext4;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 17 13:43:28 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PermisImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpermis,
        Numeropermis,
        Zonecoupe,
        Datedelivrance,
        Datefin,
        Observation,
        Idagrement,
        Idpermissionnaire,
        Typedocument,
        Cheminfichier,
        Nomfichier,
        Idceqe,
        Permis,
        IdpermissionnairePermis,
        Permis1,
        IdagrementPermis,
        Detailpermis,
        Permissionnairespnfl,
        Exportpfnl,
        Certificatorigine;
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


    public static final int IDPERMIS = AttributesEnum.Idpermis.index();
    public static final int NUMEROPERMIS = AttributesEnum.Numeropermis.index();
    public static final int ZONECOUPE = AttributesEnum.Zonecoupe.index();
    public static final int DATEDELIVRANCE = AttributesEnum.Datedelivrance.index();
    public static final int DATEFIN = AttributesEnum.Datefin.index();
    public static final int OBSERVATION = AttributesEnum.Observation.index();
    public static final int IDAGREMENT = AttributesEnum.Idagrement.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int TYPEDOCUMENT = AttributesEnum.Typedocument.index();
    public static final int CHEMINFICHIER = AttributesEnum.Cheminfichier.index();
    public static final int NOMFICHIER = AttributesEnum.Nomfichier.index();
    public static final int IDCEQE = AttributesEnum.Idceqe.index();
    public static final int PERMIS = AttributesEnum.Permis.index();
    public static final int IDPERMISSIONNAIREPERMIS = AttributesEnum.IdpermissionnairePermis.index();
    public static final int PERMIS1 = AttributesEnum.Permis1.index();
    public static final int IDAGREMENTPERMIS = AttributesEnum.IdagrementPermis.index();
    public static final int DETAILPERMIS = AttributesEnum.Detailpermis.index();
    public static final int PERMISSIONNAIRESPNFL = AttributesEnum.Permissionnairespnfl.index();
    public static final int EXPORTPFNL = AttributesEnum.Exportpfnl.index();
    public static final int CERTIFICATORIGINE = AttributesEnum.Certificatorigine.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PermisImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Permis");
    }


    /**
     * Gets the attribute value for Idpermis, using the alias name Idpermis.
     * @return the value of Idpermis
     */
    public BigDecimal getIdpermis() {
        return (BigDecimal) getAttributeInternal(IDPERMIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpermis.
     * @param value value to set the Idpermis
     */
    public void setIdpermis(BigDecimal value) {
        setAttributeInternal(IDPERMIS, value);
    }

    /**
     * Gets the attribute value for Numeropermis, using the alias name Numeropermis.
     * @return the value of Numeropermis
     */
    public String getNumeropermis() {
        return (String) getAttributeInternal(NUMEROPERMIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Numeropermis.
     * @param value value to set the Numeropermis
     */
    public void setNumeropermis(String value) {
        setAttributeInternal(NUMEROPERMIS, value);
    }

    /**
     * Gets the attribute value for Zonecoupe, using the alias name Zonecoupe.
     * @return the value of Zonecoupe
     */
    public String getZonecoupe() {
        return (String) getAttributeInternal(ZONECOUPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Zonecoupe.
     * @param value value to set the Zonecoupe
     */
    public void setZonecoupe(String value) {
        setAttributeInternal(ZONECOUPE, value);
    }

    /**
     * Gets the attribute value for Datedelivrance, using the alias name Datedelivrance.
     * @return the value of Datedelivrance
     */
    public Timestamp getDatedelivrance() {
        return (Timestamp) getAttributeInternal(DATEDELIVRANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Datedelivrance.
     * @param value value to set the Datedelivrance
     */
    public void setDatedelivrance(Timestamp value) {
        setAttributeInternal(DATEDELIVRANCE, value);
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
     * Gets the attribute value for Observation, using the alias name Observation.
     * @return the value of Observation
     */
    public String getObservation() {
        return (String) getAttributeInternal(OBSERVATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Observation.
     * @param value value to set the Observation
     */
    public void setObservation(String value) {
        setAttributeInternal(OBSERVATION, value);
    }

    /**
     * Gets the attribute value for Idagrement, using the alias name Idagrement.
     * @return the value of Idagrement
     */
    public BigDecimal getIdagrement() {
        return (BigDecimal) getAttributeInternal(IDAGREMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idagrement.
     * @param value value to set the Idagrement
     */
    public void setIdagrement(BigDecimal value) {
        setAttributeInternal(IDAGREMENT, value);
    }

    /**
     * Gets the attribute value for Idpermissionnaire, using the alias name Idpermissionnaire.
     * @return the value of Idpermissionnaire
     */
    public BigDecimal getIdpermissionnaire() {
        return (BigDecimal) getAttributeInternal(IDPERMISSIONNAIRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idpermissionnaire.
     * @param value value to set the Idpermissionnaire
     */
    public void setIdpermissionnaire(BigDecimal value) {
        setAttributeInternal(IDPERMISSIONNAIRE, value);
    }

    /**
     * Gets the attribute value for Typedocument, using the alias name Typedocument.
     * @return the value of Typedocument
     */
    public Integer getTypedocument() {
        return (Integer) getAttributeInternal(TYPEDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Typedocument.
     * @param value value to set the Typedocument
     */
    public void setTypedocument(Integer value) {
        setAttributeInternal(TYPEDOCUMENT, value);
    }

    /**
     * Gets the attribute value for Cheminfichier, using the alias name Cheminfichier.
     * @return the value of Cheminfichier
     */
    public String getCheminfichier() {
        return (String) getAttributeInternal(CHEMINFICHIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cheminfichier.
     * @param value value to set the Cheminfichier
     */
    public void setCheminfichier(String value) {
        setAttributeInternal(CHEMINFICHIER, value);
    }

    /**
     * Gets the attribute value for Nomfichier, using the alias name Nomfichier.
     * @return the value of Nomfichier
     */
    public String getNomfichier() {
        return (String) getAttributeInternal(NOMFICHIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomfichier.
     * @param value value to set the Nomfichier
     */
    public void setNomfichier(String value) {
        setAttributeInternal(NOMFICHIER, value);
    }


    /**
     * Gets the attribute value for Idceqe, using the alias name Idceqe.
     * @return the value of Idceqe
     */
    public BigDecimal getIdceqe() {
        return (BigDecimal) getAttributeInternal(IDCEQE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idceqe.
     * @param value value to set the Idceqe
     */
    public void setIdceqe(BigDecimal value) {
        setAttributeInternal(IDCEQE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPermis() {
        return (RowIterator) getAttributeInternal(PERMIS);
    }

    /**
     * @return the associated entity PermisImpl.
     */
    public PermisImpl getIdpermissionnairePermis() {
        return (PermisImpl) getAttributeInternal(IDPERMISSIONNAIREPERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity PermisImpl.
     */
    public void setIdpermissionnairePermis(PermisImpl value) {
        setAttributeInternal(IDPERMISSIONNAIREPERMIS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPermis1() {
        return (RowIterator) getAttributeInternal(PERMIS1);
    }

    /**
     * @return the associated entity PermisImpl.
     */
    public PermisImpl getIdagrementPermis() {
        return (PermisImpl) getAttributeInternal(IDAGREMENTPERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity PermisImpl.
     */
    public void setIdagrementPermis(PermisImpl value) {
        setAttributeInternal(IDAGREMENTPERMIS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDetailpermis() {
        return (RowIterator) getAttributeInternal(DETAILPERMIS);
    }


    /**
     * @return the associated entity PermissionnairespnflImpl.
     */
    public PermissionnairespnflImpl getPermissionnairespnfl() {
        return (PermissionnairespnflImpl) getAttributeInternal(PERMISSIONNAIRESPNFL);
    }

    /**
     * Sets <code>value</code> as the associated entity PermissionnairespnflImpl.
     */
    public void setPermissionnairespnfl(PermissionnairespnflImpl value) {
        setAttributeInternal(PERMISSIONNAIRESPNFL, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getExportpfnl() {
        return (RowIterator) getAttributeInternal(EXPORTPFNL);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCertificatorigine() {
        return (RowIterator) getAttributeInternal(CERTIFICATORIGINE);
    }


    /**
     * @param idpermis key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idpermis) {
        return new Key(new Object[] { idpermis });
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
            BigDecimal id = getLastId("getLastidPermis1");
            this.setIdpermis(id);
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

