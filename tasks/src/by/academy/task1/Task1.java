package by.academy.task1;


public class Task1 {
    static byte ag;
    static short bg;
    static int cg;
    static long dg;
    static float eg;
    static double fg;
    static char chg;
    static String sg;

    public static String getSg() {
        return sg;
    }

    public static void setSg(String sg) {
        Task1.sg = sg;
    }

    public static char getChg() {
        return chg;
    }


    public static void setChg(char chg) {
        Task1.chg = chg;
    }

    public static byte getAg() {
        return ag;
    }

    public static void setAg(byte ag) {
        Task1.ag = ag;
    }

    public static short getBg() {
        return bg;
    }

    public static void setBg(short bg) {
        Task1.bg = bg;
    }

    public static int getCg() {
        return cg;
    }

    public static void setCg(int cg) {
        Task1.cg = cg;
    }

    public static long getDg() {
        return dg;
    }

    public static void setDg(long dg) {
        Task1.dg = dg;
    }

    public static float getEg() {
        return eg;
    }

    public static void setEg(float eg) {
        Task1.eg = eg;
    }

    public static double getFg() {
        return fg;
    }

    public static void setFg(double fg) {
        Task1.fg = fg;
    }

    public static void main(String[] args) {
        byte al;
        short bl;
        int cl;             //Почему я не могу создать геттеры и сеттеры в методе мейн для локальных переменных?
        long dl;
        float el;
        double fl;
        char gl;

        Byte bte;
        Integer integr;
        Short shrt;
        Long lng;
        Float flt;
        Double dbl;
        Character chr;
        Boolean bln = true;


        Task1.setAg((byte) 98);
        Task1.setBg((short) 130);
        Task1.setCg(549845);
        Task1.setDg(46843215);
        Task1.setEg((float) 3.1255);
        Task1.setFg(3.116848);
        Task1.setChg(('b'));


        System.out.println("Global variables are: ");
        System.out.println();
        System.out.println("Variable ag is: " + Task1.getAg());
        System.out.println("Variable bg is: " + Task1.getBg());
        System.out.println("Variable cg is: " + Task1.getCg());
        System.out.println("Variable dg is: " + Task1.getDg());
        System.out.println("Variable eg is: " + Task1.getEg());
        System.out.println("Variable fg is: " + Task1.getFg());
        System.out.println("Variable chg is: " + Task1.getChg());
        System.out.println();


        al = Task1.getAg();
        bl = Task1.getBg();
        cl = Task1.getCg();
        dl = Task1.getDg();
        el = Task1.getEg();
        fl = Task1.getFg();
        gl = Task1.getChg();


        System.out.println("Local variables are: ");
        System.out.println();
        System.out.println("Variable al is: " + al);
        System.out.println("Variable bl is: " + bl);
        System.out.println("Variable cl is: " + cl);
        System.out.println("Variable dl is: " + dl);
        System.out.println("Variable el is: " + el);
        System.out.println("Variable fl is: " + fl);
        System.out.println("Variable gl is: " + gl);
        System.out.println();


        Task1.setAg((byte) bg);  //установить значение ag(byte) из bg (short) преобразовывая в byte
        System.out.println("ag (byte) is: " + Task1.getAg());
        Task1.setBg((short) cg);
        System.out.println("bg (short) is: " + Task1.getBg());
        Task1.setCg((int) dg);
        System.out.println("cg (int) is: " + Task1.getCg());
        Task1.setEg((float) fl);
        System.out.println("eg (float) is: " + Task1.getEg());
        System.out.println();


        bte = Task1.getAg();
        shrt = Task1.getBg();
        integr = Task1.getCg();
        lng = Task1.getDg();
        flt = Task1.getEg();
        dbl = Task1.getFg();
        chr = Task1.getChg();


        System.out.println("integer is: " + integr);
        System.out.println("bte is: " + bte);
        System.out.println("shrt is: " + shrt);
        System.out.println("lng is: " + lng);
        System.out.println("flt is: " + flt);
        System.out.println("dbl is: " + dbl);
        System.out.println("chr is: " + chr);
        System.out.println("bln is: " + bln);



        shrt = (short)bte;
        integr = (int)shrt;
        lng = (long)integr;
        
        System.out.println("bte => shrt: " + shrt);
        System.out.println("shrt => integr " + integr);


    }


}
