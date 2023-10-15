import java.util.Scanner;
public class CalculMoyenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'étudiants (inférieur à " + Tab.NMAX + "): ");
        int nb = scanner.nextInt();

        if (nb <= 0 || nb >= Tab.NMAX) {
            System.out.println("Le nombre d'étudiants doit être un entier positif et inférieur à " + Tab.NMAX);
            return;
        }

        float[] noteCtrl = new float[nb];
        float[] noteExam = new float[nb];

        System.out.println("Saisie des notes de contrôle :");
        Tab.remplire(noteCtrl);

        System.out.println("Saisie des notes d'examen :");
        Tab.remplire(noteExam);

        float[] moy = new float[nb];
        for (int i = 0; i < nb; i++) {
            moy[i] = (noteCtrl[i] + 2 * noteExam[i]) / 3;
        }

        System.out.println("Moyennes des étudiants :");
        Tab.lister(moy);

        float[] Bonus = new float[nb];
        for (int i = 0; i < Bonus.length; i++) {
            Bonus[i] = 1.5f;
        }
        float[] moyAvecBonus = new float[nb];
        for (int i = 0; i < nb; i++) {
            moyAvecBonus[i] = moy[i] + Bonus[i];
        }

        System.out.println("Moyennes avec bonus de 1.5 :");
        Tab.lister(moyAvecBonus);
    }
}
