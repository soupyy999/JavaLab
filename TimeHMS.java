class TimeHMS {
    int hrs, min, sec;

    TimeHMS(int h, int m, int s) {
        hrs = h;
        min = m;
        sec = s;
    }

    void add(TimeHMS t) {
        int s = this.sec + t.sec;
        int m = this.min + t.min + s / 60;
        int h = this.hrs + t.hrs + m / 60;

        System.out.println(h + ":" + (min % 60) + ":" + (sec % 60));
    }

    public static void main(String[] args) {
        TimeHMS t1 = new TimeHMS(2, 45, 50);
        TimeHMS t2 = new TimeHMS(1, 30, 20);

        t1.add(t2);
    }
}
