public class App {
    public static void main(String[] args) throws Exception {
        
        SalesRep Sales1 = new SalesRep("prasad", "Kharche", 10, 25, 730, 25, 30000, 2,"Prasadk","123",30000);
        //System.out.println("individual comision of "+Sales1.firstName+" is  >>>"+Sales1.calculateComission());
        Sales1.profileVisit();
        SalesRep Sales2 = new SalesRep("Sahil", "G", 10, 25, 730, 25, 30000, 2,"sahilG","1234",30000);
        //System.out.println("individual comision of "+Sales2.firstName+" is  >>>"+Sales2.calculateComission());
        Sales2.profileVisit();
        SalesRep Sales3 = new SalesRep("Kunal", "K", 10, 25, 730, 25, 30000, 2,"KunalK","12345",30000);
        //System.out.println("individual comision of "+Sales3.firstName+" is  >>>"+Sales3.calculateComission());
        Sales3.profileVisit();

        SalesManager sm = new SalesManager("Vinit", "Siwach",45, 26, 730, 25, 30000, 2,"VinitS","121", 10000, Sales1.salesMade+Sales2.salesMade+Sales3.salesMade);
        //sm.calculateTotalComission();
        if(sm.login("VinitS", "121")){
            sm.profileVisit();
        }
        
    }
}
