public enum Condition {
    GOUP ("едет вверх"),
    GODOWN ("едет вниз"),
    OPENDOORS ("открывает двери"),
    CLOSEDOORS ("закрывает двери"),
    STANDOPENDOORS ("стоит с открытыми дверьми"),
    STANDCLOSEDOORS ("стоит с закрытыми дверьми");


    private final String title;

    Condition(String title) {
        this.title = title;
    }
}

