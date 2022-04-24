package com.laptrinhjavaweb.enums;

public enum DistrictsEnums {
    QUAN_1("Quận 1"),
    QUAN_2("Quận 2"),
    QUAN_3("Quận 3"),
    QUAN_4("Quận 4"),
    QUAN_5("Quận 5"),
    QUAN_6("Quận 6"),
    QUAN_7("Quận 7"),
    QUAN_8("Quận 8"),
    QUAN_9("Quận 9"),
    QUAN_10("Quận 10"),
    QUAN_11("Quận 11"),
    QUAN_12("Quận 12"),
    QUAN_THU_DUC("Quận Thủ Đức"),
    QUAN_TAN_BINH("Quận Tân Bình"),
    QUAN_GO_VAP("Quận Gò Vấp"),
    QUAN_Tan_Phu("Quận Tân Phú"),
    QUAN_Binh_Chanh("Quận Bình Chánh");

    private final String districtValue;

    DistrictsEnums(String districtValue) {
        this.districtValue = districtValue;
    }



    public String getDistrictValue() {
        return districtValue;
    }
}
