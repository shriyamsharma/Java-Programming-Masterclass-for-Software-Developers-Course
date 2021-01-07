package shri.sharma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
//
//        if (theatre.reserveSeat("H02")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, no seat available");
//        }


//        if (theatre.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, no seat available");
//        }

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.println("PLease pay for it");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing Threatre.seat");
        printList(theatre.seats);

        Collections.shuffle(seatCopy);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("Min seat is " + minSeat.getSeatNumber());
        System.out.println("Max seat is " + maxSeat.getSeatNumber());

        System.out.println("=========================================");
        sortList(seatCopy);
    }

//    public static void printList(List<Theatre.Seat> list) {
//        for (Theatre.Seat seat : list){
//            System.out.println();
//            System.out.println("" + seat.getSeatNumber());
//        }
//        System.out.println();
//        System.out.println("====================================================================");
//    }

    //lecture 154
    //copy list
    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=================================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i=0; i<list.size() - 1; i++) {
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) >0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }


}
