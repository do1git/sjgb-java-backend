package kr.ac.sejong.sjgb.domain.enums;

public enum SemesterEnum {
    S202201, S202202, S202301,S202302,S202401,S202402;

    public static boolean contains(String value) {
        for (SemesterEnum enumValue : SemesterEnum.values()) {
            if (enumValue.name().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
