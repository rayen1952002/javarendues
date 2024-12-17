package levels;
import java.io.*;

import models.Subject;
import models.Teacher;
import utils.Data;

import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream().map(teacher -> teacher.getName().toUpperCase()).reduce((name1, name2) -> name1 + "#" + name2).orElse("");/* TO DO 1  hint(reduce)*/;

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream().filter(teacher -> teacher.getSubject().equals(Subject.JAVA)).filter(teacher -> teacher.getSalary() > 80000).collect(Collectors.toSet());/* TO DO 3 */;

        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toCollection(TreeSet::new));;

        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<Integer, List<Teacher>> map = teachers.stream().collect(Collectors.groupingBy(teacher -> teacher.getSubject().hashCode(), Collectors.toList()));
        /* TO DO 5 */;

        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream().collect(Collectors.groupingBy(
                teacher -> teacher.getSubject().hashCode(),
                Collectors.mapping(teacher -> teacher.getName(), Collectors.joining(", "))
        ));
        /* TO DO 6: Afficher les nom des enseignants de chaque module */
        List<Subject> T1 = teachers.stream()
                .map(Teacher::getSubject)
                .distinct()
                .collect(Collectors.toList());


    }
}
