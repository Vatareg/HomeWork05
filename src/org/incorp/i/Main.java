package org.incorp.i;

public class Main {

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];

        empl[0] = new Employee("0_Lim", "Lum", "Lam", "LimLumLam@mail.org", "8(920)920-90-20", 7500, 33);
        empl[1] = new Employee("1_Kim", "Kam", "Kum", "KimKamKum@mail.org", "8(920)920-20-90", 7400, 32);
        empl[2] = new Employee("2_Sun", "San", "Sen", "SunSanSen@mail.org", "8(920)920-90-10", 7900, 41);
        empl[3] = new Employee("3_Vun", "Van", "Ven", "VunVanVen@mail.org", "8(920)920-80-10", 7900, 42);
        empl[4] = new Employee("4_Sur", "Sar", "Ser", "SurSarSer@mail.org", "8(920)920-70-70", 27900, 81);
        for (int i = 0; i < empl.length; i++) {
            if(empl[i].getAge()>40){
                System.out.println(empl[i]);
            }


        }
    }
}
