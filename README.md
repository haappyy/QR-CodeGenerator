# QR-CodeGenerator

This is a example project which provides an http based qr code generator.
This is a spring boot project. Add additional dependencies in the pom.xml.
It exposes the qr code generator on `http://localhost:8080/qrcode?inputText=HelloWorld`.
Use the query param `inputText` to determine the content of the qr code.

# Docker 

Use `docker build` to build the container and `docker run` to run it. Expose port 8080.



