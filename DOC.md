# RestEasy Microserive mit Quarkus Framwork

Die Erstellte API checkt ob die eingegebene Ganzzahl (BigInteger) eine Primzahl ist.

## Enpoint

Über den Endpunkt: `/isprime/{number}` lässt sich prüfen ob die Zahl eine Primzahl ist.

Händischer Test:
```sh
curl http://127.0.0.1:8080/isprime/199
```

## Probleme

* Docker Image nicht fertig gestellt, keine Zeit mehr
* Ausbaufähiger Unit Test, Test deckt nur eine Primzahl ab. Verbesserungen wären z.B. testen
auf negative Zahlen, keine Ganzzahlen usw...

## Ausführen

Da noch kein Docker Image verfügbar, über maven starten:
```sh
./mvnw quarkus:dev 
```
