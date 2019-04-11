# azure-databricks-postgres

This repo provides instruction on how to connet to Azure DB for PostgreSQL from Azure Databricks using Scala.

* Azure DB for PostgreSQL documentation, including quickstart: https://docs.microsoft.com/en-ca/azure/postgresql/

* Azure Databricks documentation, including quickstart: https://docs.azuredatabricks.net/getting-started/quick-start.html

Once you create a PostgreSQL DB, enable Azure service access. By default, SSL connection should be enabled. Allow Azure Databricks to access a ca-certificates.crt and then you should be able to run the script for connection.