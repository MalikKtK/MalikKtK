# Ex: Client vs Library Code

I denne tutorial skal du arbejde med nogle eksempler på Client code og Library code, og du vil få en bedre forståelse for dette og for abstraction i det hele taget.

#### Bibliotek

I går lavede du en øvelse med en Bog og et Bibliotek.

```java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }
    
    // Getter and Setters for all Fields (attributes)
}
```

```java
public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("War Thunder", "John Doe", "123456789", 2019));
        books.add(new Book("Hacknet", "John Doe", "234567891", 2013));
        books.add(new Book("Hacknet", "John Doe", "345678912", 2022));
        books.add(new Book("Hacknet", "John Doe", "456789123", 2021));
    }

    public boolean doesBookExist(Book book){
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())){
                return true;
            }
        }
        return false;
    }
}a
```

Du skal arbejde videre med denne kode som grundlag.&#x20;

#### Nyt Projekt i IntelliJ

Lav et nyt projekt i intelliJ og tilføj disse to filer til projektet. Kør projektet for at sikre dig at det compiler.&#x20;

Meningen er at dette projekt skal gemmes i en .jar fil, som du herefter kan importere ind i et andet projekt og gøre brug af din kode der.&#x20;

Dit projekt skulle nu gerne se sådan ud:

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.10.17.png>)

Læg mærke til Main klassen med en tom main() metode (lav den hvis du ikke har den).

#### Generer en library.jar fil

i intelliJ klik på:&#x20;

**File -> Project Structure -> Artifacts -> + -> JAR -> From modules with dependencies**&#x20;

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.17.57.png>)

I **main class** vælg din Main klasse:

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.19.49.png>)

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.21.11.png>)

Og klik ok, ok, ok til det hele

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.22.32.png>)

Klik på:

Build -> Build Artifacts

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.31.05.png>)

library:jar -> Build

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.31.55.png>)

Nu har du fået en Jar fil i dit project.&#x20;

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.34.38.png>)

&#x20;Denne jar fil indeholder kompileret kode af dine 3 filer Book, Library og Main. Denne fil kan du give til dine klassekammerater eller du kunne sælge den til andre som så kunne bruge den.&#x20;

#### Brug din sidemands jar fil i dit projekt.&#x20;

Lav et nyt tomt projekt i intelliJ. Få fat i din sidemands jar fil, eller brug denne: [library.jar](https://github.com/2-semester-programmering/dat22v1\_assets/raw/main/libary.jar)

Klik: **File -> Project Structure -> modules -> + -> JARs or Directories**

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.46.18.png>)

Find din jar fil og klik "open", klik "apply, OK, OK"

Under "External Libraries" kan du nu se din importerede jar fil

![](<../.gitbook/assets/Screenshot 2022-08-23 at 14.49.13.png>)

#### Brug koden fra JAR filen

Lav en Main.java fil og brug bibliotekskoden.

```
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        var result = library.doesBookExist(new Book("War Thunder", "John Doe", "123456789", 2019));
        System.out.println(result);
    }
}
```

#### Client Code vs Library Code

I dette eksempel er alt hvad du har lavet af kode og som er tilgængeligt i din jar fil "Library Code", alt hvad du har i dinn Main herover er "Client Code". På klientsiden ved du ikke hvordan **doesBookExist** finder ud af om bogen eksisterer, men du ved hvordan du bruger metoden. Dette er et eksempel på abstraction.&#x20;

#### ArrayList

Ligesom når du bruger en Arrayliste så gør du også  brug af noget "Library" kode som nogle andre mennesker har lavet og som du sikkert ikke har megen ide om hvordan er lavet da du arbejder med en abstraktion.

```
import java.util.ArrayList;
```

Nu kan du lave et object af en Arrayliste og bruge Arraylistens metoder som feks:

```
ArrayList<String> names = new ArrayList<>()
names.add("Claus")
```

Hvordan `public class ArrayList` er kodet er ikke så vigtigt for os lige nu, men at vi kan tilføje noget til listen vha. `add()` er det vi har brug for at vide.&#x20;
