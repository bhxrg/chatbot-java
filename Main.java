package chatbot.com;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class Main extends JFrame {
    //Typing Bar
    private JTextField inputBar = new JTextField();
      
    //Chat Output Area
    private JTextArea chatOutput = new JTextArea();
    
    public Main() {
        //Creating the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 900);
        this.setVisible(true);
        this.setResizable(false);
         
         
          // Setting GUI title 
          this.setTitle("Bank Customer Care ChatBot");
        
        // creating inputBar 
        inputBar.setLocation(2, 750);
        inputBar.setSize(900, 30);
 
        //inputBar Action Event
        inputBar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String userInput = inputBar.getText();
                chatOutput.append("You: " + userInput + "\n");
                if(userInput.contains("hi")) {
                	botOutput("Hello how can i assist you in the customer care section?");
                }
                
                else if(userInput.contains("hello")|| userInput.contains("hi")|| userInput.contains("hey")){
                    botOutput("Hi!! Hope you are well!");
                }
                
                else if(userInput.contains("Please guide me, i need information")|| userInput.contains("i need assistance")|| userInput.contains("assist me")) {
                    botOutput("Please select a catagory I can assist you with:Customer Service,Report Issue,Account Details, Make a Payment");
                }
               
                else if(userInput.contains("where to login?")|| userInput.contains("login page")|| userInput.contains("main page")) {
                	botOutput("Go on this website www.abcbank.com");
                }
                else if (userInput.contains("change password")|| userInput.contains("change PIN")) {
                    botOutput("To change your password, please follow these steps:");
                    botOutput("1. Log in to your account.");
                    botOutput("2. Go to the 'Account Settings' section.");
                    botOutput("3. Select the 'Change Password' option and follow the prompts.");
                }
                else if (userInput.contains("forgot password")) {
                    botOutput("If you've forgotten your password, you can reset it by:");
                    botOutput("1. Going to the login page.");
                    botOutput("2. Clicking on the 'Forgot Password' link.");
                    botOutput("3. Following the instructions sent to your registered email.");
                }
                else if (userInput.contains("set up balance alert") || userInput.contains("balance notifications")) {
                    botOutput("To set up balance alerts, you can:");
                    botOutput("1. Log in to your online banking account.");
                    botOutput("2. Navigate to the 'Alerts' or 'Notifications' section.");
                    botOutput("3. Select 'Balance Alerts' and configure your alert preferences.");
                }
                else if (userInput.contains("travel notifications") || userInput.contains("notify bank of travel")) {
                    botOutput("Traveling soon? It's essential to let us know to avoid any issues with your accounts while you're away.");
                    botOutput("To notify the bank of your travel plans, follow these steps:");
                    botOutput("1. Log in to your online banking account.");
                    botOutput("2. Navigate to the 'Travel Notifications' or 'Manage Travel' section.");
                    botOutput("3. Provide your travel destination(s), dates, and contact information.");
                    botOutput("4. Submit the travel notification form.");
                    botOutput("By informing us of your travel plans, you can help prevent your cards from being blocked due to unusual activity while abroad.");
                }

                
                else if (userInput.contains("transaction alerts") || userInput.contains("activity notifications")) {
                    botOutput("To set up transaction alerts, you can:");
                    botOutput("1. Log in to your online banking account.");
                    botOutput("2. Navigate to the 'Alerts' or 'Notifications' section.");
                    botOutput("3. Select 'Transaction Alerts' and specify the types of transactions you want to be notified about.");
                }
                
                else if (userInput.contains("loan eligibility")||userInput.contains("loan application")) {
                    botOutput("To check your loan eligibility, you can:");
                    botOutput("1. Visit our website and use our online loan eligibility calculator.");
                    botOutput("2. Contact our loan department for a detailed assessment.");
                }
                else if (userInput.contains("branch locator") || userInput.contains("find branch") || userInput.contains("ATM near me")) {
                    botOutput("To locate a branch or ATM near you, please use one of the following options:");
                    botOutput("1. Visit our website and use the branch/ATM locator tool.");
                    botOutput("2. Download our mobile app, which includes a branch and ATM finder feature.");
                    botOutput("3. Text your location (e.g., 'ATM near [your location]') to our SMS service at 12345.");
                    botOutput("4. Contact our customer support for assistance in finding the nearest branch or ATM.");
                }
                else if (userInput.contains("report lost card") || userInput.contains("What should I do if my credit card is lost or stolen?") ||userInput.contains("report stolen card")) {
                    botOutput("I'm sorry to hear that you've lost your card. Here's what you should do:");
                    botOutput("1. Immediately call our 24/7 customer support hotline at 1-800-123-4567.");
                    botOutput("2. Inform the representative that your card has been lost or stolen.");
                    botOutput("3. They will assist you in blocking the card to prevent unauthorized use.");
                    botOutput("4. A replacement card will be ordered for you and sent to your registered address.");
                }


                else if (userInput.contains("balance inquiry")) {
                    botOutput("To check your account balance, you can:");
                    botOutput("1. Use our mobile banking app.");
                    botOutput("2. Visit our nearest ATM and use your debit card.");
                    botOutput("3. Call our automated phone system at 1-800-123-4567.");
                }
                else if (userInput.contains("transaction history")) {
                    botOutput("You can view your transaction history by:");
                    botOutput("1. Logging in to your online banking account.");
                    botOutput("2. Selecting the 'Transaction History' option.");
                    botOutput("3. Choosing the date range you want to review.");
                }
                else if (userInput.contains("apply for a loan")) {
                    botOutput("To apply for a loan, please follow these steps:");
                    botOutput("1. Visit our website and log in to your account.");
                    botOutput("2. Navigate to the 'Loan Application' section.");
                    botOutput("3. Fill out the loan application form and submit it.");
                }
                else if (userInput.contains("report a lost card")) {
                    botOutput("I'm sorry to hear that. To report a lost or stolen card, please call our 24/7 customer support hotline at 1-800-555-1234.");
                    botOutput("We will assist you in blocking the card and ordering a replacement.");
                }
                else if (userInput.contains("transfer funds")) {
                    botOutput("To transfer funds between your accounts, follow these steps:");
                    botOutput("1. Log in to your online banking account.");
                    botOutput("2. Select the 'Transfer Funds' option.");
                    botOutput("3. Choose the accounts and amount you want to transfer.");
                    botOutput("4. Confirm the transaction.");
                }

               else if (userInput.contains("interest rates")) {
                botOutput("Our current interest rates can be found on our website's 'Interest Rates' page.");
                botOutput("If you have specific questions about interest rates, feel free to ask, and I'll provide more information.");
                }
                
               else if (userInput.contains("credit card application")) {
            	    botOutput("To apply for a credit card, you can:");
            	    botOutput("1. Visit our website and fill out the online application form.");
            	    botOutput("2. Visit one of our branch locations and apply in person.");
            	}
               else if (userInput.contains("foreign currency exchange")) {
                    botOutput("For foreign currency exchange services, please:");
                    botOutput("1. Visit our nearest branch with your identification.");
                    botOutput("2. Check our website for current exchange rates.");
                    botOutput("3. Contact our customer support for further assistance.");
                }
               else if (userInput.contains("checkbook request")) {
            	    botOutput("To request a new checkbook, you can:");
            	    botOutput("1. Log in to your online banking account.");
            	    botOutput("2. Navigate to 'Request Services' and select 'Order Checkbook'.");
            	    botOutput("3. Provide your mailing address, and we'll send it to you.");
            	}
               else if (userInput.contains("mortgage refinancing")) {
            	    botOutput("If you're interested in mortgage refinancing:");
            	    botOutput("1. Visit our website and use our refinancing calculator.");
            	    botOutput("2. Contact our mortgage department for a consultation.");
            	    botOutput("3. Check our current mortgage rates for attractive options.");
            	}
               else if (userInput.contains("business banking")) {
            	    botOutput("For business banking services, we offer:");
            	    botOutput("1. Business checking and savings accounts.");
            	    botOutput("2. Commercial loans and lines of credit.");
            	    botOutput("3. Merchant services and payroll solutions.");
            	}

                else if (userInput.contains("estate planning")) {
                botOutput("For estate planning and wealth management services:");
                botOutput("1. Schedule a consultation with our financial advisors.");
                botOutput("2. Explore our investment portfolios and trust services.");
                }
                
                else if (userInput.contains("credit score inquiry")) {
                    botOutput("To check your credit score, you can:");
                    botOutput("1. Access your credit report through a credit bureau.");
                    botOutput("2. Enroll in our credit monitoring service for regular updates.");
                    botOutput("3. Contact our credit department for specific inquiries.");
                }
                
                else if(userInput.contains("help")) {
                	botOutput("Of course! I'm here to assist you.");
                }
                else if(userInput.contains("goodbye") || userInput.contains("thank you for the information") || userInput.contains(" thank you!goodbye")) {
                	botOutput("Goodbye! If you have any more requests in the future, feel free to ask.");
                }
                else if(userInput.contains("report issue")) {
                	botOutput("Sure!Please provide a brief description about the issue");
                }
                else if (userInput.contains("return product")) {
                    botOutput("I'm sorry to hear that. To initiate a return, please follow these steps:");
                    botOutput("1. Log in to your account.");
                    botOutput("2. Go to the 'Order History' section.");
                    botOutput("3. Select the order containing the item you want to return.");
                    botOutput("4. Follow the on-screen instructions to complete the return process.");
                }
                else if (userInput.contains("make a payment")) {
                    botOutput("Great! To make a payment, you can visit our website and log in to your account.");
                    botOutput("If you need assistance with the payment process, please let me know.");
                }
                else if(userInput.contains("customer service")){
                    botOutput("Please select area needing assistance: Speak to rep,Account Information,Payments and Transactions,");
                }
               else if(userInput.contains("speak to rep")|| userInput.contains("Speak to rep")){
                    botOutput("Please wait while we connect you!");
                    botOutput("We have connected you to one of our prompt engineer!Feel free to ask and clarify doubts");
                    botOutput("Hello! This is Sakshma!How can I help u");
               }
               else if (userInput.contains("working hours") || userInput.contains("branch hours") || userInput.contains("holidays")) {
            	    botOutput("Our branch operating hours are as follows:");
            	    botOutput("Monday to Friday: 9:00 AM to 5:00 PM");
            	    botOutput("Saturday: 9:00 AM to 1:00 PM");
            	    botOutput("Sunday: Closed");

            	    botOutput("Please note that our branches are also closed on national holidays.");

                    botOutput("The timings of the bank is on weekdays from monday to friday-morning 10am to 2 pm");
                    botOutput("The bank is on leave only on even saturdays and all sundays");
                } 
                
                else if(userInput.contains("account details")|| userInput.contains("Account Information")) {
                	botOutput("Sure, I can help you with your account details. Please choose one of the following options:");
                    botOutput("Please enter Email or Account #");
                    botOutput("1. To retrieve account balance, type 'Balance Inquiry'.");
                    botOutput("2. To update your contact information, type 'Update Contact Info'.");
                    botOutput("3. To reset your password, type 'Reset Password'.");
                    botOutput("4. For other account-related inquiries, please type 'help'.");
                }
                else if (userInput.contains("online banking registration")) {
                    botOutput("To register for online banking, please follow these steps:");
                    botOutput("1. Visit our website.");
                    botOutput("2. Click 'Register' and provide your account details.");
                    botOutput("3. Verify your identity through a one-time code sent to your email or phone.");
                }
                else if (userInput.contains("ATM-related issues")) {
                    botOutput("For ATM-related issues, please:");
                    botOutput("1. Report a lost or stolen card by calling our hotline.");
                    botOutput("2. Inquire about ATM locations and services.");
                    botOutput("3. Get help with ATM cash withdrawal problems.");
                }
                else if (userInput.contains("investment options")) {
                    botOutput("We offer various investment options, including:");
                    botOutput("1. Savings accounts with competitive interest rates.");
                    botOutput("2. Certificates of Deposit (CDs) with flexible terms.");
                    botOutput("3. Consultation with our financial advisors for personalized investment plans.");
                }
                else if (userInput.contains("transaction dispute")) {
                    botOutput("If you have a transaction dispute, please:");
                    botOutput("1. Review your transaction history online.");
                    botOutput("2. If you find an error, contact our customer support with the transaction details.");
                }
                
                else if(userInput.contains("Balance Inquiry")){
                    botOutput("Please enter Email or Account #");
                }
                else if(userInput.contains("Account # is XXXXXXXXXX")) {
                	botOutput("The balance in your account is Rupees 120000");
                	botOutput("An amount of Rupees 4500 has been tranfered to ur acct XXXXXXXXXX by YYYYYYYYYYY");
                	botOutput("An amount of Rupees 230 has been withdrawn from your account");
                	botOutput("The recent transaction has been done at 13:45:54 ");
                }
                else if(userInput.contains("Update Contact Info")){
                    botOutput("Please enter old contact number");
                    botOutput("Please enter new contact number");
                    botOutput("Contact details successfully updated!");
                }
                else if (userInput.contains("credit card statement")) {
                    botOutput("To check your credit card statement, please follow these steps:");
                    botOutput("1. Log in to your online banking account.");
                    botOutput("2. Navigate to the 'Credit Card' section.");
                    botOutput("3. Select 'View Statement' and choose the desired month.");
                }
                else if (userInput.contains("loan repayment")) {
                    botOutput("For loan repayment options, you can:");
                    botOutput("1. Set up an automatic loan repayment plan.");
                    botOutput("2. Make a one-time payment online.");
                    botOutput("3. Visit one of our branches for assistance.");
                }
                else if (userInput.contains("open a new account")) {
                    botOutput("To open a new account with us, you can:");
                    botOutput("1. Visit our nearest branch in person.");
                    botOutput("2. Apply online through our website.");
                    botOutput("3. Contact our customer support for guidance.");
                }

                else if (userInput.contains("interest calculation")) {
                    botOutput("To calculate the interest on your account, use this formula:");
                    botOutput("Interest = Principal Amount * Rate * Time (in years)");
                    botOutput("If you need specific interest details, please provide your account details.");
                }
                else if (userInput.contains("foreign exchange rates")) {
                    botOutput("Our current foreign exchange rates are available on our website.");
                    botOutput("You can also get real-time rates by calling our FX hotline at 1-800-555-6789.");
                }
                else if (userInput.contains("report fraud")) {
                    botOutput("If you suspect fraud on your account, please:");
                    botOutput("1. Immediately call our fraud hotline at 1-800-123-4567.");
                    botOutput("2. Freeze your account via the mobile app or online banking.");
                }

                else if (userInput.contains("what is the process for credit score inquiry?")) {
                  botOutput("The process for checking your credit score involves:");
                  botOutput("1. Accessing your credit report through a credit bureau.");
                  botOutput("2. Enrolling in our credit monitoring service for regular updates.");
                   botOutput("3. Contacting our credit department for specific inquiries.");
                  }
                
                else if (userInput.contains("tell me about checking credit scores")) {
                    botOutput("Checking your credit score can be done in these ways:");
                    botOutput("1. Access your credit report through a credit bureau.");
                    botOutput("2. Enroll in our credit monitoring service for regular updates.");
                    botOutput("3. Contact our credit department for specific inquiries.");
                }
                else if (userInput.contains("account balance") || userInput.contains("check balance") || userInput.contains("how much money")) {
                    botOutput("To check your account balance, please:");
                    botOutput("1. Log in to your online banking account.");
                    botOutput("2. Go to the 'Account Summary' section.");
                    botOutput("3. Your account balance will be displayed there.");
                }
                
                else if (userInput.contains("how can I check my credit score?")) {
                    botOutput("To check your credit score, you have a few options:");
                    botOutput("1. Access your credit report through a credit bureau.");
                    botOutput("2. Enroll in our credit monitoring service for regular updates.");
                    botOutput("3. Contact our credit department for specific inquiries.");
                }
                
                else if (userInput.contains("technical support") || userInput.contains("troubleshooting") || userInput.contains("online banking issues")) {
                    botOutput("For technical support related to online banking or mobile apps, please try the following steps:");
                    botOutput("1. Clear your browser cache or app data and try again.");
                    botOutput("2. Make sure you have the latest version of our mobile app installed.");
                    botOutput("3. Check your internet connection and try accessing online banking from a different browser or device.");
                    botOutput("4. If the issue persists, contact our technical support team at support@yourbank.com or call 1-800-TECH-SUP.");
                }

                
                else if (userInput.contains("apply for a mortgage")) {
                    botOutput("To apply for a mortgage, please visit our website and complete the online application form.");
                    botOutput("A mortgage specialist will contact you to guide you through the process.");
                }
                else if(userInput.contains("Contact didnt get updated ! I didnt receive any message")) {
                	botOutput("Oops! Problem on our side! Trying to resolve it asap and get back to you");
                }
               
               else if(userInput.contains("report issue")){
                 botOutput("Select an issue: Late delivery, Missing Product, Invalide Info");
 
               } 
               else if (userInput.contains("complaint") || userInput.contains("feedback")) {
                    botOutput("I'm sorry to hear that you have a complaint or feedback.");
                    botOutput("To submit a complaint or provide feedback, please do one of the following:");
                    botOutput("1. Contact our customer support team at support@yourbank.com.");
                    botOutput("2. Call our 24/7 hotline at 1-800-123-4567 to speak with a representative.");
                    botOutput("3. Visit our nearest branch and speak to a customer service agent.");
                    botOutput("Your concern will be addressed promptly.");
                }

               else {
            	   botOutput("I'm sorry, I couldnt understand your request.Please try again");
            	   
            	   botOutput("If you have a specific question or need more details, feel free to ask!");
               }
                
                inputBar.setText("");
            }
        });
        
      //chatOutput
        chatOutput.setLocation(15, 5);
        chatOutput.setSize(560, 510);
        chatOutput.setLineWrap(true);
        chatOutput.setEditable(false);
        
        //Frame items
        this.add(inputBar);
        this.add(chatOutput);
    }
    
    public void botOutput(String s){
        chatOutput.append("ChatBot: " + s + "\n");
    }
    
    public static void main(String[] args){
        new Main();
        Scanner sc= new Scanner(System.in);
        
    }
  
}