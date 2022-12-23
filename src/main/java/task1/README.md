# Opgave 1

Denne opgave omhandler, at kaste exceptions

De følgende klasser medfølger:

- `Animal` - Abstract klasse som er ansvarlig for at repræsentere et givet dyr 
- `NoSoundException` - Denne exception skal __kastes__ når et dyr ikke kan lave en lyd (så som et firben). 

`Animal` klassen indeholder en constructor og en _abstrakt_ metode `makeSound`

## Step 1

Opret en ny klasse ved navn `Pig` i pakken `animals`. Dette dyr skal nedarve fra `Animal` klassen.
Dernæst skal du implementere `makeSound()` metoden således at den for grisen returnerer `Oink`

## Step 2

Opret nu en klasse ved navn `Lizard` i pakken `animals`. Ligesom `Pig` skal denne klasse også nedarve fra `Animal` klassen.
Her skal du endnu engang implementere `makeSound()` metoden, men i stedet for at returnere en streng skal du kaste en `NoSoundException`  (metoden skal _propagere_ din exception). 

## Sådan tester du din løsning

Vi har lavet en række test-metoder som du kan benytte for at verificere korrektheden af dit program. Filen `test/java/task1/Task1Test.java` indeholder to metoder som tjekker om du har løst opgaven. I IntelliJ kan du trykke på det lille play-ikon i venstre side for at køre enkelte tests eller dem alle sammen på en gang. Et eksempel på dette ses nedenfor:
![](https://i.imgur.com/UDaJCWj.png)