package com.rev;

public class StringMastery {
    public static void main(String[] args) {

        // 1. String literal (goes to String Pool)
        String a = "java";
        String b = "java";
        System.out.println("a == b : " + (a == b)); // true, same object in pool

        // 2. Using new String (heap object)
        String c = new String("java"); 
        System.out.println("a == c : " + (a == c)); 
        System.out.println("a.equals(c) : " + a.equals(c)); 
        
        
     // 3. String immutability
        String d = "Hello";
        d.concat("World");
        System.out.println("After concat (immutable):"+d);
        
     // 4. Proper concatenation
        d= d.concat("World");
        System.out.println("After reassignment: " + d);
        
     // 5. String methods
        
        String name = "Oracle Java";
        
        System.out.println("Length :" + name.length());
        
        System.out.println("Trimmed :"+ name.trim());
        
        System.out.println("Uppercase:" + name.toUpperCase());
        
        System.out.println("charAt(2):"+name.charAt(2));
        
        System.out.println("indexOf(\"Java\"): "+ name.indexOf("Java"));
        
        System.out.println("substring(2, 8):"+name.substring(2,8));
        
        // 6. equalsIgnoreCase and contains
        
        String tech = "Java";
        
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(tech));
        
        System.out.println("Contains 'va':"+ a.contains("va"));
        
        // 7. startsWith / endsWith
        
        System.out.println("startsWith(\"ja\"): " + a.startsWith("ja")); 
        
        System.out.println("endsWith(\"va\"): " + a.endsWith("va"));
        
     // 8. StringBuilder (mutable)
        
        StringBuilder sb = new StringBuilder ("start");
        
        sb.append("-middle").append("-end");
        
        System.out.println("StringBuilder: " + sb);
        
        sb.insert(5,"Insert");
        
        System.out.println("After insert: " + sb);
        
        sb.delete(5, 14);
        
        System.out.println("After delete: " + sb);
        
        sb.reverse();
        
        System.out.println("After reverse :"+ sb);
        
        System.out.println("Back to String: " + sb.toString());
        
        // 9. null-safe check
        
        String nullstr = null ;
        
        if ("abc".equals(nullstr)) {
        	System.out.println("Safe check passed");
        }
        else {
        	System.out.println("Safe check avoided NPE");
        }
        
        
        	
        // 10. String in switch
        
        String lang = "java" ;
        
        switch(lang) {
        
        case "java":
        	System.out.println("Java Selected");
        	break;
        	
        case "python":
        	System.out.println("Python Selected");
        	break;
        	
        	default:
        		System.out.println("Other language selected");
      
        }
        
        
     // 11. Interning
        
        String e = new String("pool");
        
        String f = e.intern();
        
        String g = "pool";
        
        System.out.println("f==g"+(f==g));
        
        
     // 12. Method chaining example
        
        String result = "string ".trim().toUpperCase().concat("123");
        System.out.println("Chained result: " + result);
       
   
        
        
        
        
        
        
        
        
    }
}
