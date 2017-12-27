<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Index</title>
</head>
<body>

<h2>Enter a US Dollar amount and click convert</h2>
<g:form name="convertForm" url="[controller:'convert', action:'result']">
    <g:textField name="usValue" value="${useValue}"/>
    <g:submitButton name="submitButton" value="Convert"/>
</g:form>
</body>
</html>
