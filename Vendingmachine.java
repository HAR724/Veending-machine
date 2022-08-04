import java.util.Scanner;


public class Vendingmachine{
    public static void main(String[] args) {
    int y=0;
    int pass1=0;
    int i=10;
    
        int packet1=100;
        int packet2=200;
        int packet3=300; 
        int cookies1=packet1;
        int cookies2=packet2;
        int cookies3=packet3;
       
        Scanner scan = new Scanner(System.in) ;
  while (cookies1!=0&&cookies2!=0&&cookies3!=0) {
    int x=0;
  
            System.out.print("press 0 to start:");
            int start=scan.nextInt();
           if(start==0){
            
            System.out.format("Current Date:%tc%n\n",System.currentTimeMillis());
            System.out.println( "what would you like ?");
            System.out.println( "press: 1 for rs.10 packet");                                 
             System.out.println("press: 2 for rs.5 packet");                                      
             System.out.println("press: 3 for rs.2 packet");
             System.out.println("press: 4 for report");      
             System.out.println("press: 5 for OFF");
            int packet=scan.nextInt();
             
            switch(packet){
                case 1:{
                    System.out.println("how many packets you want:");
                    int num1=scan.nextInt();
                    if(packet1>0&&packet1>=num1){
                    System.out.println("insert "+10*num1+" coins and machine only accept , rs.1 coins , rs.2 coins , rs.5 coins , rs.10 coins :");
                                while(x!=10*num1){
                                int num2=scan.nextInt();
                                if((num2==1||num2==5||num2==2||num2==10)&&num2>10*num1){
                                    int num4=num2-10*num1;
                                    x=x+10*num1;
                                    System.out.println(num4);
                                    
            
            
                                }else if(num2==1||num2==5||num2==2||num2==10){
                                    x=x+num2;
                                    if(x>10*num1){
                                     x=x-10*num1;
                                     System.out.println("please take your changes Rs."+x);
                                     x=10*num1;
                                     break;
             
                                    }
                                   
                                
                                }else{
                                    System.out.println("your coins are not accepted by the machine take your rs."+num2+" back and please is insert again ");
                                } 
                            }
                             y=y+x;
                            System.out.println("please take your "+num1+" packets from the below:");
                            System.out.println();
                            case1(num1);
                            packet1-=num1;
                            System.out.println();
                            
                        }else{
                            System.out.println("sry not enough stock only "+packet1+" is left");
                        }
                       
                      break;
                    }
                case 2:{
                    System.out.println("how many packets you want:");
                    int num=scan.nextInt();
                    if(packet2>0&&packet2>=num){
                    System.out.println("insert "+5*num+" coins and machine only accept, rs.1 coins, rs.2 coins , rs.5 coins , rs.10 coins :");
                    while(x!=5*num){
                        int num2=scan.nextInt();
                         if((num2==1||num2==5||num2==2||num2==10)&&num2>5*num){
                            int num4=num2-5*num;
                            x=x+5*num;
                            System.out.println("please take your changes Rs."+num4);
                            


                        }else if(num2==1||num2==5||num2==2||num2==10){
                            x=x+num2;
                           if(x>5*num){
                            x=x-5*num;
                            System.out.println("please take your changes Rs."+x);
                            x=5*num;
                            break;

                           }
                        
                        }else{
                            System.out.println("your coins are not accepted by the machine take your rs."+num2+" back and please is insert again ");
                        }
                           
                        
                      
                    }
                     y=y+x;
                    System.out.println("please take your "+num+" packets from the below:");
                    System.out.println();
                    case2(num);
                    System.out.println();
                    packet2-=num;
                }else{
                    System.out.println("sry not enough stock "+packet2+" is left");
                }

                break;
                    }
               
                
                case 3:{
                    System.out.println("how many packets you want:");
                    int num3=scan.nextInt();
                    if(packet3>0&&packet3>=num3){
                    System.out.println("insert "+2*num3+" coins and machine only accept, rs.1 coins, rs.2 coins , rs.5 coins , rs.10 coins :");
                    
                    while(x!=2*num3){
                        int num2=scan.nextInt();
                        if((num2==1||num2==5||num2==2||num2==10)&&num2>2*num3){
                            int num4=num2-2*num3;
                            x=x+2*num3;
                            System.out.println("please take your changes Rs."+num4);
                            


                        }else if(num2==1||num2==5||num2==2||num2==10){
                            x=x+num2;
                            if(x>2*num3){
                             x=x-2*num3;
                             System.out.println("please take your changes Rs."+x);
                             x=2*num3;
                             break;
 
                            }
                           
                        
                        }else{
                            System.out.println("your coins are not accepted by the machine take your rs."+num2+" back and please is insert again ");
                        }
                           
                        
                      
                    }
                    y=y+x;
                    System.out.println("please take your "+num3+" packets from the below:");
                    System.out.println();
                    case3(num3);
                    System.out.println();
                    packet3-=num3;
                }else{
                    System.out.println("sry not enough stock "+packet3+" is left");
                }
                    break;
                }
                case 4:{
               
                    System.out.println("this can be only done by the owner :");
                    for( i=2;i>=0;i--){
                    System.out.print("password:");
                     int pass=scan.nextInt();
                    if(pass==8989){
                        System.out.println("the current number of packet available is:");
                        System.out.println("no.of Rs.10 packets: "+packet1);
                        System.out.println("no.of Rs.5 packets: "+packet2);
                        System.out.println("no.of Rs.2 packets: "+packet3);
                        System.out.println("Money: "+y);
                        break;
                    }else if(i==0){
                        System.out.println("machine is locked it will be reset after 1 hour");
                        break;
                    }else
                    {
                        System.out.println("wrong password only "+i+"attempt is left please try again");
                    }
                }
                
                    System.out.println();
                    break;
                }
                
                case 5:{
                    System.out.println("this can be only done by the owner");
                    System.out.println("password");
                     pass1=scan.nextInt();
                    if(pass1==8989){
                        System.out.println("Machine should be shutting down");
                        break;
                        
                    }else{
                        System.out.println("password you enter is wrong you can't shutting down the machine");
                    }
                    System.out.println();
                    break;
                }
                 default:{
                    System.out.println("please try again");
                    
                }
            }
        
    }else{
        System.out.println("please try again");
    }

           if(pass1==8989||i==0){
               break;

            }
        
           
      cookies1=packet1;
      cookies2=packet2;
     cookies3=packet3;
     // System.out.println(cookies1);
   
}

        
        

    
}
public static void case1(int num1){
    System.out.println("    ****************************************************************");
    System.out.format("       your transaction time:%tc%n\n",System.currentTimeMillis() );
    System.out.println( "                   here your receipt                               ");
    System.out.println( "              you purchase "+num1+" packets of rs.10                 ");
    System.out.println("         and the total amount of"+num1+" packets is "+10*num1+"       ");
    System.out.println("     **************************************************************");

}

public static void case2(int num){
    System.out.println("    ****************************************************************");
    System.out.format("       your transaction time:%tc%n\n",System.currentTimeMillis() );
    System.out.println( "                   here your receipt                               ");
    System.out.println( "              you purchase "+num+" packets of rs.10                 ");
    System.out.println("         and the total amount of"+num+" packets is "+10*num+"       ");
    System.out.println("     **************************************************************");
}

public static void case3(int num3){
    System.out.println("    ****************************************************************");
    System.out.format("       your transaction time:%tc%n\n",System.currentTimeMillis() );
    System.out.println( "                   here your receipt                               ");
    System.out.println( "              you purchase "+num3+" packets of rs.10                 ");
    System.out.println("         and the total amount of"+num3+" packets is "+10*num3+"       ");
    System.out.println("     **************************************************************");
}
}
