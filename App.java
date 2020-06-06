
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First Set of variables
double itemPrice = 67.53;
double moneyInwallet = 153.22;
int numberOffriends = 17;
int age = 45;
String firstName = "James";
String lastName = "Smith";
char middleInitial = 'H';
double moneyLeft = moneyInwallet - itemPrice;
int friendsPeryear = age / numberOffriends;
String fullName = firstName + " " + middleInitial + " " + lastName;
System.out.println("Hello my name is " + fullName + ".");
System.out.println("I am " + age + " years old and I have " + numberOffriends + " friends, so I have made " + friendsPeryear + " friends per year.");
System.out.println("I have $" + moneyInwallet + " currently in my wallet and I plan on buying an item priced at $" + itemPrice + ". Afterwards I'll have $" + moneyLeft + " left.");
//Second set of variables
double itemPriceb = 267.93;
double moneyInwalletB = 79.63;
int numberOffriendsB = 60; 
int ageB = 33;
String firstNameb ="Joanne";
String lastNameb = "Michaels";
char middleInitialb = 'B';
double moneyLeftb = itemPriceb - moneyInwalletB;
int friendsPeryearB = numberOffriendsB / ageB +1 ;
String fullNameb = firstNameb + " " + middleInitialb + " " + lastNameb;
System.out.println(" ");
System.out.println("Hello, my name is " + fullNameb + ".");
System.out.println("I want to make a purchase that costs $" + itemPriceb + " but I only have $" + moneyInwalletB + " in my wallet, so I am $" + moneyLeftb + " short." );
System.out.println("I am popular in my community and have around " + numberOffriendsB + " friends and I am " + ageB + ". If I made a friend for every year I was alive, I would make around " + friendsPeryearB + " friend per year." );
		}

}
