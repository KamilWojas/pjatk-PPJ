package Zadanie1003;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double polePowierzchni() {
        return dlugosc * szerokosc;
    }

    public void show() {
        System.out.println("Pole powierzchni prostokata: " + polePowierzchni());
    }


    public static class Prostopadloscian extends Prostokat {
        private double wysokosc;

        public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
            super(dlugosc, szerokosc);
            this.wysokosc = wysokosc;
        }

        public double objetosc() {
            return polePowierzchni() * wysokosc;
        }

        @Override
        public void show() {
            super.show();
            System.out.println("Objetosc prostopadloscianu: " + objetosc());
        }
    }

    public static class Trojkat {
        private double bok;

        public Trojkat(double bok) {
            this.bok = bok;
        }

        public double polePowierzchni() {
            return (Math.sqrt(3) / 4) * bok * bok;
        }

        public void show() {
            System.out.println("Pole powierzchni trojkata: " + polePowierzchni());
        }


        public static class Ostroslup extends Trojkat {
            private double wysokosc;

            public Ostroslup(double bok, double wysokosc) {
                super(bok);
                this.wysokosc = wysokosc;
            }

            public double objetosc() {
                return (1.0 / 3.0) * polePowierzchni() * wysokosc;
            }

            @Override
            public void show() {
                super.show();
                System.out.println("Objetosc ostroslupa: " + objetosc());
            }
        }

        public static class Graniastoslup extends Trojkat {
            private double wysokosc;

            public Graniastoslup(double bok, double wysokosc) {
                super(bok);
                this.wysokosc = wysokosc;
            }

            public double objetosc() {
                return polePowierzchni() * wysokosc;
            }

            @Override
            public void show() {
                super.show();
                System.out.println("Objetosc graniastoslupa: " + objetosc());
            }

            public class Main {
                public static void main(String[] args) {
                    Prostokat prostokat = new Prostokat(5, 3);
                    prostokat.show();

                    Prostopadloscian prostopadloscian = new Prostopadloscian(5, 3, 4);
                    prostopadloscian.show();

                    Trojkat trojkat = new Trojkat(4);
                    trojkat.show();

                    Ostroslup ostroslup = new Ostroslup(4, 6);
                    ostroslup.show();

                    Graniastoslup graniastoslup = new Graniastoslup(4, 6);
                    graniastoslup.show();
                }
            }
        }
    }
}
