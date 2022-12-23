# Opgave 4

Denne opgave omhandler også exceptions, men denne gang skal vi ike blot _kaste_ dem, vi skal også _håndtere_ dem.
Vi er ved at lave et system som gør det muligt at lave opskrifter og dernæst tilberede dem. Desværre lader det til, at nogle ondsindede mennesker synes det er sjovt at putte rottegift i opskrifterne. Det er vores opgave at sikre, at de giftige ingredienser aldrig bliver tilberedt og at vi fortsat kan tilberede retten, foruden dem.

Klasserne forneden medfølger:
- `Cooking` - Logik som bruges til at tilberede en opskrift
- `Recipe` - Logik der repræsentere en givet opskrift - en opskrift indeholder en liste af ingredienser
- `ingredients.Ingredient` - Abstrakt klasse, som alle ingredienser nedarver fra - indeholder logik der gør det muligt at tilberede den enkelte ingrediens.
- `ingredients.IsPoisonous` - Interface, som bruges til at markere ingredienser der er giftige.
- `ingredients.PoisonousIngredientException` - Exception that should be thrown when trying to prepare a toxic ingredient
- `ingredients.` - Mulige ingredienser, som kan benyttes i en opskrift
  - `Pasta`
  - `RatPoison`
  - `Thyme`
  - `Tomato`
  
## Step 1
Start med at modificere `prepare()` metoden i `ingredients.Ingredient` klassen. I øjeblikket bliver dens instansvariable `isPrepared` altid sat til `true`. 

Ændr metoden således at, ingredienser der implementerer interfacet `ingredients.IsPoisonous` får metoden til at kaste en exception af typen `ingredients.PoisonousIngredientException` - denne exception skal __propageres__. 

Instansvariablen `isPrepared` skal kun sættes til `true` for ikke giftige ingredienser.

## Step 2
Nu er vi klar til at tilberede en opskrift. I `Cooking` klassen skal du redigere `cook()` metoden. Metoden skal køre igennem ingredienserne i opskriften. Du kan hente ingredienserne gennem instansvariablen `recipe` og dernæst kalde `getIngredients` på denne. 

For hver ingredients skal du kalde `prepare()` metoden, og håndtere exceptions som bliver kastet undervejs ved brug af `try / catch`

Når du er færdig med at køre igennem listen af ingredienser skal du opdatere `isDone` instansvariablen for at indikere at du er færdig med at tilberede retten.

## Sådan tester du din løsning

Ligesom i de forrige opgaver har vi oprettet en række test-metoder som du kan benytte for at verificere korrektheden af dit program. Filen `test/java/task4/Task4Test.java` indeholder fire metoder som tjekker om du har løst opgaven.

Du kan benytte de første to tests for at tjekke korrektheden af __step 1__, og de resterende to tests for at teste korrektheden af __step 2__.