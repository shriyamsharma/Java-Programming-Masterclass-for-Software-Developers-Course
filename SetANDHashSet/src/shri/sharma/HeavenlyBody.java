package shri.sharma;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTROID
    }


//    private static final int STAR = 1;
//    private static final int PLANET = 2;
//    private static final int DWARF_PLANET = 3;
//    private static final int MOON = 4;
//    private static final int COMET = 5;
//    private static final int ASTEROID = 6;


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())) {
//            return false;
//        }

        if (obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
//        System.out.println("hashcode called");
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }
}


