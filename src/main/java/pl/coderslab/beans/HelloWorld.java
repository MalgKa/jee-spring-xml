package pl.coderslab.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//można użyć z biblioteki lombok, żeby nie pisać geterów, seterów, konstruktora bez i z argumentami
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class HelloWorld {
    private String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
