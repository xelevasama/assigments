package assigment5;

//When a loan cannot be created (book unavailable, etc.)
class LoanException extends Exception {
 public LoanException(String message) {
   super(message);
 }
}