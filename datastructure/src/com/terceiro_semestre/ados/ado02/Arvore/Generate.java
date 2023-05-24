package com.terceiro_semestre.ados.ado02.Arvore;

public class Generate {
    public static int[] existing_ids = new int[0];

    public static Estudante randomEstudante() {
        String name = randomName();
        double exam01 = randomExamGrade();
        double exam02 = randomExamGrade();
        int absences = randomAbsences();
        int id = randomID();

        return new Estudante(name, exam01, exam02, absences, id);
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static double randomDouble(int min, int max) {
        return (Math.random() * (max - min) + min);
    }

    public static double randomExamGrade() {
        return randomDouble(0, 10);
    }

    public static int randomAbsences() {
        int CARGA_HORARIA = 72;
        return randomNumber(0, CARGA_HORARIA);
    }

    public static int randomID() {
        int randomId = randomNumber(0, 1000);

        for (int i : existing_ids) {
            boolean alreadyUsedID = (i == randomId);
            if (alreadyUsedID) {
                return Generate.randomID();
            }
        }

        int[] next_existing_ids = new int[existing_ids.length + 1];
        for (int i = 0; i < existing_ids.length; i++) {
            next_existing_ids[i] = existing_ids[i];
        }

        next_existing_ids[next_existing_ids.length - 1] = randomId;

        return randomId;
    }

    public static String randomName() {
        String[] firstNames = new String[] { "Marcos", "Julia", "João", "Maria", "Pedro", "Lucas", "Miguel", "Ana",
                "Luiza", "Larissa", "Leticia", "Luis", "Lucas", "Lucia" };
        String[] lastNames = new String[] { "Costa", "da Silva", "de Souza", "Pereira", "Alves", "Ribeiro", "Ferreira",
                "Rodrigues", "Gomes", "Martins", "Oliveira", "Carvalho", "Melo", "Santos" };

        return firstNames[Generate.randomNumber(0, firstNames.length)] + " "
                + lastNames[Generate.randomNumber(0, lastNames.length)];
    }
}
