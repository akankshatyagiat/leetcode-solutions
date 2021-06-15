class Solution {
    public String intToRoman(int num) {
         int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
         String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L","XL", "X", "IX", "V", "IV", "I" };

	    StringBuilder s = new StringBuilder();

	    for (int i = 0; i < values.length; i++) {
		    while (num >= values[i]) {
		    	num -= values[i];
                //System.out.println(num+" and "+i);
			    s.append(romanLiterals[i]);
		    }
            //System.out.print("last "+i+" ");
	    }
	return s.toString();
    }
}
//          StringBuilder retVal = new StringBuilder();
//         while(num != 0){
//             //Specific Constraint Cases
//              if(num == 4) {
//                 num -= 4;
//                retVal.append("IV");;
//                 continue;
//             }
//              if(num == 9) {
//                 num -= 9;
//                 retVal.append("IX");
//                 continue;
//             }
            
//             //General cases
//             if(num < 5) {
//                 num -= 1;
//                 retVal.append("I");
//                 continue;
//             }
//             if(num < 10) {
//                 num -= 5;
//                 retVal.append("V");
//                 continue;
//             }
//             if(num < 50) {
//                 if(num / 10 == 4) {
//                     num -= 40;
//                     retVal.append("XL");;
//                 }
//                 else {
//                     num -= 10;
//                     retVal.append("X");
//                 }
//                 continue;
//             }
//             if(num < 100) {
//                 if(num / 10 == 9) {
//                     num -=90;
//                     retVal.append("XC");
//                 }
//                 else {
//                     num -=50;
//                     retVal.append("L");
//                 }
//                 continue;
//             }
//             if(num < 500) {
//                 if(num / 100 == 4) {
//                     num -= 400;
//                     retVal.append("CD");
//                 }
//                 else {
//                     num -= 100;
//                     retVal.append("C");
//                 }
//                 continue;
//             }
//             if(num < 1000) {
//                 if(num / 100 == 9) {
//                     num -= 900;
//                     retVal.append("CM");
//                 }
//                 else {
//                     num -=500;
//                     retVal.append("D");
//                 }
//                 continue;
//             }
//             if(num > 1000) {
//                 num -=1000;
//                 retVal.append("M");
//                 continue;
//             }
           
//         }
//         return retVal.toString();
//    }
// }