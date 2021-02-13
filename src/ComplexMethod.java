public class ComplexMethod {

    public String intToEnglishValue(int i) {
        if (i == 1) {
            return "One";
        }
       else if (i == 2) {
            return "Two";
        }
        else if (i == 3) {
            return "Three";
        }
        else if (i == 4) {
            return "Four";
        }
        else if (i == 5) {
            return "Five";
        }
        else if (i == 6) {
            return "Six";
        }
        else if (i > 6) {
            throw new NotImplementedException();
        }
		else {
        return null;
		}
	}
}
