compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin	
ejecutar:compilar
	java -cp bin MediaRecursivo.src.Media1
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm ap-personas.jar manifest.txt -C bin