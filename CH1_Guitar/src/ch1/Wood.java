package ch1;

public enum Wood {
    INDIAN_ROSEWOOD, MAHOGANY;

    public String toString(){
        switch (this) {
            case INDIAN_ROSEWOOD: return "indian_rosewood";
            case MAHOGANY: return "mahogany";
            default: return "Illegal";
        }
    }
}
