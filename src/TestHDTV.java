import java.util.*;
public class TestHDTV {
	public static void main(String args[]){
		HDTV h1=new HDTV("Videocon",34);
		HDTV h2=new HDTV("Sony",35);
		HDTV h3=new HDTV("Toshiba",36);
		ArrayList<HDTV>al=new ArrayList<HDTV>();
		al.add(h1);
		al.add(h2);
		al.add(h3);
		Iterator<HDTV> itr= al.iterator();
		
		while(itr.hasNext()){
			HDTV hd=(HDTV)itr.next();
			System.out.println("TV Name:"+hd.BrandName+"  Size :"+" "+hd.Size);
		}
		
		
	}

}
