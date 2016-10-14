package cm.gov.minfof.model.entityviewobject;

import java.math.BigDecimal;

import oracle.jbo.RowIterator;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jul 29 10:29:09 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PartiesproduitspfnlViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idpartiesproduitspfnl,
        Idpartiesrecoltees,
        Idproduitspfnl,
        Estunproduitpfnl,
        Idunitemesure,
        Idunitemesureexport,
        ProduitspfnlView,
        IdproduitspfnlPartiesproduitspfnlView,
        IdpartiesrecolteesPartiesproduitspfnlView;
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
    public static final int ESTUNPRODUITPFNL = AttributesEnum.Estunproduitpfnl.index();
    public static final int IDUNITEMESURE = AttributesEnum.Idunitemesure.index();
    public static final int IDUNITEMESUREEXPORT = AttributesEnum.Idunitemesureexport.index();
    public static final int PRODUITSPFNLVIEW = AttributesEnum.ProduitspfnlView.index();
    public static final int IDPRODUITSPFNLPARTIESPRODUITSPFNLVIEW =
        AttributesEnum.IdproduitspfnlPartiesproduitspfnlView.index();
    public static final int IDPARTIESRECOLTEESPARTIESPRODUITSPFNLVIEW =
        AttributesEnum.IdpartiesrecolteesPartiesproduitspfnlView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PartiesproduitspfnlViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Idpartiesproduitspfnl.
     * @return the Idpartiesproduitspfnl
     */
    public BigDecimal getIdpartiesproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPARTIESPRODUITSPFNL);
    }

    /**
     * Gets the attribute value for the calculated attribute Idpartiesrecoltees.
     * @return the Idpartiesrecoltees
     */
    public BigDecimal getIdpartiesrecoltees() {
        return (BigDecimal) getAttributeInternal(IDPARTIESRECOLTEES);
    }

    /**
     * Gets the attribute value for the calculated attribute Idproduitspfnl.
     * @return the Idproduitspfnl
     */
    public BigDecimal getIdproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPRODUITSPFNL);
    }

    /**
     * Gets the attribute value for the calculated attribute Estunproduitpfnl.
     * @return the Estunproduitpfnl
     */
    public Integer getEstunproduitpfnl() {
        return (Integer) getAttributeInternal(ESTUNPRODUITPFNL);
    }


    /**
     * Gets the attribute value for the calculated attribute Idunitemesure.
     * @return the Idunitemesure
     */
    public BigDecimal getIdunitemesure() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESURE);
    }

    /**
     * Gets the attribute value for the calculated attribute Idunitemesureexport.
     * @return the Idunitemesureexport
     */
    public BigDecimal getIdunitemesureexport() {
        return (BigDecimal) getAttributeInternal(IDUNITEMESUREEXPORT);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ProduitspfnlView.
     */
    public RowIterator getProduitspfnlView() {
        return (RowIterator) getAttributeInternal(PRODUITSPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link IdproduitspfnlPartiesproduitspfnlView.
     */
    public RowIterator getIdproduitspfnlPartiesproduitspfnlView() {
        return (RowIterator) getAttributeInternal(IDPRODUITSPFNLPARTIESPRODUITSPFNLVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link IdpartiesrecolteesPartiesproduitspfnlView.
     */
    public RowIterator getIdpartiesrecolteesPartiesproduitspfnlView() {
        return (RowIterator) getAttributeInternal(IDPARTIESRECOLTEESPARTIESPRODUITSPFNLVIEW);
    }
}
