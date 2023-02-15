# HTML & CSS

### What is HTML?

HTML stands for Hypertext Markup Language. **Hypertext** is text displayed on a display. **Markup language** is a computer language that uses tags to define elements. You could say that html is a language that has specific rules just like JSON, XML or a Java file, that uses tags to define individual elements like the header tag, link tag or others.

### How to create an html file

Simply create a new file with the file ending `.html` fx `index.html` or `about.html`

In this file you can write html. To open the rendered html file, open the file in a browser (usually you can just double click the file)

_Teacher note_: Create a simple html file and add some simple tags

#### Whats up with the index.html file??

The `index.html` file has always been used as the default html page. So usually when navigating to a websites main page. The `index.html` file will be served.

### HTML tags

To write open a tag, you you write this: `<p>` where `p` is the tag name. To close the `p` tag write this `</p>`. What you write inbetween is the content of the tag. `<p>this is the content of the p tag</p>`

There are a few tags that are **self closing** like fx a line break tag: `<br/>` or an image tag `<img src="https://someurl.dk" />`

There are lots of different html tags! Here are a few:

* `h1` defines a header tag - `<h1>Buy okay products</h1>`
* `a` defines a link tag - `<a href="www.telmore.dk">Go to Telmore website</a>`
* `footer` defines a footer element - `<footer>Adress: copenhagen street 1, 2300 Copenhagen</footer>`

Find more tags by googling somthing like `html tags`. This site i can generally recommend: [https://developer.mozilla.org/en-US/docs/Web/HTML/Element](https://developer.mozilla.org/en-US/docs/Web/HTML/Element)

### HTML attributes

HTML attributes is used for adding information to a tag. There are **tons** of html attributes. I will give a few examples:

`<a href="www.telmore.dk">Go to Telmore website</a>` - `href` is an attribute that decides what link to go to when the link is clicked.

`<div class="user-name">Benjamin Hughes</div>` - `class` is the attribute defining an identifier for an element.

#### Naming HTML elements

Why should we even name our html elements? Mostly it's for targeting when writing css and javascript. So fx if we wanted to change the text color of a `h2` tag. Then we would need to tell for what tag the text color should be changed. The same with js, if we wanted to change the text of an h2 we would need to select that element first. Here namin is super useful!

There are 2 main ways of naming:

1. **Class** - `<p class="user-name">Pernille Høegh</p>`
   * The same class can be used for multiple elements
   * You can use multiple classes on a single element
2. **Id** - `<p id="user-name">Pernille Høegh</p>`
   * Id's should be used for unique elements
   * The same id should not be used for an element
   * `id`'s should be very rarely used!&#x20;

Use hyphen between names ([https://google.github.io/styleguide/htmlcssguide.html#ID\_and\_Class\_Name\_Delimiters](https://google.github.io/styleguide/htmlcssguide.html#ID\_and\_Class\_Name\_Delimiters)) and always lowercase! So not `UserName` but `user-name`, `productList` to `product-list`

### HTML document structure

An html document is divided into different parts:

```markup
<html>
    <!-- inside of the html tag is where all your html will go -->
    <head>
        <!-- This is where you put meta information about the page: favicon, title, social media tags etc -->
    </head>
    <body>
        <!-- In the body is where you put the content of your website -->
        <main>
            <header>
                <!-- In the header you have things like the logo and navigation-->
                  <nav>
                  <ul>
                    <li><a href="/">Ebai</a></li>
                    <li><a href="#products">Products</a></li>
                  </ul>
                  </nav>
            </header>
            <section class="intro">
                <h1>Welcome to our wonderful site</h1>
            </section>
            <section id="products" class="products">
                <ul>
                    <li>Tv</li>
                    <li>Mobile</li>
                    <li>Washing machine</li>
                </ul>
            </section>
        </main>
        <footer>
            <!-- In the footer you have things like contact information, links, address-->
        </footer>
    </body>
</html>
```

An example of some sections on a page.

![Image not loaded go to https://github.com/behu-kea/dat20-classes/blob/master/week-1/assets/layout.png to see image](assets/layout.png)



## HTML DOM

DOM stands for Document Object Model. It is a representation of the html elements! The individual html elements are represented as nodes.

#### Why do we even have the DOM? What is it used for?

The browser uses the DOM to render a page. So a browser takes your html, transforms it into the DOM and then it starts rendering the DOM.

When working with javascript you will actively be using this DOM. You dont need to understand the code. This is simply an example to show that the DOM is a very concrete and real thing.

```javascript
// The document object model
const dom = window.document;
// Here we are grabbing a specific node (the html element div with the class of user-name)
const usernameDomNode = dom.querySelector('div.user-name');
// Now we are changing the text inside of the node
usernameDomNode.innerText = "Heriette Hansen";
```

![Image not loaded go to https://github.com/behu-kea/dat20-classes/blob/master/week-1/assets/dom.png to see image](assets/dom.png)

The nodes have relationships between each other.

* Who is the parent of the `body`?
* What relationship does the `div` with id `div1`  has to the `h1`?
* Who is the `h1`'s grandparent?
* How many children does the `HTML` element have?
