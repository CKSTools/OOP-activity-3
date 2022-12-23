# Opgave 3

Denne opgave omhandler hvordan vi læser og skriver til filer og file i/o. I opgaven skal du læse filen `gods.txt` (ligger i resources), som indeholder 9 guder separeret med `,` (komma). Filen skal læses, filtreres således at guder der starter med _A_ bliver frasorteret. De resterende guder skrives til en ny fil `filtered-gods.txt` som du skal oprette. Hver gud skal have sin egen linje i filen.

De følgende klasser medfølger:
- `GreekGods` - Logik der læser `gods.txt` filen og opretter en ny fil med filtreret guder.

## Step 1
Start med at implementere `readFile` metoden. En reference `godFile` til filen du skal læse er allerede oprette - du skal bruge denne variabel når du læser fra filsystemet. 

Indlæs filen og `split` ved hver `,` - dette burde give dig en liste af strenge hvor hver streng er navnet på en gud. Hver gud skal derefter tilføjes til listen `gods` som findes på instansen. 

## Step 2
Nu skal vi implementere `saveFilteredGods` metoden.

I metodens krop, skal du starte med at oprette en ny fil som du gemmer guderne til. Her skal du benytte `file` variablen for at gemme til filsystemet. Undervejs burde denne metode oprette en `filtered-gods.txt` i roden af dit projekt.

Dernæst skal du køre igennem liste af `string` i `gods` listen og:
- _frasortere_ guder som starter med __A__
- oprette en ny linje med gudens navn

Husk at _lukke_ filen når du er færdig.

## Sådan tester du din løsning
Ligesom i de forrige opgaver har vi oprettet en række test-metoder som du kan benytte for at verificere korrektheden af dit program. Filen `test/java/task3/Task3Test.java` indeholder to metoder som tjekker om du har løst opgaven.

I step 2 kan du også inspicere den oprettede fil, hvis du har problemer med opgaven.