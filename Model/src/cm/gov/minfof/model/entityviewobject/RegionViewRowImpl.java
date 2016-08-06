package cm.gov.minfof.model.entityviewobject;

import cm.gov.minfof.model.entityviewobject.common.RegionViewRow;

import java.math.BigDecimal;

import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 27 11:59:43 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RegionViewRowImpl extends ViewRowImpl implements RegionViewRow {

    public static final int ENTITY_REGION = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idregions,
        Nomregion,
        Coderegion,
        Descriptionregions,
        Cheflieuregion,
        DepartementView,
        CommuneView;
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

    public static final int IDREGIONS = AttributesEnum.Idregions.index();
    public static final int NOMREGION = AttributesEnum.Nomregion.index();
    public static final int CODEREGION = AttributesEnum.Coderegion.index();
    public static final int DESCRIPTIONREGIONS = AttributesEnum.Descriptionregions.index();
    public static final int CHEFLIEUREGION = AttributesEnum.Cheflieuregion.index();
    public static final int DEPARTEMENTVIEW = AttributesEnum.DepartementView.index();
    public static final int COMMUNEVIEW = AttributesEnum.CommuneView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RegionViewRowImpl() {
    }

    /**
     * Gets Region entity object.
     * @return the Region
     */
    public EntityImpl getRegion() {
        return (EntityImpl) getEntity(ENTITY_REGION);
    }

    /**
     * Gets the attribute value for idregions using the alias name Idregions.
     * @return the idregions
     */
    public BigDecimal getIdregions() {
        return (BigDecimal) getAttributeInternal(IDREGIONS);
    }

    /**
     * Sets <code>value</code> as attribute value for idregions using the alias name Idregions.
     * @param value value to set the idregions
     */
    public void setIdregions(BigDecimal value) {
        setAttributeInternal(IDREGIONS, value);
    }

    /**
     * Gets the attribute value for nomregion using the alias name Nomregion.
     * @return the nomregion
     */
    public String getNomregion() {
        return (String) getAttributeInternal(NOMREGION);
    }

    /**
     * Sets <code>value</code> as attribute value for nomregion using the alias name Nomregion.
     * @param value value to set the nomregion
     */
    public void setNomregion(String value) {
        setAttributeInternal(NOMREGION, value);
    }

    /**
     * Gets the attribute value for coderegion using the alias name Coderegion.
     * @return the coderegion
     */
    public String getCoderegion() {
        return (String) getAttributeInternal(CODEREGION);
    }

    /**
     * Sets <code>value</code> as attribute value for coderegion using the alias name Coderegion.
     * @param value value to set the coderegion
     */
    public void setCoderegion(String value) {
        setAttributeInternal(CODEREGION, value);
    }

    /**
     * Gets the attribute value for descriptionregions using the alias name Descriptionregions.
     * @return the descriptionregions
     */
    public String getDescriptionregions() {
        return (String) getAttributeInternal(DESCRIPTIONREGIONS);
    }

    /**
     * Sets <code>value</code> as attribute value for descriptionregions using the alias name Descriptionregions.
     * @param value value to set the descriptionregions
     */
    public void setDescriptionregions(String value) {
        setAttributeInternal(DESCRIPTIONREGIONS, value);
    }

    /**
     * Gets the attribute value for cheflieuregion using the alias name Cheflieuregion.
     * @return the cheflieuregion
     */
    public String getCheflieuregion() {
        return (String) getAttributeInternal(CHEFLIEUREGION);
    }

    /**
     * Sets <code>value</code> as attribute value for cheflieuregion using the alias name Cheflieuregion.
     * @param value value to set the cheflieuregion
     */
    public void setCheflieuregion(String value) {
        setAttributeInternal(CHEFLIEUREGION, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DepartementView.
     */
    public RowIterator getDepartementView() {
        return (RowIterator) getAttributeInternal(DEPARTEMENTVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CommuneView.
     */
    public RowIterator getCommuneView() {
        return (RowIterator) getAttributeInternal(COMMUNEVIEW);
    }
}

