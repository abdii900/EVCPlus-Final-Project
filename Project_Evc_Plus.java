import java.util.Scanner;
public class Project_Evc_Plus {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // User balance
        long haraa = 1000;

        //pin
        int PIN = 1234;
        double mypin;
        double options;
        long number;
        long money;
        double dooro;
        double option;

        //zip code
        System.out.println("Zip code");
        String dial = input.next();
        String DialEVC = "*770#";

        if (dial.equals(DialEVC)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan geli PIN-kaaga");
            mypin = input.nextDouble();
            System.out.println("EVC-PLUS");

            // qeybta hubinta pinka
            int MiFiuser;
            long hr = 100;
            double select;

            if (mypin == PIN) {
                System.out.println("1.Itus haraagaaga");
                System.out.println("2.Kaarka hadalka");
                System.out.println("3.Bixi Biil");
                System.out.println("4.U wareeji EVCPLUS");
                System.out.println("5.Warbixin Kooban");
                System.out.println("6.Salaam Bank");
                System.out.println("7.Maareynta");
                System.out.println("8.Bill Payment");

                options = input.nextDouble();

                //haraaga
                if (options == 1) {
                    System.out.println("Haraagaagu Waa " + haraa + "$");
                } else if (options == 2) {
                    System.out.println("Kaarka Hadalka");
                    System.out.println("1.ku shubo Airtime");
                    System.out.println("2.Ugu shub Airtime");
                    System.out.println("3.MIFI Packages");
                    System.out.println("4.Ku shubo Internet");
                    System.out.println("5.Ugu shub qof kale (MMT)");

                    option = input.nextDouble();

                    //ku shupo
                    if (option == 1) {
                        System.out.println("Fadlan Geli Lacagta");
                        money = input.nextLong();
                        System.out.println("Ma hubtaa inaad $" + money + " ugu shubtid un-deffined?");
                        System.out.println("1.Haa");
                        System.out.println("2.Maya");
                        select = input.nextDouble();

                        if (select == 1) {
                            System.out.println("Waxaad ku shubatay $" + money + " Haraagaagu waa " + (haraa - money));
                        } else {
                            System.out.println("Waad ku mahadsantahay iska joojinta adeegaan");
                        }
                    }
                    //ugu shub

                    if (option == 2) {
                        System.out.println("soogali Mobile-ka");
                        number = input.nextLong();
                        System.out.println("soo gali lacag");
                        money = input.nextLong();
                        System.out.println("Ma hubtaa inaad \n$" + money + " ugu shubeesid\nnumberka" + number + "?");
                        System.out.println("1.Haa");
                        System.out.println("2.Maya");
                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("Waxaad $" + money + " ugu shubtay \n" + number + "\nharaagaagu waa $" + (haraa - money));
                        } else {
                            System.out.println("Waad ku mahadsantahay iska joojinta adeegaan");
                        }
                    }

                    //mifi
                    if (option == 3) {
                        System.out.println("EVCPlus");
                        System.out.println("1.Ku shubo Data-da MIFI");
                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("-- internet Bundle Recharge --");
                            System.out.println("1.Isbuucle(Weekly)");
                            System.out.println("2.Bille(MiFI)");
                            System.out.println("3.Maalinle(Daily)");

                            dooro = input.nextDouble();

                            if (dooro == 1) {
                                System.out.println("Fadlan dooro Bandle Week");
                                System.out.println("1.$5=10GB");
                                System.out.println("2.$10=25GB");

                                dooro = input.nextDouble();

                                if (dooro == 1) {
                                    System.out.println("Fadlan GelI MiFi user");
                                    MiFiuser = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $5 ugu shubtid " + MiFiuser + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    dooro = input.nextDouble();

                                    if (dooro == 1) {
                                        System.out.println("waxaad $5 ugu shubtay " + MiFiuser);
                                    } else {
                                        System.out.println("waad ku mahadsantahay inaad iska joojiso adeegaan");
                                    }
                                }

                                if (dooro == 2) {
                                    System.out.println("Fadlan GelI MiFi user");
                                    MiFiuser = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $10 ugu shubtid " + MiFiuser + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    dooro = input.nextDouble();

                                    if (dooro == 1) {
                                        System.out.println("waxaad $10 ugu shubtay " + MiFiuser);
                                    } else {
                                        System.out.println("waad ku mahadsantahay inaad\n iska joojiso adeegaan");
                                    }
                                }
                            }

                            if (dooro == 2) {
                                System.out.println("Fadlan dooro bundle ka ");
                                System.out.println("1. $20 = 40 GB");
                                System.out.println("2. $40 = 85 GB");
                                System.out.println("3. $60 = 150 GB");
                                System.out.println("4. $30 = Monthly Unlimit");

                                dooro = input.nextDouble();

                                if (dooro == 1) {
                                    System.out.println("Fadlan Gali MIFI user");
                                    MiFiuser = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $20 ugu shubtid " + MiFiuser + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    dooro = input.nextDouble();

                                    if (dooro == 1) {
                                        System.out.println("waxaad 20$ ugu shubtay " + MiFiuser);
                                    } else {
                                        System.out.println("waad ku mahadsantahay inaad iska joojisay adeegaan");
                                    }
                                }
                            }
                        }
                    }
                }

                //  QEYBTA BIXI BILLKA
                double aqoonsi;
                double bill = 100;
                double haaye;
                if (options == 3) {
                    System.out.println("Bixi Bill");
                    System.out.println("1. Post Paid");
                    System.out.println("2. Ku iibso");
                    dooro = input.nextDouble();

                    if (dooro == 1) {
                        System.out.println("Post Paid:");
                        System.out.println("1. Ogow biilka");
                        System.out.println("2. Bixi biil");
                        System.out.println("3. Ka bixi biil");
                        dooro = input.nextInt();

                        //ogow biilka
                        if (dooro == 1) {
                            System.out.println("Haraagaa biilka waa $" + bill);
                        } else if (dooro == 2) {
                            System.out.println("Fadlan aqoonsiga soo gali");
                            aqoonsi = input.nextDouble();

                            System.out.println("Fadlan Geli Number-ka");
                            number = input.nextLong();

                            System.out.println("Fadlan Gali lacagta");
                            money = input.nextLong();

                            if (money <= bill) {
                                System.out.println("Ma hubtaa inaad $" + money + " udirto " + number + "?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                dooro = input.nextInt();

                                if (dooro == 1) {
                                    haaye = bill - money;
                                    System.out.println("Waad ku guuleystay howshaan\nHaraagaagu waa $" + haaye);
                                } else {
                                    System.out.println("Mahadsanid!");
                                }
                            } else {
                                System.out.println("Lacagta aad gelisay waa ka badan tahay biilka. Fadlan hubi.");
                            }
                        } else if (dooro == 3) {
                            System.out.println("Adeegga 'ka bixi biil' wali lama dhameystirin.");
                        } else {
                            System.out.println("Doorasho aan sax ahayn");
                        }
                    } else if (dooro == 2) {
                        System.out.println("Adeegga 'Ku iibso' wali lama shaqeynin.");
                    } else {
                        System.out.println("Doorasho khaldan.");
                    }
                }


                // qeybta wareejinta lacagta
                else if (options == 4) {
                    System.out.println("Fadlan Geli Mobile-ka");
                    number = input.nextLong();

                    System.out.println("Fadlan soo gali lacagta");
                    money = input.nextLong();

                    System.out.println("Ma hubtaa in aad $" + money + " u wareejineesid " + number + "?");
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    dooro = input.nextDouble();

                    if (dooro == 1) {
                        haraa -= money;// Haraaga ha isbedelo
                        System.out.println("[-EVCPlus-] $" + money + "\nAyaad u wareejisay " + number +
                                "\nHaraagaaga EVCPLUS waa $" + haraa +
                                "\n20 sano oo adeeg bulsho ah");
                    } else {
                        System.out.println("Waad ku guuleysatay inaad iska joojiso adeegaan");
                    }
                }

                //qeybta warbixin kooban
                String gmail;
                int date;
                if (options == 5) {
                    System.out.println("Warbixin Kooban");
                    System.out.println("1. Last Action");
                    System.out.println("2. Wareejintii u dambeysay");
                    System.out.println("3. Iibsashadii u dambeysay");
                    System.out.println("4. Last 3 actions");
                    System.out.println("5. Email me my activity");

                    option = input.nextDouble();

                    if (option == 1) {
                        System.out.println("$20 ayaad uwareejisay +2526000000");
                    } else if (option == 2) {
                        System.out.println("Statementiga:");
                        System.out.println("1. U dirtay");
                        System.out.println("2. Ka heshay");
                        dooro = input.nextDouble();

                        if (dooro == 1) {
                            System.out.println("Soo Gali Numberka");
                            number = input.nextLong();
                            System.out.println("Waan ka xunahay wax lacag ah uma aadan dirin " + number);
                        } else if (dooro == 2) {
                            System.out.println("Soo Gali Numberka");
                            number = input.nextLong();
                            System.out.println("Waan ka xunnahay wax lacag ah kuuma uusan soo dirin " + number);
                        } else {
                            System.out.println("Doorasho aan sax ahayn");
                        }
                    } else if (option == 3) {
                        System.out.println("Fadlan geli aqoonsiga ganacsiga");
                        aqoonsi = input.nextDouble();
                        System.out.println("No paying options");
                    } else if (option == 4) {
                        System.out.println("Your mini statement has been sent as SMS to your registered mobile no.");
                    } else if (option == 5) {
                        input.nextLine();
                        System.out.println("Fadlan soo gali Gmail kaaga");
                        gmail = input.nextLine();
                        System.out.println("Soo gali date-ka dabe (maalin/bisha/sanadka) sida 30/10/2019");
                        date = input.nextInt();
                        System.out.println("Your request is being processed and the activity will be emailed to " + gmail);
                    } else {
                        System.out.println("Doorasho aan sax ahayn");
                    }
                    //salaam bank
                } else if (options == 6) {
                    System.out.println("Salaam Bank");
                    System.out.println("1. Itus Haraagaaga");
                    System.out.println("2. Lacag Dhigasho");
                    System.out.println("3. Lacag Qaadahso");
                    System.out.println("4. Ka wareeji EVCP-lus");
                    System.out.println("5. U wareeji Account to Account");
                    System.out.println("6. Maareynta Bank-ga");
                    System.out.println("7. Kala bax");

                    int SalaamBank_Options = input.nextInt();
                    int Bank_PIN_Number = 1234;
                    int Bank_Number = 772299;
                    double Bank_Balance = 6000;
                    String Bank_Account_Holder = "abdi aziiz isack";

                    //itus haraaga
                    if (SalaamBank_Options == 1) {
                        System.out.println("Fadlan Geli Number-kaga sirta ee Bank-ga");
                        int Bank_PIN_Code = input.nextInt();

                        if (Bank_PIN_Code == Bank_PIN_Number) {
                            System.out.println("Koontada Bank-ga: " + Bank_Number + " - " + Bank_Account_Holder +
                                    "\nHaraagaagu waa $" + Bank_Balance + " USD");
                        } else {
                            System.out.println("Incorrect Bank Password");
                        }

                        //lacah dhigasho
                    } else if (SalaamBank_Options == 2) {
                        System.out.println("Fadlan Geli Lacagta: ");
                        double LacagDhigasho = input.nextDouble();
                        input.nextLine();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        String Maclumad = input.nextLine();
                        System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                        int Bank_PIN_Code = input.nextInt();

                        if (Bank_PIN_Code == Bank_PIN_Number) {
                            System.out.println("Ma hubtaa inaad $" + LacagDhigasho + " dhigatid Accountkaga Bank-ga?");
                            System.out.println("1. Haa  2. Maya");
                            int confirm = input.nextInt();

                            if (confirm == 1) {
                                double NewBalance = Bank_Balance + LacagDhigasho;
                                System.out.println("Waxaad ku guuleysatay inaad $" + LacagDhigasho +
                                        " dhigatid Bank-ka " + Bank_Number +
                                        "\nHaraagaaga cusub waa $" + NewBalance);
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        } else {
                            System.out.println("Incorrect PIN");
                        }
                        //lacah qaadasho
                    } else if (SalaamBank_Options == 3) {
                        System.out.println("Fadlan Soo Geli Lacagta:");
                        double Lacag_Qaadasho = input.nextDouble();
                        input.nextLine();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        String Qadasho_Maclumad = input.nextLine();
                        System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                        int Bank_PIN_Code = input.nextInt();

                        if (Bank_PIN_Code == Bank_PIN_Number) {
                            if (Bank_Balance < Lacag_Qaadasho) {
                                System.out.println("Haraagaaga koontadu kuguma filna");
                            } else {
                                System.out.println("Ma hubtaa inaad $" + Lacag_Qaadasho + " ka qaadatid Account-kaga?");
                                System.out.println("1. Haa  2. Maya");
                                int confirm = input.nextInt();

                                if (confirm == 1) {
                                    double newBalance = Bank_Balance - Lacag_Qaadasho;
                                    System.out.println("Waxaad ku guuleysatay inaad $" + Lacag_Qaadasho +
                                            " ka qaadatid\nHaraaga cusub waa $" + newBalance);
                                } else {
                                    System.out.println("Mahadsanid");
                                }
                            }
                        } else {
                            System.out.println("Incorrect PIN");
                        }

                        //ka wareeji evc plus
                    } else if (SalaamBank_Options == 4) {
                        System.out.println("Ka wareeji EVCPlus:");
                        System.out.println("1. Salaam Somali Bank");
                        System.out.println("2. Salaam SCH");
                        System.out.println("3. Bank Beeraha");
                        System.out.println("4. Daarusalam Bank");
                        System.out.println("5. MyBank LTD");

                        int Ka_Wareeji_Options = input.nextInt();

                        if (Ka_Wareeji_Options >= 1 && Ka_Wareeji_Options <= 5) {
                            System.out.println("Fadlan Geli Account-kaga");
                            int Account_Number = input.nextInt();
                            input.nextLine();
                            System.out.println("Fadlan Geli Macluumaad: ");
                            String Maclumad = input.nextLine();
                            System.out.println("Xogtaada waa la helay laakiin weli adeegga si buuxda looma dhameystirin.");
                        } else {
                            System.out.println("Selection Error: Fadlan Dooro Number-ka (1 - 5)");
                        }

                        //u wareeji account
                    } else if (SalaamBank_Options == 5) {
                        System.out.println("Account to Account:");
                        System.out.println("Fadlan Geli Account ama Mobile Number: ");
                        int Account_Mobile = input.nextInt();
                        System.out.println("Fadlan Geli Lacagta: ");
                        double Lacagta_Account = input.nextDouble();
                        input.nextLine();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        String Maclumad = input.nextLine();
                        System.out.println("Fadlan Geli Number-ka sirta ah: ");
                        int BankPINCode = input.nextInt();

                        if (BankPINCode == Bank_PIN_Number) {
                            System.out.println("Ma hubtaa inaad $" + Lacagta_Account +
                                    " u wareejisid Account-ka " + Account_Mobile + "?");
                            System.out.println("1. Haa  2. Maya");
                            int confirm = input.nextInt();

                            if (confirm == 1) {
                                System.out.println("Waxaad ku guuleysatay inaad $" + Lacagta_Account +
                                        " u wareejisid " + Account_Mobile + "\nMahadsanid!");
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        } else {
                            System.out.println("Incorrect PIN Code");
                        }

                        //maareynta bankiga
                    } else if (SalaamBank_Options == 6) {
                        System.out.println("Fadlan Geli On-Time-Password-ga");
                        int OnTimePassword = input.nextInt();
                        System.out.println("Invalid");
                    }

                    // Maareynta Bank-ga (PIN & Password bedelid)
                    else if (SalaamBank_Options == 7) {
                        System.out.println("Maareynta Bank-ga:");
                        System.out.println("1. Bedel PIN-ka Bank-ga");
                        System.out.println("2. Bedel Password-ka E-Bank-ga");
                        int Maareynta_Bankga = input.nextInt();

                        if (Maareynta_Bankga == 1) {
                            System.out.println("Fadlan Geli PIN-kaaga Cusub ee koontada:");
                            int NewBank_PIN_Code = input.nextInt();
                            System.out.println("Ku celi PIN-kaaga cusub ee koontada:");
                            int Confirm_PIN_Code = input.nextInt();

                            if (NewBank_PIN_Code == Confirm_PIN_Code) {
                                System.out.println("Waxaad ku guuleysatay inaad bedesho PIN-ka sirta ah ee koontada Bank-ga.");
                            } else {
                                System.out.println("Confirm Password Not Matching");
                            }

                        } else if (Maareynta_Bankga == 2) {
                            System.out.println("Fadlan Geli PIN-ka Cusub ee koontada E-Bank:");
                            int NewE_Bank_PIN_Code = input.nextInt();
                            System.out.println("Ku celi PIN-ka cusub ee koontada:");
                            int Confirm_PIN_Code = input.nextInt();

                            if (NewE_Bank_PIN_Code == Confirm_PIN_Code) {
                                System.out.println("Waxaad ku guuleysatay inaad bedesho PIN-ka sirta ee koontada E-Bank.");
                            } else {
                                System.out.println("Confirm Password Not Matching");
                            }

                        } else {
                            System.out.println("Doorasho aan sax ahayn");
                        }
                    } else {
                        System.out.println("Selection Error: Fadlan Dooro (1 - 7)");
                    }

                    //maareynta
                } else if (options == 7) {
                    System.out.println("Maareynta");
                    System.out.println("1. Bedel lambarka sirta");
                    System.out.println("2. Bedel Luuqada");
                    System.out.println("3. Wargali Mobile Lumay");
                    System.out.println("4. Lacag Xirasho");
                    System.out.println("5. Uceli Lacag Qaldantay");
                    System.out.println("6. Enable Mobile Banking");

                    int dr = input.nextInt();


                    //edel lambarka sirta
                    if (dr == 1) {
                        System.out.println("Fadlan Geli PIN-kaaga cusub");
                        int newpin = input.nextInt();
                        System.out.println("Fadlan Hubi PIN-kaaga cusub");
                        int confirm = input.nextInt();

                        if (newpin == confirm) {
                            System.out.println("Waad ku guuleysatay inaad iska badasho PIN-ka.");
                        } else {
                            System.out.println("PIN-ka ma is waafaqayaan, fadlan isku day mar kale.");
                        }

                        //Bedel Luuqada
                    } else if (dr == 2) {
                        System.out.println("Fadlan dooro Luuqada");
                        System.out.println("1. SOMALI");
                        System.out.println("2. ENGLISH");

                        int luuqad = input.nextInt();

                        if (luuqad == 1) {
                            System.out.println("Waad ku guuleysatay inaad iska bedeshay luuqada Somali.");
                        } else if (luuqad == 2) {
                            System.out.println("Congrats! You have changed your language to English.");
                        } else {
                            System.out.println("Doorasho luuqad khaldan, fadlan isku day mar kale.");
                        }

                        //Lacag Xirasho
                    } else if (dr == 3) {
                        System.out.println("Fadlan Geli Mobile-ka lumay");
                        long nm = input.nextLong();
                        System.out.println("Waxaa lagu wargelin doonaa in number-ka " + nm + " uu yahay mid la diiwaangeliyey lumitaan.");

                    } else if (dr == 4) {
                        System.out.println("Fadlan Geli Number-ka Khaladka ah");
                        long wrong_num = input.nextLong();
                        System.out.println("Fadlan Geli Number-kii Loo Rabay");
                        long nu = input.nextLong();
                        System.out.println("Fadlan Geli Macluumaad (1 = Haa, 2 = Maya)");
                        int macluumaad = input.nextInt();

                        if (macluumaad == 1) {
                            System.out.println("Ma hubtaa inaad xirto lacagtaan?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm = input.nextInt();
                            if (confirm == 1) {
                                System.out.println("Lacagta waa la xiray.");
                            } else {
                                System.out.println("Lacagta lama xirin.");
                            }
                        } else {
                            System.out.println("Wax ficil ah lagama qaadin.");
                        }

                        //Uceli Lacag Qaldantay
                    } else if (dr == 5) {
                        System.out.println("Fadlan Geli Aqoonsiga Lacag Dirida");
                        int Aqoonsigalacag_dirida = input.nextInt();
                        System.out.println("Waad ku mahadsan tahay codsigaaga.");

                        //Enable Mobile Banking
                    } else if (dr == 6) {
                        System.out.println("Fadlan Geli Number-ka is-diiwaangelinta");
                        long nu = input.nextLong();
                        System.out.println("Mobile Banking waa la hawlgaliyay.");

                    } else {
                        System.out.println("Doorasho khaldan, fadlan isku day mar kale.");
                    }
                }



                //BILL PAYMENTS
                int bil = input.nextInt();
                if (options == 8) {
                    System.out.println("EVCPlus");
                    System.out.println("1.Itus Haraaga Bill ka");
                    System.out.println("2.Wada bixi Bill ka");
                    System.out.println("3.Qayb Ka Bixi Bill ka");

                    int opt = input.nextInt();

                    //Itus Haraaga Bill ka
                    if (opt == 1) {
                        System.out.println("Fadlan gali bill reference number");
                        String reference = input.next();
                        System.out.println("Fadlan dooro nooca biilka:");

                        for (int i = 0; i < bil; i++) {
                            System.out.println((i + 1) + ". " + BILL_TYPES[i]);
                        }

                        int billType = input.nextInt();

                        if (billType > 0 && billType <= BILL_TYPES.length) {
                            System.out.println("Haraaga biilka " + BILL_TYPES[billType - 1] +
                                    " ee lambarka " + reference + " waa $100");
                        } else {
                            System.out.println("Invalid bill type selected");
                        }


                        //Wada bixi Bill ka
                    } else if (opt == 2) {
                        System.out.println("Fadlan gali bill reference number");
                        String reference = input.next();
                        System.out.println("Fadlan dooro nooca biilka:");

                        for (int i = 0; i < BILL_TYPES.length; i++) {
                            System.out.println((i + 1) + ". " + BILL_TYPES[i]);
                        }

                        int billType = input.nextInt();

                        if (billType > 0 && billType <= BILL_TYPES.length) {
                            System.out.println("Ma hubtaa inaad wada bixid biilka " +
                                    BILL_TYPES[billType - 1] + " ee $100?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int confirm = input.nextInt();

                            if (confirm == 1) {
                                System.out.println("Biilka ayaa loo bixiyay. Mahadsanid!");
                            } else if (confirm == 2) {
                                System.out.println("Bixinta biilka waa la joojiyay");
                            } else {
                                System.out.println("Doorasho khaldan.");
                            }
                        } else {
                            System.out.println("Invalid bill type selected");
                        }

                        //Qayb Ka Bixi Bill ka
                    } else if (opt == 3) {
                        System.out.println("Fadlan gali bill reference number");
                        String reference = input.next();
                        System.out.println("Fadlan dooro nooca biilka:");

                        for (int i = 0; i < BILL_TYPES.length; i++) {
                            System.out.println((i + 1) + ". " + BILL_TYPES[i]);
                        }

                        int billType = input.nextInt();

                        if (billType > 0 && billType <= BILL_TYPES.length) {
                            System.out.println("Fadlan geli qadarka aad rabto inaad bixiso:");
                            double amount = input.nextDouble();

                            if (amount > haraa) {
                                System.out.println("Haraagaagu kuguma filna. Haraagaagu waa $" + haraa);
                            } else {
                                System.out.println("Ma hubtaa inaad bixiso $" + amount +
                                        " biilka " + BILL_TYPES[billType - 1] + "?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");

                                int confirm = input.nextInt();

                                if (confirm == 1) {
                                    System.out.println("Waxaad ku guuleysatay inaad bixiso $" +
                                            amount + " biilka " + BILL_TYPES[billType - 1]);
                                    System.out.println("Haraagaaga cusub waa $" + (haraa - amount));
                                } else if (confirm == 2) {
                                    System.out.println("Bixinta biilka waa la joojiyay");
                                } else {
                                    System.out.println("Doorasho khaldan.");
                                }
                            }
                        } else {
                            System.out.println("Invalid bill type selected");
                        }

                    } else {
                        System.out.println("Invalid option selected");
                    }
                }

            }
        }
    }
    private static final String[] BILL_TYPES = {
            "Electricity",
            "Water",
            "Internet",
            "TV Subscription"
    };
}


