import java.util.*;

public class Bagian2 {
    
    public static void main(String[] args) {

        ArrayList<Integer> kelas01 = new ArrayList<Integer>();
        ArrayList<Integer> kelas02 = new ArrayList<Integer>();
        ArrayList<Integer> kelas03 = new ArrayList<Integer>();
        ArrayList<Integer> kelas04 = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);

        int input;

        do {
            System.out.println("Pilihan Menu\n1. Input Nilai\n2. Lihat Nilai\n3. Data Yang Di Inginkan\n4. Keluar");
            System.out.print("Masukan Pilihan : ");
            input = s.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Pilih Kelas\n1. Kelas 01\n2. Kelas 02\n3. Kelas 03\n4. Kelas 04");
                    System.out.print("Masukan Pilihan : ");
                    int kelas = s.nextInt();
                    System.out.print("Masukkan Nilai : ");
                    int nilai = s.nextInt();

                    switch (kelas) {
                        case 1:
                            kelas01.add(nilai);
                            break;
                        case 2:
                            kelas02.add(nilai);
                            break;
                        case 3:
                            kelas03.add(nilai);
                            break;
                        case 4:
                            kelas04.add(nilai);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Pilih Kelas Yang Ingin Dilihat Nilainya :\n1. Kelas 01\n2. Kelas 02\n3. Kelas 03\n4. Kelas 04");
                    System.out.print("Masukan Pilihan : ");
                    int kelasLihat = s.nextInt();

                    switch (kelasLihat) {
                        case 1:
                            System.out.println("Nilai Kelas 01 : ");
                            for (int i : kelas01) {
                                System.out.println(i);
                            }
                            break;
                        case 2: 
                            System.out.println("Nilai Kelas 02 : ");
                            for (int i : kelas02) {
                                System.out.println(i);
                            }
                            break;
                        case 3:
                            System.out.println("Nilai Kelas 03 : ");
                            for (int i : kelas03) {
                                System.out.println(i);
                            }
                            break;
                        case 4:
                            System.out.println("Nilai Kelas 04 : ");
                            for (int i : kelas04) {
                                System.out.println(i);
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Pilh Yang Diinginkan :");
                    System.out.println("1. Rata - Rata\n2. Nilai Tertinggi\n3. Nilai Terendah");
                    System.out.print("Masukan Pilihan : ");
                    int pilihFitur = s.nextInt();

                    switch (pilihFitur) {
                        case 1:
                            System.out.println("Pilih Kelas Yang Ingin Dilihat Rata-Ratanya :\n1. Kelas 01\n2. Kelas 02\n3. Kelas 03\n4. Kelas 04");
                            System.out.print("Masukan Pilihan : ");
                            int kelasRata = s.nextInt();

                            switch (kelasRata) {
                                case 1:
                                    if (!kelas01.isEmpty()) {
                                        double total01 = 0;
                                        for (int i : kelas01) {
                                            total01 += i;
                                        }
                                        double rata01 = total01 / kelas01.size();
                                        System.out.println("Rata - Rata Kelas 01 : " + rata01);
                                    } else {
                                        System.out.println("Kelas 01 tidak memiliki nilai.");
                                    }
                                    break;
                                case 2:
                                    if (!kelas02.isEmpty()) {
                                        double total02 = 0;
                                        for (int i : kelas02) {
                                            total02 += i;
                                        }
                                        double rata02 = total02 / kelas02.size();
                                        System.out.println("Rata - Rata Kelas 02 : " + rata02);
                                    } else {
                                        System.out.println("Kelas 02 tidak memiliki nilai.");
                                    }
                                    break;
                                case 3:
                                    if (!kelas03.isEmpty()) {
                                        double total03 = 0;
                                        for (int i : kelas03) {
                                            total03 += i;
                                        }
                                        double rata03 = total03 / kelas03.size();
                                        System.out.println("Rata - Rata Kelas 03 : " + rata03);
                                    } else {
                                        System.out.println("Kelas 03 tidak memiliki nilai.");
                                    }
                                    break;
                                case 4:
                                    if (!kelas04.isEmpty()) {
                                        double total04 = 0;
                                        for (int i : kelas04) {
                                            total04 += i;
                                        }
                                        double rata04 = total04 / kelas04.size();
                                        System.out.println("Rata - Rata Kelas 04 : " + rata04);
                                    } else {
                                        System.out.println("Kelas 04 tidak memiliki nilai.");
                                    }
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Pilihan :\n1. Antar Kelas\n2. Kelas Yang Dipilih");
                            int pilihNilaiTertinggi = s.nextInt();

                            switch (pilihNilaiTertinggi) {
                                case 1:
                                    int max01 = !kelas01.isEmpty() ? Collections.max(kelas01) : Integer.MIN_VALUE;
                                    int max02 = !kelas02.isEmpty() ? Collections.max(kelas02) : Integer.MIN_VALUE;
                                    int max03 = !kelas03.isEmpty() ? Collections.max(kelas03) : Integer.MIN_VALUE;
                                    int max04 = !kelas04.isEmpty() ? Collections.max(kelas04) : Integer.MIN_VALUE;

                                    Integer[] max = {max01, max02, max03, max04};

                                    int maxNilai = Collections.max(Arrays.asList(max));

                                    System.out.println("Nilai Tertinggi Antar Kelas: " + maxNilai);
                                    break;
                                case 2:
                                    System.out.println("Pilih Kelas : \n1. Kelas 01\n2. Kelas 02\n3. Kelas 03\n4. Kelas 04");
                                    int pilihKelasTertinggi = s.nextInt();

                                    switch (pilihKelasTertinggi) {
                                        case 1:
                                            if (!kelas01.isEmpty()) {
                                                System.out.println("Nilai Tertinggi Kelas 01: " + Collections.max(kelas01));
                                            } else {
                                                System.out.println("Kelas 01 tidak memiliki nilai.");
                                            }
                                            break;
                                        case 2:
                                            if (!kelas02.isEmpty()) {
                                                System.out.println("Nilai Tertinggi Kelas 02: " + Collections.max(kelas02));
                                            } else {
                                                System.out.println("Kelas 02 tidak memiliki nilai.");
                                            }
                                            break;
                                        case 3:
                                            if (!kelas03.isEmpty()) {
                                                System.out.println("Nilai Tertinggi Kelas 03: " + Collections.max(kelas03));
                                            } else {
                                                System.out.println("Kelas 03 tidak memiliki nilai.");
                                            }
                                            break;
                                        case 4:
                                            if (!kelas04.isEmpty()) {
                                                System.out.println("Nilai Tertinggi Kelas 04: " + Collections.max(kelas04));
                                            } else {
                                                System.out.println("Kelas 04 tidak memiliki nilai.");
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Pilihan :\n1. Antar Kelas\n2. Kelas Yang Dipilih");
                            int pilihNilaiTerendah = s.nextInt();

                            switch (pilihNilaiTerendah) {
                                case 1:
                                    int min01 = !kelas01.isEmpty() ? Collections.min(kelas01) : Integer.MAX_VALUE;
                                    int min02 = !kelas02.isEmpty() ? Collections.min(kelas02) : Integer.MAX_VALUE;
                                    int min03 = !kelas03.isEmpty() ? Collections.min(kelas03) : Integer.MAX_VALUE;
                                    int min04 = !kelas04.isEmpty() ? Collections.min(kelas04) : Integer.MAX_VALUE;

                                    Integer[] min = {min01, min02, min03, min04};

                                    int minNilai = Collections.min(Arrays.asList(min));

                                    System.out.println("Nilai Terendah Antar Kelas: " + minNilai);
                                    break;
                                case 2:
                                    System.out.println("Pilih Kelas : \n1. Kelas 01\n2. Kelas 02\n3. Kelas 03\n4. Kelas 04");
                                    int pilihKelasTerendah = s.nextInt();

                                    switch (pilihKelasTerendah) {
                                        case 1:
                                            if (!kelas01.isEmpty()) {
                                                System.out.println("Nilai Terendah Kelas 01: " + Collections.min(kelas01));
                                            } else {
                                                System.out.println("Kelas 01 tidak memiliki nilai.");
                                            }
                                            break;
                                        case 2:
                                            if (!kelas02.isEmpty()) {
                                                System.out.println("Nilai Terendah Kelas 02: " + Collections.min(kelas02));
                                            } else {
                                                System.out.println("Kelas 02 tidak memiliki nilai.");
                                            }
                                            break;
                                        case 3:
                                            if (!kelas03.isEmpty()) {
                                                System.out.println("Nilai Terendah Kelas 03: " + Collections.min(kelas03));
                                            } else {
                                                System.out.println("Kelas 03 tidak memiliki nilai.");
                                            }
                                            break;
                                        case 4:
                                            if (!kelas04.isEmpty()) {
                                                System.out.println("Nilai Terendah Kelas 04: " + Collections.min(kelas04));
                                            } else {
                                                System.out.println("Kelas 04 tidak memiliki nilai.");
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih, keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (input != 4);
    }
}
