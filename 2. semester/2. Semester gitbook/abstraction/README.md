# Abstraction

### Abstraction in Java

**Abstraction** is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

Another example is the break pedal of a Car. If an animal jumps in front of your car you hit the break pedal, and you do not have to think about how the computer in the car interpret your push to the pedal and after that activates the breakpads on the wheels.&#x20;

The pedal is an abstraction, it hides the technical details and gives us a simple an easy to use interface to the cars breaking system.&#x20;

Abstraction lets you focus on **what the object does** instead of **how it does it**.

#### Ways to achieve Abstraction in Java

There are two ways to achieve abstraction in java

1. Abstract class (0 to 100%)
2. **Interface (100%) - the one we will focus on**

### Client code / Library Code

When we work with abstraction it is good to think of the code you are writing as either Client code or Library Code.  In relation to the examples above, **Client code** would be the break pedal. It is easy and simple to use, and we dont need to know in details how it is programmed. \
**Library code** is then the actual code with all the details.&#x20;

A little naive but descriptive example could look like this:

<pre class="language-java" data-line-numbers><code class="lang-java"><strong>// Library Code
</strong>class Car {
    private int speed;
    
    public void acceleratorPedal(int speed){
        this.speed = speed;
    }
    
    public void breakPedal(){
        this.speed = 0;
    }
}</code></pre>

<pre class="language-java" data-line-numbers><code class="lang-java"><strong>// Client Code
</strong>class Main{
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.acceleratorPedal(100);  // Speed up car
        bmw.breakPedal();  // stop car
    }
}</code></pre>

In my Client Code i only need to know that i can use the two methods **accelerator** and **breakPedal** and i need to know that accelerator takes one parameter (which in this case is the speed i want the car to drive) and that it has a void return value. I also need to know that the method breakPedal has no parameters and it also has a void return type.  Thats it!

If i (the author of the Library code) would at some point like to make the car a little more advanced, i could do that without "breaking" the client code by just following the simple agreements that the accelerator method "takes one parameter" and "returns void", and that the breakPedal method has "no parameters" and "returns void". &#x20;

My code could look like this, without the user of the client code would ever know anything about what has happened. The code in the Main class does not have to change anything.&#x20;

<pre class="language-java" data-line-numbers><code class="lang-java"><strong>// Library Code
</strong>class Car {
    private int speed;
    public void acceleratorPedal(int speed){
        if(this.speed &#x3C; speed){
            for(int i = this.speed; i &#x3C; speed; i++){
                sleepOneSec();
                this.speed = speed;
            }
        } else if (this.speed > speed) {
            for(int i = this.speed; i > speed; i--){
                sleepOneSec();
                this.speed = speed;
            }
        }
    }
    
    public void breakPedal(){
        for(int i = this.speed; i > 0; i--){
            sleepOneSec();
            this.speed = i;
        }
    }
       
    private static void sleepOneSec() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}</code></pre>

<pre class="language-java" data-line-numbers><code class="lang-java"><strong>// Client Code
</strong>class Main{
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.acceleratorPedal(100);  // Speed up car
        bmw.breakPedal();  // stop car
    }
}</code></pre>

It complicates things a little that in your case you are most often writing both client code and library code, but this is mostly due too the fact that it is often very small projects you are working on.&#x20;

But still, stick to this principle: **when you code keep library code and client code separate.** &#x20;
