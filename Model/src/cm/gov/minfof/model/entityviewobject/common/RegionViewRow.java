package cm.gov.minfof.model.entityviewobject.common;

import java.math.BigDecimal;

import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 27 11:59:45 WAT 2016
// ---------------------------------------------------------------------
public interface RegionViewRow extends Row {
    BigDecimal getIdregions();

    void setIdregions(BigDecimal value);

    String getNomregion();

    void setNomregion(String value);

    String getCoderegion();

    void setCoderegion(String value);

    String getDescriptionregions();

    void setDescriptionregions(String value);

    String getCheflieuregion();

    void setCheflieuregion(String value);
}

