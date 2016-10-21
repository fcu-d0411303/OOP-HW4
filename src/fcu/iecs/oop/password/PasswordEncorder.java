package fcu.iecs.oop.password;

public class PasswordEncorder {
	
	public String encode(String password){
		String password1=password.replace('a','4');
		String password2=password1.replace('e','3');
		String password3=password2.replace('i','1');
		String password4=password3.replace('o','0');
		String password5=password4.replace('t','7');
		return password5;
	}

}
