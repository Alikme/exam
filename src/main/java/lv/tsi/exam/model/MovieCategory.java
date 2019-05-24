package lv.tsi.exam.model;

public enum MovieCategory {
    ACTION("Action"),
    COMEDY("Comedy"),
    DRAMA("Drama");

    private final String category;

    MovieCategory(String category) {
        this.category = category;
    }
}
