package kr.ac.sejong.sjgb.domain;

public class Tools {
    public static boolean contains(Class<? extends Enum<?>> enumClass, String value) {
        for (Enum<?> enumConstant : enumClass.getEnumConstants()) {
            if (enumConstant.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

}
