package shri.sharma;

import java.util.List;

public interface ISaveable {
//    List<String> write();
    List write();
    void read(List savedValues);
//    void read(List<String> savedValues);
}
