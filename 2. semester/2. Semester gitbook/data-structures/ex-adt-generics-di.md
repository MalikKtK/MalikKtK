# Ex: ADT, Generics, DI

Solution: [https://github.com/2-semester-programmering/Ex\_02\_ADT/tree/maste](https://github.com/2-semester-programmering/Ex\_02\_ADT/tree/master)r

### Øvelse: Lav Deck klassen færdig

Fortsæt med DeckList eksemplet fra tavlen og lav mindst følgende metoder færdig.

```java
add()
get()
size()
isEmpty() 
contains(Object o)
remove(Object o)
remove(int index)
clear()
set(int index, E element)
add(int index, E element)
indexOf(Object o)
```

Når det er gjort kan du gå videre med resten af metoderne.



### Øvelse: Book / Library DI

Lav Bog øvelsen fra første undervisningsgang om til at den ved hjælp af dependency injection kan skifte mellem ArrayList og Linked List.va

```java
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        System.out.println(library.doesBookExist(new Book("War Thunder", "John Doe", "123456789", 2019)));
    }
}
```

```java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
}
```

```java
public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("War Thunder", "John Doe", "123456789", 2019));
        books.add(new Book("Hacknet", "John Doe", "345678910", 2013));
        books.add(new Book("Hacknet", "John Doe", "80808080", 2022));
        books.add(new Book("Hacknet", "John Doe", "9090909090", 2021));
    }

    public boolean doesBookExist(Book book){
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())){
                return true;
            }
        }
        return false;
    }
}
```
