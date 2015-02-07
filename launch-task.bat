SET LOG_FILE="c:\\data\\test1.txt"
SET FILES_DIR="C:\Users\Adrian\Google Drive\Functional Programming Principles in Scala"
SET JAR_LOCATION="C:\workspaces\31012015\LastTrack\target\"
SET MAIN_CLASS=driver.BatDriver

cd %JAR_LOCATION%
java -cp "LastTrack-0.0.1-SNAPSHOT.jar;dependency-jars/*" driver.BatDriver %LOG_FILE% %FILES_DIR%
