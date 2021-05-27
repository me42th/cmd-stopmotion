public class BUTANTAN {
    
private static final String signature = "\n CORONAVAC \t PFIZER \t MODERNA";
private static int companySize = 1;
private static String espaco = "";

private static String company[] = new String[]{
        "            _._._                       ",
        "           _|   |_                      ",
        "           | ... |      __________      ",
        "           | ||| |-----| BUTANTAN |---- ",
        "           |     |                     |",
        "   ())     |[-|-]| [-|-]  [-|-]  [-|-] |",
        "  (()))    |     |---------------------|",
        " (())())   |     |                     |",
        " (()))()  |[-|-]| [-|-]       .-\"-.   |",
        " ()))(()   |     |             |_|_|   |",
        "    ||     |_____|_____________|_|_|___|",
        " ~ ~^^                       /=====\\   "    
    };

    private static String doorOpen[] = new String[]{
        " ()))(()   |     |             | 💉 |  |",
        "    ||     |_____|_____________|_💉_|__|",
         
    };
    
       
     private static String [] ghost = new String[]{
     
     };       
    
   
    
    
    
    private static String[] rightSpace = new String[]{
        " ",// 1
        " ",// 2
        " ",// 3
        " ",// 4
        " ",// 5
        " ",// 6
        " ",// 7
        " ",// 8        
        " ",// 9        
        " ",// 10        
        " ",// 11        
        " ",// 12        
    };
    private static String[] leftSpace = new String[]{
        " ",// 1
        " ",// 2
        " ",// 3
        " ",// 4
        " ",// 5
        " ",// 6
        " ",// 7
        " ",// 8
        " ",// 9
        " ",// 10
        " ",// 11
        " " // 12
};

   
    public static void main(String[] args) throws Exception{
         prompt();
      explosion();
        
        String [] falas = new String[]{
             "Olá",
             "Como vai?"
         };
       talk(
               new String[]{
             "Olá",
             "Como vai?"
              }
       );
       walkRight(15,
               new String[]{
             "Esta é uma homenagem",
             "Bem pequena",      
             "Bem pequena",
             "Mas é o que este simples dev",
             "Mas é o que este simples dev",
             "E entusiasta da ciência",
             "E entusiasta da ciência",
             "Podia e fez questão de fazer",
             "Podia e fez questão de fazer",
             "Aos hérois que criaram a vacina",
             "Aos hérois que criaram a vacina",
             "E que lutaram contra tudo e todos por ela",
             
         } );
       
       talk(
               new String[]{
             "É estranho falar sobre isso!",
                   
              }
       );
       rightSpace[0] = "\t\t😷 Gratidão";
	   talk(
               new String[]{
             "É estranho falar sobre isso!",
                   
              }
       );
       talk(
               new String[]{
               "Pois nunca pensei que alguem",
                       
              }
       );
       rightSpace[1] = "\t\t\t Cientistas";
       talk(
               new String[]{
               "Pois nunca pensei que alguem",    
              }
       );
       
       
       walkLeft(3,
               new String[]{
                   
                   "Poderia achar diferente",                                 
                   
                }
               );
        talk(
                new String[]{
                   "Poderia achar diferente",
                }
        );
        rightSpace[2] = "\t\t\t VOCÊS SÃO FODA!!";
        talk(
                new String[]{
                   "A coragem de vocês",
				   "Permitiu que todos pudessem sonhar" ,
                   "Permitiu que todos pudessem sonhar"                   
                    
                    
                }
        );
        
        walkRight(1,
                new String[]{
                    "Fazer o que precisa ser feito",
                    
                    
                }                
        );
        
        walkRight(1,
                new String[]{
                    "Fazer o que precisa ser feito",
                    
                    
                }                
        );
        
        
        
        walkRight(1,new String[]{
                    "Correndo riscos",
                    
                    }
        );
        
        walkRight(2,new String[]{
                   "Na nossa idade média tardia",
                    }
        );
        
        walkRight(1,new String[]{
                    "A ciência é linda e vocês são a culpa disso"
            });
        walkRight(1,new String[]{
                    "A ciência é linda e vocês são a culpa disso"
            });
              
        talk(
                new String[]{
                    "Eu realmente precisava falar"
                }
        );
       

        
		talk(
                new String[]{
                    "Eu realmente precisava falar" 
                }
        );        
        walkLeft(1,new String[]{
                "De alguma forma",
                              
            }
        );

        walkLeft(1,new String[]{
                "O tanto que sou grato",
                              
            }
        );
        
        walkLeft(1,new String[]{
                "O tanto que sou grato",
                              
            }
        );
     
        walkLeft(1,new String[]{
                "É uma homenagem bem pequena",
                              
            }
        );
         
        walkLeft(1,new String[]{
                "Mas juro que é de coração!"
                        
                              
            }
        );
		

        walkLeft(1,new String[]{
                 "Mas juro que é de coração!"
                              
            }
        );
        
        
        
        walkLeft(1,new String[]{
                "Coragem de ir lá e fazer"              
            }               
        );
     
        walkRight(1,new String[]{
                "Merece um muito obrigado"              
            }                
        );
        rightSpace[4] = "\t Salvaram o mundo!";
        leftSpace[9] = doorOpen[0];
        leftSpace[10] = doorOpen[1];
        
        walkLeft(3,new String[]{
                "Este é o meu!"
                
                
            }                
        );
        
        
        
        walkRight(3,new String[]{
               "Vocês são incriveis!!",
                "Vocês são incriveis!!",
                
            }                
        );

		rightSpace[6] = "\t HERÓIS!!!";
        talk(new String[]{
                " OBRIGADO ",
                " OBRIGADO!! ",
                
            }                
        );
               
    }   
    
    public static void talk(String [] texto)throws Exception{
        for(String fala : texto){
            printMe42th(fala,1);
            Thread.sleep(2500);
        }
    }
    
    private static void printMe42th(String fala, int step){
            limpaTela();
            System.out.println(leftSpace[0]+rightSpace[0]);
            System.out.println(leftSpace[1]+rightSpace[1]);
            System.out.println(leftSpace[2]+rightSpace[2]);
            System.out.println(leftSpace[3]+rightSpace[3]);
            System.out.println(leftSpace[4]+rightSpace[4]);
            System.out.println(leftSpace[5]+rightSpace[5]);
            System.out.println(leftSpace[6]+rightSpace[6]);
            System.out.println(leftSpace[7]+rightSpace[7]);
            System.out.println(leftSpace[8]+espaco+"   "+fala+rightSpace[8]);
            System.out.println(leftSpace[9]+espaco+" O"+rightSpace[9]);
            System.out.println(leftSpace[10]+espaco+"-|-"+rightSpace[10]);
            String pernas =
                     step==2?"/ |"
                    :step==3?"| |"
                    :step==4?"| \\"
                    :"/ \\"    ;
            System.out.println(leftSpace[11]+espaco+pernas+rightSpace[11]);
            System.out.println(signature);
    }
    
    public static void walkRight(int passos, String [] texto)throws Exception{
       String fala = texto.length > 0 ?texto[0]:" ";
        for(int cont = 0;cont<passos;cont++){
            for(int step = 1; step < 5;step++){
                
                printMe42th(fala,step);
                doCompany();
                Thread.sleep(500);
            }
        fala = cont < texto.length ?texto[cont]:fala;    
        }
        
        printMe42th(fala,1);
        Thread.sleep(750);
    }

    public static void walkLeft(int passos, String [] texto)throws Exception{
       String fala = texto.length > 0 ?texto[0]:" ";
       if(passos > espaco.length()) return;
        for(int cont = 0;cont < passos;cont++){
            for(int step = 1; step < 5;step++){
                
                printMe42th(fala, step);
                int control = espaco.length()-1;
                espaco = "";
                for(int innerCont = 0;innerCont < control;innerCont++)
                    espaco+=" ";
                Thread.sleep(500);
            }
        fala = cont < texto.length ?texto[cont]:fala;    
        }
        
        printMe42th(fala, passos);
        Thread.sleep(750);
    }
            
    public static void doCompany(){
       if(espaco.length() < 8 || companySize >= company[0].length() )
           espaco+=" ";
       else{
           for(int cont = 0;cont < leftSpace.length;cont++)
               leftSpace[cont] = " "+company[cont].substring(company[cont].length()- companySize,
                       company[cont].length());
            companySize++;        
        }
        
    }
     
    
    public static void limpaTela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void prompt() throws Exception{

        String prompt,promptFirstLine ,promptSecondLine ,promptFLine ;
        
        String space = "       ";
        String input = "";
        
        String secondLine = "    ";
        String thirdLine = "            ";
        prompt = " ";
        promptFirstLine = prompt;
        promptSecondLine = " ";
        promptFLine = " ";
        
        for(int cont = 0; cont < 30; cont ++){
        limpaTela();    
 
        System.out.println("________________          __________");
        System.out.println("/+============+\\ |      |         | |");
        System.out.println("||C:\\>"+input+promptFirstLine+space+"|| |      |         | |");
        System.out.println("||"+secondLine+promptSecondLine+"       || |      | |====|  | |");
        System.out.println("||"+thirdLine+"|| |      |   ___   | |");
        System.out.println("||"+promptFLine+"           || |      |  |OMS|  | |");
        System.out.println("||            ||/@@@    |   ---   | |");
        System.out.println("\\+============+/    @   |_________|./.");
        System.out.println("                   @          ..  ....'");
        System.out.println("..................@     __.'.'  ''");
        System.out.println("/oooooooooooooooo//     ///");
        System.out.println("/................//     /_/");
        System.out.println("------------------");
        prompt = cont%2==0?" ":"|";
        promptFirstLine = cont < 15?prompt:" ";
        promptSecondLine = cont >= 15?prompt:" ";
        promptFLine = cont >= 19?prompt:" ";
        secondLine= cont == 15?"OUT:":secondLine;
        thirdLine = cont == 19?" FATAL ERROR":thirdLine;
        input = cont==5?"C"
                :cont==7?"CO"
                :cont==9?"COV"
                :cont==11?"COVI"
                :cont==13?"COVID"
                :cont==15?"COVID "
                :input;
        space=   cont==5?"      "
                :cont==7?"     "
                :cont==9?"    "
                :cont==11?"   "
                :cont==13?"  "
                :cont==15?" "
                :space;
        Thread.sleep(500);

        }
    
    }
    public static void explosion() throws Exception{
       
        String frame[] = new String[]{
        "________________          __________",
        "/+============+\\ |      |         | |",
        "||            || |      |         | |",
        "||            || |      | |====|  | |",
        "||            || |      |   ___   | |",
        "||            || |      |  |OMS|  | |",
        "||            ||/@@@    |   ---   | |",
        "\\+============+/    @   |_________|./.",
        "                   @          ..  ....'",
        "..................@     __.'.'  ''",
        "/oooooooooooooooo//     ///",
        "/................//     /_/",
        "------------------"
        };
        
        String frame_1[] = new String[]{
            "🦠¨#%🦠¨%@#🦠¨%🦠¨%@🦠¨%#@🦠%🦠@%¨#🦠¨%@🦠¨%#🦠¨%",
            "#*$(*🦠#($*🦠(#*🦠$(*🦠#($*🦠(#🦠$(*🦠#(🦠$*(#*",
            "(*🦠$(#*🦠$(*🦠#(*🦠$(@🦠#94*🦠(*🦠$(*🦠($🦠*(#*",
            "#(@*$🦠(#*@🦠$(*🦠#($🦠#($🦠(#*🦠$(#🦠$(🦠#$(*#",
            "#*$🦠*🦠#¨$*🦠#¨$*¨#*$¨*#🦠$¨*🦠#¨$*🦠¨#$*¨🦠#",
            "#(*$🦠(*#🦠$(🦠#$(*🦠#($🦠(#🦠$(🦠)$🦠#)(🦠%)@##",
            "*E🦠#¨*@🦠¨*$¨R(*🦠)R🦠)($🦠#)🦠()🦠$)🦠)(🦠$)()",
            "#(*🦠$(*🦠#)$(#@🦠$_($#(*#$((¨*#)$(#🦠$_#($",
            "#$🦠)(#$🦠🦠)#(🦠$)(#🦠$)(🦠#)(🦠$)(🦠#(🦠%(_@(🦠",
            "#*$🦠(*$(*🦠@(*🦠(*🦠$(*🦠%(*🦠(*🦠$(*🦠%)$_#*",
            "()#*$)(*)($%)_(_$#($_(_)($)(+_%(+#_$(*",
            "$(*($🦠(*🦠(*🦠#¨$*(¨#*¨$(#)$*#)(@$)(🦠$#*",
            "#($*🦠#)%)¨%🦠%#$¨*¨*¨$*#$$¨%#@(#)(_$(%("
        };
        
        String frame_2[] = new String[]{
            "JFL😷FJ😷SFOIJO😷CM😷SCMOAS😷MCOIM😷OCIMOA😷MC",
            "IORUOEWRIUQEWPRUPQEURIPEURIOUQEWRPIQEWP",
            "CNBV,CZXBNVM,ZCXV,NCBVNCXZBV,MCNZXBV,,Z",
            "NMB,CXVBFJLA😷SFJÇ😷SLKJÇS😷JFJKFJ😷SFKSL😷F",
            "QWEUREWURYOEWURYOEWUROEWTRUOQEWYRUOEWRU",
            "VNCXB,VNB.VB,ZCXVÇCVNAINVNVJN😷FLVNF😷SV",
            "UEWRYOIUERHJ😷KFCNÇMCN😷SÇOFJL😷SKVÇVNS😷J)",
            "S😷CS😷CKSLÇC,L~C,~S,CLÇSCL,~SC,S~CLS😷CÇ$",
            "AS😷.CKS😷CMÇSCÇSCKMÇSLCMÇLS😷CMLMCÇSKCMÇ",
            "AS😷CKJS😷CJNL😷SKCNLKSN😷CLKSAJ😷CNKSAJCLCN",
            "😷SCLKMS😷ÇCMKS😷ÇCMKCÇLSAMCKÇS😷CLKS😷CMLK",
            "SÇCLKMA😷SÇCLM S😷CÇMslmlçlmc😷sçklcmks😷c",
            "K😷SÇCLKM😷CÇSC,~SP😷CPÓ,CCSC,´POEOPPWOEK"
        };
        boolean coin = true;
        for(int cont = 0;cont < frame.length ;cont++){
        limpaTela();
            for(int arrayCont = 0; arrayCont < frame.length; arrayCont++)
                System.out.println(frame[arrayCont]);
            for(int innerCont = 0; innerCont<= cont;innerCont++)
                frame[frame.length-1-innerCont] = cont%2 == 0
                        ?frame_1[frame_1.length-1-innerCont]
                        :frame_2[frame_2.length-1-innerCont];
            
            if(cont == frame.length-1 && coin){
                cont = 0;
                coin = false;
            }
            if(!coin){
                frame_1[cont] = "";
                frame_2[cont] = "";
            }
        Thread.sleep(200);    
            
        }
        
        
    }
   
}
