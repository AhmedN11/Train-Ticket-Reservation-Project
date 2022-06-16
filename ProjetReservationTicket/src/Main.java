class Main {
    public static void main(String[] args) {
        
        ServiceTrain bbb = new ServiceTrain();
        
        Train trainUn = new Train("trainUn", 1, "Rabat", "Casablanca", 100, "50");
        Train trainDeux = new Train("trainDeux", 1, "Casablanca", "Rabat", 100, "50");
        Train trainTrois = new Train("trainTrois", 1, "Casablanca", "Tanger", 100, "50");
        Train trainQuatre = new Train("trainQuatre", 1, "Rabat", "Marrackech", 100, "50");
        Train trainCinq = new Train("trainCinq", 1, "Marrackech", "Casablanca", 100, "50");
        Train trainSix = new Train("trainSix", 1, "Marrackech", "Benguerir", 100, "50");
        
        bbb.getTrainDispo().add(trainUn);
        bbb.getTrainDispo().add(trainDeux);
        bbb.getTrainDispo().add(trainTrois);
        bbb.getTrainDispo().add(trainQuatre);
        bbb.getTrainDispo().add(trainCinq);
        bbb.getTrainDispo().add(trainSix);

        bbb.gettrains().add(trainUn);
        bbb.gettrains().add(trainDeux);
        bbb.gettrains().add(trainTrois);
        bbb.gettrains().add(trainQuatre);
        bbb.gettrains().add(trainCinq);
        bbb.gettrains().add(trainSix);
     
   
        

    }
}