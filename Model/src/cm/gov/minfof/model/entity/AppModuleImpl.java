package cm.gov.minfof.model.entity;

import cm.gov.minfof.model.entity.common.*;
import cm.gov.minfof.model.entityviewobject.NiveauValidationViewImpl;
import cm.gov.minfof.model.entityviewobject.RegionViewImpl;

import cm.gov.minfof.model.entityviewobject.gestLastIdUnitMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIcCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCategorieUniteMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCommunesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDepartementsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsexportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdExportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdFamillesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdOriginePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPartiesRecolteesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPaysImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPermissionnairePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdProduitsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdRegionsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdartiesProduitsPfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitPfnlImpl;
import cm.gov.minfof.model.entityviewobject.listeExploitantImpl;
import cm.gov.minfof.model.entityviewobject.listeOrigineImpl;
import cm.gov.minfof.model.entityviewobject.listeQualitePermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeSexeImpl;
import cm.gov.minfof.model.entityviewobject.listeStatutPermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeTypePersonneImpl;
import cm.gov.minfof.model.entityviewobject.permisActifViewImpl;
import cm.gov.minfof.model.entityviewobject.typeDocumentViewImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
import cm.gov.minfof.model.entityviewobject.getLastIcCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCategorieUniteMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCollectePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCommunesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDepartementsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsexportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdExportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdFamillesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdOriginePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPartiesRecolteesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPaysImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPermissionnairePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdProduitsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdRegionsImpl;

import cm.gov.minfof.model.entityviewobject.getLastIdartiesProduitsPfnlImpl;

import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletImpl;
import cm.gov.minfof.model.entityviewobject.listeExploitantImpl;
import cm.gov.minfof.model.entityviewobject.listeOrigineImpl;

import cm.gov.minfof.model.entityviewobject.listeQualitePermissionnaireImpl;

import cm.gov.minfof.model.entityviewobject.listeSexeImpl;
import cm.gov.minfof.model.entityviewobject.listeStatutPermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeTypePersonneImpl;

import cm.gov.minfof.model.entityviewobject.permisActifViewImpl;

import cm.gov.minfof.model.entityviewobject.typeDocumentViewImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;


//import cm.gov.minfof.model.entityviewobject.getLastIdCategorieMesureImpl;

import cm.gov.minfof.model.entityviewobject.getLastIdCategorieUniteMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCollectePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCommunesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDepartementsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdFamillesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdOriginePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPartiesRecolteesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPaysImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPermissionnairePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdProduitsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdRegionsImpl;

import cm.gov.minfof.model.entityviewobject.getLastIdartiesProduitsPfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitPfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletImpl;
import cm.gov.minfof.model.entityviewobject.listeExploitantImpl;
import cm.gov.minfof.model.entityviewobject.listeOrigineImpl;

import cm.gov.minfof.model.entityviewobject.listeQualitePermissionnaireImpl;

import cm.gov.minfof.model.entityviewobject.listeSexeImpl;
import cm.gov.minfof.model.entityviewobject.listeStatutPermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeTypePersonneImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 05 11:35:57 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    
    
    
    
    /**
     * @return
     */
    public BigDecimal creerIdRegion() {
        BigDecimal lastId=new BigDecimal(0);
        getLastIdRegionsImpl vo = this.getgetLastIdRegions1();
        vo.executeQuery();
        if (vo.hasNext()) {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
            //System.out.println("lastid = " + lastId);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId;
    }
    
    /**
     * Container's getter for CommuneView1.
     * @return CommuneView1
     */
    public ViewObjectImpl getCommuneView1() {
        return (ViewObjectImpl) findViewObject("CommuneView1");
    }

    /**
     * Container's getter for DepartementView1.
     * @return DepartementView1
     */
    public ViewObjectImpl getDepartementView1() {
        return (ViewObjectImpl) findViewObject("DepartementView1");
    }

    /**
     * Container's getter for RegionView1.
     * @return RegionView1
     */
    public RegionViewImpl getRegionView1() {
        return (RegionViewImpl) findViewObject("RegionView1");
    }

    /**
     * Container's getter for RegionsView1.
     * @return RegionsView1
     */
    public ViewObjectImpl getRegionsView1() {
        return (ViewObjectImpl) findViewObject("RegionsView1");
    }

    /**
     * Container's getter for CommunesView1.
     * @return CommunesView1
     */
    public ViewObjectImpl getCommunesView1() {
        return (ViewObjectImpl) findViewObject("CommunesView1");
    }

    /**
     * Container's getter for DepartementsView1.
     * @return DepartementsView1
     */
    public ViewObjectImpl getDepartementsView1() {
        return (ViewObjectImpl) findViewObject("DepartementsView1");
    }

    /**
     * Container's getter for DepartementView2.
     * @return DepartementView2
     */
    public ViewObjectImpl getDepartementView2() {
        return (ViewObjectImpl) findViewObject("DepartementView2");
    }

    /**
     * Container's getter for DepartementView3.
     * @return DepartementView3
     */
    public ViewObjectImpl getDepartementView3() {
        return (ViewObjectImpl) findViewObject("DepartementView3");
    }

    /**
     * Container's getter for CommuneView2.
     * @return CommuneView2
     */
    public ViewObjectImpl getCommuneView2() {
        return (ViewObjectImpl) findViewObject("CommuneView2");
    }

    /**
     * Container's getter for DepartementView4.
     * @return DepartementView4
     */
    public ViewObjectImpl getDepartementView4() {
        return (ViewObjectImpl) findViewObject("DepartementView4");
    }

    /**
     * Container's getter for CommuneView3.
     * @return CommuneView3
     */
    public ViewObjectImpl getCommuneView3() {
        return (ViewObjectImpl) findViewObject("CommuneView3");
    }

    /**
     * Container's getter for CommuneView4.
     * @return CommuneView4
     */
    public ViewObjectImpl getCommuneView4() {
        return (ViewObjectImpl) findViewObject("CommuneView4");
    }

    /**
     * Container's getter for CommunesView2.
     * @return CommunesView2
     */
    public ViewObjectImpl getCommunesView2() {
        return (ViewObjectImpl) findViewObject("CommunesView2");
    }

    /**
     * Container's getter for DepartementsView2.
     * @return DepartementsView2
     */
    public ViewObjectImpl getDepartementsView2() {
        return (ViewObjectImpl) findViewObject("DepartementsView2");
    }

    /**
     * Container's getter for CommunesView3.
     * @return CommunesView3
     */
    public ViewObjectImpl getCommunesView3() {
        return (ViewObjectImpl) findViewObject("CommunesView3");
    }

    /**
     * Container's getter for DepartementsView3.
     * @return DepartementsView3
     */
    public ViewObjectImpl getDepartementsView3() {
        return (ViewObjectImpl) findViewObject("DepartementsView3");
    }

    /**
     * Container's getter for CommunesView4.
     * @return CommunesView4
     */
    public ViewObjectImpl getCommunesView4() {
        return (ViewObjectImpl) findViewObject("CommunesView4");
    }

    /**
     * Container's getter for DepartementsView4.
     * @return DepartementsView4
     */
    public ViewObjectImpl getDepartementsView4() {
        return (ViewObjectImpl) findViewObject("DepartementsView4");
    }

    /**
     * Container's getter for CommuneView5.
     * @return CommuneView5
     */
    public ViewObjectImpl getCommuneView5() {
        return (ViewObjectImpl) findViewObject("CommuneView5");
    }

    /**
     * Container's getter for FamillePfnlView1.
     * @return FamillePfnlView1
     */
    public ViewObjectImpl getFamillePfnlView1() {
        return (ViewObjectImpl) findViewObject("FamillePfnlView1");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView1.
     * @return PartiesProduitsPfnlView1
     */
    public ViewObjectImpl getPartiesProduitsPfnlView1() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView1");
    }

    /**
     * Container's getter for PartiesRecolteesView1.
     * @return PartiesRecolteesView1
     */
    public ViewObjectImpl getPartiesRecolteesView1() {
        return (ViewObjectImpl) findViewObject("PartiesRecolteesView1");
    }

    /**
     * Container's getter for ProduitsPfnlView1.
     * @return ProduitsPfnlView1
     */
    public ViewObjectImpl getProduitsPfnlView1() {
        return (ViewObjectImpl) findViewObject("ProduitsPfnlView1");
    }

    /**
     * Container's getter for ProduitspfnlView2.
     * @return ProduitspfnlView2
     */
    public ViewObjectImpl getProduitspfnlView2() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView2");
    }

    /**
     * Container's getter for PartiesrecolteesView2.
     * @return PartiesrecolteesView2
     */
    public ViewObjectImpl getPartiesrecolteesView2() {
        return (ViewObjectImpl) findViewObject("PartiesrecolteesView2");
    }

    /**
     * Container's getter for PartiesproduitspfnlView2.
     * @return PartiesproduitspfnlView2
     */
    public ViewObjectImpl getPartiesproduitspfnlView2() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView2");
    }

    /**
     * Container's getter for FamillepfnlView2.
     * @return FamillepfnlView2
     */
    public ViewObjectImpl getFamillepfnlView2() {
        return (ViewObjectImpl) findViewObject("FamillepfnlView2");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView3.
     * @return PartiesProduitsPfnlView3
     */
    public ViewObjectImpl getPartiesProduitsPfnlView3() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView3");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView4.
     * @return PartiesProduitsPfnlView4
     */
    public ViewObjectImpl getPartiesProduitsPfnlView4() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView4");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView5.
     * @return PartiesProduitsPfnlView5
     */
    public ViewObjectImpl getPartiesProduitsPfnlView5() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView5");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView6.
     * @return PartiesProduitsPfnlView6
     */
    public ViewObjectImpl getPartiesProduitsPfnlView6() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView6");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView7.
     * @return PartiesProduitsPfnlView7
     */
    public ViewObjectImpl getPartiesProduitsPfnlView7() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView7");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView8.
     * @return PartiesProduitsPfnlView8
     */
    public ViewObjectImpl getPartiesProduitsPfnlView8() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView8");
    }

    /**
     * Container's getter for ProduitsPfnlView3.
     * @return ProduitsPfnlView3
     */
    public ViewObjectImpl getProduitsPfnlView3() {
        return (ViewObjectImpl) findViewObject("ProduitsPfnlView3");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView9.
     * @return PartiesProduitsPfnlView9
     */
    public ViewObjectImpl getPartiesProduitsPfnlView9() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView9");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView10.
     * @return PartiesProduitsPfnlView10
     */
    public ViewObjectImpl getPartiesProduitsPfnlView10() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView10");
    }

    /**
     * Container's getter for ProduitsPfnlView4.
     * @return ProduitsPfnlView4
     */
    public ViewObjectImpl getProduitsPfnlView4() {
        return (ViewObjectImpl) findViewObject("ProduitsPfnlView4");
    }

    /**
     * Container's getter for ProduitsPfnlView5.
     * @return ProduitsPfnlView5
     */
    public ViewObjectImpl getProduitsPfnlView5() {
        return (ViewObjectImpl) findViewObject("ProduitsPfnlView5");
    }

    /**
     * Container's getter for ProduitsPfnlView6.
     * @return ProduitsPfnlView6
     */
    public ViewObjectImpl getProduitsPfnlView6() {
        return (ViewObjectImpl) findViewObject("ProduitsPfnlView6");
    }

    /**
     * Container's getter for ProduitspfnlView7.
     * @return ProduitspfnlView7
     */
    public ViewObjectImpl getProduitspfnlView7() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView7");
    }

    /**
     * Container's getter for PartiesproduitspfnlView11.
     * @return PartiesproduitspfnlView11
     */
    public ViewObjectImpl getPartiesproduitspfnlView11() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView11");
    }

    /**
     * Container's getter for PartiesproduitspfnlView12.
     * @return PartiesproduitspfnlView12
     */
    public ViewObjectImpl getPartiesproduitspfnlView12() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView12");
    }

    /**
     * Container's getter for ProduitspfnlView8.
     * @return ProduitspfnlView8
     */
    public ViewObjectImpl getProduitspfnlView8() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView8");
    }

    /**
     * Container's getter for PartiesproduitspfnlView13.
     * @return PartiesproduitspfnlView13
     */
    public ViewObjectImpl getPartiesproduitspfnlView13() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView13");
    }

    /**
     * Container's getter for PartiesproduitspfnlView14.
     * @return PartiesproduitspfnlView14
     */
    public ViewObjectImpl getPartiesproduitspfnlView14() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView14");
    }

    /**
     * Container's getter for ProduitspfnlView9.
     * @return ProduitspfnlView9
     */
    public ViewObjectImpl getProduitspfnlView9() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView9");
    }

    /**
     * Container's getter for PartiesproduitspfnlView15.
     * @return PartiesproduitspfnlView15
     */
    public ViewObjectImpl getPartiesproduitspfnlView15() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView15");
    }

    /**
     * Container's getter for PartiesproduitspfnlView16.
     * @return PartiesproduitspfnlView16
     */
    public ViewObjectImpl getPartiesproduitspfnlView16() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView16");
    }

    /**
     * Container's getter for ProduitspfnlView10.
     * @return ProduitspfnlView10
     */
    public ViewObjectImpl getProduitspfnlView10() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView10");
    }

    /**
     * Container's getter for PartiesproduitspfnlView17.
     * @return PartiesproduitspfnlView17
     */
    public ViewObjectImpl getPartiesproduitspfnlView17() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView17");
    }

    /**
     * Container's getter for PartiesproduitspfnlView18.
     * @return PartiesproduitspfnlView18
     */
    public ViewObjectImpl getPartiesproduitspfnlView18() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView18");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView19.
     * @return PartiesProduitsPfnlView19
     */
    public ViewObjectImpl getPartiesProduitsPfnlView19() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView19");
    }

    /**
     * Container's getter for DepartementsIbfk1Link1.
     * @return DepartementsIbfk1Link1
     */
    public ViewLinkImpl getDepartementsIbfk1Link1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link1");
    }

    /**
     * Container's getter for DepartementsIbfk1Assoc1Link1.
     * @return DepartementsIbfk1Assoc1Link1
     */
    public ViewLinkImpl getDepartementsIbfk1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Assoc1Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Link1.
     * @return CommunesIbfk1Link1
     */
    public ViewLinkImpl getCommunesIbfk1Link1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link1");
    }

    /**
     * Container's getter for DepartementsIbfk1Assoc2Link1.
     * @return DepartementsIbfk1Assoc2Link1
     */
    public ViewLinkImpl getDepartementsIbfk1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Assoc2Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Assoc1Link1.
     * @return CommunesIbfk1Assoc1Link1
     */
    public ViewLinkImpl getCommunesIbfk1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Assoc1Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Assoc2Link1.
     * @return CommunesIbfk1Assoc2Link1
     */
    public ViewLinkImpl getCommunesIbfk1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Assoc2Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Link2.
     * @return CommunesIbfk1Link2
     */
    public ViewLinkImpl getCommunesIbfk1Link2() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link2");
    }

    /**
     * Container's getter for DepartementsIbfk1Link2.
     * @return DepartementsIbfk1Link2
     */
    public ViewLinkImpl getDepartementsIbfk1Link2() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link2");
    }

    /**
     * Container's getter for CommunesIbfk1Link1_1.
     * @return CommunesIbfk1Link1_1
     */
    public ViewLinkImpl getCommunesIbfk1Link1_1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link1_1");
    }

    /**
     * Container's getter for DepartementsIbfk1Link1_1.
     * @return DepartementsIbfk1Link1_1
     */
    public ViewLinkImpl getDepartementsIbfk1Link1_1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link1_1");
    }

    /**
     * Container's getter for CommunesIbfk1Link2_1.
     * @return CommunesIbfk1Link2_1
     */
    public ViewLinkImpl getCommunesIbfk1Link2_1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link2_1");
    }

    /**
     * Container's getter for DepartementsIbfk1Link2_1.
     * @return DepartementsIbfk1Link2_1
     */
    public ViewLinkImpl getDepartementsIbfk1Link2_1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link2_1");
    }

    /**
     * Container's getter for CommunesIbfk1Assoc2Link2.
     * @return CommunesIbfk1Assoc2Link2
     */
    public ViewLinkImpl getCommunesIbfk1Assoc2Link2() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Assoc2Link2");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link1.
     * @return FkPartiesproduitspfnl2Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link1.
     * @return FkPartiesproduitspfnl1Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc1Link1.
     * @return FkPartiesproduitspfnl2Assoc1Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc1Link1.
     * @return FkPartiesproduitspfnl1Assoc1Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc2Link1.
     * @return FkPartiesproduitspfnl2Assoc2Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc2Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc2Link1.
     * @return FkPartiesproduitspfnl1Assoc2Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc2Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link1.
     * @return ProduitspfnlIbfk1Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc3Link1.
     * @return FkPartiesproduitspfnl2Assoc3Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc3Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc3Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc3Link1.
     * @return FkPartiesproduitspfnl1Assoc3Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc3Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc3Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc1Link1.
     * @return ProduitspfnlIbfk1Assoc1Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc1Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc2Link1.
     * @return ProduitspfnlIbfk1Assoc2Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc2Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc3Link1.
     * @return ProduitspfnlIbfk1Assoc3Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc3Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc3Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link2.
     * @return ProduitspfnlIbfk1Link2
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link2() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link2");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link2.
     * @return FkPartiesproduitspfnl1Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link2");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link2.
     * @return FkPartiesproduitspfnl2Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link2");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link1_1.
     * @return ProduitspfnlIbfk1Link1_1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link1_1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link1_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link1_1.
     * @return FkPartiesproduitspfnl1Link1_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link1_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link1_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link1_1.
     * @return FkPartiesproduitspfnl2Link1_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link1_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link1_1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link2_1.
     * @return ProduitspfnlIbfk1Link2_1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link2_1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link2_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link2_1.
     * @return FkPartiesproduitspfnl1Link2_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link2_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link2_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link2_1.
     * @return FkPartiesproduitspfnl2Link2_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link2_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link2_1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link3_1.
     * @return ProduitspfnlIbfk1Link3_1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link3_1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link3_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link3_1.
     * @return FkPartiesproduitspfnl1Link3_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link3_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link3_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link3_1.
     * @return FkPartiesproduitspfnl2Link3_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link3_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link3_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc3Link2.
     * @return FkPartiesproduitspfnl1Assoc3Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc3Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc3Link2");
    }

    /**
     * Container's getter for getLastIdRegions1.
     * @return getLastIdRegions1
     */
    public getLastIdRegionsImpl getgetLastIdRegions1() {
        return (getLastIdRegionsImpl) findViewObject("getLastIdRegions1");
    }

    /**
     * Container's getter for getLastIdDepartements1.
     * @return getLastIdDepartements1
     */
    public getLastIdDepartementsImpl getgetLastIdDepartements1() {
        return (getLastIdDepartementsImpl) findViewObject("getLastIdDepartements1");
    }

    /**
     * Container's getter for getLastIdCommunes1.
     * @return getLastIdCommunes1
     */
    public getLastIdCommunesImpl getgetLastIdCommunes1() {
        return (getLastIdCommunesImpl) findViewObject("getLastIdCommunes1");
    }

    /**
     * Container's getter for getLastIdFamilles1.
     * @return getLastIdFamilles1
     */
    public getLastIdFamillesImpl getgetLastIdFamilles1() {
        return (getLastIdFamillesImpl) findViewObject("getLastIdFamilles1");
    }

    /**
     * Container's getter for getLastIdProduits1.
     * @return getLastIdProduits1
     */
    public getLastIdProduitsImpl getgetLastIdProduits1() {
        return (getLastIdProduitsImpl) findViewObject("getLastIdProduits1");
    }

    /**
     * Container's getter for getLastIdPartiesRecoltees1.
     * @return getLastIdPartiesRecoltees1
     */
    public getLastIdPartiesRecolteesImpl getgetLastIdPartiesRecoltees1() {
        return (getLastIdPartiesRecolteesImpl) findViewObject("getLastIdPartiesRecoltees1");
    }

    /**
     * Container's getter for getLastIdartiesProduitsPfnl1.
     * @return getLastIdartiesProduitsPfnl1
     */
    public getLastIdartiesProduitsPfnlImpl getgetLastIdartiesProduitsPfnl1() {
        return (getLastIdartiesProduitsPfnlImpl) findViewObject("getLastIdartiesProduitsPfnl1");
    }

    /**
     * Container's getter for PaysView1.
     * @return PaysView1
     */
    public ViewObjectImpl getPaysView1() {
        return (ViewObjectImpl) findViewObject("PaysView1");
    }

    /**
     * Container's getter for PaysView1_1.
     * @return PaysView1_1
     */
    public ViewObjectImpl getPaysView1_1() {
        return (ViewObjectImpl) findViewObject("PaysView1_1");
    }

    /**
     * Container's getter for getLastIdPays1.
     * @return getLastIdPays1
     */
    public getLastIdPaysImpl getgetLastIdPays1() {
        return (getLastIdPaysImpl) findViewObject("getLastIdPays1");
    }

    /**
     * Container's getter for OriginespnflsView1.
     * @return OriginespnflsView1
     */
    public ViewObjectImpl getOriginespnflsView1() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView1");
    }

    /**
     * Container's getter for OriginespnflsView1_1.
     * @return OriginespnflsView1_1
     */
    public ViewObjectImpl getOriginespnflsView1_1() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView1_1");
    }

    /**
     * Container's getter for origineView1.
     * @return origineView1
     */
 //   public origineViewImpl getorigineView1() {
 //       return (origineViewImpl) findViewObject("origineView1");
 //   }

    /**
     * Container's getter for listeOrigine1.
     * @return listeOrigine1
     */
    public listeOrigineImpl getlisteOrigine1() {
        return (listeOrigineImpl) findViewObject("listeOrigine1");
    }

    /**
     * Container's getter for getLastIdOriginePfnl1.
     * @return getLastIdOriginePfnl1
     */
    public getLastIdOriginePfnlImpl getgetLastIdOriginePfnl1() {
        return (getLastIdOriginePfnlImpl) findViewObject("getLastIdOriginePfnl1");
    }

    /**
     * Container's getter for AgrementsView1.
     * @return AgrementsView1
     */
    public ViewObjectImpl getAgrementsView1() {
        return (ViewObjectImpl) findViewObject("AgrementsView1");
    }

    /**
     * Container's getter for PermissionnairespnflView1.
     * @return PermissionnairespnflView1
     */
    public ViewObjectImpl getPermissionnairespnflView1() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView1");
    }

    /**
     * Container's getter for PermissionnairespnflView1_1.
     * @return PermissionnairespnflView1_1
     */
    public ViewObjectImpl getPermissionnairespnflView1_1() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView1_1");
    }

    /**
     * Container's getter for AgrementsView1_1.
     * @return AgrementsView1_1
     */
    public ViewObjectImpl getAgrementsView1_1() {
        return (ViewObjectImpl) findViewObject("AgrementsView1_1");
    }


    /**
     * Container's getter for listeExploitant1.
     * @return listeExploitant1
     */
    public listeExploitantImpl getlisteExploitant1() {
        return (listeExploitantImpl) findViewObject("listeExploitant1");
    }

    /**
     * Container's getter for listeQualitePermissionnaire1.
     * @return listeQualitePermissionnaire1
     */
    public listeQualitePermissionnaireImpl getlisteQualitePermissionnaire1() {
        return (listeQualitePermissionnaireImpl) findViewObject("listeQualitePermissionnaire1");
    }

    /**
     * Container's getter for listeTypePersonne1.
     * @return listeTypePersonne1
     */
    public listeTypePersonneImpl getlisteTypePersonne1() {
        return (listeTypePersonneImpl) findViewObject("listeTypePersonne1");
    }

    /**
     * Container's getter for listeSexe1.
     * @return listeSexe1
     */
    public listeSexeImpl getlisteSexe1() {
        return (listeSexeImpl) findViewObject("listeSexe1");
    }

    /**
     * Container's getter for listeStatutPermissionnaire1.
     * @return listeStatutPermissionnaire1
     */
    public listeStatutPermissionnaireImpl getlisteStatutPermissionnaire1() {
        return (listeStatutPermissionnaireImpl) findViewObject("listeStatutPermissionnaire1");
    }

    /**
     * Container's getter for getLastIdPermissionnairePfnl1.
     * @return getLastIdPermissionnairePfnl1
     */
    public getLastIdPermissionnairePfnlImpl getgetLastIdPermissionnairePfnl1() {
        return (getLastIdPermissionnairePfnlImpl) findViewObject("getLastIdPermissionnairePfnl1");
    }

    /**
     * Container's getter for getlastidagrement1.
     * @return getlastidagrement1
     */
    public ViewObjectImpl getgetlastidagrement1() {
        return (ViewObjectImpl) findViewObject("getlastidagrement1");
    }


    /**
     * Container's getter for PaysView2.
     * @return PaysView2
     */
    public ViewObjectImpl getPaysView2() {
        return (ViewObjectImpl) findViewObject("PaysView2");
    }


    /**
     * Container's getter for CommuneView7.
     * @return CommuneView7
     */
    public ViewObjectImpl getCommuneView7() {
        return (ViewObjectImpl) findViewObject("CommuneView7");
    }


    /**
     * Container's getter for PermissionnairespnflView4.
     * @return PermissionnairespnflView4
     */
    public ViewObjectImpl getPermissionnairespnflView4() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView4");
    }


    /**
     * Container's getter for OriginespnflsView2.
     * @return OriginespnflsView2
     */
    public ViewObjectImpl getOriginespnflsView2() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView2");
    }


    /**
     * Container's getter for RegionView2.
     * @return RegionView2
     */
    public RegionViewImpl getRegionView2() {
        return (RegionViewImpl) findViewObject("RegionView2");
    }


    /**
     * Container's getter for DepartementView6.
     * @return DepartementView6
     */
    public ViewObjectImpl getDepartementView6() {
        return (ViewObjectImpl) findViewObject("DepartementView6");
    }


    /**
     * Container's getter for PaysView3.
     * @return PaysView3
     */
    public ViewObjectImpl getPaysView3() {
        return (ViewObjectImpl) findViewObject("PaysView3");
    }


    /**
     * Container's getter for CommuneView8.
     * @return CommuneView8
     */
    public ViewObjectImpl getCommuneView8() {
        return (ViewObjectImpl) findViewObject("CommuneView8");
    }


    /**
     * Container's getter for PermissionnairespnflView5.
     * @return PermissionnairespnflView5
     */
    public ViewObjectImpl getPermissionnairespnflView5() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView5");
    }


    /**
     * Container's getter for OriginespnflsView3.
     * @return OriginespnflsView3
     */
    public ViewObjectImpl getOriginespnflsView3() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView3");
    }


    /**
     * Container's getter for RegionView3.
     * @return RegionView3
     */
    public RegionViewImpl getRegionView3() {
        return (RegionViewImpl) findViewObject("RegionView3");
    }


    /**
     * Container's getter for DepartementView7.
     * @return DepartementView7
     */
    public ViewObjectImpl getDepartementView7() {
        return (ViewObjectImpl) findViewObject("DepartementView7");
    }


    /**
     * Container's getter for PermisView1.
     * @return PermisView1
     */
    public ViewObjectImpl getPermisView1() {
        return (ViewObjectImpl) findViewObject("PermisView1");
    }

    /**
     * Container's getter for PermisView2.
     * @return PermisView2
     */
    public ViewObjectImpl getPermisView2() {
        return (ViewObjectImpl) findViewObject("PermisView2");
    }

    /**
     * Container's getter for PermisView3.
     * @return PermisView3
     */
    public ViewObjectImpl getPermisView3() {
        return (ViewObjectImpl) findViewObject("PermisView3");
    }

    /**
     * Container's getter for FkPermis2Link1.
     * @return FkPermis2Link1
     */
    public ViewLinkImpl getFkPermis2Link1() {
        return (ViewLinkImpl) findViewLink("FkPermis2Link1");
    }

    /**
     * Container's getter for FkPermis1Link1.
     * @return FkPermis1Link1
     */
    public ViewLinkImpl getFkPermis1Link1() {
        return (ViewLinkImpl) findViewLink("FkPermis1Link1");
    }

    /**
     * Container's getter for GetLastidPermis2.
     * @return GetLastidPermis2
     */
    public ViewObjectImpl getgetLastidPermis1() {
        return (ViewObjectImpl) findViewObject("getLastidPermis1");
       } 
    /**

     * Container's getter for CategorieunitemesureView1.
     * @return CategorieunitemesureView1
     */
    public ViewObjectImpl getCategorieunitemesureView1() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView1");
    }

    /**
     * Container's getter for CategorieunitemesureView1_1.
     * @return CategorieunitemesureView1_1
     */
    public ViewObjectImpl getCategorieunitemesureView1_1() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView1_1");
    }

    /**
     * Container's getter for getLastIdCategorieMesure1.
     * @return getLastIdCategorieMesure1
     */
//    public getLastIdCategorieMesureImpl getgetLastIdCategorieMesure1() {
//        return (getLastIdCategorieMesureImpl) findViewObject("getLastIdCategorieMesure1");
//    }

    /**
     * Container's getter for getLastIdCategorieUniteMesure1.
     * @return getLastIdCategorieUniteMesure1
     */
    public getLastIdCategorieUniteMesureImpl getgetLastIdCategorieUniteMesure1() {
        return (getLastIdCategorieUniteMesureImpl) findViewObject("getLastIdCategorieUniteMesure1");
    }

    /**
     * Container's getter for UnitemesureView1.
     * @return UnitemesureView1
     */
    public ViewObjectImpl getUnitemesureView1() {
        return (ViewObjectImpl) findViewObject("UnitemesureView1");
    }

    /**
     * Container's getter for UnitemesureView1_1.
     * @return UnitemesureView1_1
     */
    public ViewObjectImpl getUnitemesureView1_1() {
        return (ViewObjectImpl) findViewObject("UnitemesureView1_1");
    }

    /**
     * Container's getter for UnitemesureView2.
     * @return UnitemesureView2
     */
    public ViewObjectImpl getUnitemesureView2() {
        return (ViewObjectImpl) findViewObject("UnitemesureView2");
    }

    /**
     * Container's getter for UnitemesureView1_2.
     * @return UnitemesureView1_2
     */
    public ViewObjectImpl getUnitemesureView1_2() {
        return (ViewObjectImpl) findViewObject("UnitemesureView1_2");
    }

    /**
     * Container's getter for FkUnitemesure1Link1.
     * @return FkUnitemesure1Link1
     */
    public ViewLinkImpl getFkUnitemesure1Link1() {
        return (ViewLinkImpl) findViewLink("FkUnitemesure1Link1");
    }

    /**
     * Container's getter for FkUnitemesure1Link2.
     * @return FkUnitemesure1Link2
     */
    public ViewLinkImpl getFkUnitemesure1Link2() {
        return (ViewLinkImpl) findViewLink("FkUnitemesure1Link2");
    }

    /**
     * Container's getter for CategorieunitemesureView2.
     * @return CategorieunitemesureView2
     */
    public ViewObjectImpl getCategorieunitemesureView2() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView2");
    }


    /**
     * Container's getter for CategorieunitemesureView3.
     * @return CategorieunitemesureView3
     */
    public ViewObjectImpl getCategorieunitemesureView3() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView3");
    }


    /**
     * Container's getter for CategorieunitemesureView4.
     * @return CategorieunitemesureView4
     */
    public ViewObjectImpl getCategorieunitemesureView4() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView4");
    }

    /**
     * Container's getter for UnitemesureView3.
     * @return UnitemesureView3
     */
    public ViewObjectImpl getUnitemesureView3() {
        return (ViewObjectImpl) findViewObject("UnitemesureView3");
    }

    /**
     * Container's getter for CategToUnitLink.
     * @return CategToUnitLink
     */
    public ViewLinkImpl getCategToUnitLink() {
        return (ViewLinkImpl) findViewLink("CategToUnitLink");
    }

    /**
     * Container's getter for CategorieunitemesureView5.
     * @return CategorieunitemesureView5
     */
    public ViewObjectImpl getCategorieunitemesureView5() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView5");
    }

    /**
     * Container's getter for CategToUnitLink1.
     * @return CategToUnitLink1
     */
    public ViewLinkImpl getCategToUnitLink1() {
        return (ViewLinkImpl) findViewLink("CategToUnitLink1");
    }

    /**
     * Container's getter for UnitemesureView4.
     * @return UnitemesureView4
     */
    public ViewObjectImpl getUnitemesureView4() {
        return (ViewObjectImpl) findViewObject("UnitemesureView4");
    }

    /**
     * Container's getter for CategToUnitLink2.
     * @return CategToUnitLink2
     */
    public ViewLinkImpl getCategToUnitLink2() {
        return (ViewLinkImpl) findViewLink("CategToUnitLink2");
    }

    /**
     * Container's getter for CategorieunitemesureView6.
     * @return CategorieunitemesureView6
     */
    public ViewObjectImpl getCategorieunitemesureView6() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView6");
    }

    /**
     * Container's getter for gestLastIdUnitMesure1.
     * @return gestLastIdUnitMesure1
     */
    public gestLastIdUnitMesureImpl getgetLastIdUnitMesure1() {
        return (gestLastIdUnitMesureImpl) findViewObject("getLastIdUnitMesure1");
    }

    /**
     * Container's getter for listOrdreGrandeur1.
     * @return listOrdreGrandeur1
     */
    public listOrdreGrandeurImpl getlistOrdreGrandeur1() {
        return (listOrdreGrandeurImpl) findViewObject("listOrdreGrandeur1");
    }

    /**
     * Container's getter for CategorieproduitView1.
     * @return CategorieproduitView1
     */
    public ViewObjectImpl getCategorieproduitView1() {
        return (ViewObjectImpl) findViewObject("CategorieproduitView1");
    }

    /**
     * Container's getter for CategorieproduitView2.
     * @return CategorieproduitView2
     */
    public ViewObjectImpl getCategorieproduitView2() {
        return (ViewObjectImpl) findViewObject("CategorieproduitView2");
    }

    /**
     * Container's getter for getLastIdCategorieProduit1.
     * @return getLastIdCategorieProduit1
     */
    public ViewObjectImpl getgetLastIdCategorieProduit1() {
        return (ViewObjectImpl) findViewObject("getLastIdCategorieProduit1");
    }

    /**
     * Container's getter for CategorieproduitView3.
     * @return CategorieproduitView3
     */
    public ViewObjectImpl getCategorieproduitView3() {
        return (ViewObjectImpl) findViewObject("CategorieproduitView3");
    }

    /**
     * Container's getter for ProduitspfnlView11.
     * @return ProduitspfnlView11
     */
    public ViewObjectImpl getProduitspfnlView11() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView11");
    }

    /**
     * Container's getter for CategToProduitLink.
     * @return CategToProduitLink
     */
    public ViewLinkImpl getCategToProduitLink() {
        return (ViewLinkImpl) findViewLink("CategToProduitLink");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView20.
     * @return PartiesProduitsPfnlView20
     */
    public ViewObjectImpl getPartiesProduitsPfnlView20() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView20");
    }

    /**
     * Container's getter for UnitemesureView5.
     * @return UnitemesureView5
     */
    public ViewObjectImpl getUnitemesureView5() {
        return (ViewObjectImpl) findViewObject("UnitemesureView5");
    }

    /**
     * Container's getter for PartieProdToUniteMesureLink.
     * @return PartieProdToUniteMesureLink
     */
    public ViewLinkImpl getPartieProdToUniteMesureLink() {
        return (ViewLinkImpl) findViewLink("PartieProdToUniteMesureLink");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView21.
     * @return PartiesProduitsPfnlView21
     */
    public ViewObjectImpl getPartiesProduitsPfnlView21() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView21");
    }

    /**
     * Container's getter for UnitemesureView6.
     * @return UnitemesureView6
     */
    public ViewObjectImpl getUnitemesureView6() {
        return (ViewObjectImpl) findViewObject("UnitemesureView6");
    }

    /**
     * Container's getter for PartieProdToUniteMesureExport.
     * @return PartieProdToUniteMesureExport
     */
    public ViewLinkImpl getPartieProdToUniteMesureExport() {
        return (ViewLinkImpl) findViewLink("PartieProdToUniteMesureExport");
    }

    /**
     * Container's getter for TransporteurView1.
     * @return TransporteurView1
     */
    public ViewObjectImpl getTransporteurView1() {
        return (ViewObjectImpl) findViewObject("TransporteurView1");
    }

    /**
     * Container's getter for TransporteurView1_1.
     * @return TransporteurView1_1
     */
    public ViewObjectImpl getTransporteurView1_1() {
        return (ViewObjectImpl) findViewObject("TransporteurView1_1");
    }

    /**
     * Container's getter for TypevehiculeView1.
     * @return TypevehiculeView1
     */
    public ViewObjectImpl getTypevehiculeView1() {
        return (ViewObjectImpl) findViewObject("TypevehiculeView1");
    }

    /**
     * Container's getter for TypevehiculeView2.
     * @return TypevehiculeView2
     */
    public ViewObjectImpl getTypevehiculeView2() {
        return (ViewObjectImpl) findViewObject("TypevehiculeView2");
    }

    /**
     * Container's getter for VehiculeView1.
     * @return VehiculeView1
     */
    public ViewObjectImpl getVehiculeView1() {
        return (ViewObjectImpl) findViewObject("VehiculeView1");
    }

    /**
     * Container's getter for VehiculeView1_1.
     * @return VehiculeView1_1
     */
    public ViewObjectImpl getVehiculeView1_1() {
        return (ViewObjectImpl) findViewObject("VehiculeView1_1");
    }

    /**
     * Container's getter for VehiculeView2.
     * @return VehiculeView2
     */
    public ViewObjectImpl getVehiculeView2() {
        return (ViewObjectImpl) findViewObject("VehiculeView2");
    }

    /**
     * Container's getter for VehiculeView3.
     * @return VehiculeView3
     */
    public ViewObjectImpl getVehiculeView3() {
        return (ViewObjectImpl) findViewObject("VehiculeView3");
    }

    /**
     * Container's getter for VehiculeView4.
     * @return VehiculeView4
     */
    public ViewObjectImpl getVehiculeView4() {
        return (ViewObjectImpl) findViewObject("VehiculeView4");
    }

    /**
     * Container's getter for VehiculeView1_2.
     * @return VehiculeView1_2
     */
    public ViewObjectImpl getVehiculeView1_2() {
        return (ViewObjectImpl) findViewObject("VehiculeView1_2");
    }

    /**
     * Container's getter for VehiculeView1_3.
     * @return VehiculeView1_3
     */
    public ViewObjectImpl getVehiculeView1_3() {
        return (ViewObjectImpl) findViewObject("VehiculeView1_3");
    }

    /**
     * Container's getter for VehiculeView1_4.
     * @return VehiculeView1_4
     */
    public ViewObjectImpl getVehiculeView1_4() {
        return (ViewObjectImpl) findViewObject("VehiculeView1_4");
    }

    /**
     * Container's getter for FkVehicule3Link1.
     * @return FkVehicule3Link1
     */
    public ViewLinkImpl getFkVehicule3Link1() {
        return (ViewLinkImpl) findViewLink("FkVehicule3Link1");
    }

    /**
     * Container's getter for FkVehicule2Link1.
     * @return FkVehicule2Link1
     */
    public ViewLinkImpl getFkVehicule2Link1() {
        return (ViewLinkImpl) findViewLink("FkVehicule2Link1");
    }

    /**
     * Container's getter for FkVehicule1Link1.
     * @return FkVehicule1Link1
     */
    public ViewLinkImpl getFkVehicule1Link1() {
        return (ViewLinkImpl) findViewLink("FkVehicule1Link1");
    }

    /**
     * Container's getter for FkVehicule1Link2.
     * @return FkVehicule1Link2
     */
    public ViewLinkImpl getFkVehicule1Link2() {
        return (ViewLinkImpl) findViewLink("FkVehicule1Link2");
    }

    /**
     * Container's getter for FkVehicule2Link2.
     * @return FkVehicule2Link2
     */
    public ViewLinkImpl getFkVehicule2Link2() {
        return (ViewLinkImpl) findViewLink("FkVehicule2Link2");
    }

    /**
     * Container's getter for FkVehicule3Link2.
     * @return FkVehicule3Link2
     */
    public ViewLinkImpl getFkVehicule3Link2() {
        return (ViewLinkImpl) findViewLink("FkVehicule3Link2");
    }

    /**
     * Container's getter for TransporteurView2.
     * @return TransporteurView2
     */
    public ViewObjectImpl getTransporteurView2() {
        return (ViewObjectImpl) findViewObject("TransporteurView2");
    }

    /**
     * Container's getter for VehiculeView5.
     * @return VehiculeView5
     */
    public ViewObjectImpl getVehiculeView5() {
        return (ViewObjectImpl) findViewObject("VehiculeView5");
    }

    /**
     * Container's getter for TransporteurToVehiculeLink.
     * @return TransporteurToVehiculeLink
     */
    public ViewLinkImpl getTransporteurToVehiculeLink() {
        return (ViewLinkImpl) findViewLink("TransporteurToVehiculeLink");
    }

    /**
     * Container's getter for RegionView4.
     * @return RegionView4
     */
    public RegionViewImpl getRegionView4() {
        return (RegionViewImpl) findViewObject("RegionView4");
    }

    /**
     * Container's getter for VehiculeView6.
     * @return VehiculeView6
     */
    public ViewObjectImpl getVehiculeView6() {
        return (ViewObjectImpl) findViewObject("VehiculeView6");
    }

    /**
     * Container's getter for RegionToVehiculeLink.
     * @return RegionToVehiculeLink
     */
    public ViewLinkImpl getRegionToVehiculeLink() {
        return (ViewLinkImpl) findViewLink("RegionToVehiculeLink");
    }

    /**
     * Container's getter for TypevehiculeView3.
     * @return TypevehiculeView3
     */
    public ViewObjectImpl getTypevehiculeView3() {
        return (ViewObjectImpl) findViewObject("TypevehiculeView3");
    }

    /**
     * Container's getter for VehiculeView7.
     * @return VehiculeView7
     */
    public ViewObjectImpl getVehiculeView7() {
        return (ViewObjectImpl) findViewObject("VehiculeView7");
    }

    /**
     * Container's getter for TypeVehiculeToVehiculeLink.
     * @return TypeVehiculeToVehiculeLink
     */
    public ViewLinkImpl getTypeVehiculeToVehiculeLink() {
        return (ViewLinkImpl) findViewLink("TypeVehiculeToVehiculeLink");
    }

    /**
     * Container's getter for getLastIdTransporteur1.
     * @return getLastIdTransporteur1
     */
    public ViewObjectImpl getgetLastIdTransporteur1() {
        return (ViewObjectImpl) findViewObject("getLastIdTransporteur1");
    }

    /**
     * Container's getter for getLastIdVehicule1.
     * @return getLastIdVehicule1
     */
    public ViewObjectImpl getgetLastIdVehicule1() {
        return (ViewObjectImpl) findViewObject("getLastIdVehicule1");
    }

    /**
     * Container's getter for TypeVehiculeForMeView1.
     * @return TypeVehiculeForMeView1
     */
    public ViewObjectImpl getTypeVehiculeForMeView1() {
        return (ViewObjectImpl) findViewObject("TypeVehiculeForMeView1");
    }

    /**
     * Container's getter for RegionView5.
     * @return RegionView5
     */
    public RegionViewImpl getRegionView5() {
        return (RegionViewImpl) findViewObject("RegionView5");
    }

    /**
     * Container's getter for RegionView6.
     * @return RegionView6
     */
    public RegionViewImpl getRegionView6() {
        return (RegionViewImpl) findViewObject("RegionView6");
    }

    /**
     * Container's getter for RegionToVehiculeLink1.
     * @return RegionToVehiculeLink1
     */
    public ViewLinkImpl getRegionToVehiculeLink1() {
        return (ViewLinkImpl) findViewLink("RegionToVehiculeLink1");
    }
    /**
     * Container's getter for LocaliteView1.
     * @return LocaliteView1
     */
    public ViewObjectImpl getLocaliteView1() {
        return (ViewObjectImpl) findViewObject("LocaliteView1");
    }

    /**
     * Container's getter for LocaliteView2.
     * @return LocaliteView2
     */
    public ViewObjectImpl getLocaliteView2() {
        return (ViewObjectImpl) findViewObject("LocaliteView2");
    }

    /**
     * Container's getter for FkLocalite1Link1.
     * @return FkLocalite1Link1
     */
    public ViewLinkImpl getFkLocalite1Link1() {
        return (ViewLinkImpl) findViewLink("FkLocalite1Link1");
    }

    /**
     * Container's getter for getLastidLocalite1.
     * @return getLastidLocalite1
     */
    public ViewObjectImpl getgetLastidLocalite1() {
        return (ViewObjectImpl) findViewObject("getLastidLocalite1");
    }

    /**
     * Container's getter for DepartementView5.
     * @return DepartementView5
     */
    public ViewObjectImpl getDepartementView5() {
        return (ViewObjectImpl) findViewObject("DepartementView5");
    }

    /**
     * Container's getter for LocaliteView3.
     * @return LocaliteView3
     */
    public ViewObjectImpl getLocaliteView3() {
        return (ViewObjectImpl) findViewObject("LocaliteView3");
    }

    /**
     * Container's getter for DepToLocaliteLink.
     * @return DepToLocaliteLink
     */
    public ViewLinkImpl getDepToLocaliteLink() {
        return (ViewLinkImpl) findViewLink("DepToLocaliteLink");
    }

    /**
     * Container's getter for LocaliteView4.
     * @return LocaliteView4
     */
    public ViewObjectImpl getLocaliteView4() {
        return (ViewObjectImpl) findViewObject("LocaliteView4");
    }

    /**
     * Container's getter for DepToLocaliteLink1.
     * @return DepToLocaliteLink1
     */
    public ViewLinkImpl getDepToLocaliteLink1() {
        return (ViewLinkImpl) findViewLink("DepToLocaliteLink1");
    }

    /**
     * Container's getter for DepartementView8.
     * @return DepartementView8
     */
    public ViewObjectImpl getDepartementView8() {
        return (ViewObjectImpl) findViewObject("DepartementView8");
    }

    /**
     * Container's getter for DepToLocaliteLink2.
     * @return DepToLocaliteLink2
     */
    public ViewLinkImpl getDepToLocaliteLink2() {
        return (ViewLinkImpl) findViewLink("DepToLocaliteLink2");
    }

    /**
     * Container's getter for PostecontroleView1.
     * @return PostecontroleView1
     */
    public ViewObjectImpl getPostecontroleView1() {
        return (ViewObjectImpl) findViewObject("PostecontroleView1");
    }

    /**
     * Container's getter for PostecontroleView2.
     * @return PostecontroleView2
     */
    public ViewObjectImpl getPostecontroleView2() {
        return (ViewObjectImpl) findViewObject("PostecontroleView2");
    }

    /**
     * Container's getter for FkPostecontrole1Link1.
     * @return FkPostecontrole1Link1
     */
    public ViewLinkImpl getFkPostecontrole1Link1() {
        return (ViewLinkImpl) findViewLink("FkPostecontrole1Link1");
    }

    /**
     * Container's getter for getLatsidPostecontrole1.
     * @return getLatsidPostecontrole1
     */
    public ViewObjectImpl getgetLatsidPostecontrole1() {
        return (ViewObjectImpl) findViewObject("getLatsidPostecontrole1");
    }

    /**
     * Container's getter for DepartementView9.
     * @return DepartementView9
     */
    public ViewObjectImpl getDepartementView9() {
        return (ViewObjectImpl) findViewObject("DepartementView9");
    }

    /**
     * Container's getter for PostecontroleView3.
     * @return PostecontroleView3
     */
    public ViewObjectImpl getPostecontroleView3() {
        return (ViewObjectImpl) findViewObject("PostecontroleView3");
    }

    /**
     * Container's getter for DepToPostecontroleLink.
     * @return DepToPostecontroleLink
     */
    public ViewLinkImpl getDepToPostecontroleLink() {
        return (ViewLinkImpl) findViewLink("DepToPostecontroleLink");
    }

    /**
     * Container's getter for PostecontroleView4.
     * @return PostecontroleView4
     */
    public ViewObjectImpl getPostecontroleView4() {
        return (ViewObjectImpl) findViewObject("PostecontroleView4");
    }

    /**
     * Container's getter for DepToPostecontroleLink1.
     * @return DepToPostecontroleLink1
     */
    public ViewLinkImpl getDepToPostecontroleLink1() {
        return (ViewLinkImpl) findViewLink("DepToPostecontroleLink1");
    }

    /**
     * Container's getter for PostecontroleView5.
     * @return PostecontroleView5
     */
    public ViewObjectImpl getPostecontroleView5() {
        return (ViewObjectImpl) findViewObject("PostecontroleView5");
    }

    /**
     * Container's getter for DepToPostecontroleLink2.
     * @return DepToPostecontroleLink2
     */
    public ViewLinkImpl getDepToPostecontroleLink2() {
        return (ViewLinkImpl) findViewLink("DepToPostecontroleLink2");
    }

    /**
     * Container's getter for DetailpermisView1.
     * @return DetailpermisView1
     */
    public ViewObjectImpl getDetailpermisView1() {
        return (ViewObjectImpl) findViewObject("DetailpermisView1");
    }

    /**
     * Container's getter for DetailpermisView2.
     * @return DetailpermisView2
     */
    public ViewObjectImpl getDetailpermisView2() {
        return (ViewObjectImpl) findViewObject("DetailpermisView2");
    }

    /**
     * Container's getter for DetailpermisView3.
     * @return DetailpermisView3
     */
    public ViewObjectImpl getDetailpermisView3() {
        return (ViewObjectImpl) findViewObject("DetailpermisView3");
    }

    /**
     * Container's getter for DetailpermisView4.
     * @return DetailpermisView4
     */
    public ViewObjectImpl getDetailpermisView4() {
        return (ViewObjectImpl) findViewObject("DetailpermisView4");
    }

    /**
     * Container's getter for FkDetailpermis3Link1.
     * @return FkDetailpermis3Link1
     */
    public ViewLinkImpl getFkDetailpermis3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailpermis3Link1");
    }

    /**
     * Container's getter for FkDetailpermis2Link1.
     * @return FkDetailpermis2Link1
     */
    public ViewLinkImpl getFkDetailpermis2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailpermis2Link1");
    }

    /**
     * Container's getter for FkDetailpermis1Link1.
     * @return FkDetailpermis1Link1
     */
    public ViewLinkImpl getFkDetailpermis1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailpermis1Link1");
    }

    /**
     * Container's getter for getLatsidDetailpermis1.
     * @return getLatsidDetailpermis1
     */
    public ViewObjectImpl getgetLatsidDetailpermis1() {
        return (ViewObjectImpl) findViewObject("getLatsidDetailpermis1");
    }

    /**
     * Container's getter for PermisView4.
     * @return PermisView4
     */
    public ViewObjectImpl getPermisView4() {
        return (ViewObjectImpl) findViewObject("PermisView4");
    }

    /**
     * Container's getter for DetailpermisView5.
     * @return DetailpermisView5
     */
    public ViewObjectImpl getDetailpermisView5() {
        return (ViewObjectImpl) findViewObject("DetailpermisView5");
    }

    /**
     * Container's getter for PermisTopDetailLink.
     * @return PermisTopDetailLink
     */
    public ViewLinkImpl getPermisTopDetailLink() {
        return (ViewLinkImpl) findViewLink("PermisTopDetailLink");
    }

    /**
     * Container's getter for DetailpermisView6.
     * @return DetailpermisView6
     */
    public ViewObjectImpl getDetailpermisView6() {
        return (ViewObjectImpl) findViewObject("DetailpermisView6");
    }

    /**
     * Container's getter for PermisTopDetailLink1.
     * @return PermisTopDetailLink1
     */
    public ViewLinkImpl getPermisTopDetailLink1() {
        return (ViewLinkImpl) findViewLink("PermisTopDetailLink1");
    }

    /**
     * Container's getter for CollectepfnlView1.
     * @return CollectepfnlView1
     */
    public ViewObjectImpl getCollectepfnlView1() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView1");
    }

    /**
     * Container's getter for CollectepfnlView2.
     * @return CollectepfnlView2
     */
    public ViewObjectImpl getCollectepfnlView2() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView2");
    }

    /**
     * Container's getter for CollectepfnlView3.
     * @return CollectepfnlView3
     */
    public ViewObjectImpl getCollectepfnlView3() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView3");
    }

    /**
     * Container's getter for CollectepfnlView4.
     * @return CollectepfnlView4
     */
    public ViewObjectImpl getCollectepfnlView4() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView4");
    }

    /**
     * Container's getter for FkCollectepfnl1Link1.
     * @return FkCollectepfnl1Link1
     */
    public ViewLinkImpl getFkCollectepfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkCollectepfnl1Link1");
    }

    /**
     * Container's getter for FkCollectepfnl1Link2.
     * @return FkCollectepfnl1Link2
     */
    public ViewLinkImpl getFkCollectepfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkCollectepfnl1Link2");
    }

    /**
     * Container's getter for DetailscollectepfnlView1.
     * @return DetailscollectepfnlView1
     */
    public ViewObjectImpl getDetailscollectepfnlView1() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_1.
     * @return DetailscollectepfnlView1_1
     */
    public ViewObjectImpl getDetailscollectepfnlView1_1() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_1");
    }

    /**
     * Container's getter for DetailscollectepfnlView2.
     * @return DetailscollectepfnlView2
     */
    public ViewObjectImpl getDetailscollectepfnlView2() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView2");
    }

    /**
     * Container's getter for DetailscollectepfnlView3.
     * @return DetailscollectepfnlView3
     */
    public ViewObjectImpl getDetailscollectepfnlView3() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView3");
    }

    /**
     * Container's getter for DetailscollectepfnlView4.
     * @return DetailscollectepfnlView4
     */
    public ViewObjectImpl getDetailscollectepfnlView4() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView4");
    }

    /**
     * Container's getter for DetailscollectepfnlView5.
     * @return DetailscollectepfnlView5
     */
    public ViewObjectImpl getDetailscollectepfnlView5() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView5");
    }

    /**
     * Container's getter for DetailscollectepfnlView6.
     * @return DetailscollectepfnlView6
     */
    public ViewObjectImpl getDetailscollectepfnlView6() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView6");
    }

    /**
     * Container's getter for DetailscollectepfnlView7.
     * @return DetailscollectepfnlView7
     */
    public ViewObjectImpl getDetailscollectepfnlView7() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView7");
    }

    /**
     * Container's getter for DetailscollectepfnlView8.
     * @return DetailscollectepfnlView8
     */
    public ViewObjectImpl getDetailscollectepfnlView8() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView8");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_2.
     * @return DetailscollectepfnlView1_2
     */
    public ViewObjectImpl getDetailscollectepfnlView1_2() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_2");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_3.
     * @return DetailscollectepfnlView1_3
     */
    public ViewObjectImpl getDetailscollectepfnlView1_3() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_3");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_4.
     * @return DetailscollectepfnlView1_4
     */
    public ViewObjectImpl getDetailscollectepfnlView1_4() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_4");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_5.
     * @return DetailscollectepfnlView1_5
     */
    public ViewObjectImpl getDetailscollectepfnlView1_5() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_5");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_6.
     * @return DetailscollectepfnlView1_6
     */
    public ViewObjectImpl getDetailscollectepfnlView1_6() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_6");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_7.
     * @return DetailscollectepfnlView1_7
     */
    public ViewObjectImpl getDetailscollectepfnlView1_7() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_7");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_8.
     * @return DetailscollectepfnlView1_8
     */
    public ViewObjectImpl getDetailscollectepfnlView1_8() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_8");
    }

    /**
     * Container's getter for FkDetailscollectepfnl7Link1.
     * @return FkDetailscollectepfnl7Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl7Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl7Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl6Link1.
     * @return FkDetailscollectepfnl6Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl6Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl6Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl5Link1.
     * @return FkDetailscollectepfnl5Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl5Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl5Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl4Link1.
     * @return FkDetailscollectepfnl4Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl4Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl4Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl3Link1.
     * @return FkDetailscollectepfnl3Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl3Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl2Link1.
     * @return FkDetailscollectepfnl2Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl2Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl1Link1.
     * @return FkDetailscollectepfnl1Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl1Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl1Link2.
     * @return FkDetailscollectepfnl1Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl1Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl2Link2.
     * @return FkDetailscollectepfnl2Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl2Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl2Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl3Link2.
     * @return FkDetailscollectepfnl3Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl3Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl3Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl4Link2.
     * @return FkDetailscollectepfnl4Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl4Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl4Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl5Link2.
     * @return FkDetailscollectepfnl5Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl5Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl5Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl6Link2.
     * @return FkDetailscollectepfnl6Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl6Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl6Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl7Link2.
     * @return FkDetailscollectepfnl7Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl7Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl7Link2");
    }

    /**
     * Container's getter for CollectepfnlView5.
     * @return CollectepfnlView5
     */
    public ViewObjectImpl getCollectepfnlView5() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView5");
    }

    /**
     * Container's getter for DetailscollectepfnlView9.
     * @return DetailscollectepfnlView9
     */
    public ViewObjectImpl getDetailscollectepfnlView9() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView9");
    }

    /**
     * Container's getter for CollecteToDetailLink.
     * @return CollecteToDetailLink
     */
    public ViewLinkImpl getCollecteToDetailLink() {
        return (ViewLinkImpl) findViewLink("CollecteToDetailLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView10.
     * @return DetailscollectepfnlView10
     */
    public ViewObjectImpl getDetailscollectepfnlView10() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView10");
    }

    /**
     * Container's getter for PermissionnairespnflView2.
     * @return PermissionnairespnflView2
     */
    public ViewObjectImpl getPermissionnairespnflView2() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView2");
    }

    /**
     * Container's getter for DetailCollToPermissionnaireLink.
     * @return DetailCollToPermissionnaireLink
     */
    public ViewLinkImpl getDetailCollToPermissionnaireLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToPermissionnaireLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView11.
     * @return DetailscollectepfnlView11
     */
    public ViewObjectImpl getDetailscollectepfnlView11() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView11");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView22.
     * @return PartiesProduitsPfnlView22
     */
    public ViewObjectImpl getPartiesProduitsPfnlView22() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView22");
    }

    /**
     * Container's getter for DetailCollToPartieProdPfnlLink.
     * @return DetailCollToPartieProdPfnlLink
     */
    public ViewLinkImpl getDetailCollToPartieProdPfnlLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToPartieProdPfnlLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView12.
     * @return DetailscollectepfnlView12
     */
    public ViewObjectImpl getDetailscollectepfnlView12() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView12");
    }

    /**
     * Container's getter for OriginespnflsView4.
     * @return OriginespnflsView4
     */
    public ViewObjectImpl getOriginespnflsView4() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView4");
    }

    /**
     * Container's getter for DetailCollToOriginePfnlLink.
     * @return DetailCollToOriginePfnlLink
     */
    public ViewLinkImpl getDetailCollToOriginePfnlLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToOriginePfnlLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView13.
     * @return DetailscollectepfnlView13
     */
    public ViewObjectImpl getDetailscollectepfnlView13() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView13");
    }

    /**
     * Container's getter for UnitemesureView7.
     * @return UnitemesureView7
     */
    public ViewObjectImpl getUnitemesureView7() {
        return (ViewObjectImpl) findViewObject("UnitemesureView7");
    }

    /**
     * Container's getter for DetailCollToUnitMesureLink.
     * @return DetailCollToUnitMesureLink
     */
    public ViewLinkImpl getDetailCollToUnitMesureLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToUnitMesureLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView14.
     * @return DetailscollectepfnlView14
     */
    public ViewObjectImpl getDetailscollectepfnlView14() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView14");
    }

    /**
     * Container's getter for PermisView5.
     * @return PermisView5
     */
    public ViewObjectImpl getPermisView5() {
        return (ViewObjectImpl) findViewObject("PermisView5");
    }

    /**
     * Container's getter for DetailCollToDocOfficielLink.
     * @return DetailCollToDocOfficielLink
     */
    public ViewLinkImpl getDetailCollToDocOfficielLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToDocOfficielLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView15.
     * @return DetailscollectepfnlView15
     */
    public ViewObjectImpl getDetailscollectepfnlView15() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView15");
    }

    /**
     * Container's getter for DepartementView10.
     * @return DepartementView10
     */
    public ViewObjectImpl getDepartementView10() {
        return (ViewObjectImpl) findViewObject("DepartementView10");
    }

    /**
     * Container's getter for DetailCollToDeptLink.
     * @return DetailCollToDeptLink
     */
    public ViewLinkImpl getDetailCollToDeptLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToDeptLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView16.
     * @return DetailscollectepfnlView16
     */
    public ViewObjectImpl getDetailscollectepfnlView16() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView16");
    }


    /**
     * Container's getter for DetailscollectepfnlView17.
     * @return DetailscollectepfnlView17
     */
    public ViewObjectImpl getDetailscollectepfnlView17() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView17");
    }

    /**
     * Container's getter for CollecteToDetailLink1.
     * @return CollecteToDetailLink1
     */
    public ViewLinkImpl getCollecteToDetailLink1() {
        return (ViewLinkImpl) findViewLink("CollecteToDetailLink1");
    }

    /**
     * Container's getter for DepartementView11.
     * @return DepartementView11
     */
    public ViewObjectImpl getDepartementView11() {
        return (ViewObjectImpl) findViewObject("DepartementView11");
    }

    /**
     * Container's getter for DetailCollToDeptLink1.
     * @return DetailCollToDeptLink1
     */
    public ViewLinkImpl getDetailCollToDeptLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToDeptLink1");
    }

    /**
     * Container's getter for UnitemesureView8.
     * @return UnitemesureView8
     */
    public ViewObjectImpl getUnitemesureView8() {
        return (ViewObjectImpl) findViewObject("UnitemesureView8");
    }

    /**
     * Container's getter for DetailCollToUnitMesureLink1.
     * @return DetailCollToUnitMesureLink1
     */
    public ViewLinkImpl getDetailCollToUnitMesureLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToUnitMesureLink1");
    }

    /**
     * Container's getter for PermisView6.
     * @return PermisView6
     */
    public ViewObjectImpl getPermisView6() {
        return (ViewObjectImpl) findViewObject("PermisView6");
    }

    /**
     * Container's getter for DetailCollToDocOfficielLink1.
     * @return DetailCollToDocOfficielLink1
     */
    public ViewLinkImpl getDetailCollToDocOfficielLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToDocOfficielLink1");
    }

    /**
     * Container's getter for PermissionnairespnflView3.
     * @return PermissionnairespnflView3
     */
    public ViewObjectImpl getPermissionnairespnflView3() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView3");
    }

    /**
     * Container's getter for DetailCollToPermissionnaireLink1.
     * @return DetailCollToPermissionnaireLink1
     */
    public ViewLinkImpl getDetailCollToPermissionnaireLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToPermissionnaireLink1");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView23.
     * @return PartiesProduitsPfnlView23
     */
    public ViewObjectImpl getPartiesProduitsPfnlView23() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView23");
    }

    /**
     * Container's getter for DetailCollToPartieProdPfnlLink1.
     * @return DetailCollToPartieProdPfnlLink1
     */
    public ViewLinkImpl getDetailCollToPartieProdPfnlLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToPartieProdPfnlLink1");
    }

    /**
     * Container's getter for OriginespnflsView5.
     * @return OriginespnflsView5
     */
    public ViewObjectImpl getOriginespnflsView5() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView5");
    }

    /**
     * Container's getter for DetailCollToOriginePfnlLink1.
     * @return DetailCollToOriginePfnlLink1
     */
    public ViewLinkImpl getDetailCollToOriginePfnlLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToOriginePfnlLink1");
    }

    /**
     * Container's getter for getLastIdCollectePfnl1.
     * @return getLastIdCollectePfnl1
     */
    public getLastIdCollectePfnlImpl getgetLastIdCollectePfnl1() {
        return (getLastIdCollectePfnlImpl) findViewObject("getLastIdCollectePfnl1");
    }

    /**
     * Container's getter for getLastIdDetailsCollecte1.
     * @return getLastIdDetailsCollecte1
     */
    public getLastIdDetailsCollecteImpl getgetLastIdDetailsCollecte1() {
        return (getLastIdDetailsCollecteImpl) findViewObject("getLastIdDetailsCollecte1");
    }


    /**
     * Container's getter for getLibellePartieProduitPfnl1.
     * @return getLibellePartieProduitPfnl1
     */
    public getLibelleProduitPfnlImpl getgetLibellePartieProduitPfnl1() {
        return (getLibelleProduitPfnlImpl) findViewObject("getLibellePartieProduitPfnl1");
    }

    /**
     * Container's getter for getLibelleProduitComplet1.
     * @return getLibelleProduitComplet1
     */
    public getLibelleProduitCompletImpl getgetLibelleProduitComplet1() {
        return (getLibelleProduitCompletImpl) findViewObject("getLibelleProduitComplet1");
    }

    /**
     * Container's getter for getLibellePartieProduitPfnl2.
     * @return getLibellePartieProduitPfnl2
     */
    public getLibelleProduitPfnlImpl getgetLibellePartieProduitPfnl2() {
        return (getLibelleProduitPfnlImpl) findViewObject("getLibellePartieProduitPfnl2");
    }

    /**
     * Container's getter for getLibelleProduitPfnl1.
     * @return getLibelleProduitPfnl1
     */
    public getLibelleProduitPfnlImpl getgetLibelleProduitPfnl1() {
        return (getLibelleProduitPfnlImpl) findViewObject("getLibelleProduitPfnl1");
    }

    /**
     * Container's getter for getLastidDetailslettrevoiture1.
     * @return getLastidDetailslettrevoiture1
     */
    public ViewObjectImpl getgetLastidDetailslettrevoiture1() {
        return (ViewObjectImpl) findViewObject("getLastidDetailslettrevoiture1");
    }

    /**
     * Container's getter for getLastidLettrevoiture1.
     * @return getLastidLettrevoiture1
     */
    public ViewObjectImpl getgetLastidLettrevoiture1() {
        return (ViewObjectImpl) findViewObject("getLastidLettrevoiture1");
    }

    /**
     * Container's getter for Partiproduit1.
     * @return Partiproduit1
     */
    public ViewObjectImpl getPartiproduit1() {
        return (ViewObjectImpl) findViewObject("Partiproduit1");
    }

    /**
     * Container's getter for getPartieProduit1.
     * @return getPartieProduit1
     */
    public ViewObjectImpl getgetPartieProduit1() {
        return (ViewObjectImpl) findViewObject("getPartieProduit1");
    }


    /**
     * Container's getter for DetailslettrevoitureView1.
     * @return DetailslettrevoitureView1
     */
    public ViewObjectImpl getDetailslettrevoitureView1() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView1");
    }

    /**
     * Container's getter for LettrevoitureView1.
     * @return LettrevoitureView1
     */
    public ViewObjectImpl getLettrevoitureView1() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView1");
    }

    /**
     * Container's getter for LettrevoitureView2.
     * @return LettrevoitureView2
     */
    public ViewObjectImpl getLettrevoitureView2() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView2");
    }

    /**
     * Container's getter for LettrevoitureView3.
     * @return LettrevoitureView3
     */
    public ViewObjectImpl getLettrevoitureView3() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView3");
    }

    /**
     * Container's getter for LettrevoitureView4.
     * @return LettrevoitureView4
     */
    public ViewObjectImpl getLettrevoitureView4() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView4");
    }

    /**
     * Container's getter for LettrevoitureView5.
     * @return LettrevoitureView5
     */
    public ViewObjectImpl getLettrevoitureView5() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView5");
    }

    /**
     * Container's getter for LettrevoitureView6.
     * @return LettrevoitureView6
     */
    public ViewObjectImpl getLettrevoitureView6() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView6");
    }

    /**
     * Container's getter for DetailslettrevoitureView2.
     * @return DetailslettrevoitureView2
     */
    public ViewObjectImpl getDetailslettrevoitureView2() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView2");
    }

    /**
     * Container's getter for DetailslettrevoitureView3.
     * @return DetailslettrevoitureView3
     */
    public ViewObjectImpl getDetailslettrevoitureView3() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView3");
    }

    /**
     * Container's getter for DetailslettrevoitureView4.
     * @return DetailslettrevoitureView4
     */
    public ViewObjectImpl getDetailslettrevoitureView4() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView4");
    }

    /**
     * Container's getter for LettrevoitureView7.
     * @return LettrevoitureView7
     */
    public ViewObjectImpl getLettrevoitureView7() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView7");
    }

    /**
     * Container's getter for LettrevoitureView8.
     * @return LettrevoitureView8
     */
    public ViewObjectImpl getLettrevoitureView8() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView8");
    }

    /**
     * Container's getter for LettrevoitureView9.
     * @return LettrevoitureView9
     */
    public ViewObjectImpl getLettrevoitureView9() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView9");
    }

    /**
     * Container's getter for LettrevoitureView10.
     * @return LettrevoitureView10
     */
    public ViewObjectImpl getLettrevoitureView10() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView10");
    }

    /**
     * Container's getter for LettrevoitureView11.
     * @return LettrevoitureView11
     */
    public ViewObjectImpl getLettrevoitureView11() {
        return (ViewObjectImpl) findViewObject("LettrevoitureView11");
    }

    /**
     * Container's getter for DetailslettrevoitureView5.
     * @return DetailslettrevoitureView5
     */
    public ViewObjectImpl getDetailslettrevoitureView5() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView5");
    }

    /**
     * Container's getter for DetailslettrevoitureView6.
     * @return DetailslettrevoitureView6
     */
    public ViewObjectImpl getDetailslettrevoitureView6() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView6");
    }

    /**
     * Container's getter for DetailslettrevoitureView7.
     * @return DetailslettrevoitureView7
     */
    public ViewObjectImpl getDetailslettrevoitureView7() {
        return (ViewObjectImpl) findViewObject("DetailslettrevoitureView7");
    }

    /**
     * Container's getter for FkLettrevoiture5Link1.
     * @return FkLettrevoiture5Link1
     */
    public ViewLinkImpl getFkLettrevoiture5Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture5Link1");
    }

    /**
     * Container's getter for FkLettrevoiture4Link1.
     * @return FkLettrevoiture4Link1
     */
    public ViewLinkImpl getFkLettrevoiture4Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture4Link1");
    }

    /**
     * Container's getter for FkLettrevoiture3Link1.
     * @return FkLettrevoiture3Link1
     */
    public ViewLinkImpl getFkLettrevoiture3Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture3Link1");
    }

    /**
     * Container's getter for FkLettrevoiture2Link1.
     * @return FkLettrevoiture2Link1
     */
    public ViewLinkImpl getFkLettrevoiture2Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture2Link1");
    }

    /**
     * Container's getter for FkLettrevoiture1Link1.
     * @return FkLettrevoiture1Link1
     */
    public ViewLinkImpl getFkLettrevoiture1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture3Link1.
     * @return FkDetailslettrevoiture3Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture3Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture2Link1.
     * @return FkDetailslettrevoiture2Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture2Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture1Link1.
     * @return FkDetailslettrevoiture1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture5Assoc1Link1.
     * @return FkLettrevoiture5Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture5Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture5Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture4Assoc1Link1.
     * @return FkLettrevoiture4Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture4Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture4Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture3Assoc1Link1.
     * @return FkLettrevoiture3Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture3Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture3Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture2Assoc1Link1.
     * @return FkLettrevoiture2Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture2Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture1Assoc1Link1.
     * @return FkLettrevoiture1Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture1Assoc1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture1Assoc1Link1.
     * @return FkDetailslettrevoiture1Assoc1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture1Assoc1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture2Assoc1Link1.
     * @return FkDetailslettrevoiture2Assoc1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture2Assoc1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture3Assoc1Link1.
     * @return FkDetailslettrevoiture3Assoc1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture3Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture3Assoc1Link1");
    }

    /**
     * Container's getter for AgrementByPermisView1.
     * @return AgrementByPermisView1
     */
    public ViewObjectImpl getAgrementByPermisView1() {
        return (ViewObjectImpl) findViewObject("AgrementByPermisView1");
        }
        /**
     * Container's getter for PermissionnairespnflView6.
     * @return PermissionnairespnflView6
     */
    public ViewObjectImpl getPermissionnairespnflView6() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView6");
    }

    /**
     * Container's getter for PermisView7.
     * @return PermisView7
     */
    public ViewObjectImpl getPermisView7() {
        return (ViewObjectImpl) findViewObject("PermisView7");
    }

    /**
     * Container's getter for PermissionnaireToPermisLink.
     * @return PermissionnaireToPermisLink
     */
    public ViewLinkImpl getPermissionnaireToPermisLink() {
        return (ViewLinkImpl) findViewLink("PermissionnaireToPermisLink");
    }


    /**
     * Container's getter for PermisView8.
     * @return PermisView8
     */
    public ViewObjectImpl getPermisView8() {
        return (ViewObjectImpl) findViewObject("PermisView8");
    }

    /**
     * Container's getter for PermissionnaireToPermisLink1.
     * @return PermissionnaireToPermisLink1
     */
    public ViewLinkImpl getPermissionnaireToPermisLink1() {
        return (ViewLinkImpl) findViewLink("PermissionnaireToPermisLink1");
    }

    /**
     * Container's getter for permisActifView1.
     * @return permisActifView1
     */
    public permisActifViewImpl getpermisActifView1() {
        return (permisActifViewImpl) findViewObject("permisActifView1");
    }

    /**
     * Container's getter for typeDocumentView1.
     * @return typeDocumentView1
     */
    public typeDocumentViewImpl gettypeDocumentView1() {
        return (typeDocumentViewImpl) findViewObject("typeDocumentView1");
    }


    /**
     * Container's getter for ProduitsPfnlView12.
     * @return ProduitsPfnlView12
     */
    public ViewObjectImpl getProduitsPfnlView12() {
        return (ViewObjectImpl) findViewObject("ProduitsPfnlView12");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView24.
     * @return PartiesProduitsPfnlView24
     */
    public ViewObjectImpl getPartiesProduitsPfnlView24() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView24");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc3Link3.
     * @return FkPartiesproduitspfnl1Assoc3Link3
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc3Link3() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc3Link3");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView25.
     * @return PartiesProduitsPfnlView25
     */
    public ViewObjectImpl getPartiesProduitsPfnlView25() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView25");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc3Link2.
     * @return FkPartiesproduitspfnl2Assoc3Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc3Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc3Link2");
    }

    /**
     * Container's getter for ExportpfnlView1.
     * @return ExportpfnlView1
     */
    public ViewObjectImpl getExportpfnlView1() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1");
    }

    /**
     * Container's getter for ExportpfnlView1_1.
     * @return ExportpfnlView1_1
     */
    public ViewObjectImpl getExportpfnlView1_1() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1_1");
    }

    /**
     * Container's getter for ExportpfnlView2.
     * @return ExportpfnlView2
     */
    public ViewObjectImpl getExportpfnlView2() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView2");
    }

    /**
     * Container's getter for ExportpfnlView3.
     * @return ExportpfnlView3
     */
    public ViewObjectImpl getExportpfnlView3() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView3");
    }

    /**
     * Container's getter for ExportpfnlView1_2.
     * @return ExportpfnlView1_2
     */
    public ViewObjectImpl getExportpfnlView1_2() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1_2");
    }

    /**
     * Container's getter for ExportpfnlView1_3.
     * @return ExportpfnlView1_3
     */
    public ViewObjectImpl getExportpfnlView1_3() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1_3");
    }

    /**
     * Container's getter for FkExportpfnl2Link1.
     * @return FkExportpfnl2Link1
     */
    public ViewLinkImpl getFkExportpfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl2Link1");
    }

    /**
     * Container's getter for FkExportpfnl1Link1.
     * @return FkExportpfnl1Link1
     */
    public ViewLinkImpl getFkExportpfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl1Link1");
    }

    /**
     * Container's getter for FkExportpfnl1Link1_1.
     * @return FkExportpfnl1Link1_1
     */
    public ViewLinkImpl getFkExportpfnl1Link1_1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl1Link1_1");
    }

    /**
     * Container's getter for FkExportpfnl2Link1_1.
     * @return FkExportpfnl2Link1_1
     */
    public ViewLinkImpl getFkExportpfnl2Link1_1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl2Link1_1");
    }

    /**
     * Container's getter for DetailsexportpfnlView1.
     * @return DetailsexportpfnlView1
     */
    public ViewObjectImpl getDetailsexportpfnlView1() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView1");
    }

    /**
     * Container's getter for DetailsexportpfnlView2.
     * @return DetailsexportpfnlView2
     */
    public ViewObjectImpl getDetailsexportpfnlView2() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView2");
    }

    /**
     * Container's getter for DetailsexportpfnlView3.
     * @return DetailsexportpfnlView3
     */
    public ViewObjectImpl getDetailsexportpfnlView3() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView3");
    }

    /**
     * Container's getter for DetailsexportpfnlView4.
     * @return DetailsexportpfnlView4
     */
    public ViewObjectImpl getDetailsexportpfnlView4() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView4");
    }

    /**
     * Container's getter for DetailsexportpfnlView5.
     * @return DetailsexportpfnlView5
     */
    public ViewObjectImpl getDetailsexportpfnlView5() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView5");
    }

    /**
     * Container's getter for DetailsexportpfnlView6.
     * @return DetailsexportpfnlView6
     */
    public ViewObjectImpl getDetailsexportpfnlView6() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView6");
    }

    /**
     * Container's getter for DetailsexportpfnlView7.
     * @return DetailsexportpfnlView7
     */
    public ViewObjectImpl getDetailsexportpfnlView7() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView7");
    }

    /**
     * Container's getter for DetailsexportpfnlView8.
     * @return DetailsexportpfnlView8
     */
    public ViewObjectImpl getDetailsexportpfnlView8() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView8");
    }

    /**
     * Container's getter for FkDetailsexportpfnl3Link1.
     * @return FkDetailsexportpfnl3Link1
     */
    public ViewLinkImpl getFkDetailsexportpfnl3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl3Link1");
    }

    /**
     * Container's getter for FkDetailsexportpfnl2Link1.
     * @return FkDetailsexportpfnl2Link1
     */
    public ViewLinkImpl getFkDetailsexportpfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl2Link1");
    }

    /**
     * Container's getter for FkDetailsexportpfnl1Link1.
     * @return FkDetailsexportpfnl1Link1
     */
    public ViewLinkImpl getFkDetailsexportpfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl1Link1");
    }

    /**
     * Container's getter for FkDetailsexportpfnl1Link2.
     * @return FkDetailsexportpfnl1Link2
     */
    public ViewLinkImpl getFkDetailsexportpfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl1Link2");
    }

    /**
     * Container's getter for FkDetailsexportpfnl2Link2.
     * @return FkDetailsexportpfnl2Link2
     */
    public ViewLinkImpl getFkDetailsexportpfnl2Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl2Link2");
    }

    /**
     * Container's getter for FkDetailsexportpfnl3Link2.
     * @return FkDetailsexportpfnl3Link2
     */
    public ViewLinkImpl getFkDetailsexportpfnl3Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl3Link2");
    }

    /**
     * Container's getter for getLastIcCollecte1.
     * @return getLastIcCollecte1
     */
    public getLastIcCollecteImpl getgetLastIcCollecte1() {
        return (getLastIcCollecteImpl) findViewObject("getLastIcCollecte1");
    }

    /**
     * Container's getter for LastiddetailscollecteView1.
     * @return LastiddetailscollecteView1
     */
    public ViewObjectImpl getLastiddetailscollecteView1() {
        return (ViewObjectImpl) findViewObject("LastiddetailscollecteView1");
    }

    /**
     * Container's getter for LastiddetailscollecteView1_1.
     * @return LastiddetailscollecteView1_1
     */
    public ViewObjectImpl getLastiddetailscollecteView1_1() {
        return (ViewObjectImpl) findViewObject("LastiddetailscollecteView1_1");
    }

    /**
     * Container's getter for lastiddetailscollecte1.
     * @return lastiddetailscollecte1
     */
    public ViewObjectImpl getlastiddetailscollecte1() {
        return (ViewObjectImpl) findViewObject("lastiddetailscollecte1");
    }

    /**
     * Container's getter for ExportpfnlView4.
     * @return ExportpfnlView4
     */
    public ViewObjectImpl getExportpfnlView4() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView4");
    }

    /**
     * Container's getter for DetailsexportpfnlView9.
     * @return DetailsexportpfnlView9
     */
    public ViewObjectImpl getDetailsexportpfnlView9() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView9");
    }

    /**
     * Container's getter for ExportToDetailExportLink.
     * @return ExportToDetailExportLink
     */
    public ViewLinkImpl getExportToDetailExportLink() {
        return (ViewLinkImpl) findViewLink("ExportToDetailExportLink");
    }

    /**
     * Container's getter for ExportpfnlView5.
     * @return ExportpfnlView5
     */
    public ViewObjectImpl getExportpfnlView5() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView5");
    }


    /**
     * Container's getter for ExportToPermisLink.
     * @return ExportToPermisLink
     */
    public ViewLinkImpl getExportToPermisLink() {
        return (ViewLinkImpl) findViewLink("ExportToPermisLink");
    }

    /**
     * Container's getter for ExportpfnlView6.
     * @return ExportpfnlView6
     */
    public ViewObjectImpl getExportpfnlView6() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView6");
    }

    /**
     * Container's getter for PermissionnairespnflView7.
     * @return PermissionnairespnflView7
     */
    public ViewObjectImpl getPermissionnairespnflView7() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView7");
    }

    /**
     * Container's getter for ExportToPermissionnaireLink.
     * @return ExportToPermissionnaireLink
     */
    public ViewLinkImpl getExportToPermissionnaireLink() {
        return (ViewLinkImpl) findViewLink("ExportToPermissionnaireLink");
    }

    /**
     * Container's getter for DetailsexportpfnlView10.
     * @return DetailsexportpfnlView10
     */
    public ViewObjectImpl getDetailsexportpfnlView10() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView10");
    }

    /**
     * Container's getter for UnitemesureView9.
     * @return UnitemesureView9
     */
    public ViewObjectImpl getUnitemesureView9() {
        return (ViewObjectImpl) findViewObject("UnitemesureView9");
    }

    /**
     * Container's getter for DetailsExportToUnitMesureLink.
     * @return DetailsExportToUnitMesureLink
     */
    public ViewLinkImpl getDetailsExportToUnitMesureLink() {
        return (ViewLinkImpl) findViewLink("DetailsExportToUnitMesureLink");
    }

    /**
     * Container's getter for DetailsexportpfnlView11.
     * @return DetailsexportpfnlView11
     */
    public ViewObjectImpl getDetailsexportpfnlView11() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView11");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView26.
     * @return PartiesProduitsPfnlView26
     */
    public ViewObjectImpl getPartiesProduitsPfnlView26() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView26");
    }

    /**
     * Container's getter for DetailsExportToPartieProduitLink.
     * @return DetailsExportToPartieProduitLink
     */
    public ViewLinkImpl getDetailsExportToPartieProduitLink() {
        return (ViewLinkImpl) findViewLink("DetailsExportToPartieProduitLink");
    }

    /**
     * Container's getter for DetailsexportpfnlView12.
     * @return DetailsexportpfnlView12
     */
    public ViewObjectImpl getDetailsexportpfnlView12() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView12");
    }

    /**
     * Container's getter for ExportToDetailExportLink1.
     * @return ExportToDetailExportLink1
     */
    public ViewLinkImpl getExportToDetailExportLink1() {
        return (ViewLinkImpl) findViewLink("ExportToDetailExportLink1");
    }

    /**
     * Container's getter for PermissionnairespnflView8.
     * @return PermissionnairespnflView8
     */
    public ViewObjectImpl getPermissionnairespnflView8() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView8");
    }

    /**
     * Container's getter for ExportToPermissionnaireLink1.
     * @return ExportToPermissionnaireLink1
     */
    public ViewLinkImpl getExportToPermissionnaireLink1() {
        return (ViewLinkImpl) findViewLink("ExportToPermissionnaireLink1");
    }

    /**
     * Container's getter for PermisView9.
     * @return PermisView9
     */
    public ViewObjectImpl getPermisView9() {
        return (ViewObjectImpl) findViewObject("PermisView9");
    }

    /**
     * Container's getter for ExportToPermisLink1.
     * @return ExportToPermisLink1
     */
    public ViewLinkImpl getExportToPermisLink1() {
        return (ViewLinkImpl) findViewLink("ExportToPermisLink1");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView27.
     * @return PartiesProduitsPfnlView27
     */
    public ViewObjectImpl getPartiesProduitsPfnlView27() {
        return (ViewObjectImpl) findViewObject("PartiesProduitsPfnlView27");
    }

    /**
     * Container's getter for DetailsExportToPartieProduitLink1.
     * @return DetailsExportToPartieProduitLink1
     */
    public ViewLinkImpl getDetailsExportToPartieProduitLink1() {
        return (ViewLinkImpl) findViewLink("DetailsExportToPartieProduitLink1");
    }

    /**
     * Container's getter for UnitemesureView10.
     * @return UnitemesureView10
     */
    public ViewObjectImpl getUnitemesureView10() {
        return (ViewObjectImpl) findViewObject("UnitemesureView10");
    }

    /**
     * Container's getter for DetailsExportToUnitMesureLink1.
     * @return DetailsExportToUnitMesureLink1
     */
    public ViewLinkImpl getDetailsExportToUnitMesureLink1() {
        return (ViewLinkImpl) findViewLink("DetailsExportToUnitMesureLink1");
    }

    /**
     * Container's getter for getLastIdExport1.
     * @return getLastIdExport1
     */
    public getLastIdExportImpl getgetLastIdExport1() {
        return (getLastIdExportImpl) findViewObject("getLastIdExport1");
    }

    /**
     * Container's getter for getLastIdDetailsexport1.
     * @return getLastIdDetailsexport1
     */
    public getLastIdDetailsexportImpl getgetLastIdDetailsexport1() {
        return (getLastIdDetailsexportImpl) findViewObject("getLastIdDetailsexport1");
    }

    /**
     * Container's getter for GroupeutilisateurView1.
     * @return GroupeutilisateurView1
     */
    public ViewObjectImpl getGroupeutilisateurView1() {
        return (ViewObjectImpl) findViewObject("GroupeutilisateurView1");
    }

    /**
     * Container's getter for UtilisateurView1.
     * @return UtilisateurView1
     */
    public ViewObjectImpl getUtilisateurView1() {
        return (ViewObjectImpl) findViewObject("UtilisateurView1");
    }

    /**
     * Container's getter for UtilisateurView2.
     * @return UtilisateurView2
     */
    public ViewObjectImpl getUtilisateurView2() {
        return (ViewObjectImpl) findViewObject("UtilisateurView2");
    }

    /**
     * Container's getter for UtilisateurView3.
     * @return UtilisateurView3
     */
    public ViewObjectImpl getUtilisateurView3() {
        return (ViewObjectImpl) findViewObject("UtilisateurView3");
    }

    /**
     * Container's getter for UtilisateurView4.
     * @return UtilisateurView4
     */
    public ViewObjectImpl getUtilisateurView4() {
        return (ViewObjectImpl) findViewObject("UtilisateurView4");
    }

    /**
     * Container's getter for UtilisateurView5.
     * @return UtilisateurView5
     */
    public ViewObjectImpl getUtilisateurView5() {
        return (ViewObjectImpl) findViewObject("UtilisateurView5");
    }

    /**
     * Container's getter for UtilisateurView6.
     * @return UtilisateurView6
     */
    public ViewObjectImpl getUtilisateurView6() {
        return (ViewObjectImpl) findViewObject("UtilisateurView6");
    }

    /**
     * Container's getter for UtilisateurView7.
     * @return UtilisateurView7
     */
    public ViewObjectImpl getUtilisateurView7() {
        return (ViewObjectImpl) findViewObject("UtilisateurView7");
    }

    /**
     * Container's getter for FkUtilisateur3Link1.
     * @return FkUtilisateur3Link1
     */
    public ViewLinkImpl getFkUtilisateur3Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur3Link1");
    }

    /**
     * Container's getter for FkUtilisateur2Link1.
     * @return FkUtilisateur2Link1
     */
    public ViewLinkImpl getFkUtilisateur2Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur2Link1");
    }

    /**
     * Container's getter for FkUtilisateur1Link1.
     * @return FkUtilisateur1Link1
     */
    public ViewLinkImpl getFkUtilisateur1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur1Link1");
    }

    /**
     * Container's getter for FkUtilisateur3Assoc1Link1.
     * @return FkUtilisateur3Assoc1Link1
     */
    public ViewLinkImpl getFkUtilisateur3Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur3Assoc1Link1");
    }

    /**
     * Container's getter for FkUtilisateur2Assoc1Link1.
     * @return FkUtilisateur2Assoc1Link1
     */
    public ViewLinkImpl getFkUtilisateur2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur2Assoc1Link1");
    }

    /**
     * Container's getter for FkUtilisateur1Assoc1Link1.
     * @return FkUtilisateur1Assoc1Link1
     */
    public ViewLinkImpl getFkUtilisateur1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur1Assoc1Link1");
    }
    
    public UserData findutil (String _loginuser, String _passworduser){
        UserData util = null;
        ViewObject vo = this.getUtilisateurView1();
        ViewCriteria vc = vo.createViewCriteria();;
        ViewCriteriaRow vcr = vc.createViewCriteriaRow();
        vcr.setAttribute("Loginuser", _loginuser);
        vcr.setAttribute("Passworduser",_passworduser);
        vc.add(vcr);
        vo.appendViewCriteria(vc);
        vo.executeQuery();
        if (vo.hasNext()){
            util = new UserData();
            Row rr=vo.next();
            util.setLoginuser(rr.getAttribute("Loginuser").toString());
            util.setNonuser(rr.getAttribute("Nomuser").toString());            
            util.setTelephone(rr.getAttribute("Telephone").toString());
            BigDecimal bd;
            BigDecimal b1;
            Boolean bb;
            
            bd= (BigDecimal)rr.getAttribute("Iddepartements");
            util.setIddepartement(bd);
            
            bd= (BigDecimal)rr.getAttribute("Idregions");
            util.setIdregion(bd);
            
            bd= (BigDecimal)rr.getAttribute("Idgroupe");
            util.setIdgroupe(bd);
            b1=new BigDecimal(1);
            if (bd.equals(b1)) util.setEstinfo(true);
            b1=new BigDecimal(2);
            if (bd.equals(b1)) util.setEstadmin(true);
            b1=new BigDecimal(3);
            if (bd.equals(b1)) util.setEstuser(true);
            
            
            bd= (BigDecimal)rr.getAttribute("Idutilisateur");
            util.setIdutilisateur(bd);
            
            int nn = (Integer)rr.getAttribute("Niveauintervention");
            util.setNiveauintervention(nn);
            if (nn == 1) util.setEstcent(true);
            if (nn == 2) util.setEstreg(true);
            if (nn == 3) util.setEstdep(true);
            
            bb= (Boolean)rr.getAttribute("Saisieexport");
            util.setSaisieexport(bb);
            
            bb= (Boolean)rr.getAttribute("Saisiecollecte");
            util.setSaisiecollecte(bb);
            
            bb= (Boolean)rr.getAttribute("Saisietransit");
            util.setSaisietransit(bb);
            
        }
        
        return util;
        
    }

    /**
     * Container's getter for NiveauValidationView1.
     * @return NiveauValidationView1
     */
    public NiveauValidationViewImpl getNiveauValidationView1() {
        return (NiveauValidationViewImpl) findViewObject("NiveauValidationView1");
    }

    /**
     * Container's getter for getLastIdUtilisateur1.
     * @return getLastIdUtilisateur1
     */
    public ViewObjectImpl getgetLastIdUtilisateur1() {
        return (ViewObjectImpl) findViewObject("getLastIdUtilisateur1");
    }
}


