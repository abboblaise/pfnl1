package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CommuneViewSDOImpl extends SDODataObject implements CommuneViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 5;

   public CommuneViewSDOImpl() {}

   public java.math.BigDecimal getIdcommunes() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcommunes(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getNomcommune() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setNomcommune(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIddepartements() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIddepartements(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getCodecommune() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setCodecommune(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.util.List getCommuneView() {
      return getList(START_PROPERTY_INDEX + 4);
   }

   public void setCommuneView(java.util.List value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.util.List getDepartementView() {
      return getList(START_PROPERTY_INDEX + 5);
   }

   public void setDepartementView(java.util.List value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }


}

