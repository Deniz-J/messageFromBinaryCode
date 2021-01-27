String messageFromBinaryCode(String code) {
    String s="";
    
    for(int i=0; i<code.length(); i+=8){
        int sum =0;
        for(int j=i; j<i+8; j++){
         char c = code.charAt(j);
         int a = Character.getNumericValue(c);
         int n = a *(int)(Math.pow(2, Math.abs(7-j+i))); 
          sum = sum + n;        
        }
        s= s+ (char)(sum);
    }           
   return s;
}
