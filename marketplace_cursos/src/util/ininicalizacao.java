package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import Cursos.Curso;

public class ininicalizacao {
    

    private static final String COMMA_DELIMITER = null;
    private static boolean add;

    public static ArrayList<Curso> inicialize() {
        ArrayList<Curso> cursos;
        List<List<String>> records = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader("book.csv"))) {
    String line;
    while ((line = br.readLine()) != null) {
        String[] values = line.split(COMMA_DELIMITER);
        add = cursos.add(new Curso(values));
    }
}
    }
}
