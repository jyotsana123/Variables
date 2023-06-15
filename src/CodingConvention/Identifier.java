package CodingConvention;

class _ {}  //valid
class ${}   //valid
class Abc_${}  //valid
class _$ab12{} //valid
//class 123{}  invalid

public class Identifier {

	int $ = 1;
	int _ = 2;
	int ab = 3;
	int _$ = 4;
	int $_ab12 = 5;
	int abc$_ab = 6;
	int String = 7;
	//int int =8
	
	void _(){}
	void $() {}
	void _12() {}
	void $_12(){}
	void ab$_ad12() {}
	void String() {}
	//void if() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/* Every name is java is call identifiers
    class name, method name, variables name
While declaring identifiers we must follow some rules:
1. Identifiers contains a-z, A-Z, 0-9, underscore and dollar(_ $)
2. Identifiers should not start with numbers
3. It's not possible to declare keywords as a identifiers.
4. It possible to declare pre-defined class as a identifier, but it's not recommended to use
5. Identifiers are case sensitive
6. There is no length limit for identifiers but it's recommended to take less than 16 characters
*/