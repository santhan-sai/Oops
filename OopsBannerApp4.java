public class OopsBannerApp4 {
    public static void main (String[] args) {
	    String[] line=new String[7];
	    line[0]=String.join("   ***    ","   ***    ","******* ","   *****");
	    line[1]=String.join(" **   **  "," **   **  ","*     * "," **     ");
		line[2]=String.join("**     ** ","**     ** ","*     * ","**      ");
		line[3]=String.join("**     ** ","**     ** ","******* ","  ***** ");
		line[4]=String.join("**     ** ","**     ** ","*       ","       **");
		line[5]=String.join(" **   **  "," **   **  ","*       "," **   **");
		line[6]=String.join("   ***    ","   ***    ","*       ","  ***** ");
	for(int i=0;i<7;i++){
	    System.out.println(line[i]);
		}
    }
}
