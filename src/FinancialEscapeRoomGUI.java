import javax.swing.*;

public class FinancialEscapeRoomGUI {
    public static void main(String[] args) {
        int score = 0;
        int timeLeft = 100;

        String[] questions = {
                "1️⃣ The vault asks: What is a *budget*?",
                "2️⃣ A digital lock flashes: What does *APR* stand for?",
                "3️⃣ Another lock blinks: What is *compound interest*?",
                "4️⃣ Final door asks: Which action *builds your credit score* best?"
        };

        String[][] options = {
                {"A) A plan for income and spending", "B) A type of loan", "C) A stock portfolio"},
                {"A) Annual Percentage Rate", "B) Average Payment Rate", "C) Account Percentage Return"},
                {"A) Interest on principal only", "B) Interest on principal and prior interest", "C) Simple one-time interest"},
                {"A) Paying bills on time", "B) Using maximum credit limit", "C) Ignoring credit card payments"}
        };

        char[] correctAnswers = {'A', 'A', 'B', 'A'};

        JOptionPane.showMessageDialog(null,
                "🔒 WELCOME TO THE FINANCIAL ESCAPE ROOM 🔒\n\n"
                        + "You are trapped inside a virtual bank vault!\n"
                        + "Each door is locked by a financial puzzle.\n"
                        + "Answer correctly to unlock it — each wrong answer costs you 10 time points!\n\n"
                        + "Let's begin! 🏁",
                "Financial Escape Room", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < questions.length; i++) {
            String question = questions[i] + "\n\n" +
                    options[i][0] + "\n" +
                    options[i][1] + "\n" +
                    options[i][2] + "\n\n" +
                    "⏳ Time left: " + timeLeft + " points\n" +
                    "Score: " + score + "\n";

            String answer = JOptionPane.showInputDialog(null, question, "Room " + (i + 1), JOptionPane.QUESTION_MESSAGE);

            if (answer == null) {
                JOptionPane.showMessageDialog(null, "🚪 You quit the game. The vault remains locked.");
                System.exit(0);
            }

            answer = answer.trim().toUpperCase();

            if (answer.length() > 0 && answer.charAt(0) == correctAnswers[i]) {
                JOptionPane.showMessageDialog(null, "✅ Correct! You unlocked this door!");
                score++;
            } else {
                timeLeft -= 10;
                JOptionPane.showMessageDialog(null, "❌ Wrong! Alarm sounds. -10 time points!");
            }

            if (timeLeft <= 0) {
                JOptionPane.showMessageDialog(null,
                        "💀 You ran out of time! The vault locks forever.\n"
                                + "Final Score: " + score + "/" + questions.length,
                        "Game Over", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }

        // End game summary
        String message = "🏁 You escaped the vault!\n\n"
                + "Final Score: " + score + "/" + questions.length + "\n"
                + "Time Left: " + timeLeft + " points\n\n";

        if (score == questions.length)
            message += "🌟 Financial Genius! You mastered the vault!";
        else if (score >= 2)
            message += "💡 Great job — you escaped with partial success!";
        else
            message += "😬 Barely escaped — study more about money management!";

        JOptionPane.showMessageDialog(null, message, "Escape Complete!", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
