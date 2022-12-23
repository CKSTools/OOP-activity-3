# Opgave 2

Denne opgave omhandler hvordan man laver lists og sorterer dem i Java, ved brug af et `Comparable` interface. Forestil dig, at du er er blevet ansat til at holde styr på stillingerne i Formel1, og du derfor gerne vil lave et lille program som kan gøre dette for dig. Hver kører har et navn og nogle point som du bruges til at finde ud af hvor de placeres. 

De følgende klasser medfølger:
- `Driver` - Logik ansvarlig for at repræsentere en givet kører. Indeholder to attributter:
  - `Name` - Navnet på køreren
  - `Points` - Antal point en givet kører har akkumuleret indtil videre
- `ScoreBoard` - Indeholder en liste over alle kørerne og tillader at nye kan blive tilføjet

## Step 1
Start med at redigere `Driver` klassen sådan, at parametrene der bliver givet til constructor'en for de hensigtsmæssig instansvariabler. Derefter skal du ændre de to `getter` metoder således, at de returnerer deres respektive instansvariabler. 

## Step 2
I `Scoreboard` klassen er `List<Driver>` allerede deklareret, men den er ikke initialiseret endnu. Denne variabel skal instantieres til en `ArrayList` før du kan fortsætte.

Derefter skal du implementere logikken for `addDriver(Driver driver)` metoden. `driver` variablen skal tilføjes til `drivers` listen.

## Step 3
I `Driver` klassen skal du nu implementere `Comparable` interface'et sammen med dens tilhørende metode `compareTo`.
`compareTo` metoden skal sortere kørerne efter point, faldenede, sådan at, kører med flest point kommer først.

## Sådan tester du din løsning

Ligesom i sidste opgave har vi oprettet en række test-metoder som du kan benytte for at verificere korrektheden af dit program. Filen `test/java/task2/Task2Test.java` indeholder fire metoder som tjekker om du har løst opgaven. 