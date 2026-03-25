public class OOPSBannerApp7{
	class  
	public static String[] getOpattern(){
	  return new String[]{
       
        "   *   ",
        " *   * ",
        "*     *",
        "*     *",
        "*     *",
        "*     *",
		" *   * ",
        "   *   "
 };
        }
		public static String[] getPpattern(){
          return new String[]{
		"**   *   ",
		"*     * ",
		"*      *",
        "*     * ",
        "**      ",
        "*       ",
        "*       ",
        "*       "
      } ;
       }
      public static String[] getSpattern(){
          return new String[]{
        "   *** ",
        " **    ",
        "**     ",
        "  *    ",
        "    *  ",
        "     **",
        "    ** ",
        " ***   ",
	};
    }
public static void main(String[] args){
       String[] tern=getOpattern();
       String[] ppattern=getPpattern();
       String[] spattern=getSpattern();
     
     for(int i=0;i<tern.length;i++){
     System.out.println(tern[i] + " " +tern[i]+" "+ppattern[i]+" "+spattern[i]);
}
}
}
