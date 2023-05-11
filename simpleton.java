//Aaron Prince Anu

class simpleton
{
    public static void main(String[] args) 
    {
        //vars
        double income;
        double houseCost;
        int totalChildren;
        int schoolChildren;
        double grossTax;
        double finalTax;
        double taxProperty = 0;
        double taxChildren = 0;
        final double SURTAX = 0.15;

        //input
        System.out.println("What is your income?");
        income = In.getDouble();

        System.out.println("How much did your house cost");
        houseCost = In.getDouble();

        System.out.print("How many children do you have?");
        totalChildren = In.getInt();

        System.out.print("How many of those children go to school?");
        schoolChildren = In.getInt();

        //calculate
        if (houseCost <= 8000) {
            income -= 10000;
            taxProperty = (0.18 * income);
        } else if (houseCost > 8000) {
            taxProperty = (0.18 * income);
        }

        if (schoolChildren > 0) {
            taxChildren = (schoolChildren * 1000) + ((totalChildren - schoolChildren) * 500);
        } else if (schoolChildren == 0) {
            taxChildren = (totalChildren * 500);
        }

        finalTax = taxProperty - taxChildren;

        if (finalTax > 2000){
            grossTax = (finalTax * SURTAX);
            finalTax += grossTax;
        }

        if (houseCost < 6000 && totalChildren > 2 && schoolChildren > 1 || schoolChildren == 1) {
            System.out.println("The total tax refund is $" + Math.abs(finalTax));
        } else if (houseCost > 6000 && finalTax < 0) {
            finalTax = 0;
            System.out.println("The total tax refund is $" + finalTax);
        }
    }
}