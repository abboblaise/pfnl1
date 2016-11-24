package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class CollectepfnlViewSDOImpl extends SDODataObject implements CollectepfnlViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public CollectepfnlViewSDOImpl() {}

   public java.math.BigDecimal getIdcollectepfnl() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdcollectepfnl(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.sql.Date getDatecollecte() {
      return (java.sql.Date)get(START_PROPERTY_INDEX + 1);
   }

   public void setDatecollecte(java.sql.Date value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getIdentificateur() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setIdentificateur(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getIddepartement() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setIddepartement(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getCodepcfc() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setCodepcfc(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getIdlocalite() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setIdlocalite(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.util.List getCollectepfnlView() {
      return getList(START_PROPERTY_INDEX + 6);
   }

   public void setCollectepfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.util.List getDetailscollectepfnlView() {
      return getList(START_PROPERTY_INDEX + 7);
   }

   public void setDetailscollectepfnlView(java.util.List value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}

