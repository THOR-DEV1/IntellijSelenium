package listeners;


import java.io.IOException;
import java.util.Scanner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import util.ErrorClass;
import util.JiraPolicy;
import util.JiraServiceProvider;
import util.LoaderClass;

public class Jiralistener implements ITestListener {
    LoaderClass ld=new LoaderClass();
    ErrorClass tt=new ErrorClass();
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("TestPass in listner");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Testfil inlistner");
        JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
        boolean isTicketReady = jiraPolicy.logTicketReady();
        String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
                + "got failed due to some assertion or exception";
        String issueDescription = result.getThrowable().getMessage() + "\n";
        System.out.print("\n"+issueDescription);
        System.out.println("Exception occured Do you Want raise ticket(yes/no) :: ");
        //Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        String str= tt.Assert();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
        System.out.println(str);

        if(str.equals("yes")){
            if (isTicketReady) {
                // raise jira ticket:
                System.out.println("is ticket ready for JIRA: " + isTicketReady);
                JiraServiceProvider jiraSp = null;
                //Connection
                try {
                    jiraSp = new JiraServiceProvider(ld.load("jiraurl"),
                            ld.load("user"), ld.load("pass"), ld.load("project"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //Report


                //HELENIUM
                try {
                    jiraSp.createJiraTicket(ld.load("IssueType"), ld.load("issueSummary"), ld.load("Discrption"), ld.load("report"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else {
                System.out.print("Thank You...!");
            }
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }




}
