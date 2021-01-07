package sharma.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        List<Integer> grade = new ArrayList<Integer>();
        grade.add(73);
        grade.add(67);
        grade.add(38);
        grade.add(33);

        gradingStudents(grade);
    }





    public static List<Integer> gradingStudents(List<Integer> grades){

        List<Integer> temp = new ArrayList<Integer>();

            for (int i = 0; i < grades.size(); i++) {
                if ((grades.get(i) > -1) && (grades.get(i) < 101)) {
                    if (grades.get(i) < 38) {
                        temp.add(grades.get(i));
                    } else {
                        if ((grades.get(i) + 1) % 5 == 0) {
                            temp.add(grades.get(i) +1);
                        } else if ((grades.get(i) + 2) % 5 == 0) {
                            temp.add(grades.get(i) +2);
                        } else {
                            temp.add(grades.get(i));
                        }
                    }
                }
            }

            return temp;
        }
    }
