class TimeHM {
    int hours, minutes;

    TimeHM(int h, int m) {
        hours = h;
        minutes = m;
    }

    void add(TimeHM t) {
        int min = this.minutes + t.minutes;
        int hr = this.hours + t.hours + min / 60;

        System.out.println(hr + " hr " + (min % 60) + " min");
    }

    public static void main(String[] args) {
        TimeHM t1 = new TimeHM(3, 40);
        TimeHM t2 = new TimeHM(2, 30);

        t1.add(t2);
    }
}
