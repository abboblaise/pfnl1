package cm.gov.minfof.model.entityviewobject.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class LettrevoitureViewSDOImpl extends SDODataObject implements LettrevoitureViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 14;

   public LettrevoitureViewSDOImpl() {}

   public java.math.BigDecimal getIdlettrevoiture() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setIdlettrevoiture(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getIdpermissionnaire() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setIdpermissionnaire(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getIddepartementdestination() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setIddepartementdestination(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getNomconducteur() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setNomconducteur(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getIdpostechargement() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setIdpostechargement(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getNumerolettrevoiture() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setNumerolettrevoiture(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.math.BigDecimal getIdpermis() {
      return getBigDecimal(START_PROPERTY_INDEX + 6);
   }

   public void setIdpermis(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getDatelettrevoiture() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setDatelettrevoiture(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getImmatriculation() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setImmatriculation(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.math.BigDecimal getIddepartemental() {
      return getBigDecimal(START_PROPERTY_INDEX + 9);
   }

   public void setIddepartemental(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.math.BigDecimal getIdregional() {
      return getBigDecimal(START_PROPERTY_INDEX + 10);
   }

   public void setIdregional(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.math.BigDecimal getIdpostechargement1() {
      return getBigDecimal(START_PROPERTY_INDEX + 11);
   }

   public void setIdpostechargement1(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getNomdepart() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setNomdepart(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.util.List getLettrevoitureView2() {
      return getList(START_PROPERTY_INDEX + 13);
   }

   public void setLettrevoitureView2(java.util.List value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.util.List getLettrevoitureView4() {
      return getList(START_PROPERTY_INDEX + 14);
   }

   public void setLettrevoitureView4(java.util.List value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }


}

