import javax.swing.*;
public class Foles 
{
   public static void main (String[] args)
   {
	   String shkronja_enkriptuese = JOptionPane.showInputDialog(
			   "Mire se vini ne programin per enkriptim ne t folur.\n"
			   + "Me cilen shkronje deshironi te flas?");
			   
	   
	  Foles folesi = new Foles(); 
	   while (true)
	   {
		   String fjalia = JOptionPane.showInputDialog(
				   "Shkruaj fjaline qe deshiron te perkthesh:\n"
				   + "Nese do ta perfundosh perkthimin mos shkruaj asgje."
				   );
		   
		   if(fjalia == null || fjalia.equals(""))
		   {
			   System.exit(0);
		   }
		   
		   String rezultati = folesi.perkthe(fjalia, shkronja_enkriptuese);
		
	       System.out.println(rezultati);
	       JOptionPane.showMessageDialog(null, rezultati);
	   }
   }   
   
   public   boolean     eshteZanore(char karakteri)
   {
	   return (karakteri == 'a'|| karakteri == 'e'
			   || karakteri == 'e' || karakteri == 'i'
			   || karakteri == 'o' || karakteri == 'u'
			   || karakteri == 'y'
	       );
   }

public String perkthe(String fjalia,String shkronja_enkriptuese)
{
	   if(fjalia == null || fjalia.equals(""))
	   {
		   return "";
	   }

	   String rezultati = "";
	   
	   for (int i = 0; i < fjalia.length(); i = i + 1)
	   {
		
		   char karakteri =  fjalia.charAt(i);
		   
		   rezultati = rezultati + karakteri;
		   
		   if (eshteZanore(karakteri))
		   {
			   rezultati = rezultati + shkronja_enkriptuese + karakteri;
		   }
	   }
	   
	   return rezultati;
	   
    }


}
