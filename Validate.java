public class Validate {
  String mobile, email;
  Validate(){

  }
  Validate(String mobile,String email){
    this.mobile = mobile;
    this.email = email;
  }
  public static void validateMobile(String mobile)throws InvalidNumberException{
    if((mobile.length())<10){
      throw new InvalidNumberException("Not Valid");
      }
    else{
      System.out.println("Mobile Number is valid");
    }

  }

  public void validateEmail(String email){
    if(email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
      System.out.println("Email is valid");
    }
    else{
      System.out.println("Email is not valid");
      System.exit(0);
    }
  }
}
