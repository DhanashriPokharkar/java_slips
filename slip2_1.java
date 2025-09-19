/* Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their height.
(Hint : BMI = Wts. In kgs / (ht)2) */

class slip2_1 {
    public static void main(String args[]) {
        String fn = args[0];
        String ln = args[1];
        float wei = Float.parseFloat(args[2]);
        float hei = Float.parseFloat(args[3]);

        System.out.println(fn + " " + ln + " BMI Score is " + (wei / (hei * hei)));
    }
}