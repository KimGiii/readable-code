package cleancode.studycafe.tobe.model;

import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;

import java.util.List;

public class StudyCafePasses {

    private final List<StudyCafeLockerPass> passes;

    public StudyCafePasses(List<StudyCafeLockerPass> passes) {
        this.passes = passes;
    }

    public static StudyCafePasses of(List<StudyCafeLockerPass> passes) {
        return new StudyCafePasses(passes);
    }

    public List<StudyCafeLockerPass> findPassBy(StudyCafePassType studyCafePassType) {
        return passes.stream()
            .filter(studyCafePass -> studyCafePass.isSamePassType(studyCafePassType))
            .toList();
    }
}
