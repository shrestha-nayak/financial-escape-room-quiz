import javax.swing.*;
import java.util.*;

public class FinancialEscapeRoomJOptionPane100 {

    // Configurable difficulty
    private static final int TIME_START = 120;     // total time points
    private static final int TIME_PENALTY = 10;    // penalty per wrong answer
    private static final int WIN_THRESHOLD = 12;   // correct answers needed to escape
    private static final int TOTAL = 100;          // question bank size

    // Data stores
    private static String[] questions = new String[TOTAL];
    private static String[][] options = new String[TOTAL][3];
    private static char[] correct = new char[TOTAL];
    private static int ptr = 0;

    private static void add(String q, String a, String b, String c, char ans) {
        if (ptr >= TOTAL) return;
        questions[ptr] = (ptr + 1) + ". " + q;
        options[ptr][0] = "A) " + a;
        options[ptr][1] = "B) " + b;
        options[ptr][2] = "C) " + c;
        correct[ptr] = Character.toUpperCase(ans);
        ptr++;
    }

    public static void main(String[] args) {
        // =========================
        // Build 100-question bank
        // =========================

        // ACTIVITY #3: Needs vs Wants (1–12)
        add("Which best defines a 'need'?",
                "Essential for survival (e.g., food, shelter)",
                "Something nice to have but not required",
                "Any expensive item", 'A');
        add("Which best defines a 'want'?",
                "Necessary to live",
                "Desired but not essential",
                "Mandatory monthly bill", 'B');
        add("Why is distinguishing needs vs wants important?",
                "It limits unnecessary spending and supports saving",
                "It increases taxes",
                "It eliminates bills", 'A');
        add("A winter coat for freezing weather is typically a…",
                "Want", "Need", "Investment", 'B');
        add("A latest-model gaming console is typically a…",
                "Need", "Want", "Debt", 'B');
        add("Which habit best supports savings?",
                "Treating wants as needs",
                "Buying all wants first",
                "Prioritizing needs before wants", 'C');
        add("Phone data plan needed for work/school is usually a…",
                "Need", "Want", "Tax", 'A');
        add("Streaming subscriptions are usually…",
                "Needs", "Wants", "Debts", 'B');
        add("Classifying everything as a need leads to…",
                "Unlimited buying",
                "Better budgeting",
                "Lower prices", 'A');
        add("Choosing generic brand groceries over premium snacks mainly reflects…",
                "Wants over needs",
                "Needs over wants",
                "Taxes over savings", 'B');
        add("The main benefit of separating needs and wants is to…",
                "Avoid compound interest",
                "Control impulse spending",
                "Eliminate insurance", 'B');
        add("A bus pass to get to school/work is typically a…",
                "Need", "Want", "Investment", 'A');

        // ACTIVITY #3: Credit vs Debit (13–25)
        add("A credit card lets you…",
                "Borrow up to a limit and repay later",
                "Spend only what’s in your bank now",
                "Avoid paying bills", 'A');
        add("A debit card lets you…",
                "Borrow from the bank",
                "Spend money already in your account",
                "Delay payments without interest", 'B');
        add("Which builds credit history when used responsibly?",
                "Credit card", "Debit card", "Prepaid gift card", 'A');
        add("Which card helps budgeting by limiting spending to existing funds?",
                "Credit card", "Debit card", "Store card", 'B');
        add("If you don’t pay your full credit card balance by due date…",
                "No impact",
                "Interest/fees may be charged",
                "The balance disappears", 'B');
        add("A key risk of misusing credit cards is…",
                "Automatic raises",
                "Debt and interest charges",
                "Free cash forever", 'B');
        add("Debit card transactions generally come from…",
                "A loan", "Your checking balance", "Your credit score", 'B');
        add("Using a credit card properly can…",
                "Build a strong credit score",
                "Remove taxes",
                "Prevent bills", 'A');
        add("Which is most accurate?",
                "Debit = borrowing; Credit = your cash",
                "Credit = borrowing; Debit = your cash",
                "Both are loans", 'B');
        add("Overspending risk is usually higher with…",
                "Credit cards", "Debit cards", "Cash only", 'A');
        add("A benefit of debit cards is…",
                "Spending only what you have",
                "Guaranteed rewards",
                "Free money", 'A');
        add("A key reason to monitor credit card statements is to…",
                "Check grades",
                "Catch fraud and track spending",
                "Lower taxes", 'B');
        add("Paying a credit card only the minimum due…",
                "Usually increases interest costs over time",
                "Pays off balance faster",
                "Eliminates interest", 'A');

        // Credit terms (APR, billing, late, accrued interest) (26–33)
        add("APR stands for…",
                "Annual Percentage Rate",
                "Average Payment Ratio",
                "Annual Penalty Rate", 'A');
        add("The billing cycle is…",
                "Time between statements",
                "Your credit limit",
                "The payment's grace period only", 'A');
        add("Late fees are…",
                "Rewards for early payment",
                "Penalties for missed/late payments",
                "Taxes on income", 'B');
        add("Accrued interest is…",
                "Interest already paid",
                "Interest accumulated but not yet paid",
                "Fees charged by stores", 'B');
        add("Higher APR on a credit card generally means…",
                "Lower interest cost",
                "Higher interest cost if you carry a balance",
                "No change", 'B');
        add("A longer billing cycle typically…",
                "Changes your credit limit",
                "Affects statement timing between bills",
                "Guarantees lower APR", 'B');
        add("A common way to avoid credit card interest is…",
                "Pay statement balance in full by due date",
                "Pay after due date",
                "Ignore bills", 'A');
        add("Late payments can harm…",
                "Your GPA",
                "Your credit score and wallet",
                "Your license", 'B');

        // Credit score basics (34–43)
        add("A credit score is…",
                "A random ID",
                "A 3-digit number of creditworthiness",
                "Your bank account number", 'B');
        add("Knowing your credit score helps you…",
                "Choose movies",
                "Understand loan eligibility and rates",
                "Avoid taxes", 'B');
        add("A major factor in credit scores is…",
                "Payment history",
                "Favorite color",
                "Shoe size", 'A');
        add("Another key factor in credit scores is…",
                "Credit utilization (balance/limit)",
                "Car color",
                "Phone model", 'A');
        add("To improve your credit score, you should…",
                "Pay on time and keep utilization low",
                "Miss a few payments",
                "Max out cards", 'A');
        add("Opening many new accounts at once can…",
                "Boost your score instantly",
                "Hurt your score in the short term",
                "Eliminate debt", 'B');
        add("Reviewing your credit report can help…",
                "Find errors and prevent fraud",
                "Raise taxes",
                "Change your job title", 'A');
        add("Student loans affect credit by…",
                "Having no effect",
                "Helping if paid on time; hurting if late/default",
                "Only helping", 'B');
        add("Keeping utilization below roughly what level is commonly advised?",
                "90%", "30%", "5%", 'B');
        add("Length of credit history generally…",
                "Helps scores if longer with good behavior",
                "Does not matter",
                "Always hurts", 'A');

        // ACTIVITY #4: Savings vehicles (44–63)
        add("A bank savings account is best described as…",
                "Long-term storage with interest",
                "Credit line",
                "Stock account", 'A');
        add("Savings account advantage…",
                "Easy access to money + interest",
                "No statements",
                "Guaranteed high returns", 'A');
        add("Savings account disadvantage…",
                "Usually lower interest than investments",
                "Huge risk of loss",
                "No FDIC insurance", 'A');
        add("A checking account is used mainly for…",
                "Everyday spending and paying bills",
                "Speculating on stocks",
                "Retirement only", 'A');
        add("Checking accounts typically…",
                "Do not earn much interest",
                "Guarantee 10% returns",
                "Charge capital gains tax", 'A');
        add("A Certificate of Deposit (CD) is…",
                "A timed deposit with fixed rate",
                "A stock certificate",
                "A debit card", 'A');
        add("CDs often offer…",
                "Higher rates than savings accounts",
                "Unlimited withdrawals",
                "No penalties for early withdrawal", 'A');
        add("Mutual funds…",
                "Pool investors' money into diversified portfolios",
                "Are savings accounts",
                "Are crypto only", 'A');
        add("A drawback of mutual funds is…",
                "Fees and market risk",
                "FDIC fees",
                "Guaranteed loss", 'A');
        add("Money market funds typically invest in…",
                "Short-term, low-risk instruments",
                "NFT art",
                "Only real estate", 'A');
        add("Money market funds advantage…",
                "Generally safer with modest returns",
                "Guaranteed to beat stocks",
                "No market risk", 'A');
        add("Roth IRA allows…",
                "Tax-free growth/withdrawals in retirement",
                "Tax-free contributions now",
                "Unlimited contributions by anyone", 'A');
        add("Roth IRA limitation…",
                "Income limits and penalties for early earnings withdrawal",
                "No investment choices",
                "No growth", 'A');
        add("401(k) commonly offers…",
                "Employer match and tax-deferred growth",
                "No investment options",
                "Guaranteed payout", 'A');
        add("401(k) early withdrawals can…",
                "Trigger penalties/taxes",
                "Be free of penalties",
                "Earn airline miles", 'A');
        add("Rule of 72 estimates…",
                "Years to double an investment at a given rate",
                "Your credit limit",
                "Tax bracket", 'A');
        add("A drawback of Rule of 72 is…",
                "Ignores inflation/market volatility",
                "Needs calculus",
                "Is illegal", 'A');

        // ACTIVITY #5: Investment terms (64–77)
        add("Bonds are…",
                "Debt securities paying fixed interest",
                "Ownership shares",
                "Cryptos", 'A');
        add("Stocks represent…",
                "Ownership in a company",
                "Loans to a company",
                "Taxes owed", 'A');
        add("Dividends are…",
                "Company earnings paid to shareholders",
                "Loan payments to banks",
                "Sales taxes", 'A');
        add("Blue-chip stocks are…",
                "Well-established, stable companies",
                "Startups only",
                "Delisted firms", 'A');
        add("Capital gain is…",
                "Profit from selling an asset above purchase price",
                "A bank fee",
                "A tax credit", 'A');
        add("An exchange is…",
                "A marketplace for trading financial instruments",
                "A tax office",
                "A currency only", 'A');
        add("An index is…",
                "A measure tracking a representative group of stocks",
                "A brokerage account",
                "A checking account", 'A');
        add("NYSE is…",
                "A major U.S. stock exchange in New York",
                "A crypto wallet",
                "A mutual fund", 'A');
        add("NASDAQ is known for…",
                "Electronic trading and many tech stocks",
                "Only bonds",
                "Only commodities", 'A');
        add("Reinvesting dividends typically…",
                "Can compound returns over time",
                "Eliminates taxes",
                "Guarantees no risk", 'A');
        add("Diversification generally…",
                "Spreads risk across assets",
                "Maximizes single-stock exposure",
                "Is illegal", 'A');
        add("Higher potential returns usually come with…",
                "Higher risk",
                "No risk",
                "Government guarantees always", 'A');
        add("A brokerage account lets you…",
                "Buy/sell investments like stocks and funds",
                "Avoid all taxes",
                "Print money", 'A');
        add("Market volatility refers to…",
                "How much prices move up/down",
                "Trading volume only",
                "Dividend dates", 'A');

        // ACTIVITY #6: Understanding investments (78–86)
        add("Public companies are…",
                "Firms whose shares trade on stock exchanges",
                "Private clubs",
                "Government agencies only", 'A');
        add("A benefit of investing in stocks is…",
                "Potential growth and dividends",
                "Guaranteed profits",
                "No risk", 'A');
        add("A risk of investing is…",
                "Market downturns and possible losses",
                "Guaranteed refunds",
                "Elimination of inflation", 'A');
        add("Individual stocks vs mutual funds: stocks are…",
                "Direct ownership with higher volatility risk",
                "Diversified baskets by default",
                "Only government bonds", 'A');
        add("ETFs are…",
                "Funds that trade like stocks, often with low fees",
                "Savings accounts",
                "CDs", 'A');
        add("Index funds…",
                "Track a market index and are usually low cost",
                "Try to beat the market actively",
                "Are checking accounts", 'A');
        add("A drawback of active mutual funds can be…",
                "Higher fees",
                "FDIC insurance",
                "Guaranteed outperformance", 'A');
        add("Dollar-cost averaging means…",
                "Investing fixed amounts regularly over time",
                "Investing only once",
                "Timing the top perfectly", 'A');
        add("A diversified portfolio primarily aims to…",
                "Reduce risk by spreading investments",
                "Maximize one stock only",
                "Avoid saving", 'A');

        // ACTIVITY #7: Contemporary securities (87–94)
        add("Cryptocurrency is…",
                "Digital currency using cryptography on decentralized networks",
                "Paper bonds",
                "A savings account", 'A');
        add("Stablecoins are…",
                "Cryptos pegged to stable assets (e.g., USD)",
                "Only NFTs",
                "Lottery tickets", 'A');
        add("Altcoins are…",
                "Any crypto that is not Bitcoin",
                "Only stablecoins",
                "Only U.S. stocks", 'A');
        add("A blockchain is…",
                "A distributed ledger recording transactions securely",
                "A paper ledger",
                "A stock certificate", 'A');
        add("Crypto vs stocks: one key difference is…",
                "Crypto is decentralized and highly volatile; stocks are company ownership and regulated",
                "Both are bank accounts",
                "Both are FDIC insured", 'A');
        add("NFTs are…",
                "Unique digital tokens representing ownership of digital items",
                "Savings bonds",
                "Checking accounts", 'A');
        add("A key risk in crypto is…",
                "High volatility and regulatory uncertainty",
                "Guaranteed gains",
                "FDIC insurance", 'A');
        add("Exchanges for crypto are…",
                "Platforms to buy/sell/trade cryptocurrencies",
                "Only banks",
                "ATMs only", 'A');

        // ACTIVITY #8: Financial literacy for youth (95–100)
        add("A common efficient way to save for college is…",
                "529 College Savings Plan",
                "Keeping cash under mattress",
                "High-fee loans", 'A');
        add("A key factor before taking a college loan is…",
                "Return on investment (earnings vs debt)",
                "School mascot",
                "Laptop brand", 'A');
        add("A teen budget should…",
                "Track income/expenses and prioritize needs over wants",
                "Ignore saving goals",
                "Avoid taxes forever", 'A');
        add("Common ways teens get into financial trouble include…",
                "High credit card debt and ignoring loans",
                "Keeping an emergency fund",
                "Paying on time", 'A');
        add("Teens should know debit vs credit because…",
                "Debit uses current funds; credit borrows and can build credit if paid in full",
                "Both are free money",
                "Neither affects spending", 'A');
        add("A strong early credit-building strategy is…",
                "On-time payments and low utilization (<30%)",
                "Maxing out cards",
                "Never checking reports", 'A');

        // Safety check in case ptr < 100
        if (ptr < TOTAL) {
            JOptionPane.showMessageDialog(null,
                    "Internal setup warning: only " + ptr + " questions populated (expected " + TOTAL + ").",
                    "Setup", JOptionPane.WARNING_MESSAGE);
        }

        // =========================
        // Game loop
        // =========================
        int score = 0;
        int timeLeft = TIME_START;

        // Shuffle order
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < TOTAL; i++) order.add(i);
        Collections.shuffle(order);

        JOptionPane.showMessageDialog(null,
                "WELCOME TO THE FINANCIAL ESCAPE ROOM\n\n" +
                        "There are " + TOTAL + " locked doors (questions).\n" +
                        "Escape by unlocking " + WIN_THRESHOLD + " doors (correct answers) before time runs out.\n" +
                        "Wrong answers cost " + TIME_PENALTY + " time points.\n\n" +
                        "Good luck!",
                "Financial Escape Room", JOptionPane.INFORMATION_MESSAGE);

        for (int n = 0; n < order.size(); n++) {
            int i = order.get(n);
            String prompt =
                    questions[i] + "\n\n" +
                            options[i][0] + "\n" +
                            options[i][1] + "\n" +
                            options[i][2] + "\n\n" +
                            "Time left: " + timeLeft + "   |   Score: " + score + "\n" +
                            "(Answer with A, B, or C)";

            String ans = JOptionPane.showInputDialog(null, prompt, "Door " + (n + 1),
                    JOptionPane.QUESTION_MESSAGE);

            if (ans == null) {
                JOptionPane.showMessageDialog(null, "You quit. The vault remains locked.");
                System.exit(0);
            }

            ans = ans.trim().toUpperCase();
            char pick = ans.isEmpty() ? '?' : ans.charAt(0);

            if (pick == correct[i]) {
                score++;
                JOptionPane.showMessageDialog(null, "Correct! Door unlocked.");
            } else {
                timeLeft -= TIME_PENALTY;
                JOptionPane.showMessageDialog(null, "Wrong! Alarm sounds. -" + TIME_PENALTY + " time points.");
            }

            if (timeLeft <= 0) {
                JOptionPane.showMessageDialog(null,
                        "You ran out of time! The vault locks forever.\nFinal Score: "
                                + score + " / " + TOTAL,
                        "Game Over", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            if (score >= WIN_THRESHOLD) {
                JOptionPane.showMessageDialog(null,
                        "You escaped after unlocking " + score + " doors!\nTime left: " + timeLeft,
                        "Escape Successful", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }

        // Completed all questions without hitting threshold (unlikely with low threshold)
        String end =
                "All doors attempted.\nFinal Score: " + score + " / " + TOTAL + "\nTime left: " + timeLeft + "\n\n";
        if (score >= WIN_THRESHOLD) {
            end += "You escaped with wisdom and discipline!";
        } else if (score >= WIN_THRESHOLD / 2) {
            end += "So close! Keep practicing your financial skills.";
        } else {
            end += "Trapped this time—study the concepts and try again!";
        }

        JOptionPane.showMessageDialog(null, end, "Vault Status", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
