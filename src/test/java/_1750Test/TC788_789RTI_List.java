package _1750Test;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3e091eeb-65e5-4077-81b6-7752729c278c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1411, profileId = 101275)
public class TC788_789RTI_List extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
        
    	sTestCaseID="TC788";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
//   	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
////    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
////    _AgentsSetting.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
////    _AgentsSetting.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
//    _AgentsSetting.Click_ClickAgentSettings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
//    _AgentsSetting.Click_clickPayroll();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
//    _AgentsSetting.Click_ClicktoAddDate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
//    _AgentsSetting.Enter_EnterAutoRunDate(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
//    _AgentsSetting.Click_ClickSave();
    

_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_RTI();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.SelectAccountManager(data[4]);

    }
    
    
    @Test  (priority=2,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
        
    	sTestCaseID="TC789";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
        pages.loginpageSandbox _loginpage = new pages.loginpageSandbox(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
 //  	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
//    _AgentsSetting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
//    _AgentsSetting.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
//    _AgentsSetting.Click_ClickAgentSettings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
//    _AgentsSetting.Click_clickPayroll();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
//    _AgentsSetting.Click_ClicktoAddDate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
//    _AgentsSetting.Enter_EnterAutoRunDate(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
//    _AgentsSetting.Click_ClickSave();
//    

_1743Agent_Dashboard.Agent_Payroll_DSB _Agent_Payroll_DSB = new _1743Agent_Dashboard.Agent_Payroll_DSB(driver);
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click__Payroll_();
    
    TestModellerLogger.SetLastNodeGuid("b3d231eb-c171-49f9-ad97-9f10ea92235a");
    _Agent_Payroll_DSB.Click_Submit_RTI();
    
    NewPages.Pension_Contribution_Page pensionContribution=new NewPages.Pension_Contribution_Page(driver);
    
    pensionContribution.SelectAccountManager(data[4]);
  
  


    }

}
