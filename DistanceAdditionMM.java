class DistanceAdditionMM {
    int meter, cm, mm;

    DistanceAdditionMM(int meter, int cm, int mm) {
        this.meter = meter;
        this.cm = cm;
        this.mm = mm;
    }

    DistanceAdditionMM add(DistanceAdditionMM d) {
        int mm = this.mm + d.mm;
        int cm = this.cm + d.cm + mm / 10;
        int meter = this.meter + d.meter + cm / 100;

        return new DistanceAdditionMM(meter, cm % 100, mm % 10);
    }

    void display() {
        System.out.println(meter + "m " + cm + "cm " + mm + "mm");
    }

    public static void main(String[] args) {
        DistanceAdditionMM d1 = new DistanceAdditionMM(1, 50, 5);
        DistanceAdditionMM d2 = new DistanceAdditionMM(2, 60, 8);

        DistanceAdditionMM result = d1.add(d2);
        result.display();
    }
}