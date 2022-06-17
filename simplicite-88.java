package main.java.eraser;


public class Eraser {
    public static String erase(String str) {
    	if(str != "") {
        StringBuilder textbuilder = new StringBuilder(str);
        char x;
        char y;
        char z;
        for (int i=1;i<textbuilder.length()-1;i++){
            x = textbuilder.charAt(i);
            y = textbuilder.charAt(i+1);
            z = textbuilder.charAt(i-1);
            if((x==' ')&&(y!=' ')&&(z!=' ')) {
            	textbuilder.deleteCharAt(i);
            }
        }
        if (textbuilder.charAt(textbuilder.length()-1)==' '){
            textbuilder.deleteCharAt(textbuilder.length()-1);
        }
        if (textbuilder.charAt(0)==' ') {
        	textbuilder.deleteCharAt(0);
        }
        System.out.println(textbuilder.toString());
        return textbuilder.toString();
    	}
    	else {
    		return "";
    	}
    }
}
