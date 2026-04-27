class DistanceAdditionCM {
    int meter, cm;

    DistanceAdditionCM(int meter, int cm) {
        this.meter = meter;
        this.cm = cm;
    }

    void add(DistanceAdditionCM d) {
        int cm = this.cm + d.cm;
        int meter = this.meter + d.meter + cm / 100;

        System.out.println(meter + "m " + (cm % 100) + "cm");
    }

    public static void main(String[] args) {
        DistanceAdditionCM d1 = new DistanceAdditionCM(2, 80);
        DistanceAdditionCM d2 = new DistanceAdditionCM(3, 50);

        d1.add(d2);
    }
}
