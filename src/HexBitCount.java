
public class HexBitCount {

	public static void main(String[] args) {
		System.out.println(hex_bitcount("2EF"));
		System.out.println(hex_bitcount("2F"));

	}
	
	public static int hex_bitcount(String S)
	{
		int i = Integer.parseInt(S, 16);
	    String Bin = Integer.toBinaryString(i);
	    System.out.println("binary: " + Bin);
	    int retcount = 0;
	    
	    for (int x = 0; x < Bin.length(); x++)
	    {
	    	//System.out.println("char: " + Bin.charAt(x));
	    	if (Bin.charAt(x) == '1')
	    	{
	    		retcount++;
	    	}
	    }
	    
		return retcount;
	}

}
