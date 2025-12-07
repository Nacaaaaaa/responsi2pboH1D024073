class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] daftarMesin = new defaultMesin[5];
        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin mesin : daftarMesin) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.printf("Performa: %.1f%n%n", mesin.nilaiPerforma());
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin mesin : daftarMesin) {
            if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin mesinTertinggi = daftarMesin[0];
        double performaTertinggi = mesinTertinggi.nilaiPerforma();

        for (int i = 1; i < daftarMesin.length; i++) {
            if (daftarMesin[i].nilaiPerforma() > performaTertinggi) {
                performaTertinggi = daftarMesin[i].nilaiPerforma();
                mesinTertinggi = daftarMesin[i];
            }
        }
        System.out.printf("%s -> %.1f%n", mesinTertinggi.namaMesin, performaTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        int n = daftarMesin.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarMesin[j].nilaiPerforma() < daftarMesin[j + 1].nilaiPerforma()) {
                    defaultMesin temp = daftarMesin[j];
                    daftarMesin[j] = daftarMesin[j + 1];
                    daftarMesin[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3 && i < daftarMesin.length; i++) {
            System.out.printf("%d. %s -> %.1f%n", (i + 1), daftarMesin[i].namaMesin, daftarMesin[i].nilaiPerforma());
        }
    }
}
