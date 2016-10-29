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
// ---    Thu Oct 13 13:51:09 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExportpfnlImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idexportpfnl,
        Idpermis,
        Idpermissionnaire,
        Numeroexport,
        Numeroco,
        Exportpfnl,
        IdpermissionnaireExportpfnl,
        Exportpfnl1,
        IdpermisExportpfnl,
        Permis,
        Permissionnairespnfl,
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


    public static final int IDEXPORTPFNL = AttributesEnum.Idexportpfnl.index();
    public static final int IDPERMIS = AttributesEnum.Idpermis.index();
    public static final int IDPERMISSIONNAIRE = AttributesEnum.Idpermissionnaire.index();
    public static final int NUMEROEXPORT = AttributesEnum.Numeroexport.index();
    public static final int NUMEROCO = AttributesEnum.Numeroco.index();
    public static final int EXPORTPFNL = AttributesEnum.Exportpfnl.index();
    public static final int IDPERMISSIONNAIREEXPORTPFNL = AttributesEnum.IdpermissionnaireExportpfnl.index();
    public static final int EXPORTPFNL1 = AttributesEnum.Exportpfnl1.index();
    public static final int IDPERMISEXPORTPFNL = AttributesEnum.IdpermisExportpfnl.index();
    public static final int PERMIS = AttributesEnum.Permis.index();
    public static final int PERMISSIONNAIRESPNFL = AttributesEnum.Permissionnairespnfl.index();
    public static final int DETAILSEXPORTPFNL = AttributesEnum.Detailsexportpfnl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ExportpfnlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.Exportpfnl");
    }


    /**
     * Gets the attribute value for Idexportpfnl, using the alias name Idexportpfnl.
     * @return the value of Idexportpfnl
     */
    public BigDecimal getIdexportpfnl() {
        return (BigDecimal) getAttributeInternal(IDEXPORTPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idexportpfnl.
     * @param value value to set the Idexportpfnl
     */
    public void setIdexportpfnl(BigDecimal value) {
        setAttributeInternal(IDEXPORTPFNL, value);
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
     * Gets the attribute value for Numeroexport, using the alias name Numeroexport.
     * @return the value of Numeroexport
     */
    public String getNumeroexport() {
        return (String) getAttributeInternal(NUMEROEXPORT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Numeroexport.
     * @param value value to set the Numeroexport
     */
    public void setNumeroexport(String value) {
        setAttributeInternal(NUMEROEXPORT, value);
    }

    /**
     * Gets the attribute value for Numeroco, using the alias name Numeroco.
     * @return the value of Numeroco
     */
    public String getNumeroco() {
        return (String) getAttributeInternal(NUMEROCO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Numeroco.
     * @param value value to set the Numeroco
     */
    public void setNumeroco(String value) {
        setAttributeInternal(NUMEROCO, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getExportpfnl() {
        return (RowIterator) getAttributeInternal(EXPORTPFNL);
    }

    /**
     * @return the associated entity ExportpfnlImpl.
     */
    public ExportpfnlImpl getIdpermissionnaireExportpfnl() {
        return (ExportpfnlImpl) getAttributeInternal(IDPERMISSIONNAIREEXPORTPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity ExportpfnlImpl.
     */
    public void setIdpermissionnaireExportpfnl(ExportpfnlImpl value) {
        setAttributeInternal(IDPERMISSIONNAIREEXPORTPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getExportpfnl1() {
        return (RowIterator) getAttributeInternal(EXPORTPFNL1);
    }

    /**
     * @return the associated entity ExportpfnlImpl.
     */
    public ExportpfnlImpl getIdpermisExportpfnl() {
        return (ExportpfnlImpl) getAttributeInternal(IDPERMISEXPORTPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity ExportpfnlImpl.
     */
    public void setIdpermisExportpfnl(ExportpfnlImpl value) {
        setAttributeInternal(IDPERMISEXPORTPFNL, value);
    }

    /**
     * @return the associated entity PermisImpl.
     */
    public PermisImpl getPermis() {
        return (PermisImpl) getAttributeInternal(PERMIS);
    }

    /**
     * Sets <code>value</code> as the associated entity PermisImpl.
     */
    public void setPermis(PermisImpl value) {
        setAttributeInternal(PERMIS, value);
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
    public RowIterator getDetailsexportpfnl() {
        return (RowIterator) getAttributeInternal(DETAILSEXPORTPFNL);
    }


    /**
     * @param idexportpfnl key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idexportpfnl) {
        return new Key(new Object[] { idexportpfnl });
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
            BigDecimal id = getLastId("getLastIdExport1");
            setIdexportpfnl(id);
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

