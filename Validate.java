public class Validate {
  String mobile, email, pickup, drop ;
  Validate(){

  }


  public Validate(String mobile, String email, String pickup, String drop) {
    this.mobile = mobile;
    this.email = email;
    this.pickup = pickup;
    this.drop = drop;
  }

  public static void validateMobile(String mobile)throws InvalidNumberException{
    if((mobile.length())<10){
      throw new InvalidNumberException("\nNot Valid");
      }
    else{
      System.out.println("\nMobile Number is valid");
    }
  }

  public void validateEmail(String email){
    if(email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
      System.out.println("\nEmail is valid");
    }
    else{
      System.out.println("\nEmail is not valid");
      System.exit(0);
    }
  }

  public void validateLoc(String pickup, String drop){
    if(pickup.equals(drop)){
      System.out.println("\nPick and Drop can't be same");
      System.exit(0);
    }
  }
}
