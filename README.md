"#ceasarcipher"

To Run Application :

run maven goal "spring-boot:run" to start the embedded Tomcat server.

To Encipher :

Navigate to localhost:8080/encipher?text=TEST&shift=2

The parameter text is the text that is going to be enciphered and the shift is
the number of letters to shift by.
Both of the parameter may be changed.


To Decipher :

Navigate to localhost:8080/decipher?text=TEST&shift=2

The parameter text is the text that is going to be enciphered and the shift is
the number of letters to shift by.
Both of the parameter may be changed.