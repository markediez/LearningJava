/* 
 * Author: Mark Diez
 * Date: 11 December 2015
 * Ex. 5.31
 * Global Warming Facts
 */

public class GlobalWarmingQuiz {
	private String a,b,c,d,question;

	public GlobalWarmingQuiz() {
		a = "";
		b = "";
		c = "";
		d = "";
		question = "";

	}
	public void getQuestion(int i) {
		switch (i) {
			case 1:
			// http://www.livescience.com/37057-global-warming-effects.html
				question = "What are some effects of Global Warming?";
				a = "Extreme weather events ";
				b = "Increase of CO2 gas in the atmosphere";
				c = "both a and b";
				d = "none of the above";
				break;
			case 2:
			// http://science.howstuffworks.com/environmental/green-science/climate-skeptic1.htm
				question = "Which of the following is not an argument against global warming?";
				a = "We are currently experiencing a pattern similar to the Medieval Warm Period in the 9th-14th centuries";
				b = "The data of weather temperatures are corrupted due to urban heat isalnd";
				c = "Models used to determine weather and predict outcomes are unreliable.";
				d ="None of the above";
				break;
			case 3:
			http://www.forbes.com/sites/warrenmeyer/2010/10/15/denying-the-catstrophe-the-science-of-the-climate-skeptics-position/
				question = "Skeptics agree that humans have contributed higher levels of CO2";
				a = "True";
				b = "False";
				c = "Both true";
				d = "Both false";
				break;
			case 4:
			// https://www.edf.org/human-activity-causing-global-warming?utm_source=ggad&utm_medium=cpc&utm_campaign=gr-GWCauses&gclid=Cj0KEQiAqK-zBRC2zaXc8MOiwfIBEiQAXPHrXurZ0RZuZQjr6ulR5xXyABNQRez3H8piB49HRS3fyrQaAk1Y8P8HAQ
				question = "What is the main cause of global warming?";
				a = "Cows farting";
				b = "Deforestation";
				c = "Burning fossil fules";
				d = "Burning plastic";
				break;
			case 5:
			// http://www.nrdc.org/globalwarming/gsteps.asp
				question = "Which will not help against climate change?";
				a = "Puchase a hybrid / electric car";
				b = "Live in a tiny home";
				c = "Tell congress to regulate a cap on carbon emission";
				d = "All fail to combat against climate change";
				break;
			default:
				question = "";
				a ="";
				b ="";
				c ="";
				d ="";
			;
		}
		System.out.printf("%s%na.) %s%n%nb.) %s%n%nc.) %s%n%nd.) %s%n%n",
							question, a, b, c, d); 
	}

	public boolean getAnswer(int num, String ans) {
		switch(num) {
			case 1:
				if(ans.equals("a"))
					return true;
				break;
			case 2:
				if(ans.equals("d"))
					return true;
			case 3:
				if(ans.equals("a"))
					return true;
				break;
			case 4:
				if(ans.equals("c"))
					return true;
				break;
			case 5:
				if(ans.equals("d"))
					return true;
				break;
		}

		return false;
	}
}