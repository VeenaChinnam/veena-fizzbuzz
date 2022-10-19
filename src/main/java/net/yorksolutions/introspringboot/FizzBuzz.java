package net.yorksolutions.introspringboot;

public class FizzBuzz {
    int num;

    public FizzBuzz(int num){
        this.num = num;
    }
    public String play(){
        boolean isD5 = this.num % 5 == 0;
        boolean isD3 = this.num % 3 == 0;


        if(isD5 && isD3 ){
            return "fizz buzz";
        }
        if(isD5){
            return "buzz";
        }
        if (isD3) {

            return "fizz";
        }

//        if(this.num % 5 == 0 && this.num % 3 == 0){
//            return "fizz buzz";
//        }
//        if(this.num % 5 == 0){
//            return "buzz";
//        }
//        if (this.num % 3 == 0) {
//
//            return "fizz";
//        }
        return Integer.toString (this.num);
    }
}
