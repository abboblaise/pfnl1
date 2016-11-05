package cm.gov.minfof.model.entity;

import java.math.BigDecimal;

import java.math.BigInteger;

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
// ---    Sat Aug 06 08:39:28 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProduitsPfnlImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Idproduitspfnl,
        Nomscientifique,
        Nomcommercial,
        Codeproduit,
        Idfamillepfnl,
        Descriptionsommaire,
        Modeattribution,
        Idcategorie,
        ProduitsPfnl,
        IdfamillepfnlProduitsPfnl,
        PartiesProduitsPfnl,
        PartiesProduitsPfnl1,
        FamillePfnl,
        PartiesRecoltees,
        PartiesProduitsPfnl2,
        Categorieproduit;
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


    public static final int IDPRODUITSPFNL = AttributesEnum.Idproduitspfnl.index();
    public static final int NOMSCIENTIFIQUE = AttributesEnum.Nomscientifique.index();
    public static final int NOMCOMMERCIAL = AttributesEnum.Nomcommercial.index();
    public static final int CODEPRODUIT = AttributesEnum.Codeproduit.index();
    public static final int IDFAMILLEPFNL = AttributesEnum.Idfamillepfnl.index();
    public static final int DESCRIPTIONSOMMAIRE = AttributesEnum.Descriptionsommaire.index();
    public static final int MODEATTRIBUTION = AttributesEnum.Modeattribution.index();
    public static final int IDCATEGORIE = AttributesEnum.Idcategorie.index();
    public static final int PRODUITSPFNL = AttributesEnum.ProduitsPfnl.index();
    public static final int IDFAMILLEPFNLPRODUITSPFNL = AttributesEnum.IdfamillepfnlProduitsPfnl.index();
    public static final int PARTIESPRODUITSPFNL = AttributesEnum.PartiesProduitsPfnl.index();
    public static final int PARTIESPRODUITSPFNL1 = AttributesEnum.PartiesProduitsPfnl1.index();
    public static final int FAMILLEPFNL = AttributesEnum.FamillePfnl.index();
    public static final int PARTIESRECOLTEES = AttributesEnum.PartiesRecoltees.index();
    public static final int PARTIESPRODUITSPFNL2 = AttributesEnum.PartiesProduitsPfnl2.index();
    public static final int CATEGORIEPRODUIT = AttributesEnum.Categorieproduit.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProduitsPfnlImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("cm.gov.minfof.model.entity.ProduitsPfnl");
    }


    /**
     * Gets the attribute value for Idproduitspfnl, using the alias name Idproduitspfnl.
     * @return the value of Idproduitspfnl
     */
    public BigDecimal getIdproduitspfnl() {
        return (BigDecimal) getAttributeInternal(IDPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idproduitspfnl.
     * @param value value to set the Idproduitspfnl
     */
    public void setIdproduitspfnl(BigDecimal value) {
        setAttributeInternal(IDPRODUITSPFNL, value);
    }

    /**
     * Gets the attribute value for Nomscientifique, using the alias name Nomscientifique.
     * @return the value of Nomscientifique
     */
    public String getNomscientifique() {
        return (String) getAttributeInternal(NOMSCIENTIFIQUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomscientifique.
     * @param value value to set the Nomscientifique
     */
    public void setNomscientifique(String value) {
        setAttributeInternal(NOMSCIENTIFIQUE, value);
    }

    /**
     * Gets the attribute value for Nomcommercial, using the alias name Nomcommercial.
     * @return the value of Nomcommercial
     */
    public String getNomcommercial() {
        return (String) getAttributeInternal(NOMCOMMERCIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nomcommercial.
     * @param value value to set the Nomcommercial
     */
    public void setNomcommercial(String value) {
        setAttributeInternal(NOMCOMMERCIAL, value);
    }


    /**
     * Gets the attribute value for Codeproduit, using the alias name Codeproduit.
     * @return the value of Codeproduit
     */
    public String getCodeproduit() {
        return (String) getAttributeInternal(CODEPRODUIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Codeproduit.
     * @param value value to set the Codeproduit
     */
    public void setCodeproduit(String value) {
        setAttributeInternal(CODEPRODUIT, value);
    }

    /**
     * Gets the attribute value for Idfamillepfnl, using the alias name Idfamillepfnl.
     * @return the value of Idfamillepfnl
     */
    public BigDecimal getIdfamillepfnl() {
        return (BigDecimal) getAttributeInternal(IDFAMILLEPFNL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idfamillepfnl.
     * @param value value to set the Idfamillepfnl
     */
    public void setIdfamillepfnl(BigDecimal value) {
        setAttributeInternal(IDFAMILLEPFNL, value);
    }

    /**
     * Gets the attribute value for Descriptionsommaire, using the alias name Descriptionsommaire.
     * @return the value of Descriptionsommaire
     */
    public String getDescriptionsommaire() {
        return (String) getAttributeInternal(DESCRIPTIONSOMMAIRE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Descriptionsommaire.
     * @param value value to set the Descriptionsommaire
     */
    public void setDescriptionsommaire(String value) {
        setAttributeInternal(DESCRIPTIONSOMMAIRE, value);
    }

    /**
     * Gets the attribute value for Modeattribution, using the alias name Modeattribution.
     * @return the value of Modeattribution
     */
    public String getModeattribution() {
        return (String) getAttributeInternal(MODEATTRIBUTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modeattribution.
     * @param value value to set the Modeattribution
     */
    public void setModeattribution(String value) {
        setAttributeInternal(MODEATTRIBUTION, value);
    }

    /**
     * Gets the attribute value for Idcategorie, using the alias name Idcategorie.
     * @return the value of Idcategorie
     */
    public BigDecimal getIdcategorie() {
        return (BigDecimal) getAttributeInternal(IDCATEGORIE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Idcategorie.
     * @param value value to set the Idcategorie
     */
    public void setIdcategorie(BigDecimal value) {
        setAttributeInternal(IDCATEGORIE, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProduitsPfnl() {
        return (RowIterator) getAttributeInternal(PRODUITSPFNL);
    }

    /**
     * @return the associated entity ProduitsPfnlImpl.
     */
    public ProduitsPfnlImpl getIdfamillepfnlProduitsPfnl() {
        return (ProduitsPfnlImpl) getAttributeInternal(IDFAMILLEPFNLPRODUITSPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity ProduitsPfnlImpl.
     */
    public void setIdfamillepfnlProduitsPfnl(ProduitsPfnlImpl value) {
        setAttributeInternal(IDFAMILLEPFNLPRODUITSPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPartiesProduitsPfnl() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNL);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPartiesProduitsPfnl1() {
        return (RowIterator) getAttributeInternal(PARTIESPRODUITSPFNL1);
    }

    /**
     * @return the associated entity FamillePfnlImpl.
     */
    public FamillePfnlImpl getFamillePfnl() {
        return (FamillePfnlImpl) getAttributeInternal(FAMILLEPFNL);
    }

    /**
     * Sets <code>value</code> as the associated entity FamillePfnlImpl.
     */
    public void setFamillePfnl(FamillePfnlImpl value) {
        setAttributeInternal(FAMILLEPFNL, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public PartiesRecolteesImpl getPartiesRecoltees() {
        return (PartiesRecolteesImpl) getAttributeInternal(PARTIESRECOLTEES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPartiesRecoltees(PartiesRecolteesImpl value) {
        setAttributeInternal(PARTIESRECOLTEES, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public PartiesProduitsPfnlImpl getPartiesProduitsPfnl2() {
        return (PartiesProduitsPfnlImpl) getAttributeInternal(PARTIESPRODUITSPFNL2);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPartiesProduitsPfnl2(PartiesProduitsPfnlImpl value) {
        setAttributeInternal(PARTIESPRODUITSPFNL2, value);
    }


    /**
     * @return the associated entity CategorieproduitImpl.
     */
    public CategorieproduitImpl getCategorieproduit() {
        return (CategorieproduitImpl) getAttributeInternal(CATEGORIEPRODUIT);
    }

    /**
     * Sets <code>value</code> as the associated entity CategorieproduitImpl.
     */
    public void setCategorieproduit(CategorieproduitImpl value) {
        setAttributeInternal(CATEGORIEPRODUIT, value);
    }


    /**
     * @param idproduitspfnl key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal idproduitspfnl) {
        return new Key(new Object[] { idproduitspfnl });
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
            BigDecimal id = getLastId("getLastIdProduits1");
            setIdproduitspfnl(id);
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
            System.out.println("entree dans la condition hasNext");
            Row r = vo.next();
            System.out.println("row = " + r);
            lastId = (BigDecimal) r.getAttribute(0);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId; 
    }
}

