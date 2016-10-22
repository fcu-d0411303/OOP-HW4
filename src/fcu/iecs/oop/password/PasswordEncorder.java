package fcu.iecs.oop.password;

public class PasswordEncorder {
	
	public String encode(String password){
		String password1=password.replace('a','4');
		String password2=password1.replace('e','3');
		String password3=password2.replace('i','1');
		String password4=password3.replace('o','0');
		String password5=password4.replace('t','7');
		String password6=password5.replace('A','4');
		String password7=password6.replace('E','3');
		String password8=password7.replace('I','1');
		String password9=password8.replace('O','0');
		String password10=password9.replace('T','7');
		return password10;
	}

}
