package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

public static ExtentReports extent;

public static ExtentReports getReport() {

if(extent==null) {

ExtentSparkReporter spark =

new ExtentSparkReporter(
"ExtentReport.html");

spark.config()
.setReportName(
"API Automation Report");

extent = new ExtentReports();

extent.attachReporter(
spark);

}

return extent;

}

}