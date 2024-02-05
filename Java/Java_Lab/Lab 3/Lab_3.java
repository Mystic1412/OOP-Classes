public class Lab_3 {
    public static void main(String[] args) {
        float fahrenheit = 98.6f;
        float centi = 5f/9f*(fahrenheit-32f); //Need to put f after a number for a float!!!!!!
        System.out.println("Fahrenheit is "+ fahrenheit+ "\nCentigrade is "+ centi);
        
        System.out.println("\nFor Loop\n");

        for (float i=0f; i <40;i= i+5){
            centi = 5f/9f*(i-32f);
            System.out.println("Fahrenheit is "+ i+ "\nCentigrade is "+ centi +"\n");
        }

        System.out.println("\nWhile Loop\n");
        
        float FahrenNum = 0f;
        while (FahrenNum<40){
            centi = 5f/9f*(FahrenNum-32f);
            System.out.println("Fahrenheit is "+ FahrenNum+ "\nCentigrade is "+ centi +"\n");
            FahrenNum = FahrenNum +5;
        }
    }
}
