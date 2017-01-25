package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entity.AppModuleImpl;
import cm.gov.minfof.model.entity.DetailsexportpfnlImpl;
import cm.gov.minfof.model.entity.PartiesProduitsPfnlViewRowImpl;

import java.math.BigDecimal;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 17 09:56:43 WAT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailsexportpfnlViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_DETAILSEXPORTPFNL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Iddetailsexportpfnl,
        Idexportpfnl,
        Idunitemesure,
        Quantite,
        Observations,
        Idpartieproduitpfnl,
        Idcertificat,
        Idpays,
        Idcertificat1,
        numeroco,
        DetailsexportpfnlView,
        DetailsexportpfnlView1,
        DetailsexportpfnlView2,
        ExportpfnlView,
        UnitemesureView,
        PartiesProduitsPfnlView,
        UnitemesureView1,
        getLibelleProduitComplet1,
        CertificatorigineView1,
        PaysView1,
        getCoParPermisActif1;
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

    public static final int IDDETAILSEXPORTPFNL = AttributesEnum.Iddetailsexportpfnl.index();
    public static final int IDEXPORTPFNL = AttributesEnum.Idexportpfnl.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int QUANTITE = AttributesEnum.Quantite.index();
    public static final int OBSERVATIONS = AttributesEnum.Observations.index();
    public static final int IDPARTIEPRODUITPFNL = AttributesEnum.Idpartieproduitpfnl.index();
    public static final int IDCERTIFICAT = AttributesEnum.Idcertificat.index();
    public static final int IDPAYS = AttributesEnum.Idpays.index();
    public static final int IDCERTIFICAT1 = AttributesEnum.Idcertificat1.index();
    public static final int NUMEROCO = AttributesEnum.numeroco.index();
    public static final int DETAILSEXPORTPFNLVIEW = AttributesEnum.DetailsexportpfnlView.index();
    public static final int DETAILSEXPORTPFNLVIEW1 = AttributesEnum.DetailsexportpfnlView1.index();
    public static final int DETAILSEXPORTPFNLVIEW2 = AttributesEnum.DetailsexportpfnlView2.index();
    public static final int EXPORTPFNLVIEW = AttributesEnum.ExportpfnlView.index();
    public static final int UNITEMESUREVIEW = AttributesEnum.UnitemesureView.index();
    public static final int PARTIESPRODUITSPFNLVIEW = AttributesEnum.PartiesProduitsPfnlView.index();
    public static final int UNITEMESUREVIEW1 = AttributesEnum.UnitemesureView1.index();
    public static final int GETLIBELLEPRODUITCOMPLET1 = AttributesEnum.getLibelleProduitComplet1.index();
    public static final int CERTIFICATORIGINEVIEW1 = AttributesEnum.CertificatorigineView1.index();
    public static final int PAYSVIEW1 = AttributesEnum.PaysView1.index();
    public static final int GETCOPARPERMISACTIF1 = AttributesEnum.getCoParPermisActif1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DetailsexportpfnlViewRowImpl() {
    }

    /**
     * Gets Detailsexportpfnl entity object.
     * @return the Detailsexportpfnl
     */
    public DetailsexportpfnlImpl getDetailsexportpfnl() {
        return (DetailsexportpfnlImpl) getEntity(ENTITY_DETAILSEXPORTPFNL);
    }

    /**
     * Gets the attribute value for iddetailsexportpfnl using the alias name Iddetailsexportpfnl.
     * @return the iddetailsexportpfnl
     */
    public BigDecimal getIddetailsexportpfnl() {
        return (BigDecimal) getAttributeInternal(IDDETAILSEXPORTPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for iddetailsexportpfnl using the alias name Iddetailsexportpfnl.
     * @param value value to set the iddetailsexportpfnl
     */
    public void setIddetailsexportpfnl(BigDecimal value) {
        setAttributeInternal(IDDETAILSEXPORTPFNL, value);
    }

    /**
     * Gets the attribute value for idexportpfnl using the alias name Idexportpfnl.
     * @return the idexportpfnl
     */
    public BigDecimal getIdexportpfnl() {
        return (BigDecimal) getAttributeInternal(IDEXPORTPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for idexportpfnl using the alias name Idexportpfnl.
     * @param value value to set the idexportpfnl
     */
    public void setIdexportpfnl(BigDecimal value) {
        setAttributeInternal(IDEXPORTPFNL, value);
    }

    /**
     * Gets the attribute value for idunitemesure using the alias name Idunitemesure.
     * @return the idunitemesure
     */
    public BigDecimal getIdunitemesure() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESURE);
    }

    /**
     * Sets <code>value</code> as attribute value for idunitemesure using the alias name Idunitemesure.
     * @param value value to set the idunitemesure
     */
    public void setIdunitemesure(BigDecimal value) {
        setAttributeInternal(IDUNITEMESURE, value);
    }

    /**
     * Gets the attribute value for quantite using the alias name Quantite.
     * @return the quantite
     */
    public Float getQuantite() {
        return (Float) getAttributeInternal(QUANTITE);
    }

    /**
     * Sets <code>value</code> as attribute value for quantite using the alias name Quantite.
     * @param value value to set the quantite
     */
    public void setQuantite(Float value) {
        setAttributeInternal(QUANTITE, value);
    }

    /**
     * Gets the attribute value for observations using the alias name Observations.
     * @return the observations
     */
    public String getObservations() {
        return (String) getAttributeInternal(OBSERVATIONS);
    }

    /**
     * Sets <code>value</code> as attribute value for observations using the alias name Observations.
     * @param value value to set the observations
     */
    public void setObservations(String value) {
        setAttributeInternal(OBSERVATIONS, value);
    }

    /**
     * Gets the attribute value for idpartieproduitpfnl using the alias name Idpartieproduitpfnl.
     * @return the idpartieproduitpfnl
     */
    public BigDecimal getIdpartieproduitpfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIEPRODUITPFNL);
    }

    /**
     * Sets <code>value</code> as attribute value for idpartieproduitpfnl using the alias name Idpartieproduitpfnl.
     * @param value value to set the idpartieproduitpfnl
     */
    public void setIdpartieproduitpfnl(BigDecimal value) {
        setAttributeInternal(IDPARTIEPRODUITPFNL, value);
    }

    /**
     * Gets the attribute value for idcertificat using the alias name Idcertificat.
     * @return the idcertificat
     */
    public BigDecimal getIdcertificat() {
        return (BigDecimal) getAttributeInternal(IDCERTIFICAT);
    }

    /**
     * Sets <code>value</code> as attribute value for idcertificat using the alias name Idcertificat.
     * @param value value to set the idcertificat
     */
    public void setIdcertificat(BigDecimal value) {
        setAttributeInternal(IDCERTIFICAT, value);
    }

    /**
     * Gets the attribute value for idpays using the alias name Idpays.
     * @return the idpays
     */
    public BigDecimal getIdpays() {
        return (BigDecimal) getAttributeInternal(IDPAYS);
    }

    /**
     * Sets <code>value</code> as attribute value for idpays using the alias name Idpays.
     * @param value value to set the idpays
     */
    public void setIdpays(BigDecimal value) {
        setAttributeInternal(IDPAYS, value);
    }

    /**
     * Gets the attribute value for idcertificat using the alias name Idcertificat1.
     * @return the idcertificat
     */
    public BigDecimal getIdcertificat1() {
        return (BigDecimal) getAttributeInternal(IDCERTIFICAT1);
    }

    /**
     * Sets <code>value</code> as attribute value for idcertificat using the alias name Idcertificat1.
     * @param value value to set the idcertificat
     */
    public void setIdcertificat1(BigDecimal value) {
        setAttributeInternal(IDCERTIFICAT1, value);
    }

    /**
     * Gets the attribute value for numeroco using the alias name numeroco.
     * @return the numeroco
     */
    
    public String getnumeroco() {
       String result = "";
       AppModuleImpl am = (AppModuleImpl)this.getApplicationModule();
       ViewObjectImpl voIm = am.getCertificatorigineView1();
       voIm.setWhereClause("Idcertificatorigine="+getIdcertificat());
       voIm.executeQuery();
       if (voIm.hasNext()){
           Row r = voIm.next();
           result = r.getAttribute("Numeroco").toString();
           }
       return result;
       // return (String) getAttributeInternal(NUMEROCO);
    }

    /**
     * Sets <code>value</code> as attribute value for numeroco using the alias name numeroco.
     * @param value value to set the numeroco
     */
    public void setnumeroco(String value) {
        setAttributeInternal(NUMEROCO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailsexportpfnlView.
     */
    public RowIterator getDetailsexportpfnlView() {
        return (RowIterator) getAttributeInternal(DETAILSEXPORTPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailsexportpfnlView1.
     */
    public RowIterator getDetailsexportpfnlView1() {
        return (RowIterator) getAttributeInternal(DETAILSEXPORTPFNLVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DetailsexportpfnlView2.
     */
    public RowIterator getDetailsexportpfnlView2() {
        return (RowIterator) getAttributeInternal(DETAILSEXPORTPFNLVIEW2);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link ExportpfnlView.
     */
    public ViewRowImpl getExportpfnlView() {
        return (ViewRowImpl) getAttributeInternal(EXPORTPFNLVIEW);
    }

    /**
     * Sets the master-detail link ExportpfnlView between this object and <code>value</code>.
     */
    public void setExportpfnlView(ViewRowImpl value) {
        setAttributeInternal(EXPORTPFNLVIEW, value);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link UnitemesureView.
     */
    public ViewRowImpl getUnitemesureView() {
        return (ViewRowImpl) getAttributeInternal(UNITEMESUREVIEW);
    }

    /**
     * Sets the master-detail link UnitemesureView between this object and <code>value</code>.
     */
    public void setUnitemesureView(ViewRowImpl value) {
        setAttributeInternal(UNITEMESUREVIEW, value);
    }

    /**
     * Gets the associated <code>PartiesProduitsPfnlViewRowImpl</code> using master-detail link PartiesProduitsPfnlView.
     */
    public PartiesProduitsPfnlViewRowImpl getPartiesProduitsPfnlView() {
        return (PartiesProduitsPfnlViewRowImpl) getAttributeInternal(PARTIESPRODUITSPFNLVIEW);
    }

    /**
     * Sets the master-detail link PartiesProduitsPfnlView between this object and <code>value</code>.
     */
    public void setPartiesProduitsPfnlView(PartiesProduitsPfnlViewRowImpl value) {
        setAttributeInternal(PARTIESPRODUITSPFNLVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UnitemesureView1.
     */
    public RowSet getUnitemesureView1() {
        return (RowSet) getAttributeInternal(UNITEMESUREVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getLibelleProduitComplet1.
     */
    public RowSet getgetLibelleProduitComplet1() {
        return (RowSet) getAttributeInternal(GETLIBELLEPRODUITCOMPLET1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CertificatorigineView1.
     */
    public RowSet getCertificatorigineView1() {
        return (RowSet) getAttributeInternal(CERTIFICATORIGINEVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PaysView1.
     */
    public RowSet getPaysView1() {
        return (RowSet) getAttributeInternal(PAYSVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> getCoParPermisActif1.
     */
    public RowSet getgetCoParPermisActif1() {
        return (RowSet) getAttributeInternal(GETCOPARPERMISACTIF1);
    }
}
