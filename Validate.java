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
}
