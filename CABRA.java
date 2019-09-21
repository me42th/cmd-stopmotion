public class CABRA {
    
private static final String signature = "\ncabra.io\tcodar.app";
private static int companySize = 1;
private static String espaco = "";

private static String company[] = new String[]{
        "            _._._                       ",
        "           _|   |_                      ",
        "           | ... |      _________       ",
        "           | ||| |-----|  CABRA  |----- ",
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
        " ()))(()   |     |             |   |   |",
        "    ||     |_____|_____________|___|___|",
         
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
             "Sou o me42th",
             "Sou o me42th",      
             "O mascote caprino",
             "O mascote caprino",
             "O mascote caprino",
             "Conosco eh o dobro na metade do tempo",
             "Conosco eh o dobro na metade do tempo",
             "Conosco eh o dobro na metade do tempo",
             "E demonstrarei \"COMO\" e \"PORQUE\"",
             "E demonstrarei \"COMO\" e \"PORQUE\"",
             
         } );
       
       talk(
               new String[]{
             "Quem sabe faz ao vivo!",
                   
              }
       );
       rightSpace[0] = "\t\t VALORES";
	   talk(
               new String[]{
             "Quem sabe faz ao vivo!",
                   
              }
       );
       talk(
               new String[]{
               "A sua expectativa eh coisa seria",
                       
              }
       );
       rightSpace[1] = "\t\t\t RESPEITO";
       talk(
               new String[]{
               "A sua expectativa eh coisa seria",    
              }
       );
       
       
       walkLeft(3,
               new String[]{
                   
                   "Somos profissionais!",                                 
                   
                }
               );
        talk(
                new String[]{
                   "A nossa parceria eh fruto de algo maior ",
                }
        );
        rightSpace[2] = "\t\t\t TRANPARENCIA";
        talk(
                new String[]{
                   "A nossa parceria eh fruto de algo maior",
				   "A sua confianca eh o nosso maior trunfo" ,
                   "A sua confianca eh o nosso maior trunfo"                   
                    
                    
                }
        );
        
        walkRight(1,
                new String[]{
                    "Por essa razao",
                    
                    
                }                
        );
        
        walkRight(1,
                new String[]{
                    "Por essa razao",
                    
                    
                }                
        );
        
        
        
        walkRight(1,new String[]{
                    "Aqui a concentracao eh intensa na meta",
                    
                    }
        );
        
        walkRight(2,new String[]{
                   "Aqui a concentracao eh intensa na meta",
                    }
        );
        
        walkRight(1,new String[]{
                    "A CABRA IO eh composta por pessoas que atendem outras pessoas"
            });
        walkRight(1,new String[]{
                    "A CABRA IO eh composta por pessoas que atendem outras pessoas"
            });
              
        talk(
                new String[]{
                    "Nao oferecemos bit/byte </codigo>"
                }
        );
       

        
		talk(
                new String[]{
                    "Nao oferecemos bit/byte </codigo>" 
                }
        );        
        walkLeft(1,new String[]{
                "E sim agregar valor ao projeto",
                              
            }
        );

        walkLeft(1,new String[]{
                "E sim agregar valor ao projeto",
                              
            }
        );
        
        walkLeft(1,new String[]{
                "Codigo com qualidade e funcional",
                              
            }
        );
     
        walkLeft(1,new String[]{
                "Codigo com qualidade e funcional",
                              
            }
        );
         
        walkLeft(1,new String[]{
                "Eh a nossa principal documentacao"
                        
                              
            }
        );
		rightSpace[3] = "\t\t\t SUSTENTABILIDADE";
        walkLeft(1,new String[]{
                 "Eh a nossa principal documentacao"
                              
            }
        );
        
        
        
        walkLeft(1,new String[]{
                "Pois assim nao desperdicamos o tempo"              
            }               
        );
     
        walkRight(1,new String[]{
                "Pois assim nao desperdicamos o tempo"              
            }                
        );
      
        
        walkLeft(1,new String[]{
                "E este, de todas as metricas possiveis, nao se recupera"
                
                
            }                
        );
        leftSpace[9] = doorOpen[0];
        leftSpace[10] = doorOpen[1];
        
        walkLeft(2,new String[]{
                "E este, de todas as metricas possiveis, nao se recupera"
                
                
            }                
        );
        
        
        
        walkRight(3,new String[]{
               "Fim?",
                "Fim?",
                
            }                
        );
        talk(new String[]{
                " 'Thus,Though we cannot make our sun Stand still,yet we will make him run' ",
                " 'Thus,Though we cannot make our sun Stand still,yet we will make him run' ",
                
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
        System.out.println("||"+promptFLine+"           || |      |  |M42|  | |");
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
                :cont==9?"CO0"
                :cont==11?"CO0D"
                :cont==13?"CO0D4"
                :cont==15?"CO0D4R"
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
        "||            || |      |  |M42|  | |",
        "||            ||/@@@    |   ---   | |",
        "\\+============+/    @   |_________|./.",
        "                   @          ..  ....'",
        "..................@     __.'.'  ''",
        "/oooooooooooooooo//     ///",
        "/................//     /_/",
        "------------------"
        };
        
        String frame_1[] = new String[]{
            "&¨#%&¨%@#&¨%&¨%@&¨%#@&%&@%¨#&¨%@&¨%#&¨%",
            "#*$(*&#($*&(#*&$(*&#($*&(#&$(*&#(&$*(#*",
            "(*&$(#*&$(*&#(*&$(@&#94*&(*&$(*&($&*(#*",
            "#(@*$&(#*@&$(*&#($&#($&(#*&$(#&$(&#$(*#",
            "#*$&*&#¨$*&#¨$*¨#*$¨*#&$¨*&#¨$*&¨#$*¨&#",
            "#(*$&(*#&$(&#$(*&#($&(#&$(&)$&#)(&%)@##",
            "*E&#¨*@&¨*$¨R(*&)R&)($&#)&()&$)&)(&$)()",
            "#(*&$(*&#)$(#@&$_($#(*#$((¨*#)$(#&$_#($",
            "#$&)(#$&&)#(&$)(#&$)(&#)(&$)(&#(&%(_@(&",
            "#*$&(*$(*&@(*&(*&$(*&%(*&(*&$(*&%)$_#*",
            "()#*$)(*)($%)_(_$#($_(_)($)(+_%(+#_$(*",
            "$(*($&(*&(*&#¨$*(¨#*¨$(#)$*#)(@$)(&$#*",
            "#($*&#)%)¨%&%#$¨*¨*¨$*#$$¨%#@(#)(_$(%("
        };
        
        String frame_2[] = new String[]{
            "JFLDFJDSFOIJODCMDSCMOASDMCOIMDOCIMOADMC",
            "IORUOEWRIUQEWPRUPQEURIPEURIOUQEWRPIQEWP",
            "CNBV,CZXBNVM,ZCXV,NCBVNCXZBV,MCNZXBV,,Z",
            "NMB,CXVBFJLADSFJÇDSLKJÇSDJFJKFJDSFKSLDF",
            "QWEUREWURYOEWURYOEWUROEWTRUOQEWYRUOEWRU",
            "VNCXB,VNB.VB,ZCXVÇCVNAINVNVJNDFLVNFDSV",
            "UEWRYOIUERHJDKFCNÇMCNDSÇOFJLDSKVÇVNSDJ)",
            "SDCSDCKSLÇC,L~C,~S,CLÇSCL,~SC,S~CLSDCÇ$",
            "ASD.CKSDCMÇSCÇSCKMÇSLCMÇLSDCMLMCÇSKCMÇ",
            "ASDCKJSDCJNLDSKCNLKSNDCLKSAJDCNKSAJCLCN",
            "DSCLKMSDÇCMKSDÇCMKCÇLSAMCKÇSDCLKSDCMLK",
            "SÇCLKMADSÇCLM SDCÇMslmlçlmcdsçklcmksdc",
            "KDSÇCLKMDCÇSC,~SPDCPÓ,CCSC,´POEOPPWOEK"
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

 
