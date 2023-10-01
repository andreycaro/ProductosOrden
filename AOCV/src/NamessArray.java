import java.util.Arrays;

public class NamessArray {

    public static void main(String[] args) {
        // 1. Crear un array de cadenas llamado `nombres` con un tamaño de 5.
        String[] names = new String[20];

        // 2. Inicializar el array con los nombres "Ana", "Carlos", "Laura", "José" y "Sofía".
        names[0] = "Shampoo";
        names[1] = "Yogurt";
        names[2] = "Detergentes";
        names[3] = "Gatos";
        names[4] = "Chocolateria";
        names[5] = "Perros";
        names[6] = "Pastas";
        names[7] = "Lavaloza";
        names[8] = "Ambientadores";
        names[9] = "Cafe";
        names[10] = "Desodorantes";
        names[11] = "Helados";
        names[12] = "Pañales";
        names[12] = "Gaseosas";
        names[13] = "Aceites";
        names[14] = "Desechables";
        names[15] = "Alimentacion";
        names[16] = "Leches";
        names[17] = "Cereales";
        names[18] = "Quesos";
        names[19] = "Reposteria";


        // 3. Imprimir los elementos del array.
        System.out.print("Nombres: ");
        for (String name : names) {
            System.out.print(names + " ");
        }
        System.out.println();

        // 4. Imprimir los nombres que empiezan con la letra "A".
        System.out.print("Nombres que empiezan con 'C': ");
        for (String name : names) {
            if (name.startsWith("C")) {
                System.out.print(name + " ");
            }
        }
        System.out.println();

        // 5. Ordenar e imprimir los nombres en orden alfabético.
        Arrays.sort(names);
        System.out.print("Nombres ordenados alfabéticamente: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

