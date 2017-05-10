import java.io.*;
class SymptomTags{




//first is adj, second is noun.
public static void combowords(String[] first, String[] second){


int min = 0;
int max = 0;
PrintWriter writer = null;

if (first.length < second.length){
     min = first.length;
     max = second.length;
}else{
     min = second.length;
     max = first.length;
}




for(int i = 0; i < max-1;i++){


     for(int j = 0; j < min; j++){


          System.out.println(first[i] + "_"  + second[j] + ".html");

          try{
               writer = new PrintWriter("htmls/" +first[i] + "_"  + second[j] + ".html", "UTF-8");
               writer.println("<html>");
               writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">");
               writer.println("<SCRIPT LANGUAGE=\"JavaScript\" src=\"mysrc.js\"></script>");
               writer.println("<title>" + first[i] + " "  + second[j] + " Symptom</title>" );
               writer.println("<div class = \"grad\"");
               writer.println("<body>");
               writer.println("<p style = \"font-size: 90px; text-align:center;\">What Is A "+ first[i] + " "  + second[j] + "?<br><br><br></p>");
               writer.println("<p style = \"font-size: 30px; text-align:center;\">A "+ first[i] + " "  + second[j] + " occurs when one's " +  second[j] + " is " + first[i] + ".<br><br><br></p>");
               writer.println("<p style = \"font-size: 70px; text-align:center;\">Treatments<br><br><br></p>");
               writer.println("<p style = \"font-size: 30px; text-align:center;\">Medical professionals suggest that treatment occur upon injury to the " +  second[j] + ".<br><br><br><br><br><br></p>");
               writer.println("</div>");
               writer.println("</body>");
               writer.println("</html>");
               writer.close();
          } catch (IOException e) {
               System.out.println("the file: " + first[i] + "_"  + second[j] + ".html" + "cannot be created." );
               // do something
          }




     }




}






}

public static void main(String[] args) throws java.io.IOException, java.lang.InterruptedException {


String[] first = new String[]{"Rash", "Painful","Infected","Contaminated","Damaged","Dirty","Pulsating","Quivering","Hurting","Fractured","Broken","Inflamed","Bleeding","Bad","Flemmy","Disgusting","Terrible","Chronic","Oozing","Nasty"};

String[] second = new String[]{"Palm","Finger","Cough","Discharge","Neck","Spine","Cyst","Boner","Pelvis","Butthole","STD","Doctor","Throat","Diarrhea","Nipple","Arm","Wrist","Vagina","Penis","Testicle","Earlobe"};


combowords(first,second);

}





}
