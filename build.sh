#!/usr/bin/zsh
mvn clean install
# mvn dependency:
if [[ $? == 0 ]]; then
	clear
	java -Dfile.encoding=UTF-8 -cp ./target/classes com.example.Main
fi
