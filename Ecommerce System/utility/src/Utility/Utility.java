package Utility;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Utility {
        private static final Logger logger = Logger.getLogger(Utility.class.getName());

        public static boolean  validateUser(String name, String email, String password) {
            logger.info("Starting user registration process.");

            if (!isValidUsername(name)) {
                logger.warning("Registration failed: Invalid name.");
                System.out.println("Invalid name");
                return false;
            }
            if (!isValidEmail(email)) {
                logger.warning("Registration failed: Invalid email address.");
                return false;
            }

            if (!isValidPassword(password)) {
                logger.warning("Registration failed: Password does not meet requirements.");
                return false;
            }

            logger.info("NEW USER " + name);
            return true;
        }

        private static boolean isValidUsername(String username) {
            return username != null && username.length() >= 3 ;
        }

        private static boolean isValidEmail(String email) {
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            return email != null && Pattern.matches(emailRegex, email);
        }

        private static boolean isValidPassword(String password) {
            return password != null && password.length() >= 8 ;
        }
    }


