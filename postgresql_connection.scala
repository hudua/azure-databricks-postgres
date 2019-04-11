val jdbcUrl = s"jdbc:postgresql://<servicename>.postgres.database.azure.com:5432/example?user=<user>@<servicename>&password=<pw>&stringtype=unspecified&ssl=true&ssl_ca_certs=<path>/ca-certificate.crt"
val connectionProperties = new java.util.Properties()
val driverClass = "org.postgresql.Driver"
connectionProperties.setProperty("Driver", driverClass)

sampleDF.write.mode("append").jdbc(jdbcUrl, "table", connectionProperties)