package project;
import java.util.Scanner;
public class JavaApplication9 {
static int [] ar3 ={0,0,0,0,0,0,0,0,0,0,0}; // dawakare user

   static int [] ar = {500,500,500,500,500,500,750,1000,1500,2000,2500,0};  // price 
   static int [] ar1= {48,48,48,48,48,48,48,48,48,48,48}; // stock
   static int [] ar2 ={0,0,0,0,0,0,0,0,0,0,0}; // to callculation
   static int averg=0;
   public static void main(String[] args) {
     pass();
       
    }
    
  
    public static void pass(){
     String username = "AMSR1234";
        String passs = "A1234";
        Scanner ara = new Scanner (System.in);
       int ew = 1;
        while(ew!=0){
        System.out.println("Pleas enter user name : ");
        String user = ara.nextLine();
        System.out.println("Enter password : ");
        String pass = ara.nextLine();
        if(pass.equals( passs)==true && user.equalsIgnoreCase(username)==true){
            ew=0;
            input();}
         else {System.out.println("wrong");}
        }
    
    }
   
   
   
    public static void input(){ 
     Scanner ara = new Scanner (System.in); 
       
        
     System.out.println("* Welcome to drinking market *"); 
     System.out.println("-------------------------------\n");
        System.out.println("Enter number 1 to selling and Enter number 2 to buying  and Enter number 3 to managment and Enter number 0 to exit: ");
        System.out.print("Enter : ");
   int in = ara.nextInt();
   while(in!=0){
   if(in==1){sell();}
   else if(in==2){purchasing();}
   else if (in==3){managment();}
   else{System.out.println("pleas just enter number 1 ,2,3and 4 to exit");}
       System.out.print("Enter section: ");
       in = ara.nextInt();
   }
    
       
    
    
    
    }
   
    
    public static void sell(){
    
    Scanner ara = new Scanner (System.in);
        System.out.println("   Welcome to selling section : ");
        System.out.println("---------------------------------");
        System.out.println("* List and price drinking *");
        System.out.println("----------------------------\n");
        System.out.println("1-cocacola=500\t2-pepsi=500\t3-fanta=500\t4-sprite=500\n5-dew=500\t6-rany=500\t7-maxici=750\t8-tiger=1000\n9-redboll=1500\t10-smart = 2000\t11-monster = 2500\t0-Exit");
        System.out.print("Enter: ");
    int dawa = ara.nextInt();
                int pc = 0;
                int pp = 0;
                int pf = 0;
                int ps = 0;
                int pd = 0;
                int pr = 0;
                int pmx = 0;
                int pt = 0;
                int pre = 0;
                int psm = 0;
                int pm = 0;
                 while(dawa!=0){
                if( dawa==1 || dawa==2 || dawa==2 || dawa==3 || dawa==4 || dawa==5 || dawa==6 || dawa==7 || dawa==8 || dawa==9 || dawa==10 || dawa==11 || dawa==0) 
                {
        switch(dawa){
            case 1 : {
                System.out.print("how much kans : ");
                  int ac = 1;
                while(ac!=0){
                ar3[0] = ara.nextInt();
                  if(ar3[0]>0){
                 pc = ar[0] *  ar3[0];  
                ar2[0]+= ar3[0];
               ac=0;   } else {System.out.println("Just write positive number : ");}   }    }
            break;
              case 2 : {
                   System.out.print("how much kans : ");
                  int bc = 1;
                   while (bc!=0){
                ar3[1] = ara.nextInt();
                if(ar3[1]>0){
               pp=  ar3[1]*ar[1];
             ar2[1]+= ar3[1];
             bc=0;   } else {System.out.println("Just write a positive number : ");} } }
            break;
              case 3 : { System.out.print("how much kans : ");
                 int dd = 1;
                 while (dd!=0){
                    
              ar3[2] = ara.nextInt();
               if(ar3[2]>0){
               pf=  ar3[2]*ar[2];
               ar2[2]+= ar3[2];
          dd=0;      }else {System.out.println("Just write a positive number : ");}  }  }
            break;
              case 4 : { System.out.print("how much kans : ");
      int kj = 1; while(kj!=0){
                  ar3[3] = ara.nextInt();
                  if(ar3[3]>0){
               ps=  ar3[3]*ar[3];
       ar2[3]+= ar3[3];      kj=0;
              
                  } else {System.out.println("Just write a positive number : ");}  }    }
            break;
              case 5 : { System.out.print("how much kans : ");
               int jj =1 ; while(jj!=0){
              ar3[4]= ara.nextInt();
              if(ar3[4]>0){
               pd=  ar3[4]*ar[4];    jj=0;
              ar2[4]+= ar3[4];
              } else {System.out.println("Just write a positive number : ");}  }   }
            break;
              case 6 : { System.out.print("how much kans : ");
              int kf =1;   while(kf!=0){
              ar3[5]= ara.nextInt();
              if(ar3[5]>0){
               pr=  ar3[5]*ar[5];   kf=0;
              ar2[5]+= ar3[5];}   else {System.out.println("Just write a positive number : ");}                       }    }
            break;
              case 7 : { System.out.print("how much kans : ");
                int hj =1; while(hj!=0){ 
              ar3[6] = ara.nextInt();
              if(ar3[6]>0){
               pmx=  ar3[6]*ar[6];
               ar2[6]+= ar3[6];         hj=0;
              }   else {System.out.println("Just write a positive number : ");}    }              }
            break;
              case 8 : { System.out.print("how much kans : ");
            int y = 1; while(y!=0){
              ar3[7] = ara.nextInt();
              if(ar3[7]>0){
               pt=  ar3[7]*ar[7];
             ar2[7]+= ar3[7];   y=0;  } else {System.out.println("Just write a positive number : ");} 
            }    }
            break;
              case 9 : { System.out.print("how much kans : ");
        int bn =1;      while(bn!=0){
                  ar3[8] = ara.nextInt();
                  if (ar3[8]>0){
               pre=  ar3[8]*ar[8];
             ar2[8]+= ar3[8]; bn=0;
                     } else {System.out.println("Just write a positive number : ");} 
              }    }
            break;
              case 10 : { System.out.print("how much kans : ");
              int uu =1; while(uu!=0){
                  ar3[9] = ara.nextInt();
                  if(ar3[9]>0){
              psm=  ar3[9]*ar[9];
            ar2[9]+= ar3[9];   uu=0;}else {System.out.println("Just write a positive number : ");} 
              
              }    }
            break;
              case 11 : { System.out.print("how much kans : ");
             int ki =1; while(ki!=0){
                  ar3[10] = ara.nextInt();
                  if(ar3[10]>0){
             pm=  ar3[10]*ar[10];
            ar2[10]+= ar3[10];  ki=0;
                  } else {System.out.println("Just write a positive number : ");}  } }
            break;
        }  } else {System.out.println("Just write 1 to 11 ");}
        System.out.println("what else: Enter 0 to exit:");
        System.out.print("Enter : ");
        dawa = ara.nextInt();
    
    }
    if ( ar3[0]!=0){System.out.println("cocacola = "+pc+"\t");}
    else if( ar3[1]!=0){System.out.println("pepsi = "+pp+"\t");}
         else if( ar3[2]!=0){System.out.println("fanta = "+pf+"\t");}
          else if( ar3[3]!=0){System.out.println("sprite = "+ps+"\t");}
           else if( ar3[4]!=0){System.out.println("dew = "+pd+"\t");}
            else if( ar3[5]!=0){System.out.println("rany = "+pr+"\t");}
             else if( ar3[6]!=0){System.out.println("maxici = "+pmx+"\t");}
              else if( ar3[7]!=0){System.out.println("tiger = "+pt+"\t");}
               else if( ar3[8]!=0){System.out.println("redbull = "+pre+"\t");}
                else if( ar3[9]!=0){System.out.println("smart = "+psm+"\t");}
                else if( ar3[10]!=0){System.out.println("monster = "+pm+"\t");}
              averg = pc+pp+pf+ps+pd+pr+pmx+pt+pre+psm+pm;
              System.out.println("the averge of money = "+averg);
              
    }
    
    public static void purchasing(){Scanner ara = new Scanner(System.in);
        System.out.println("what do you want to Add : ");
        System.out.println("Enter number"); 
        System.out.println("1-cocacola\t2-pepsi\t3-fanta\t4-sprite\n5-dew\t6-rany\t7-maxici\t8-tiger\n9-redbull\t10-smart\t11-moster\t0-to exit");
    int kk = ara.nextInt();
    if(kk>=0){
    while(kk!=0){ if(kk==1 || kk==2 || kk==3 || kk==4 || kk==5 || kk==6 || kk==7 || kk==8 || kk==9 || kk==10 || kk==11){
        switch(kk){
        case 1 :{System.out.println("how much carton cocacola:");
        
       int gh =ara.nextInt()*24;
        ar1[0] = ar1[0]+gh;
        }
              break;
     case 2 :{System.out.println("how much carton pepsi:");
     int gv =ara.nextInt()*24;
     ar1[1]=gv;
     }
     break;
     case 3 :{System.out.println("how much carton fanta:");
     int go =ara.nextInt()*24;
     ar1[2]+=go;
     }
              break;
     case 4 :{System.out.println("how much carton sprite :");
     int gp =ara.nextInt()*24;
    ar1[3] +=gp;
     
     }
              break;
     case 5 :{System.out.println("how much carton dew :");
     int gs =ara.nextInt()*24;
    ar1[4]+=gs;
     }
              break;
     case 6 :{System.out.println("how much carton rany :");
     int gn =ara.nextInt()*24;
     ar1[5]+=gn;}
              break;         
     case 7 :{System.out.println("how much carton maxici :");
     int gi =ara.nextInt()*24;
     
     ar1[6]+=gi;
     }
              break;
     case 8 :{System.out.println("how much carton tiger :");
     int hh =ara.nextInt()*24;
     ar1[7]+=hh;}
              break;
     case 9 :{System.out.println("how much carton redbull :");
     int ok =ara.nextInt()*24;
     ar1[8]+=ok;}
              break;
     case 10 :{System.out.println("how much carton smart :");
     int as =ara.nextInt()*24;
     ar1[9]+=as;}
              break;       
     case 11 :{System.out.println("how much carton monster :");
     int po =ara.nextInt()*24;
   ar1[10]+=po;}
              break;     
     case 0 :{kk=0;}    
              break;
        }  }  
    else {System.out.println("Pleas just write limitd number : ");}
     System.out.println("what else: Enter 0 to exit:");
        System.out.print("Enter : ");
        kk = ara.nextInt();
    }        
    } else {System.out.println("Pleas just write posetive number :");}
    
    
    }
    public static void managment(){
        Scanner ara = new Scanner(System.in);
        System.out.println("*welcome to managment section*\n-------------------------------------\n");
        int c = 1;
        while(c!=0){
        System.out.println("1- sold section\t2-stock section\t3-profit section\t4-exit\n----------------------------------------");
        int ff = ara.nextInt();
       switch(ff){
           
           case 1:{
            System.out.println("sold section\n--------------------");
            System.out.println("cocacola = "+ ar3[0]);
            System.out.println("pepsi = "+ ar3[1]);
            System.out.println("fanta = "+ ar3[2]);
            System.out.println("sprite= "+ ar3[3]);
            System.out.println("dew = "+ ar3[4]);
            System.out.println("rany = "+ ar3[5]);
            System.out.println("maxice = "+ ar3[6]);
            System.out.println("tiger = "+ ar3[7]);
            System.out.println("redbull = "+ ar3[8]);
            System.out.println("smart = "+ ar3[9]);
            System.out.println("monster = "+ ar3[10]);
            
            System.out.println("averge of money = "+averg);
           } break;
        
           case 2: {
            System.out.println("stock section\n-------------------");
         int aa = ar1[0] -  ar3[0];
            System.out.println("cocacola = "+aa);
            int bb = ar1[1]- ar3[1];
            System.out.println("pepsi = "+bb);
            int cc =ar1[2]- ar3[2];
            System.out.println("fanta = "+cc);
            int dd = ar1[3]- ar3[3];
            System.out.println("sprite= "+dd);
            int ee = ar1[4]- ar3[4];
            System.out.println("dew = "+ee);
            int fg = ar1[5]- ar3[5];
            System.out.println("rany = "+fg);
            int yy = ar1[6]- ar3[6];
            System.out.println("maxice = "+yy);
            int hh = ar1[7]- ar3[7];
            System.out.println("tiger = "+hh);
            int uu = ar1[8]- ar3[8];
            System.out.println("redbull = "+uu);
            int ii = ar1[9] -  ar3[9];
            System.out.println("smart = "+ii);
            int oo = ar1[10]- ar3[10];
            System.out.println("monster = "+oo); } break;
        
        
           case 3 :{  System.out.println("profit section\n-------------------");
        System.out.println("sold section\n--------------------");
            System.out.println("cocacola = "+ ar3[0]*100);
            System.out.println("pepsi = "+ ar3[1]*100);
            System.out.println("fanta = "+ ar3[2]*100);
            System.out.println("sprite= "+ ar3[3]*100);
            System.out.println("dew = "+ ar3[4]*100);
            System.out.println("rany = "+ ar3[5]*100);
            System.out.println("maxice = "+ ar3[6]*120);
            System.out.println("tiger = "+ ar3[7]*150);
            System.out.println("redbull = "+ ar3[8]*200);
            System.out.println("smart = "+ ar3[9]*220);
            System.out.println("monster = "+ ar3[10]*250);
           } break;
        
           case 4:{c=0;}  break;
       
        
        
        }
        }
    }
}
