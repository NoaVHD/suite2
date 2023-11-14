package fr.dampierre;

public class App {
    
    public static void main(String[] args) {
        int nbSuivent = 1;
        int nbPrecedent = 0;
        System.out.print(nbPrecedent+" "+nbSuivent);
        for(int i=1; i<=20; i++){
            nbPrecedent = nbSuivent;
            nbSuivent = nbPrecedent+nbSuivent;
            System.out.print(" "+nbSuivent);
        }



    }
    
}
