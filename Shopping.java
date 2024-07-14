package Home_work;

public class Shopping {
	
	double add(double value1,double value2)

	{

		double sum = value1+value2;

		return sum;

	}

	double gst(double num1,double num2)

	{

		double gst=(num1/100)*num2;

		double with_gst=num1+gst;

		return with_gst;

	}

	double elc(double tv,double ac)

	{

		double sum_ele = add(tv,ac);

		double eleGst=gst(sum_ele,18);

		System.out.println("total amt of electronics item with GST '18%' is  : "+eleGst);

		return eleGst;

	}

	double  fru(double mango,double apple)

	{

		double sum_fru = add(mango,apple);

		double fruGst=gst(sum_fru,5);

	    System.out.println("Total amt of fruit with GST '5%' is :"+fruGst);

	    return fruGst;

	}

	double total(double num1,double num2,double num3,double num4)

	{



		double total = add(elc(num1, num2),fru(num3,num4));

		System.out.println("Total amount : "+total);

		return total;

	}

	void disc(double num1,double num2,double num3,double num4)

	{

		double total=total(num1,num2,num3,num4);

		double dis=(total/100)*25;

		double finalAmt=total-dis;

		System.out.println("After 25% discount the amount will be : "+finalAmt);

	}

}
