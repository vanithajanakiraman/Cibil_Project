$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cibil.feature");
formatter.feature({
  "line": 1,
  "name": "Get Cibil Report And Score",
  "description": "",
  "id": "get-cibil-report-and-score",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24020000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "CibilScore",
  "description": "",
  "id": "get-cibil-report-and-score;cibilscore",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Need To Click The Cibil Report And Score",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Either To Click The Options Premium Of One Year",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user Either To Click The Options Standard Of Six Month",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user Either To Click The Options Basic Of One Month And Move To Create Account or Get Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application_Url()"
});
formatter.result({
  "duration": 8000503600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Need_To_Click_The_Cibil_Report_And_Score()"
});
formatter.result({
  "duration": 185349800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Either_To_Click_The_Options_Premium_Of_One_Year()"
});
formatter.result({
  "duration": 30200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Either_To_Click_The_Options_Standard_Of_Six_Month()"
});
formatter.result({
  "duration": 22900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Either_To_Click_The_Options_Basic_Of_One_Month_And_Move_To_Create_Account_or_Get_Login()"
});
formatter.result({
  "duration": 10079788200,
  "status": "passed"
});
});